package com.ustglobal.jpaeithibernateapp.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsert {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		String jpql = "insert into Product values(pid=:id,pname=:name,quantity=:quanty)";
		
		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager =entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();		
		 	
			Query query = entityManager.createNativeQuery(jpql);
			query.setParameter("id",114);
			query.setParameter("name","chooper");
			query.setParameter("quanty",11);
			entityTransaction.begin();
			query.executeUpdate();
			System.out.println("inserted");
			entityTransaction.commit();
			entityManager.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
