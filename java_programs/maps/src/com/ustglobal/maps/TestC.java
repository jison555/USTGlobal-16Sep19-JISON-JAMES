package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	
	public static void main(String[] args) {
		
		
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<>();
		
		lh.put("bangalore", 23551);
		lh.put("trivandram", 23413);
		lh.put("patna", 768123);
		
		System.out.println(lh);
		
		Set<String> s=lh.keySet();
		
		System.out.println(s);
		
		for(String key : s ) {
			
			System.out.println("key "+s);
		}
		
		Collection<Integer> c=lh.values();
		
		System.out.println(c);
		
	}

}
