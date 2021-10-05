package com.vaishnavi;
import java.sql.*;
import java.util.Scanner;
import database.DbConfig;

public class DbConfig {

	class UerInfo{
		public int userid;
		public String username;
		public String dob;
		public int age;
		Scanner sc=new Scanner(System.in);
		
		public void addUser()
		{
			System.out.println("Enter userid");
			userid=sc.nextInt();
			System.out.println("Enter username");
			username=sc.next();
			System.out.println("Enter dob");
			dob=sc.next();
			System.out.println("Enter age");
			age=sc.nextInt();
		}
	}	
public class MainApp{
			static DbConfig db=new DbConfig();
			static Scanner sc=new Scanner(System.in);
			
			public void main(String[] args)throws Exception{
				db.connect();
				adduserdata();
			}
			static void adduserdata()throws Exception
			{
				UserInfo u=new UserInfo();
				U.addUser();
				String query="insert into userinfo(userid,username,DOB,age)values("+u.userid+",'"+u.username+",'"+u.dob+",'"+u.age+")";
				Statement s=db.execute(query);
				
				if(b==false)
					System.out.println("Record inserted");
				else
					System.out.println("Insertion failed");
			}
			
}

		



