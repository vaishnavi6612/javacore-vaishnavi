package com.vaishnavi;

import java.util.LinkedList;
import java.util.Queue;

public class MainApp {

	public static void main(String[] args) {
		Queue numbers =new LinkedList();
		
		//add();
		for(int i=101;i<=105;i++)
		{
			numbers.add(i);
		}
		
		System.out.println("Numbers="+numbers);
		
		//remove()
		System.out.println("Removing values from Queue=" +numbers.remove());
		System.out.println("Queue Numbers="+numbers);
		
        //size()
		System.out.println("Size of the queue="+numbers.size());
		
		//peek()
		System.out.println("Front Element in Queue Numbers="+numbers.peek());
	}

}
