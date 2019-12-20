package com.ustglobal.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.finalproject.dao.SMSApplicationDAO;
import com.ustglobal.finalproject.dto.Cart;
import com.ustglobal.finalproject.dto.OrderInfo;
import com.ustglobal.finalproject.dto.ProductInfoBean;

@Service
public class SMSApplicationServiceImpl implements SMSApplicationService {
	@Autowired
	SMSApplicationDAO dao;

	@Override
	public boolean addProduct(ProductInfoBean bean) {
		// TODO Auto-generated method stub
		return dao.addProduct(bean);
	}

	@Override
	public List<ProductInfoBean> viewProduct() {
		// TODO Auto-generated method stub
		return dao.viewProduct();
	}

	@Override
	public boolean updateProduct(ProductInfoBean bean) {
		// TODO Auto-generated method stub
		return dao.updateProduct(bean);
	}

	@Override
	public boolean removeProduct(int id) {
		// TODO Auto-generated method stub
		return dao.removeProduct(id);
	}

	@Override
	public boolean orderProduct(OrderInfo info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addCart(Cart bean) {
		// TODO Auto-generated method stub
		return dao.addCart(bean);
	}

	@Override
	public List<Cart> viewCart() {
		// TODO Auto-generated method stub
		return dao.viewCart();
	}

	@Override
	public boolean deleteProduct(ProductInfoBean bean) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(bean);
	}

	@Override
	public List<OrderInfo> orderInfos() {
		// TODO Auto-generated method stub
		return dao.orderInfos();
	}

}
