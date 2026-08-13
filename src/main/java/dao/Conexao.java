package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL =
            "jdbc:postgresql://pg-2e5a8181-institutojef-5294.k.aivencloud.com:15737/defaultdb?sslmode=require";

    private static final String USER =
            "";

    private static final String PASSWORD =
            "";

    public static Connection conectar() {

        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {

            System.out.println("Erro ao conectar!");

            throw new RuntimeException(e);

        }

    }
}
