package com.ustglobal.lms.dto;

import java.util.List;

import lombok.Data;


@Data
public class LibraryManagementResponse {

	
	private int statusCode;
	private String message;
	private String discription;
	private List<StudentBean> studentbeans;
	private List<LibrarianBean> librarianbeans;
	private List<BookBean> bookbeans;
	private List<AdminBean> adminbeans;
	private List<BookBag> bookbag;

}
