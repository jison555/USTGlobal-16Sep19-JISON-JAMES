package com.ustglobal.springmvcassesment.dao;

import com.ustglobal.springmvcassesment.dto.OrderBean;
import com.ustglobal.springmvcassesment.dto.ProductBean;
import com.ustglobal.springmvcassesment.dto.RetailerBean;

public interface RetailerDao {
	public int registerRetailer(RetailerBean bean);//insert
	public RetailerBean login(int id,String password);//select
	public ProductBean searchProduct(int productid);//select
	public boolean updateRetailer(int id,String password);//update
	public double totalAmountPayable(ProductBean bean);
	public OrderBean retriveOrder(int id);// select
	
}
