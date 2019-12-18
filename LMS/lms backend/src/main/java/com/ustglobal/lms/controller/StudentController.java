package com.ustglobal.lms.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.dto.BookBag;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibraryManagementResponse;
import com.ustglobal.lms.dto.StudentBean;
import com.ustglobal.lms.service.StudentService;

@CrossOrigin(origins = "*" ,allowedHeaders = "*",allowCredentials = "true")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	//======================search Book======================================
	@PostMapping(path="/book",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)	
	public LibraryManagementResponse searchBook(@RequestBody BookBean beans) {
		
		int id = beans.getBid();
		BookBean bean=service.searchBook(id);
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(bean!=null) {
			lmr.setStatusCode(201);
			lmr.setMessage("book got successfully");
			lmr.setDiscription("book got DB");
			lmr.setBookbeans(Arrays.asList(bean));
			return lmr;
			
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("no book present");
			lmr.setDiscription("no book");
			return lmr;
		}
		
	}
	//==================================std login=================================
	
	@PostMapping(path="/stdlogin",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryManagementResponse stdLogin(@RequestBody StudentBean beans) {
		
		System.out.println("loginnnnnnnnnnnnnnn");
		int id = beans.getId();
		String password = beans.getPassword();
		System.out.println(id);
		StudentBean bean = service.loginStudent(id,password);

		System.out.println("bean="+bean);
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(bean!=null) {
			lmr.setStatusCode(201);
			lmr.setMessage("login successfully");
			lmr.setDiscription("login to Student");
			lmr.setStudentbeans(Arrays.asList(bean));
			return lmr;
			
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("no data present");
			lmr.setDiscription("no data present");
			return lmr;
		}
			
	}
	
	//=============================get all books========================================
	@GetMapping(path="/getallbooks",
			
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryManagementResponse getAllBooks() {
		
		List<BookBean> bean=service.getAllBooks();
		System.out.println("bookbean is"+bean);
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(bean!=null) {
			lmr.setStatusCode(201);
			lmr.setMessage("all books got successfully");
			lmr.setDiscription(" success");
			lmr.setBookbeans(bean);
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("books not present");
			lmr.setDiscription("books not present");
		}
		
		return lmr;
	}
	
	@GetMapping(path="/requestbook",
	
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryManagementResponse requestBook(@RequestParam int bid,@RequestParam int sid) {
		
		System.out.println("request reached in api");
	boolean req= service.makeRequest(bid, sid);
		
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(req) {
			lmr.setStatusCode(201);
			lmr.setMessage("book requested successfully");
			lmr.setDiscription("success");
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("book requested failure");
		}
		
		return lmr;
	}
	
	@GetMapping(path="/get-cart",
			
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public LibraryManagementResponse getCart(@RequestParam int id) {
		
		LibraryManagementResponse lmr =new LibraryManagementResponse();
	
		List<BookBag> bag =service.gettingCart(id);
		System.out.println("bag = "+bag);
		if(bag!=null) {
			
			lmr.setStatusCode(201);
			lmr.setMessage("success");
			lmr.setDiscription("cart got successfully");
			lmr.setBookbag(bag);
		}else {
			
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("cart not found");
			
		}
		return lmr;
	}
}
	