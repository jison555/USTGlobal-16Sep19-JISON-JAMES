package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.AdminDAO;
import com.ustglobal.lms.dao.LibrarianDAO;
import com.ustglobal.lms.dto.AdminBean;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO  dao;
	
	@Override
	public AdminBean adminLogin(int id, String password) {
		
		return dao.adminLogin(id, password);
	}

	@Override
	public boolean addStudent(StudentBean bean) {
		
		return dao.addStudent(bean);
	}

	@Override
	public boolean addLibrarian(LibrarianBean bean) {
		
		return dao.addLibrarian(bean);
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return dao.deleteStudent(id);
	}

	@Override
	public boolean deleteLibrarian(int id) {
		// TODO Auto-generated method stub
		return dao.deleteLibrarian(id);
	}

	@Override
	public StudentBean getDetails(int id) {
		// TODO Auto-generated method stub
		return dao.getDetails(id);
	}

	@Override
	public List<StudentBean> getAllStudent() {
		// TODO Auto-generated method stub
		return dao.getAllStudent();
	}

	@Override
	public List<BookBean> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public List<LibrarianBean> getAllLibrarian() {
		// TODO Auto-generated method stub
		return dao.getAllLibrarian();
	}

	@Override
	public BookBean searchBook(int id) {
		// TODO Auto-generated method stub
		return dao.searchBook(id);
	}



}
