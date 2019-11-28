package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {


		HashMap hm=new HashMap();

		hm.put("kuku",43456);
		hm.put("mala", 2134);
		hm.put("sheela", null);


		HashMap hm1=new HashMap();
		hm1.put("doora", 23123);
		hm1.put("riya", 12343);
		hm1.put("keithi", 23121);
		
		
		boolean haskey=hm.containsKey("kuku");
		System.out.println("has key"+haskey);
		
		boolean hasvalue=hm.containsValue(2341);
		System.out.println("has key"+hasvalue);
		
		hm.putAll(hm1);
		
		System.out.println("after put all"+hm);
		
		System.out.println(hm.size());
		
		System.out.println(hm.isEmpty());
		
		hm.clear();
		System.out.println(hm);
		
		
		
		
	}

}


