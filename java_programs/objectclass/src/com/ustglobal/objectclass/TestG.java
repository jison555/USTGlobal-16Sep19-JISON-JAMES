package com.ustglobal.objectclass;

public class TestG {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101, "jison",23450);
		Student s2=new Student(102, "amal", 21340);
		Student s3=new Student(103, "harsha", 23490);
		Student s4=new Student(101, "jison",23450);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
	}

}
