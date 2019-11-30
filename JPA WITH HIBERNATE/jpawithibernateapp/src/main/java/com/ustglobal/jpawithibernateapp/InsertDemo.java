package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class InsertDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;



		Product product = new Product();
		product.setPid(104);
		product.setPname("pen");
		product.setQuantity(10);

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(product);
			System.out.println("Record saved");
			entityTransaction.commit();
			entityManager.close();

		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}

	}

}
