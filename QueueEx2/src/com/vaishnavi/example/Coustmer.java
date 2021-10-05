package com.vaishnavi.example;

public class Coustmer {
         private String coustName;
         private int age;
         
         
		public Coustmer(String coustName, int age) {
			super();
			this.coustName = coustName;
			this.age = age;
		}


		@Override
		public String toString() {


			return "Coustmer [coustmer"+coustName+",age"+age+"]";
		}


		public String getCoustName() {
			return coustName;
		}


	

		public int getAge() {
			return age;
		}


		
		
         
         
}
