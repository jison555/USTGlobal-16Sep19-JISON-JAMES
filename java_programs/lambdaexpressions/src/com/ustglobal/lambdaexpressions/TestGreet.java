package com.ustglobal.lambdaexpressions;

public class TestGreet {
	
	public static void main(String[] args) {
		
		Greet gt=(str)-> str;
		
		String name=gt.greet("hello world");
	}

}
