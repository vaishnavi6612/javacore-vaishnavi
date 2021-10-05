package com.vaishnavi.JavaDatabase1;

import java.sql.*;

	public class DbConfig {
	         public Connection conn;
	         
	         public void ConnectnMySQL() throws ClassNotFoundException,SQLException
	         {
	        	 Class.forName("com.mysql.cj.jdbc.Driver");
	        	 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaeasydb","root","");
	         }
	}

