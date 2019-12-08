package com.ustglobal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.ustglobal.bean.AdminBean;
import com.ustglobal.bean.BookBean;
import com.ustglobal.bean.StudentBean;

public class StudentDaoImpl implements StudentDAO {
	
	private EntityManagerFactory factory;

	@Override
	public StudentBean login(String USN, String password) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from AdminBean where id=:id and password=:password";
		TypedQuery<StudentBean> query = manager.createQuery(jpql, StudentBean.class);
		query.setParameter("USN", USN);
		query.setParameter("Password", password);
		StudentBean bean = query.getSingleResult();
		if(bean!=null) {
			return bean;
		} else {
			return null;
		}
		
	}

	@Override
	public BookBean search(String name) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from BookBean where name=:name,";
		TypedQuery<BookBean> query = manager.createQuery(jpql, BookBean.class);
	BookBean bean = query.getSingleResult();
	if(bean!=null) {
		return bean;
	}else {
		return null;
	}
		
	}

	@Override
	public boolean request(int id,String status) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql = "update Book set status=:status where bid=:bid";
		try {
			TypedQuery<BookBean> query = manager.createQuery(jpql, BookBean.class);
			query.setParameter("status", status);
			query.setParameter("bid", id);
			int update = query.executeUpdate();
			if(update>0) {
				transaction.commit();
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public List<BookBean> getAll() {
	EntityManager manager = factory.createEntityManager();
	String jpql = "from Bookbean";
	TypedQuery<BookBean> query = manager.createQuery(jpql, BookBean.class);
	List<BookBean> books = query .getResultList();
	if(books!=null) {
		return books;
	}else {
		return null;
	}
	}

}
