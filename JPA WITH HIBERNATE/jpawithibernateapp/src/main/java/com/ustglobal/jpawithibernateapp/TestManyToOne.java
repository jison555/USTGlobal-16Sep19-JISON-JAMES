package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;
import com.ustglobal.jpawithibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithibernateapp.onetomany.PencilBox;

public class TestManyToOne {
	
	public static void main(String[] args) {
		
		PencilBox box = new PencilBox();
		box.setBid(3);
		box.setBname("box3");
		
		Pencil pencil1 = new Pencil();
		pencil1.setPid(104);
		pencil1.setColor("green");
		pencil1.setBox(box);
		
		Pencil pencil2 = new Pencil();
		pencil2.setPid(104);
		pencil2.setColor("black");
		pencil2.setBox(box);
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(pencil1);
			entityTransaction.commit();
			entityTransaction.begin();
			entityManager.persist(pencil2);
			System.out.println("Record saved");
			entityTransaction.commit();
			entityManager.close();

		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
	}

}
