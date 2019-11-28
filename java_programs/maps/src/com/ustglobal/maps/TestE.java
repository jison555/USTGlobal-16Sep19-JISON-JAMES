package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {


		TreeMap<String,Integer> lh=new TreeMap<>();


		lh.put("patna", 768123);
		lh.put("bangalore", 23551);
		lh.put("trivandram", 23413);
		lh.put("patna", 768123);


		for(Map.Entry<String, Integer> m : lh.entrySet()) {

			String key=m.getKey();
			Integer value=m.getValue();

			System.out.println(key);
			System.out.println(value);

			System.out.println("==============================");
		}
	}

}
