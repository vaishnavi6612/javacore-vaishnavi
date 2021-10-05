package com.vaishnavi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	   public static void main(String[] args) {
           int no,d,pos;
		
		Scanner scan =new Scanner(System.in);
		String []users= {"John","Smith","Eliz","Peter","Mathew"};
		
		try
		{
		System.out.println("Enter Number:");
		no=scan.nextInt();
		
		System.out.println("Enter Divisor:");
		d=scan.nextInt();
		
		float ans= (float)no/d;
		System.out.println("Division="+ans);
		
		System.out.println("ENter index number to print username:");
		pos=scan.nextInt();
		
		System.out.println("User at index"+pos+"="+users[pos]);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Division by zero is not valid");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Index Number must be between o and"+users.length);
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Unhandled Exception");
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("Finally...");
		}
        System.out.println("~End Of Program");
	}

}
