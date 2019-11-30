package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class UpdateDemo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
		
		entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Product product = entityManager.find(Product.class, 101);
		product.setPname("Mobile");
		System.out.println("updated record");
		entityTransaction.commit();
		
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
	}

}
