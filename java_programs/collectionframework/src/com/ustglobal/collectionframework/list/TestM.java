package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 =new ArrayList<String>(); 
		
		a1.add("girija");
		a1.add("Vanaja");
		a1.add("kiran");
		a1.add("jalaja");
		
		System.out.println("before sorting ========"+a1);
		Collections.sort(a1);
		System.out.println("after sorting =========="+a1);
	}

}
