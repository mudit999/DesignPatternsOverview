package com.mudit.myfirstspringapp.pool;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class SingletonConnectionPool {

    private final List<Connection> _connections;

    private static SingletonConnectionPool INSTANCE;

    private SingletonConnectionPool() {
        _connections = new ArrayList<>();
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public static SingletonConnectionPool getInstance() {
        // if instance does not exist then apply synchronization
        if (INSTANCE == null) {
            // Thread 1, 2, 4,
            synchronized (INSTANCE) {
                // thread 1
                if (INSTANCE == null) {
                    INSTANCE = new SingletonConnectionPool();
                }
            }
        }

        // else no need of synchronization
        return INSTANCE;
    }

    public static void main(String[] args) {

    }

}
