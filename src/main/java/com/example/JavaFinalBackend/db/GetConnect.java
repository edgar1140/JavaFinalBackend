package com.example.JavaFinalBackend.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnect {
    public static Connection get() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql:siteUsers", "basecamp", "pgpass");
    }
}

