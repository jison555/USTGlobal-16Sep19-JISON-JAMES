package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.LibrarianDAO;
import com.ustglobal.lms.dto.BookBag;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;

@Service
public class LibrarianServiceImpl implements LibrarianService {
	
	@Autowired
	private LibrarianDAO dao;

	@Override
	public boolean addLibrarian(LibrarianBean bean) {
		
		return dao.addLibrarian(bean);
	}

	@Override
	public boolean addBook(BookBean bean) {
		
		return dao.addBook(bean);
	}

	@Override
	public boolean deleteStudent(int id) {
	
		return dao.deleteStudent(id);
	}

	@Override
	public StudentBean getDetails(int id) {
		
		return dao.getDetails(id);
	}

	@Override
	public List<StudentBean> getAllDetails() {
		
		return dao.getAllDetails();
	}

	@Override
	public LibrarianBean libLogin(int id, String password) {
		
		return dao.libLogin(id, password);
	}

	@Override
	public List<BookBag> requestedBook() {
		
		return dao.requestedBook();
	}

	@Override
	public BookBag acceptRequest(int bagid) {
		
		return dao.acceptRequest(bagid);
	}

}
