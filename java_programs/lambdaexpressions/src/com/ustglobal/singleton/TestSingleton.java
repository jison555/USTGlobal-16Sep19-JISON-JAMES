package com.ustglobal.singleton;

public class TestSingleton {
	
	
	public static void main(String[] args) {
		
		MySingleton ms =MySingleton.getConnection();
		ms.s="hello";
		
		System.out.println("hashcode of ms "+ms.hashCode());
		
		MySingleton mx=MySingleton.getConnection();
		mx.s="hi";
		System.out.println("hashcode of mx "+mx.hashCode());
	}

}
