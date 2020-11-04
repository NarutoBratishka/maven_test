package database;

import java.sql.*;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&" +
            "useSSL=true&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Parolparol115";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {

/*            System.out.println(connection.isClosed());
            statement.execute("CREATE DATABASE testDb;");
            statement.execute("USE testDb;");*/
/*            statement.execute("CREATE TABLE animal(" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(45)," +
                    "anim_desc VARCHAR(100)" +
                    ");");*/
/*            statement.executeUpdate("INSERT INTO animal(name, anim_desc) VALUES" +
                    "('Tiger', 'Woods')," +
                    "('Lion', 'King');");*/
/*int countUpdates = statement.executeUpdate("UPDATE animal SET last_name='Robin' WHERE id=1;");
            System.out.println(countUpdates);*/
/*            ResultSet res = statement.executeQuery("SELECT * FROM animal;");*/
/*            statement.addBatch("INSERT INTO animal(name, last_name) VALUES ('Kenga', 'Roo');");
            statement.addBatch("INSERT INTO animal(name, last_name) VALUES ('Vinny', 'Pooh');");
            statement.addBatch("INSERT INTO animal(name, last_name) VALUES ('Piggy', 'Piglet');");
            statement.executeBatch();

            statement.clearBatch();*/
/*            boolean status = statement.isClosed();
            System.out.println("Statement is " + (status? "closed": "not closed"));*/
/*            statement.getConnection();
            statement.close();*/

        } catch (SQLException e) {
            e.printStackTrace();
        }

//        Connection connection;
//        try {
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            if (!connection.isClosed()) {
//                System.out.println("Соединение с БД установлено");
//            }
//
//            connection.close();
//            if (connection.isClosed()) {
//                System.out.println("Соединение с БД разорвано!");
//            }
//        } catch (SQLException e) {
//            System.err.println("Соединение с БД не установлено");
//            e.printStackTrace();
//        }
    }
}
