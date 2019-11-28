package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	
	public static void main(String[] args) {
		
		Student s1= new Student(2, "divya", 23.43);
		Student s2= new Student(5, "arjun", 12.212);
		Student s3= new Student(1, "kiran", 23.43);
		Student s4= new Student(11, "dinesh", 1.41);
		Student s5= new Student(32, "giri", 63.08); 
		Student s6= new Student(45, "mahi", 53.87); 
		Student s7= new Student(111, "sam", 45.83); 
		Student s8= new Student(222, "arun", 44.43); 
		Student s9= new Student(22, "gokul", 10.63); 
		
		ArrayList<Student> a1=new ArrayList<>();
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		ArrayList<Student> a2=new ArrayList<>();
		
		a2.add(s4);
		a2.add(s5);
		a2.add(s6);
		
		ArrayList<Student> a3=new ArrayList<>();
		
		a3.add(s7);
		a3.add(s8);
		a3.add(s9);
		
		HashMap<String,ArrayList<Student>> hm=new HashMap<>();
		hm.put("first", a1);
		hm.put("second", a2);
		hm.put("third", a3);
		
		System.out.println("hashMap is  "+hm);
		
		ArrayList<Student> first= hm.get("first");
		

		
		Iterator<Student> it =first.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("id is " + s.id);
			System.out.println("name is "+ s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println("=======================================");
		}
		
		for (Student std : first) {
			
			System.out.println(std.id);
		}
		
		
		
		
		
		
		
	}

}
