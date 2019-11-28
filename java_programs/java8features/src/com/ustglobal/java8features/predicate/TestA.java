package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

import com.ustglobal.java8features.Student;

public class TestA {
	

	public static void main(String[] args) {
		
		Predicate<Employee> p= (e1) -> {
			if(e1.salary>20000) {
				return true;
			}else {
				return false;
			}
		};
		
		Employee e1=new Employee(1,"anopp",22000);
		
		boolean res=p.test(e1);                         //present in predicate functional interface
		System.out.println(res);
		
	}
}
