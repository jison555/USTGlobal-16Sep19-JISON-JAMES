package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestG {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> a1=new ArrayList<Employee>();
		Employee e1= new Employee(1, "jison", 21.33);
		Employee e2= new Employee(4, "ram", 21.33);
		Employee e3= new Employee(2, "mihi", 21.54);
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		
		Comparator<Employee> cmp=(e5,e6)-> {
			return e1.name.compareTo(e2.name);
		};
		
		List<Employee> li=  a1.stream().sorted(cmp).collect(Collectors.toList());  //here Student is not implementing Comparator so we need to create the object of it
		
		Iterator<Employee> l=li.iterator();
		while(l.hasNext()) {
			Employee e=l.next();
			System.out.println(e.name);
		}
		
		

	}

}
