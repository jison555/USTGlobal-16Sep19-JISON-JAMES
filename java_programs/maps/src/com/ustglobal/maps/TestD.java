package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
	
	public static void main(String[] args) {
		
		
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<>();
		
		lh.put("bangalore", 23551);
		lh.put("trivandram", 23413);
		lh.put("patna", 768123);
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			
			String key=m.getKey();
			Integer value=m.getValue();
			System.out.println("key is "+key+ " value is "+value);
		}
	}

}
