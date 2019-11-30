package com.ustglobal.jpaeithibernateapp.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertDemo {

	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		String jpql = "insert into Product values(111,'chair',30)";

		try {

			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager =entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();

			Query query = entityManager.createNativeQuery(jpql);
			entityTransaction.begin();
			int count = query.executeUpdate();
			System.out.println("count updated "+count);
			entityTransaction.commit();
			entityManager.close();

		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}

	}
}
