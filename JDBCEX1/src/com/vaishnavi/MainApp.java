package com.vaishnavi;



import java.sql.*;


public class MainApp {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","manager");
		
		
		if(conn==null) {
			System.out.println("Connection Failed");
		}
		else
		{
			System.out.println("Connection Succeed");
		}
	


	}

}
