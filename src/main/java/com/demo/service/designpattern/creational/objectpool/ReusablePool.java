package com.demo.service.designpattern.creational.objectpool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class ReusablePool implements ObjectPool<Connection> {
    private final Queue<Connection> availableConnections = new LinkedList<>();
    private final String connectionString;
    private final int initialPoolSize;
    private final int maxPoolSize;
    private final ReentrantLock lock = new ReentrantLock();
    private int currentlyUsed = 0;

    private static volatile ReusablePool instance;

    private ReusablePool(String connectionString, int initialPoolSize, int maxPoolSize) {
        this.connectionString = connectionString;
        this.initialPoolSize = initialPoolSize;
        this.maxPoolSize = maxPoolSize;
        for (int i = 0; i < initialPoolSize; i++) {
            availableConnections.add(new Connection(connectionString));
        }
    }

    public static ReusablePool getInstance(String connectionString, int initialPoolSize, int maxPoolSize) {
        if (instance == null) {
            synchronized (ReusablePool.class) {
                if (instance == null) {
                    instance = new ReusablePool(connectionString, initialPoolSize, maxPoolSize);
                }
            }
        }
        return instance;
    }

    @Override
    public Connection acquire() {
        lock.lock();
        try {
            if (availableConnections.isEmpty() && currentlyUsed < maxPoolSize) {
                availableConnections.add(new Connection(connectionString));
            }
            if (!availableConnections.isEmpty()) {
                currentlyUsed++;
                return availableConnections.poll();
            }
            throw new RuntimeException("Maximum pool size reached, no available connections.");
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void release(Connection connection) {
        lock.lock();
        try {
            connection.reset();
            availableConnections.offer(connection);
            currentlyUsed--;
        } finally {
            lock.unlock();
        }
    }

    public int getFreeConnectionsInPool() {
        lock.lock();
        try {
            return availableConnections.size();
        } finally {
            lock.unlock();
        }
    }

    public  int getCurrentlyUsed() {
        lock.lock();
        try {
            return currentlyUsed;
        } finally {
            lock.unlock();
        }
    }

    public int getInitialPoolSize() {
        return initialPoolSize;
    }

    public int getMaxPoolSize() {
        return maxPoolSize;
    }
}