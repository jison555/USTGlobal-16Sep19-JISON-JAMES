package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.StudentDAO;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.StudentBean;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO dao;

	@Override
	public boolean addStudent(StudentBean bean) {
		
		return dao.addStudent(bean);
	}


	@Override
	public StudentBean getDetails(int id) {
		
		return dao.getDetails(id);
	}


	@Override
	public BookBean searchBook(int id) {
		
		return dao.searchBook(id);
	}

	@Override
	public StudentBean loginStudent(int id, String password) {
		
		StudentBean bean= dao.loginStudent(id, password);
		System.out.println("bean in service="+bean);
		return bean;
		
	}

	@Override
	public List<BookBean> getAllBooks() {
		
		return dao.getAllBooks();
	}


	@Override
	public boolean makeRequest(int bid, int sid) {
		
		return dao.makeRequest(bid, sid);
	}

}
