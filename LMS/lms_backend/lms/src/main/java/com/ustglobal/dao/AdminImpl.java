package com.ustglobal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.ustglobal.bean.AdminBean;
import com.ustglobal.bean.LibrarianBean;
import com.ustglobal.bean.StudentBean;

public class AdminImpl implements AdminDAO {
	
	private EntityManagerFactory factory;

	@Override
	public AdminBean login(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from AdminBean where id=:id and password=:password";
		TypedQuery<AdminBean> query = manager.createQuery(jpql, AdminBean.class);
		AdminBean bean = query.getSingleResult();
		if(bean!=null) {
			return bean;
		} else {
			return null;
		}
		
	}

	@Override
	public boolean registerStudent(StudentBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
		
	}

	@Override
	public boolean registerLibrarian(LibrarianBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
		
	}

	

	@Override
	public boolean deleteStudent(String id) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		StudentBean bean = manager.find(StudentBean.class, id);
		if(bean!=null) {
		manager.remove(bean);
		transaction.commit();
		return true;
		}else {
		return false;
		}
	}
	

	@Override
	public boolean deleteLibrarian(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		LibrarianBean bean = manager.find(LibrarianBean.class, id);
		if(bean!=null) {
		manager.remove(bean);
		transaction.commit();
		return true;
		}else {
		return false;
		}
	
	}

}
