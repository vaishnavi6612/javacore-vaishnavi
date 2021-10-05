package com.vaishnavi;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {

	public static void main(String[] args) {
		Set<String> hash=new HashSet<String>();
		
		hash.add("Smith");
		hash.add("SMITh");
		hash.add("John");
		hash.add("Peter");
		hash.add("PEter");
		
		System.out.println("HashSet="+hash);
		
		Set<String> linkedhash=new LinkedHashSet<String>();
		linkedhash.add("India");
		linkedhash.add("Austrelia");
		linkedhash.add("USA");
		linkedhash.add("usa");
		linkedhash.add("UK");
		
		System.out.println("Linked Hash Set="+linkedhash);
		
		Set<Integer> tree=new TreeSet<Integer>();
		tree.add(10);
		tree.add(89);
		tree.add(100);
		tree.add(35);
		tree.add(50);
		
		System.out.println("TreeSet="+tree);
		
		

	}

}
