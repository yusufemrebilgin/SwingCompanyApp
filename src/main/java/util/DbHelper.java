package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbHelper {
    private static final String USERNAME;
    private static final String PASSWORD;
    private static final String DB_URL;
    
    static {
        USERNAME = "root";
        PASSWORD = "12345";
        DB_URL = "jdbc:mysql://localhost:3306/jcompanydb";
    }
    
    private static Connection connection;
    
    private DbHelper() {}
    
    private static synchronized void connect() {
        try {
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (SQLException exception) {
            //loglama eklenebilir
            exception.printStackTrace();
        }
    }
    
    public static synchronized void disconnect() {
        if (connection == null) return;
        try {
            connection.close();
            connection = null;
        } catch (SQLException exception) {
            // loglama
            exception.printStackTrace();
        }
    }
    
    
    public static synchronized Connection getConnection() {
        if (connection == null) 
            connect();
        return connection;
    }
    
}