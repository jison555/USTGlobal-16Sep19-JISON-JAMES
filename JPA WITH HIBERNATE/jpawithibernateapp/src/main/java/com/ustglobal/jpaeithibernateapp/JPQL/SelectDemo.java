package com.ustglobal.jpaeithibernateapp.JPQL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class SelectDemo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactor = null;
		EntityManager entityManager = null;
		
		entityManagerFactor = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactor.createEntityManager();
		
//		String jpql =  "select * from Product";
//		
//		Query query = entityManager.createQuery(jpql);
//		List<Product> list =  query.getResultList();
//		
//		for (Product product : list) {
//			
//			//System.out.println(product.getPid());
//			System.out.println(product.getPname());
//			//System.out.println(product.getQuantity());
//		}
		
		
		String jpql =  "select pname from Product";
		
		Query query = entityManager.createQuery(jpql);
		List<String> list =  query.getResultList();
		
		for (String product : list) {
			
			
			System.out.println(product);
			//System.out.println(product.getPid());
			//System.out.println(product.getPname());
			//System.out.println(product.getQuantity());
		}
		
		
		
		
	}

}
