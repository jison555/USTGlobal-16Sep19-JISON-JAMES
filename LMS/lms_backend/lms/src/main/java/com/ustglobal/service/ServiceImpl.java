package com.ustglobal.service;

import java.util.List;

import com.ustglobal.bean.BookBean;
import com.ustglobal.bean.StudentBean;
import com.ustglobal.dao.StudentDAO;

public class ServiceImpl implements StudentService {
	
	private StudentDAO dao;
	
	@Override
	public StudentBean login(String USN, String password) {
		
		return dao.login(USN, password);
	}

	@Override
	public BookBean search(String name) {
		
		return dao.search(name) ;
	}

	@Override
	public boolean request(int id, String status) {
		
		return dao.request(id, status);
	}

	@Override
	public List<BookBean> getAll() {
			return dao.getAll();
	}

}
