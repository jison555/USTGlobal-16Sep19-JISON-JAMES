package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {

	
	public static void main(String[] args) {
		
		Hashtable<Integer ,String> ht=new Hashtable();
		ht.put(101, "ayay");
		ht.put(500, "vijay");
		ht.put(200, "sonu");
		ht.put(1000, "monu");
		ht.put(105, "mane");
		ht.put(101, "sriram");
		//ht.put(106, null);
		System.out.println("data"+ht);
	}
}
