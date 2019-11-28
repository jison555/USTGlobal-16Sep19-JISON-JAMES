package com.ustglobal.objectclass;

public class TestF {
	
	public static void main(String[] args) {
		
		Cow c1=new Cow(101, "ganga", 23450);
		
		Cow c2=new Cow(102, "gawrii", 87000);
		
		Cow c5=new Cow(101, "ganga", 23450);
		
		Cow c3=new Cow(104, "mangii", 34510);
		
		Cow c4=c3;
		
		boolean isEqual=c1.equals(c2);
		System.out.println(isEqual);
		System.out.println(c1.equals(c5));
		System.out.println(c3.equals(c4));
		
		
	}

}
