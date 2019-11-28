package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(23.54);
		al.add("yesh");
		al.add(true);
		
		ListIterator li= al.listIterator();
		
		System.out.println("===========>Forward");
		
		while(li.hasNext()) {
			Object ob=li.next();
			System.out.println("ob is "+ob);
		}
		
		System.out.println("<backward==============");
		
		while(li.hasPrevious()) {
			Object o=li.previous();
			System.out.println("o is "+o);
		}
	}

}
