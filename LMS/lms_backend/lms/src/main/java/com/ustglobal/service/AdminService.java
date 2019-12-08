package com.ustglobal.service;

import com.ustglobal.bean.AdminBean;
import com.ustglobal.bean.LibrarianBean;
import com.ustglobal.bean.StudentBean;

public interface AdminService {
	public AdminBean login(int id,String password);
	public boolean registerStudent(StudentBean bean);
	public boolean registerLibrarian(LibrarianBean bean);
	public  boolean deleteStudent(String id);
	public boolean deleteLibrarian(int id);

}
