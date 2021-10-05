package com.vaishnavi;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class MainApp {

	public static void main(String []args) {
		
          List numbersList = Arrays.asList(19,34,25,12,59,32);
		
		// sort
		Collections.sort(numbersList);
		System.out.println("List of Numbers in Ascending Order = " + numbersList);
		
		// binarySearch
		int position = Collections.binarySearch(numbersList, 60);
		System.out.println("Position of item 60 in numbersList = " + position);
		
		// reverse
		Collections.reverse(numbersList);
		System.out.println("Reverse of numbersList = " + numbersList);
		
		//swap
		Collections.swap(numbersList, 1, 2);
		System.out.println("After Swapping 1 and 2 positions="+numbersList);
		
		//fill
		ArrayList <Float>emptyList=new ArrayList();
		emptyList.add(1.1f);
		emptyList.add(2.1f);
		Collections.fill(emptyList, 56.90f);
		System.out.println("emptyList after Collections.fill="+emptyList);

		//shuffle
		Collections.shuffle(numbersList);
		System.out.println("Shuffle of numberslist="+numbersList);
		
        Object []myarray = numbersList.toArray();
		
		System.out.println("NumbersList Converting to type Array");
		for(Object r:myarray)
		{
			System.out.println(r);
		}

	}

}
