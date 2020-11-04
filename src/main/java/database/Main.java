package database;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DBConnection dbCon = new DBConnection();

        String query = "SELECT * FROM users;";
        try {
            Statement statement = dbCon.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUserName(resultSet.getString("userName"));
                user.setPassword(resultSet.getString("password"));
                System.out.println(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
