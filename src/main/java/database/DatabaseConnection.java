package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }
    private static DatabaseConnection instance = null;

    public static DatabaseConnection getInstance() {
        if(instance == null)
            instance = new DatabaseConnection();
        return instance;
    }

    public void connect(String path)  {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:database." + path);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
