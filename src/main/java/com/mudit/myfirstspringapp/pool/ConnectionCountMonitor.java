package com.mudit.myfirstspringapp.pool;

public class ConnectionCountMonitor implements ConnectionObserver {

    private int currentConnectionCount;

    public ConnectionCountMonitor() {

    }

    @Override
    public void notifyConnectionGet() {
        currentConnectionCount++;

    }
}
