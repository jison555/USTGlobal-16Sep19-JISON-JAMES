package com.ustglobal.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.AdminBean;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;


@Repository
public class AdminDAOImpl implements AdminDAO {
	
	
	
	@PersistenceUnit
	EntityManagerFactory factory;
	
	



	@Override
	public AdminBean adminLogin(int id, String password) {
		
		EntityManager manager = factory.createEntityManager();
		try {
		AdminBean bean=manager.find(AdminBean.class,id);
		System.out.println("bean="+bean);
			
			return bean;
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public boolean addStudent(StudentBean bean) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		manager.persist(bean);
		transaction.commit();
		manager.close();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
	
	
	
	
	

	@Override
	public boolean addLibrarian(LibrarianBean bean) {
		
		
		System.out.println(bean);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		manager.persist(bean);
		transaction.commit();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
	

	@Override
	public boolean deleteStudent(int id) {
		
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		StudentBean bean=manager.find(StudentBean.class,id);
		manager.remove(bean);
		transaction.commit();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	

	@Override
	public boolean deleteLibrarian(int id) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		LibrarianBean bean=manager.find(LibrarianBean.class,id);
		manager.remove(bean);
		transaction.commit();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	

	@Override
	public StudentBean getDetails(int id) {
		EntityManager manager = factory.createEntityManager();
		StudentBean bean=manager.find(StudentBean.class,id);
		return bean;
	}
	
	
	
	

	@Override
	public List<StudentBean> getAllStudent() {
		
		
		String jpql = "from StudentBean";
		EntityManager manager = factory.createEntityManager();
		
		TypedQuery<StudentBean> query =manager.createQuery(jpql,StudentBean.class);
		List<StudentBean> studentbean = query.getResultList();
		return studentbean;
	}
	
	
	
	

	@Override
	public List<BookBean> getAllBooks() {
		
		String jpql = "from BookBean";
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Query query = manager.createQuery(jpql);
		List<BookBean> bean=query.getResultList();
		return bean;
	}
	
	

	@Override
	public List<LibrarianBean> getAllLibrarian() {
		String jpql = "from LibrarianBean";
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Query query = manager.createQuery(jpql);
		List<LibrarianBean> bean=query.getResultList();
		return bean;
	}
	
	

	@Override
	public BookBean searchBook(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		BookBean bean = manager.find(BookBean.class,id);
		return bean;
	}



}
