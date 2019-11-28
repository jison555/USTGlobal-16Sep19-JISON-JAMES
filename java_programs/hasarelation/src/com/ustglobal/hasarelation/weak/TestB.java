package com.ustglobal.hasarelation.weak;

public class TestB {
	
	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println(c.cname);
		c.ride();
		//has-A relation
		
		System.out.println(c.m.mname);
		c.m.play();
	}

}
