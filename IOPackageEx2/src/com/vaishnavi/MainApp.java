/*WAP to create and store text data file using character stream class*/
package com.vaishnavi;

import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;

public class MainApp {

	public static void main(String[] args) throws IOException {
		File ref=new File("E:\\/sample.txt");
		
		if(ref.exists())
		{
			PrintWriter pw=new PrintWriter(ref);
			
			String s="Hello Java Scipt";
			pw.write(s);
			
			System.out.println("Message saved in file");
			pw.close();
		}

	}

}
