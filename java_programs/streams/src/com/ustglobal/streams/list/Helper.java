package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	void displayAllStudent(ArrayList<Student> a1) {

		Iterator<Student> it= a1.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("name is "+s.name);
			System.out.println("id is "+s.id);
			System.out.println("=======================");
		}
	}	

	void displayFailedStudents(ArrayList<Student> a1){

		List<Student> l=a1.stream().filter(student ->student.percentage<40).collect(Collectors.toList());

		Iterator<Student> it= l.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("name is "+s.name);
			System.out.println("id is "+s.id);
			System.out.println("=======================");
		}
	}	
	
	void displayPassedStudents(ArrayList<Student> a1){

		List<Student> l=a1.stream().filter(std ->std.percentage>=40).collect(Collectors.toList());

		Iterator<Student> it= l.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("name is "+s.name);
			System.out.println("id is "+s.id);
			System.out.println("=======================");
		}
	}
	
	void displayTopperStudents(ArrayList<Student> a1){
		
		Comparator<Student> cmp=(s1,s2)-> {
			
			if(s1.percentage>s2.percentage) {
				return 1;
			}else if(s1.percentage<s2.percentage) {
				return -1;
			}else {
				return 0;
			}
			
			
		};
		Student s=a1.stream().max(cmp).get();
		System.out.println(s.name);
	}

		

}


