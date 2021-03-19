/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Trieu
 */
public class JDBCConnection {
         
//        public JDBCConnection(String db, String username,String password){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,username,password);
//            
//            System.out.println("Connected");
//           
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Failed");
//        }
//        
//        
//        };
    public JDBCConnection()
    {
    }
        public Connection ConnectDB(){
            Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/eitea","root","");
            
            System.out.println("Connected");
           
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed");
        }
        
        return conn;
        };
        public static void main(String[] args) {
        new JDBCConnection().ConnectDB();
    }
}
