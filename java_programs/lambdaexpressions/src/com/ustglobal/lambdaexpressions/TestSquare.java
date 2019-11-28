package com.ustglobal.lambdaexpressions;

public class TestSquare {
	
	
	
	public static void main(String[] args) {
		
		Square sq=x ->x*x;
		
		double product=sq.square(2.0);
				System.out.println(product);
		
	}

}
