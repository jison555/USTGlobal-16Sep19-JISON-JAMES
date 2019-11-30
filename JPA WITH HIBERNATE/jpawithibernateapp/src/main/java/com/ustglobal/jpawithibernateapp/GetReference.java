package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class GetReference {
	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		 Product productDetails=entityManager.getReference(Product.class, 101);//will return proxy object
		 													//if data not found it will throw entityNotFound Exception					
		 System.out.println("id---"+productDetails.getPid());
		 System.out.println("name---"+productDetails.getPname());
		 System.out.println("quantity---"+productDetails.getQuantity());
		 entityManager.close();
		
	}
}
