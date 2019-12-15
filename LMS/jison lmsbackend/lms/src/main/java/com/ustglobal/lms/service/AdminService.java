package com.ustglobal.lms.service;

import java.util.List;

import com.ustglobal.lms.dto.AdminBean;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;

public interface AdminService {
	
	public AdminBean adminLogin(int id,String password);
	public boolean addStudent(StudentBean bean);
	public boolean addLibrarian(LibrarianBean bean);
	public boolean deleteStudent(int id);
	public boolean deleteLibrarian(int id);
	public StudentBean getDetails(int id);
	public List<StudentBean> getAllStudent();
	public List<BookBean> getAllBooks();
	public List<LibrarianBean> getAllLibrarian();
	public BookBean searchBook(int id);


}
