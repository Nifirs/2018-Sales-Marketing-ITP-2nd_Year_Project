/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promotion;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Kavinga
 */
public class DatabaseConnection {

    
    private Connection connection;
    private String url = "jdbc:mysql://localhost/dbproject";
    private String username = "root";
    private String password = "";

    public DatabaseConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = java.sql.DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

//    public static synchronized DatabaseConnection getInstance() throws SQLException {
//        if (instance == null) {
//            instance = new DatabaseConnection();
//        } else if (instance.getConnection().isClosed()) {
//            instance = new DatabaseConnection();
//        }
//
//        return instance;
//    }
}
