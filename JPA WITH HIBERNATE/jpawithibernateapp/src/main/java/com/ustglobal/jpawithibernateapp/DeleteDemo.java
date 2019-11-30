package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class DeleteDemo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManageFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			entityManageFactory=Persistence.createEntityManagerFactory("test");
			entityManager = entityManageFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product product = entityManager.find(Product.class, 101);
			entityManager.remove(product);
			System.out.println("record removed");
			entityTransaction.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
		
	}

}
