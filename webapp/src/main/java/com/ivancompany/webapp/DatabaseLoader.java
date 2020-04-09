package com.ivancompany.webapp;

import org.springframework.boot.CommandLineRunner;

import java.sql.*;

public class DatabaseLoader implements CommandLineRunner {

    private static final String url = "jdbc:postgresql://localhost/cosc3380projectdatabase";
    private static final String user = "postgres";
    private static final String password = "masterpassword";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }





    @Override
    public void run(String... strings) {
        Connection conn;
        PreparedStatement pstmt;
        String SQLInsertActor = "INSERT INTO user_credentials(login_name, password) " + "VALUES(?,?)";
        try {
            conn = connect();
            pstmt = conn.prepareStatement(SQLInsertActor, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, "ivancool");
            pstmt.setString(2, "password");
            pstmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
