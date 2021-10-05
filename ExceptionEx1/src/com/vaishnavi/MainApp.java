package com.vaishnavi;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int no,d;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Number:");
		no=scan.nextInt();
		
		System.out.println("Enter Divisor:");
		d=scan.nextInt();
		
		try
		{
		float ans= (float)no/d;
		System.out.println("Division="+ans);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			ex.printStackTrace();
			
		}
		System.out.println("~End of Program");
		
	}
	

}
