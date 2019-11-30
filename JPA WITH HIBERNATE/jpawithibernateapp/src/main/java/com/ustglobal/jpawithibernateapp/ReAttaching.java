package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class ReAttaching {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager  = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product product =  entityManager.find(Product.class, 101);
			Boolean contain = entityManager.contains(product);
			System.out.println(contain);
			entityManager.detach(product);
			System.out.println(entityManager.contains(product));	
			Product product2 = entityManager.merge(product);
			System.out.println(entityManager.contains(product2));
			product.setPname("car");
			System.out.println("updated");
			
			entityTransaction.commit();
			entityManager.clear();
			entityManager.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
		
	}

}
