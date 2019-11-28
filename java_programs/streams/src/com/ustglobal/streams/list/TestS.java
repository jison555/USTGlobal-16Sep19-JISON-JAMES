package com.ustglobal.streams.list;

import java.util.ArrayList;

public class TestS {

	public static void main(String[] args) {
		
		ArrayList<Student> a1=new ArrayList<Student>();
		
		a1.add(new Student(10, "jison",12.3));
		a1.add(new Student(20, "ameen",50.44));
		a1.add(new Student(50, "alen",10.44));
		a1.add(new Student(30, "maya",60.44));
		a1.add(new Student(60, "adr",20.44));
		
		
		
		Helper h1=new Helper();
		System.out.println("=============all the students===================");
		h1.displayAllStudent(a1);
		System.out.println("=============failed students===================");
		h1.displayFailedStudents(a1);
		System.out.println("=============passed students===================");
		h1.displayPassedStudents(a1);
		System.out.println("******the topper is******");
		h1.displayTopperStudents(a1);
	}
}
