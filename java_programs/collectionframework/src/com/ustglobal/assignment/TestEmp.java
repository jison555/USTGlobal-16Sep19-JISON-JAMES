package com.ustglobal.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.ustglobal.collectionframework.list.Student;

public class TestEmp {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> a1=new ArrayList<Employee>();
		
		Employee e1=new Employee(101, "alex", 20000);
		Employee e2=new Employee(102, "john", 40000);
		Employee e3=new Employee(103, "antony", 30000);
		
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		
for (int i = 0; i < a1.size(); i++) {
			
			Employee s=a1.get(i);
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.salary);
			
		}
		System.out.println("=========for each ===========");
		
		for(Employee s : a1) {
			System.out.println(s);
		}
		
		System.out.println("========using iterator=======");
		
		Iterator<Employee> i=a1.iterator();
		
		while(i.hasNext()) {
			
			Employee st=i.next();
			System.out.println(st);
		}
		
		System.out.println("========using list iterator======");
		
		ListIterator<Employee> li=a1.listIterator();
		
		while(li.hasNext() ) {
			
			Employee st=li.next();
			System.out.println(st);
		}

		
		
		
		
	}

}
