package com.ustglobal.jpawithibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.manytomany.Course;
import com.ustglobal.jpawithibernateapp.manytomany.Student;

public class TestManyToMany {
	
	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.setCid(10);
		course1.setCname("java");
		
		Course course2 = new Course();
		course2.setCid(11);
		course2.setCname("sql");
		
		ArrayList<Course> a1 = new ArrayList<Course>();
		a1.add(course1);
		a1.add(course2);
		
		Student student1 = new Student();
		student1.setSid(101);
		student1.setSname("amal");
		student1.setCourse(a1);
		
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;


		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student1);
			System.out.println("Record saved");
			entityTransaction.commit();
			entityManager.close();

		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
		
	}

}
