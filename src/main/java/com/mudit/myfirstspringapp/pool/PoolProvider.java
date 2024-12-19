package com.mudit.myfirstspringapp.pool;

import java.util.Collections;

public class PoolProvider {

    public final String _dbType;

    public PoolProvider(String _dbType) {
        this._dbType = _dbType;
    }

    public DatabaseConnectionPool getPool() {
        if (_dbType.equals("mysql")) {
            return new MySQLDatabaseConnectionPool(Collections.emptyList());
        } else if (_dbType.equals("postgresql")) {
            return new PostgresDatabaseConnectionPool();
        } else {
            throw new IllegalArgumentException("Unsupported db type: " + _dbType);
        }
    }
}
