package com.bookify.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {

    public static void main(String[] args) {
        String connectionUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "ayonssp";
        String password = "321654";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(connectionUrl, username, password);
            System.out.println("Connection established successfully!");
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
