package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestA {
	
	public static void main(String[] args) {
		
		ArrayList al =new ArrayList();
		al.add(12);
		al.add("chinnu");
		al.add(20.43);
		al.add(null);
		al.add(true);
		al.add('a');
		Object o1=al.get(2);
		System.out.println(o1);
		
		for(int i=0;i<6;i++) {
			
			Object obj=al.get(i);
			System.out.println(obj);
		}
	}

}
