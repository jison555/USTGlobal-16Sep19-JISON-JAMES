package com.ustglobal.lms.dao;

import java.util.List;

import com.ustglobal.lms.dto.BookBag;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;

public interface LibrarianDAO {
	
	public boolean addLibrarian(LibrarianBean bean);
	public boolean addBook(BookBean bean);
	public boolean deleteStudent(int id);
	public StudentBean getDetails(int id);
	public List<StudentBean> getAllDetails();
	public LibrarianBean libLogin(int id,String password);
	public List<BookBag> requestedBook();
	public BookBag acceptRequest(int bagid);

}
