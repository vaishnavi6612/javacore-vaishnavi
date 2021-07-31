package com.vaishnavi;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws IOException {
		File ref=new File("E:\\/test.txt");
		
		if(ref.exists())
		{
			Scanner scan=new Scanner(ref);
			
			String data=scan.nextLine();
			System.out.println(data);
		}
		else
		{
			System.out.println("File Not Found");
		}

	}

}
