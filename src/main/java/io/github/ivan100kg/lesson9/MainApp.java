package io.github.ivan100kg.lesson9;

import java.sql.*;

public class MainApp {
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    public static void main(String[] args) {
        try {
            connect();
//            insertEx();
            long time = System.currentTimeMillis();
//            connection.setAutoCommit(false);
            for (int i = 0; i < 1000; i++) {
                preparedStatement.setString(1, "Bob" + i);
                preparedStatement.setInt(2, 50 + i % 10);
//                preparedStatement.executeUpdate();
//                preparedStatement.addBatch();
            }
            Savepoint sp1 = connection.setSavepoint();
            connection.rollback(sp1);
//            connection.commit();
//            preparedStatement.executeBatch();
            System.out.println(System.currentTimeMillis() - time);

            selectEx();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            disconnect();
        }
    }

    public static void selectEx() throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM students ORDER BY id DESC LIMIT 5;");
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
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO students (name, score) VALUES (?, ?);");
        } catch (SQLException | ClassNotFoundException e) {
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
