package com.vaishnavi.JavaDatabase1;
import com.database.*;

	

import java.sql.*;

	class javadatabase
	{
		static DbConfig config= new DbConfig();
		
		public static void main(String[] args)
		{
			try
			{
				config.ConnectnMySQL();
				readData();
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println("Class path Error");
				System.out.println(ex);
			}
			catch(SQLException ex)
			{
				System.out.println("SQL syntax Error");
				System.out.println(ex);
			}
		}
		static void readData() throws SQLException
		{
			String query="SELECT empid,empname,joindate,salary FROM Employee";
			DbConfig st=(DbConfig) config.conn.createStatement();
			ResultSet R=((Statement) st).executeQuery(query);
			
			while(true)
			{
				if(R.next()==false)
					break;
				
				System.out.println(String.format("%10d %15s %15s %10.2f", R.getInt("empid"),R.getString("empname"),R.getDate("joinDate"),R.getFloat("salary")));
			}
		}

		
}
