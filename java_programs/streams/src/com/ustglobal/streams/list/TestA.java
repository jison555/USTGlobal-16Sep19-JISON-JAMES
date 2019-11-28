package com.ustglobal.streams.list;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestA {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new  ArrayList<Integer>();
		a1.add(20);
		a1.add(60);
		a1.add(54);
		a1.add(33);
		a1.add(30);
		
		List<Integer> l= a1.stream().filter(i-> i%2 ==0).collect(Collectors.toList());
		
		for (Integer i : l) {
			
			System.out.println(i);
			
		}
	}

}
