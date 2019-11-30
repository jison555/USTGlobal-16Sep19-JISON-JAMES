package com.ustglobal.jpaeithibernateapp.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		String jpql = "delete from Product where pid=104";
		
		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager =entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			Query query = entityManager.createQuery(jpql);
			entityTransaction.begin();
			int count = query.executeUpdate();
			System.out.println("count "+count);
			entityTransaction.commit();
			entityManager.close();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}

		
	}

}
