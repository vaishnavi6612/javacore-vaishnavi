package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConfig {
         public Connection con;
         public void connect()throws Exception{
        	 Class.forName("com.mysql.cj.jdbc.Driver");
        	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaeasydb","root","vaishnavi");
        	 
        	 if(con==null)
        	 
        		 System.out.println("Connectrion failed");
        		 
        	 else
        		  System.out.println("Connection Succes");
         }
         
}
