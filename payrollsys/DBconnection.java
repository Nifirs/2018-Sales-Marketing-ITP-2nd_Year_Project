package payrollsys;

import java.sql.Connection;
import java.sql.SQLException;


public class DBconnection {

    public static DBconnection getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/dbproject";
    private String username = "root";
    private String password = "";

    public DBconnection() throws SQLException {
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

/*
package payrollsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBconnection {
     public static Connection con;
    
    public static Connection getConnection() throws Exception{
    
        if(con == null){
        Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root","");
        }
        return con;
    }
    
    //save update dele
    
    public static void setData(String sql)throws Exception{  
        int i=DBconnection.getConnection().createStatement().executeUpdate(sql);
        if(i>0) {
        	System.out.print("Updated!");
        }else {
        	System.out.print("Not Updated!");
        }
    }
    
    // search
    
    public static ResultSet getData(String sql)throws Exception{
        ResultSet executeQuery = DBconnection.getConnection().createStatement().executeQuery(sql);
        if(executeQuery.next()) {
        	System.out.print("Updated!");
        }else {
        	System.out.print("Not Updated!");
        }
        return executeQuery;
    }
    
    
    
    
    
    
}
*/
