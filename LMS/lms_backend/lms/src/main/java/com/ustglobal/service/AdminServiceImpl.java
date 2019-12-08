package com.ustglobal.service;

import com.ustglobal.bean.AdminBean;
import com.ustglobal.bean.LibrarianBean;
import com.ustglobal.bean.StudentBean;
import com.ustglobal.dao.AdminDAO;

public class AdminServiceImpl implements AdminService{
		
	private AdminDAO dao;
	@Override
	public AdminBean login(int id, String password) {
		return dao.login(id, password) ;
	}

	@Override
	public boolean registerStudent(StudentBean bean) {
		return dao.registerStudent(bean);
	}

	@Override
	public boolean registerLibrarian(LibrarianBean bean) {
		return dao.registerLibrarian(bean);
	}

	@Override
	public boolean deleteStudent(String id) {
		return dao.deleteStudent(id);
	}

	@Override
	public boolean deleteLibrarian(int id) {
		return dao.deleteLibrarian(id);
	}

}
