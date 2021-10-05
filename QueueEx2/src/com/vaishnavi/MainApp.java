package com.vaishnavi;

import java.util.LinkedList;
import java.util.Queue;

import com.vaishnavi.example.Coustmer;
public class MainApp {

	

	public static void main(String[] args) {
		Queue <Coustmer>coustmersQueue=new LinkedList();
		
		coustmersQueue.add(new Coustmer("Nikhil",20));
		coustmersQueue.add(new Coustmer("Pooja",27));
		coustmersQueue.add(new Coustmer("Neha",45));
		coustmersQueue.add(new Coustmer("Reva",32));
		coustmersQueue.add(new Coustmer("Isha",50));
		
		for(Coustmer cq :coustmersQueue)
		{
			System.out.println(cq);
		}
        
		//Processing Queue
		while(coustmersQueue.isEmpty()==false)
		{
			try {
			Thread.sleep(2000);
			System.out.println("Coustmer processed="+coustmersQueue.remove());
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		System.out.println("After Processing Queue Size="+coustmersQueue.size());
	}

}
