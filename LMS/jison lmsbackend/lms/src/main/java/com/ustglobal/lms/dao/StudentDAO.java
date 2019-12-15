package com.ustglobal.lms.dao;

import java.util.List;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;

public interface StudentDAO {
	

	
	public boolean addStudent(StudentBean bean);
	public StudentBean getDetails(int id);
	public BookBean searchBook(int id);
	public StudentBean loginStudent(int id,String password);
	public List<BookBean> getAllBooks();
	public boolean makeRequest(int bid,int sid);
	
	

}
