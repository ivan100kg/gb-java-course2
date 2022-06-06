package io.github.ivan100kg;

import java.sql.*;

public class MainApp {
    private static Connection connection;
    private static Statement statement;
    public static void main(String[] args) {
        try {
            connect();
            insertEx();
            selectEx();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            disconnect();
        }
    }

    public static void selectEx() throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM students;");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " +
                    resultSet.getString("name") + " " +
                    resultSet.getInt("score"));
        }
    }

    public static void insertEx() throws SQLException {
        statement.executeUpdate("INSERT INTO students (name, score) VALUES ('Lisa', 35);");

    }

    public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void disconnect() {
        try {
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
