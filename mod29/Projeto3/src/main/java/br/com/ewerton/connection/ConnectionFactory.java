package br.com.ewerton.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection connection;

    private ConnectionFactory() {
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = initConnection();
        } else if (connection.isClosed()) {
            connection = initConnection();
        }
        return connection;
    }

    private static Connection initConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/agendamento_consultas", "user", "user");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
