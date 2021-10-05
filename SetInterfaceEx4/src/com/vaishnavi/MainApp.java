package com.vaishnavi;

import java.util.LinkedHashSet;
import java.util.Set;

import com.vaishnavi.example.Employee;

public class MainApp {

	public static void main(String[] args) {
		Set <Employee>employees =new LinkedHashSet();
		
		Employee e1=new Employee(101,"SMith",18000.00);
		Employee e2=new Employee(102,"John",19000.00);
		Employee e3=new Employee(103,"Eliz",20000.00);
		Employee e4=new Employee(101,"SMith",18000.00);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		//add duplicates
		employees.add(e1);
		employees.add(e1);
		employees.add(e1);
		
		for(Employee e:employees)
		{
			System.out.println(e);
		}

	}

}
