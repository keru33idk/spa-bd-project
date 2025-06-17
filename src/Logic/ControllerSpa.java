package Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ControllerSpa {
    private final String url = "jdbc:postgresql://localhost:1234/SPA";
    private final String user = "postgres";
    private final String password = "12345678";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado a PostgreSQL correctamente");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
