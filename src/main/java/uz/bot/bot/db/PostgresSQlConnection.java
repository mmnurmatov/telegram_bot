package uz.gita.bot.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresSQlConnection {
    public Connection getConnection() {
        // System.out.println("GETTING CONNECTION");
        try {
            Class.forName("org.postgresql.Driver");

            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/tiem_code",
                    "dwpos",
                    "$$_D@T@PR1ZM@GR0UP_$$");

        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQLException");
            // e.printStackTrace();
        }
        return null;
    }
}
