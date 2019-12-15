package com.ustglobal.lms.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.dto.BookBag;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.LibraryManagementResponse;
import com.ustglobal.lms.dto.StudentBean;
import com.ustglobal.lms.service.LibrarianService;

@CrossOrigin(origins = "*" ,allowedHeaders = "*",allowCredentials = "true")
@RestController
public class LibrarianController {
	
	@Autowired
	private LibrarianService service;	
		
	
	@PostMapping(path="/lib-login",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryManagementResponse liblogin(@RequestBody LibrarianBean bean) {
		
		int id = bean.getId();
		String password=bean.getPassword();
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		
		LibrarianBean beans=service.libLogin(id, password);
		if(beans!=null) {
			lmr.setStatusCode(201);
			lmr.setMessage("login completed");
			lmr.setDiscription("success");
			lmr.setLibrarianbeans(Arrays.asList(beans));
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("login unsuccessfull");
			lmr.setDiscription("failure");
		}
		return lmr;
		
	}
	
	//=====================login ends================================
	
	
	@PostMapping(path="/add-book",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public LibraryManagementResponse addingBook(@RequestBody BookBean bean)
	{
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(service.addBook(bean)) {
			lmr.setStatusCode(201);
			lmr.setMessage("book added successfully");
			lmr.setDiscription("success");
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("data added failed to DB");
		
		}
		return lmr;
	}
//end of modify	
		
	

//delete===================	
	
	@GetMapping(path="/get-student",
			
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public LibraryManagementResponse getStudent(@RequestParam int sid)
	{
		StudentBean bean = service.getDetails(sid);
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(bean!=null) {
			lmr.setStatusCode(201);
			lmr.setMessage("student got successfully");
			lmr.setDiscription("success");
			lmr.setStudentbeans(Arrays.asList(bean));
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("student not a member");
		
		}
		return lmr;
	}
	
//get===============================================================	
	@GetMapping(path="/get-all-student",
			
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public LibraryManagementResponse getAll()
	{
		List<StudentBean> bean = service.getAllDetails();
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(bean!=null) {
			lmr.setStatusCode(201);
			lmr.setMessage("all data of student successfully");
			lmr.setDiscription("success");
			lmr.setStudentbeans(bean);
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("students data bot found in DB");
		
		}
		return lmr;
	}
	
	@GetMapping(path="/response-book",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryManagementResponse getResponse() {
		System.out.println("reached api");
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		List<BookBag> bean=service.requestedBook();
		if(bean!=null) {
			lmr.setStatusCode(201);
			lmr.setMessage("success");
			lmr.setDiscription("request got successsfully");
			lmr.setBookbag(bean);
			
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("no request available");
		}
		return lmr;
	}
	
	@PostMapping(path="/accept-book",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryManagementResponse acceptingBook(@RequestBody BookBag bag) {
		
		System.out.println("reached api");
		int bagid=bag.getBagid();
		int bagsd=bag.getStud().getId();
		System.out.println("bagid ="+bagid);
		System.out.println("bagsd ="+bagsd);
		
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		BookBag bean =service.acceptRequest(bagid);
		if(bean!=null) {
			lmr.setStatusCode(201);
			lmr.setMessage("success");
			lmr.setDiscription("request got successsfully");
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("no request available");
		}
		return lmr;
	}
	
}
	