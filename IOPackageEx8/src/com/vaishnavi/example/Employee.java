package com.vaishnavi.example;

import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {
	public int empCode;
	public String empName;
	public double salary;
	
	public void addEmployee()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n Enter Employee Code :");
		empCode = scan.nextInt();
		
		System.out.print("\n Enter Employee Name :");
		empName = scan.next();
		
		System.out.print("\n Enter Salary :");
		salary = scan.nextDouble();
	}

	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", salary=" + salary + "]";
	}
}
