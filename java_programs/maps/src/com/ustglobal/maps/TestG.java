package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestG {

	public static void main(String[] args) {

		Employee e1=new Employee(1, "ram", 23000);
		Employee e2=new Employee(2, "ravi", 1000);
		Employee e3=new Employee(6, "shyam", 3000);
		Employee e4=new Employee(3, "midu", 23000);
		Employee e5=new Employee(9, "kv", 53000);
		Employee e6=new Employee(7, "prem", 63000);
		Employee e7=new Employee(8, "bibi", 93000);
		Employee e8=new Employee(4, "sam", 33000);
		Employee e9=new Employee(5, "gogul", 13000);


		ArrayList<Employee> a1=new ArrayList<>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);

		ArrayList<Employee> a2=new ArrayList<>();
		a2.add(e4);
		a2.add(e5);
		a2.add(e6);

		ArrayList<Employee> a3=new ArrayList<>();
		a3.add(e7);
		a3.add(e8);
		a3.add(e9);

		HashMap<String,ArrayList<Employee>> hm=new HashMap<>();

		hm.put("Manager1", a1);
		hm.put("Manager2", a2);
		hm.put("Manager3", a3);
		
//		Set<String> set = hm.keySet();
//		for (String str : set) {
//			System.out.println(str);			
//		}
//		Collection<ArrayList<Employee>> c1 = hm.values();
//		for (ArrayList<Employee> arr : c1) {
//			
//			for (Employee  ee: arr) {			
//				System.out.println(ee.id+" = "+ee.name);
//			}
//		}
		
		

		ArrayList<Employee> first= hm.get(2);
		System.out.println(first);

		Iterator<Employee> it =first.iterator();
		while(it.hasNext()) {
			Employee s=it.next();
			System.out.println("id is " + s.id);
			System.out.println("name is "+ s.name);
			System.out.println("percentage is "+s.salary);
			System.out.println("=======================================");


		}

	}
}