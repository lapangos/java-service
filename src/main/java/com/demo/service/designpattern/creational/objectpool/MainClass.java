package com.demo.service.designpattern.creational.objectpool;

public class MainClass {
    public static void main(String[] args) {
        // Initialize the pool with initial size 2 and max size 5
        ReusablePool pool = ReusablePool.getInstance("jdbc:mysql://localhost:3306/mydb", 2, 5);

        // Acquire connections from the pool
        Connection conn1 = pool.acquire();
        System.out.println("Acquired: " + conn1);

        Connection conn2 = pool.acquire();
        System.out.println("Acquired: " + conn2);

        Connection conn3 = pool.acquire();
        System.out.println("Acquired: " + conn3);

        Connection conn4 = pool.acquire();
        System.out.println("Acquired: " + conn4);

        Connection conn5 = pool.acquire();
        System.out.println("Acquired: " + conn5);

        try {
            Connection conn6 = pool.acquire();
            System.out.println("Acquired: " + conn6);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Print pool status
        System.out.println("Free connections in pool: " + pool.getFreeConnectionsInPool());
        System.out.println("Currently used connections: " + pool.getCurrentlyUsed());

        // Release connections back to the pool
        pool.release(conn1);
        System.out.println("Released: " + conn1);

        // Acquire another connection
        Connection conn7 = pool.acquire();
        System.out.println("Acquired: " + conn7);

        // Print pool status
        System.out.println("Free connections in pool: " + pool.getFreeConnectionsInPool());
        System.out.println("Currently used connections: " + pool.getCurrentlyUsed());
    }
}