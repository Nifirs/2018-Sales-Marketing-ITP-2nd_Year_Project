/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

//import com.sun.jndi.ldap.Connection;

import static javax.management.remote.JMXConnectorFactory.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author asus
 */
public class DBconnect {

    private static DBconnect instance;

    public static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Connection connection;
    
    private String url = "jdbc:mysql://localhost:3306/dbproject";
    private String username ="root";
    private String password ="";
    
    public DBconnect() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
        }catch(ClassNotFoundException ex){
//            System.out.println("database connection creation Failed :"+ ex.getMessage());
              ex.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public static synchronized DBconnect getInstance()throws SQLException{
        if(instance == null){
            instance = new DBconnect();
        }
        else if(instance.getConnection().isClosed()){
            
            instance = new DBconnect();
        }
        
        return instance;
    }
       
   
}
