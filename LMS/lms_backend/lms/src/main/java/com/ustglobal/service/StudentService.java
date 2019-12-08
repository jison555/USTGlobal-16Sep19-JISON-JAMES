package com.ustglobal.service;

import java.util.List;

import com.ustglobal.bean.BookBean;
import com.ustglobal.bean.StudentBean;

public interface StudentService {
	public StudentBean login(String id,String password);
	public BookBean search(String name);
	public boolean request(int id,String status);
	public List<BookBean> getAll();
	

}
