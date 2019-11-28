package com.ustglobal.lambdaexpressions;

public class TestMultiply {

	public static void main(String[] args) {
		
		MultiplyInterface multi= (a,b)->a*b;
		
		int product=multi.multiply(20,20);
		
		System.out.println("product is "+product);
	}
}
