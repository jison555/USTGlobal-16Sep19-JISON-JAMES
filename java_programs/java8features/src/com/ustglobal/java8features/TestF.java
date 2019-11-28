package com.ustglobal.java8features;

import java.util.function.Consumer;

public class TestF {
	
	public static void main(String[] args) {
		
		Consumer<Student> c= s -> {
			
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			
			
		};
		Student s =new Student(32,"figo",21.22);
		
		c.accept(s);
		
	}

}
