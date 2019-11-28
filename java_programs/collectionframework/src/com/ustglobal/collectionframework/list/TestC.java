package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(12);
		al.add("jison");
		al.add(34.65);
		al.add(true);
		al.add(null);
		
		Iterator it =al.iterator();
		Object ob1=it.next();
		System.out.println("ob1 is"+ob1);
		
		Object ob2= it.next();
		System.out.println("ob2 is" +ob2);
		
		Object ob3= it.next();
		System.out.println("ob3 is" +ob3);
		
		Object ob4= it.next();
		System.out.println("ob4 is" +ob4);
		
		Object ob5= it.next();
		System.out.println("ob5 is" +ob5);
		boolean b=it.hasNext();
		System.out.println(b);
		
//		Object ob6= it.next();
//		System.out.println("ob6 is" +ob6);
//		noSuchElemmentException

		
		
		
		 
		
		System.out.println("=========using for loop==============");
		
		for(int i=0;i<al.size();i++) {
			
			Object obj = al.get(i);
			System.out.println(obj);
		}
		
		ArrayList al1=new  ArrayList();
		
		al1.add(12);
		al1.add(233.56);
		al1.add("jison");
		al1.add(true);
		al1.add(null);
		
		System.out.println("===============using iterator=============");

		
		Iterator it1=al1.iterator();
		while(it1.hasNext()) {
			Object o=it1.next();
			System.out.println(o);
			}
	}

}
