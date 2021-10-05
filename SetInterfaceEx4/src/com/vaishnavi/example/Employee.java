package com.vaishnavi.example;

public class Employee {
         public int empCode;
         public String empName;
         public double empSalary;
         
         public Employee() {
        	 
        	 
         }

		public Employee(int empCode, String empName, double empSalary) {
			super();
			this.empCode = empCode;
			this.empName = empName;
			this.empSalary = empSalary;
		}

		@Override
		public String toString() {
				return "Employee [empCode="+empCode+",empname="+empName+",empSalary="+empSalary+"]";
		}

		@Override
		public int hashCode() {
			
			return empName.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			Employee another=(Employee)obj;
			
			if(this.empCode==another.empCode && this.empName.equals(another.empName)&& this.empSalary==another.empSalary)
            {
			return true;
		    }
            else
            {
            	return false;
            }

		
		}
         
        
}
