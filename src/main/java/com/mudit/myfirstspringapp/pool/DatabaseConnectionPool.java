package com.mudit.myfirstspringapp.pool;

import java.sql.Connection;

public interface DatabaseConnectionPool {
    Connection getConnection();
}
