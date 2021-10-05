package com.vaishnavi;


import java.sql.*;



class JavaDatabase1
{
			public static void main(String[] args)
			{
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaeasydb","root","");
					
					System.out.println("Connnection Eshatablished");
					//Read database table
					String query="select empid,empname,joindate,salary from Employee;";
					Statement st=conn.createStatement();
					ResultSet R=st.executeQuery(query);
					
					while(true)
					{
						if(R.next()==false)
								break;
						
						System.out.println(R.getInt("empid")+"\t"+R.getString("empname")+"\t"+R.getDate("joindate")+"\t"+R.getFloat("salary"));
					}
					System.out.println("\n Reading is done");
				}
				catch(ClassNotFoundException ex)
				{
					System.out.println("\n MYSQL class path not set");
					System.out.println(ex);
				}
				catch(SQLException ex)
				{
					System.out.println("\n SQL Query Error");
					System.out.println(ex);
				}
				
			}
		
}


