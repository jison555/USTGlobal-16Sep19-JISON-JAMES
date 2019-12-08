package com.ustglobal.dao;

import java.util.List;

import com.ustglobal.bean.BookBean;
import com.ustglobal.bean.StudentBean;

public interface StudentDAO {
	public StudentBean login(String USN,String password);
	public BookBean search(String name);
	public boolean request(int id,String status);
	public List<BookBean> getAll();

}
