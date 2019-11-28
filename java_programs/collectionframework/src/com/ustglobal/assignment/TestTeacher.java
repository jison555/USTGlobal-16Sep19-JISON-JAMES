package com.ustglobal.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestTeacher {
	
public static void main(String[] args) {
		
		ArrayList<Teacher> a1=new ArrayList<Teacher>();
		
		Teacher e1=new Teacher(101, "alex", 20000);
		Teacher e2=new Teacher(102, "john", 40000);
		Teacher e3=new Teacher(103, "antony", 30000);
		
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		
for (int i = 0; i < a1.size(); i++) {
			
			Teacher s=a1.get(i);
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.salary);
			
		}
		System.out.println("=========for each ===========");
		
		for(Teacher s : a1) {
			System.out.println(s);
		}
		
		System.out.println("========using iterator=======");
		
		Iterator<Teacher> i=a1.iterator();
		
		while(i.hasNext()) {
			
			Teacher st=i.next();
			System.out.println(st);
		}
		
		System.out.println("========using list iterator======");
		
		ListIterator<Teacher> li=a1.listIterator();
		
		while(li.hasNext() ) {
			
			Teacher st=li.next();
			System.out.println(st);
		}

		
		
		
		
	}

}
