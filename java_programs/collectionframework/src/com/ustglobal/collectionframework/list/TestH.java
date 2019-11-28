package com.ustglobal.collectionframework.list;

import java.util.LinkedList;
import java.util.Vector;

public class TestH {
	
	public static void main(String[] args) {
		
		Vector li=new Vector();
		
	
		li.add(12);
		li.add(32.43);
		li.add("more");
		li.add(null);
		li.add(true);
		
		System.out.println("==========using for loop=========");
		
		for (int i = 0; i < li.size(); i++) {
			
			System.out.println(li.get(i));
			
		}
		
		System.out.println("========using for each=======");
		
		for(Object obj : li) {
			
			System.out.println(obj);
		}
		
		System.out.println("========using iterator=====");
	}

}
