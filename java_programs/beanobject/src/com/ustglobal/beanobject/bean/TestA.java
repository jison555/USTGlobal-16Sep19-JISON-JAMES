package com.ustglobal.beanobject.bean;

public class TestA {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(12);
		s.setName("shivani");
		s.setrollno(123);
		
		Employee e=new Employee();
		e.setId(12);
		e.setDept("networks");
		e.setSalary(34000);
		e.setDesignation("HR");
		
		
		Database db=new Database();
		db.receive(s);
		db.save(e);
	}

}
