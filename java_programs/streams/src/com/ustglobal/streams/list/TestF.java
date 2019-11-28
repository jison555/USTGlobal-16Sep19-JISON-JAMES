package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new  ArrayList<Integer>();
		a1.add(20);
		a1.add(60);
		a1.add(21);
		a1.add(10);
		a1.add(30);
		
		List<Integer> l=a1.stream().sorted().collect(Collectors.toList());  //integer is comparable so need not wanted  to provide comparator  object
		
		Iterator<Integer> it=l.iterator(); 
		while(it.hasNext()) {
			Integer i= it.next();
			System.out.println(i);
		}
	}

}
