package com.mudit.myfirstspringapp.pool;

import java.sql.Connection;

public class PostgresDatabaseConnectionPool implements DatabaseConnectionPool {

    public PostgresDatabaseConnectionPool() {
    }

    @Override
    public Connection getConnection() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
