/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;




/**
 *
 * @author Charuni
 */
public class DBConnection {
    
   public static Connection connect()
   {
       Connection conn = null;
       
       try
       {
           System.out.println("0");
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("1");
           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbproject","root","");
           System.out.println("2");
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       return conn;
   }
           
    
}
