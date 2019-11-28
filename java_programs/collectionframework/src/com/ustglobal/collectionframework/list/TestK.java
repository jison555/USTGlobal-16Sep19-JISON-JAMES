package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {
	
	public static void main(String[] args) {
		
		
		ArrayList<Double> a1=new ArrayList<Double>();
		
		a1.add(32.4);
		a1.add(23.54);
		a1.add(12.65);
		a1.add(87.45);
		a1.add(null);
		a1.add(null);
		
		System.out.println(a1);
		
		a1.add(2,54.54);
		
		System.out.println("after add in 2nd index" +a1);
		a1.remove(0);
		System.out.println("after removing 0th index" +a1);
		a1.remove(null);
		System.out.println("after removing null"+a1);
		Double val = a1.get(4);
		System.out.println("object at 4th index" +val);
		a1.set(2,77.6);
		System.out.println("after replacing 2nd index" +a1);
		a1.clear();
		System.out.println("after clear method" +a1);
		a1.contains(54.7);
		
		List<Double> al1=new ArrayList<>();
		
		al1.add(12.3);
		al1.add(23.4);
		al1.add(34.5);
		
		a1.addAll(al1);
		System.out.println("after addAll"+a1);
		boolean contain = a1.containsAll(al1);
		System.out.println("contains all od al1 "+contain);
		
		boolean res= a1.removeAll(al1);
		System.out.println("remove all of al1 "+res);
	}
	
	

}
