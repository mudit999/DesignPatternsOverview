package com.mudit.myfirstspringapp.pool;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class MySQLDatabaseConnectionPool implements DatabaseConnectionPool {

    private final List<Connection> _connections;
    private final List<ConnectionObserver> _observers;

    public MySQLDatabaseConnectionPool( List<ConnectionObserver> _observers) {
        this._connections = new ArrayList<>();
        this._observers = _observers;
    }

    @Override
    public Connection getConnection() {
        _observers.stream().forEach(ConnectionObserver::notifyConnectionGet);
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public static void main(String[] args) {

    }

}
