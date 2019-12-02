package com.ustglobal.springmvcassesment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springmvcassesment.dao.RetailerDao;
import com.ustglobal.springmvcassesment.dto.OrderBean;
import com.ustglobal.springmvcassesment.dto.ProductBean;
import com.ustglobal.springmvcassesment.dto.RetailerBean;
@Service
public class RetailerServiceImpl implements RetailerService {
	@Autowired
	public RetailerDao dao;
	
	@Override
	public int registerRetailer(RetailerBean bean) {
		return dao.registerRetailer(bean);
	}

	@Override
	public RetailerBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public ProductBean searchProduct(int productid) {
		return dao.searchProduct(productid);
	}

	@Override
	public boolean updateRetailer(int id,String password) {
		return dao.updateRetailer(id,password);
	}

	@Override
	public double totalAmountPayable(ProductBean bean) {
		return dao.totalAmountPayable(bean);
	}

	@Override
	public OrderBean retriveOrder(int id) {
		return dao.retriveOrder(id);
	}
	
}
