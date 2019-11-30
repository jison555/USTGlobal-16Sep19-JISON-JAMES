package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.onetoone.Person;
import com.ustglobal.jpawithibernateapp.onetoone.VoterCard;

public class TestOneToOne { 

	public static void main(String[] args) {

		VoterCard vc= new VoterCard();
		vc.setVid(17);
		vc.setVname("ravi");

		Person p = new Person();
		p.setPid(18);
		p.setName("ravi");
		p.setVoterCard(vc);

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {

			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();
			entityManager.persist(p);
			System.out.println("record saved");
			entityTransaction.commit();
			entityManager.close();

		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}

	}

}
