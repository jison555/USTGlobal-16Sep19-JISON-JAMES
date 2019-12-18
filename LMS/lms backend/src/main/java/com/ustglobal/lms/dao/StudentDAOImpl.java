package com.ustglobal.lms.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.BookBag;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.StudentBean;


@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@PersistenceUnit
	EntityManagerFactory factory;
	

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
	public StudentBean loginStudent(int sid, String spassword) {
		EntityManager manager = factory.createEntityManager();
		try {
		StudentBean bean=manager.find(StudentBean.class,sid);
		System.out.println("bean="+bean);
		
		//System.out.println(bean.getSpassword());
		//System.out.println(password);
		
		//if(bean.getSpassword()==password) {
			
			return bean;
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		//} {
		
		//}
	}

	@Override
	public StudentBean getDetails(int id) {
	
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		StudentBean bean=manager.find(StudentBean.class,id);
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
	public boolean makeRequest(int bid, int sid) {
		System.out.println("request in dao");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql="from BookBag where sid=:sid and bid=:bid and status='approve'";
		try {
			TypedQuery<BookBag> query=manager.createQuery(jpql,BookBag.class);
			query.setParameter("sid",sid);
			query.setParameter("bid",bid);
			BookBag bag=query.getSingleResult();
			return false;
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		
		try {
		transaction.begin();
		BookBean bookbean=manager.find(BookBean.class,bid);
		System.out.println(bookbean.getBname());
		StudentBean stdbean=manager.find(StudentBean.class,sid);
		
		
		System.out.println(stdbean.getSname());
		BookBag bookBag= new BookBag();
		bookBag.setStud(stdbean);
		bookBag.setBookid(bookbean.getBid());
		bookBag.setStatus("request");
		
		List<BookBag> list = new ArrayList<BookBag>();
		list.add(bookBag);
		
			
		stdbean.setBag(list);
		manager.persist(stdbean);
		manager.persist(bookBag);
		transaction.commit();
		return true;
		}catch (Exception e1) {
			return false;
			// TODO: handle exception
		}
		}
	
	}
	@Override
	public List<BookBag> gettingCart(int id) {

	       System.out.println(id);
		String jpql = "from BookBag where status='accept' and stud.id=:sid";
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		TypedQuery<BookBag> query = manager.createQuery(jpql,BookBag.class);
		query.setParameter("sid",id);
		List<BookBag> bag =query.getResultList();
	    System.out.println(bag);
				
		return bag;
	}

}
