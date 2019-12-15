package com.ustglobal.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.BookBag;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;

@Repository
public class LibrarianDAOImpl implements LibrarianDAO {
	
	@PersistenceUnit
	EntityManagerFactory factory;
	
	
	@Override
	public boolean addLibrarian(LibrarianBean bean) {
		
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
	public boolean addBook(BookBean bean) {
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
	public boolean deleteStudent(int lid) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		StudentBean bean=manager.find(StudentBean.class,lid);
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
	public List<StudentBean> getAllDetails() {
		String jpql = "from StudentBean";
		EntityManager manager = factory.createEntityManager();
		
		TypedQuery<StudentBean> query =manager.createQuery(jpql,StudentBean.class);
		List<StudentBean> studentbean = query.getResultList();
		return studentbean;
	}

	@Override
	public LibrarianBean libLogin(int id, String password) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		LibrarianBean bean=manager.find(LibrarianBean.class,id);
		if(bean!=null) {
			return bean;
		}else {
			return null;
		}
	}

	@Override
	public List<BookBag> requestedBook() {
		String jpql = "from BookBag where status='request'";
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		TypedQuery<BookBag> query =manager.createQuery(jpql, BookBag.class);
		List<BookBag> bean=query.getResultList();		
		return bean;
	}

	@Override
	public BookBag acceptRequest(int bagid) {
		
		System.out.println("bagid = "+bagid);
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		BookBag bag = manager.find(BookBag.class, bagid);
		bag.setStatus("accept");
		transaction.commit();		
		System.out.println("bookbag is "+bag);
		return bag;
		
	}

}
