import database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect("users.db");

    }

    public void select() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String query = "SELECT * FROM account";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.getResultSet();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            System.out.println(id);
        }
    }
}
