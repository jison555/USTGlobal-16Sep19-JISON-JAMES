package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	
	public static void main(String[] args) {
		
		
		HashMap hm=new HashMap();
		
		hm.put("kuku",43456);
		hm.put("mala", 2134);
		hm.put("sheela", 23451);
		hm.put(null, 234);
		hm.put(null, 2345);
		Object gh=hm.put("geene",4566);
		
		System.out.println("data" +hm);
		
		hm.put("mala",34562);
		System.out.println("after modify" +hm);
		
		hm.put("dimple",34562);
		System.out.println(hm);
		
		Object phoneno=hm.get("sheela");
		System.out.println(phoneno);
		
		
		Object phone=hm.get("she");
		System.out.println(phone);
		
		System.out.println(hm.remove("sheela"));
		
		System.out.println(hm);
		
		
		
	
	}

}
