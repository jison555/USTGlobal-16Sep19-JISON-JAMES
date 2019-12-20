package com.ustglobal.finalproject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.fabric.xmlrpc.base.Array;
import com.ustglobal.finalproject.dto.Cart;
import com.ustglobal.finalproject.dto.OrderInfo;
import com.ustglobal.finalproject.dto.ProductInfoBean;

@Repository
public class SMSApplicationDAOImpl implements SMSApplicationDAO {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean addProduct(ProductInfoBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public List<ProductInfoBean> viewProduct() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from ProductInfoBean";
	    try {
	    	TypedQuery<ProductInfoBean> query=manager.createQuery(jpql,ProductInfoBean.class);
	    	List<ProductInfoBean> beans=query.getResultList();
	    	System.out.println(beans);
	    	return beans;
	    }catch (Exception e) {
	    	e.printStackTrace();
	    	return null;
		}

	}

	@Override
	public boolean updateProduct(ProductInfoBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		ProductInfoBean bean2=manager.find(ProductInfoBean.class, bean.getPid())	;
		bean2.setCategory(bean.getCategory());// TODO: handle exception
		bean2.setCompany(bean.getCompany());
		bean2.setName(bean.getName());
		bean2.setPrice(bean.getPrice());
		bean2.setQuantity(bean.getQuantity());
		transaction.commit();
		return true;
		
		// TODO Auto-generated method stub
	}

	@Override
	public boolean removeProduct(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			ProductInfoBean bean=manager.find(ProductInfoBean.class,id);
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean orderProduct(OrderInfo bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		
		
		try {
			List<ProductInfoBean> productInfoBeans=bean.getProductInfoBeans();
			for(ProductInfoBean productInfoBean:productInfoBeans) {
				ProductInfoBean infoBean=manager.find(ProductInfoBean.class,productInfoBean.getPid());
				infoBean.setQuantity(infoBean.getQuantity()-productInfoBean.getQuantity());
			}
			manager.persist(bean);
				transaction.commit();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
			// TODO: handle exception
		}
				// TODO Auto-generated method stub

	}

	@Override
	public List<ProductInfoBean> viewAllProduct() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from ProductInfoBean";
	    try {
	    	TypedQuery<ProductInfoBean> query=manager.createQuery(jpql,ProductInfoBean.class);
	    	List<ProductInfoBean> beans=query.getResultList();
	    	return beans;
	    }catch (Exception e) {
	    	e.printStackTrace();
	    	return null;
		}

	}

	@Override
	public List<OrderInfo> viewOrderinfo() {
		// TODO Auto-generated method stub
		String jpql="from OrderInfoBean";
		EntityManager manager=factory.createEntityManager();
		try {
		
		TypedQuery<OrderInfo> query=manager.createQuery(jpql,OrderInfo.class);
		List<OrderInfo> infos=query.getResultList();
		return infos;
		}
		catch (Exception e) {
			e.printStackTrace();
			
			return null;
			// TODO: handle exception
		}
	}

	@Override
	public boolean addCart(Cart bean) {
		// TODO Auto-generated method stub
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
		manager.persist(bean);
		transaction.commit();
		return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
			// TODO: handle exception
		}
	}

	@Override
	public List<Cart> viewCart() {
		String jpql="from Cart";
		EntityManager manager=factory.createEntityManager();
		try {
			TypedQuery<Cart> query=manager.createQuery(jpql,Cart.class);
		
			return query.getResultList();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
	}

	@Override
	public boolean deleteProduct(ProductInfoBean bean) {
		// TODO Auto-generated method stub
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.remove(bean);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}

	}

	@Override
	public List<OrderInfo> orderInfos() {
		// TODO Auto-generated method stub
		EntityManager manager=factory.createEntityManager();
		String jpql="from OrderInfo";
	    try {
	    	TypedQuery<OrderInfo> query=manager.createQuery(jpql,OrderInfo.class);
	    	List<OrderInfo> beans=query.getResultList();
	    	System.out.println(beans);
	    	return beans;
	    }catch (Exception e) {
	    	e.printStackTrace();
	    	return null;
		}

	}

}
