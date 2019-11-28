package com.ustglobal.objectclass;

public class TestD {
	
	public static void main(String[] args) {
		
		Student s=new Student(10, "jison", 23.65);
		int h=s.hashCode();
		System.out.println(h);
		
		String a=s.toString();
		System.out.println(a);
		
	}

}
