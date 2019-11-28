package com.ustglobal.beanobject.bean;

public class Database {
	
	void receive(Student s) {
		
		System.out.println("id is"+s.getId());
		System.out.println("name is "+s.getName());
		System.out.println("rollno is"+s.getrollno());
		System.out.println("================");
	}
	
	void save(Employee e) {
		
		System.out.println("id is"+e.getId());
		System.out.println("name is"+e.getName());
		System.out.println("salary is"+e.getSalary());
		System.out.println("dept name is"+e.getDept());
		System.out.println("designation is"+e.getDesignation());

	}

}
