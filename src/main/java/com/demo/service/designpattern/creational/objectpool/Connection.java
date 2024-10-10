package com.demo.service.designpattern.creational.objectpool;

public class Connection implements Reusable {
    private String connectionString;

    public Connection(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getConnectionString() {
        return connectionString;
    }

    @Override
    public void reset() {
        // Reset the connection state
        System.out.println("Connection reset.");
    }

    @Override
    public String toString() {
        return "Connection{" +
                "connectionString='" + connectionString + '\'' +
                '}';
    }
}