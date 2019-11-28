package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		int a =10;
		byte b=20;
		short h=70;
		long p=50;
		double q=60;
		float n=80;
		System.out.println("a is "+a);
		Integer i =a;                     //auto boxing
		Byte c=b;
		Short s=h;
		Long l=p;
		Double d=q;
		Float f=n;
		System.out.println("i is "+i);
		System.out.println("c is "+c);
		
		Integer x=30;
		Integer z=new Integer(x);
		System.out.println("x is "+z);
		
		int y=x;						//auto unboxing
		System.out.println("y is "+y);
		
		int value=Integer.parseInt("123");
		System.out.println("value is "+value);
		
		boolean result1 = Boolean.parseBoolean("123true");
		System.out.println("result is "+result1);
		
	}

}
