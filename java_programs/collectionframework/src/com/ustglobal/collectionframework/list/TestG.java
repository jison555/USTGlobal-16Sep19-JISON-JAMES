package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {

	
	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
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
		
		Iterator<Student> i=li.iterator();
		
		while(i.hasNext()) {
			
			Student st=i.next();
			System.out.println(st);
		}
		
		System.out.println("========using list iterator======");
		
		ListIterator<Student> l2=li.listIterator();
		
		while(l2.hasNext() ) {
			
			Student st=l2.next();
			System.out.println(st);
		}
		
		
	}
}
