package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestJ {

	public static void main(String[] args) {



		ArrayList<Student> a1=new ArrayList<Student>();

		Student s1=new Student(101, "ankitha",23.43);
		Student s2=new Student(102,"salman",34.54);
		Student s3=new Student(103,"srk", 54.67);

		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		for (int i = 0; i < a1.size(); i++) {
			
			Student s=a1.get(i);
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
			
		}
		System.out.println("=========for each ===========");
		
		for(Student s : a1) {
			System.out.println(s);
		}
		
		System.out.println("========using iterator=======");
		
		Iterator<Student> i=a1.iterator();
		
		while(i.hasNext()) {
			
			Student st=i.next();
			System.out.println(st);
		}
		
		System.out.println("========using list iterator======");
		
		ListIterator<Student> li=a1.listIterator();
		
		while(li.hasNext() ) {
			
			Student st=li.next();
			System.out.println(st);
		}

	}




}
