package com.ustglobal.immutable;

public class TestString {
	
	public static void main(String[] args) {
		
		Mystring ms=new Mystring(12,"renu");
		
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);
		
	
		
		Mystring ms1= ms.changeContent(20,"roopa");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		
		System.out.println("=====================");
		
		System.out.println(ms1.getName());
		System.out.println(ms1.getRollno());
	}

}
