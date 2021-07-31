package com.vaishnavi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class MainAPp {

	public static void main(String[] args, OutputStream fout) throws IOException {
		
	     Scanner scan =new Scanner(System.in);
	     
		 File reff = new File("E:\\/test.txt");
			
			if(reff.exists()==false)
			{
				System.out.println("File not Exist");
			    reff.createNewFile();
			    System.out.println("New File Created");
	        }
			else
			{
				String username;
				
				System.out.println("Enter Username:");
				username=scan.next();
				
				FileOutputStream fout1 = new FileOutputStream(reff,true);
				OutputStreamWriter osw = new OutputStreamWriter(fout1);
				
				osw.write("\n"+username);
				
				osw.close();
			}		

	}

}
