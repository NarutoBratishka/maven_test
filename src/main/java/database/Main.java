package database;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DBConnection dbCon = new DBConnection();

        String query = "SELECT * FROM users;";
        try {
            Statement statement = dbCon.getConnection().createStatement();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
