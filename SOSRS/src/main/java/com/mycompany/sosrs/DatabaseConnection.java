package com.mycompany.sosrs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/sos";
    private static final String USER = "sos";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void salvarDoenca(Doenca doenca) throws SQLException {
        String sql = "INSERT INTO doencas (nome) VALUES (?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, doenca.getNome());
            stmt.executeUpdate();
        }
    }

    public static List<Doenca> listarDoencas() throws SQLException {
        List<Doenca> doencas = new ArrayList<>();
        String sql = "SELECT * FROM doencas";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Doenca doenca = new Doenca(rs.getInt("id"), rs.getString("nome"));
                doencas.add(doenca);
            }
        }

        return doencas;
    }
}
