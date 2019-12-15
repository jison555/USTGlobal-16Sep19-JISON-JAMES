package com.ustglobal.lms.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.dto.AdminBean;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.LibraryManagementResponse;
import com.ustglobal.lms.dto.StudentBean;
import com.ustglobal.lms.service.AdminService;
import com.ustglobal.lms.service.StudentService;

@CrossOrigin(origins = "*" ,allowedHeaders = "*",allowCredentials = "true")
@RestController
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	
	@PostMapping(path="/admin-login",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryManagementResponse adminLogin(@RequestBody AdminBean bean) {
		
		int id=bean.getId();
		String password=bean.getPassword();
		AdminBean beans=service.adminLogin(id, password);
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		
		if(beans!=null) {
			
			lmr.setStatusCode(201);
			lmr.setMessage("login successful");
			lmr.setDiscription("success");
			lmr.setAdminbeans(Arrays.asList(beans));
		}else {
			
			lmr.setStatusCode(401);
			lmr.setMessage("login fails");
			lmr.setDiscription("failure");
			
		}
		return lmr;
	}
	
	
	//===============================student registration============================
	
	@PostMapping(path="/admin-reg-student",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public LibraryManagementResponse regstudent(@RequestBody StudentBean bean){
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(service.addStudent(bean)) {
			lmr.setStatusCode(201);
			lmr.setMessage("success");
			lmr.setDiscription("registration is successfull");
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("registration failure");
		
		}
		return lmr;
	}

	
	//===================librarian registration============================
	
	@PostMapping(path="/admin-add-lib",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public LibraryManagementResponse addlibrarian(@RequestBody LibrarianBean bean)
	{
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(service.addLibrarian(bean)) {
			lmr.setStatusCode(201);
			lmr.setMessage("success");
			lmr.setDiscription("data added to DB");
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("data not added to DB");
		
		}
		return lmr;
	}
	
	//===================delete student==================================
	
	@GetMapping(path="/admin-delete-std",
			
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public LibraryManagementResponse deleteStudent(@RequestParam int id)
	{
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(service.deleteStudent(id)) {
			lmr.setStatusCode(201);
			lmr.setMessage("delete successfully");
			lmr.setDiscription("data deleted DB");
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("data deleted DB");
		
		}
		return lmr;
	}
	
	
	
	
	//=================delete librarian========================================
	

	@GetMapping(path="/admin-delete-lib",
			
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public LibraryManagementResponse deleteLibrarian(@RequestParam int id)
	{
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(service.deleteLibrarian(id)) {
			lmr.setStatusCode(201);
			lmr.setMessage("delete successfully");
			lmr.setDiscription("data deleted DB");
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("data deleted DB");
		
		}
		return lmr;
	}
	
	//============================get singlStudent=============================
	
	
	@GetMapping(path="/admin-getstudent",
	
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public LibraryManagementResponse get(@RequestParam int id){
		
		StudentBean bean = service.getDetails(id);
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(bean!=null) {
			lmr.setStatusCode(201);
			lmr.setMessage("delete successfully");
			lmr.setDiscription("data deleted DB");
			lmr.setStudentbeans(Arrays.asList(bean));
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("data deleted DB");
		
		}
		return lmr;
	}
	

	
	//==========================get all students=====================
	
	@GetMapping(path="/admin-get-all-student",
			
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public LibraryManagementResponse getAll()
	{
		List<StudentBean> bean = service.getAllStudent();
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
	
	
	//=============================get allLibrarian==================
	
	@GetMapping(path="/admin-get-all-librarian",
			
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public LibraryManagementResponse getAllLibrarian()
	{
		List<LibrarianBean> bean = service.getAllLibrarian();
		LibraryManagementResponse lmr = new LibraryManagementResponse();
		if(bean!=null) {
			lmr.setStatusCode(201);
			lmr.setMessage("all data of student successfully");
			lmr.setDiscription("success");
			lmr.setLibrarianbeans(bean);
		}else {
			lmr.setStatusCode(401);
			lmr.setMessage("failure");
			lmr.setDiscription("students data bot found in DB");
		
		}
		return lmr;
	}
	

	//===============search Allbook======================================
	
	
	@GetMapping(path="/admin-getallbooks",
			
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
	
	//========================search single book===========================
	
	@PostMapping(path="/admin-book",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)	
	public LibraryManagementResponse searchBook(@RequestBody BookBean beans,HttpServletRequest request) {
		
		HttpSession session=request.getSession();
		//StudentBean stdbean=(StudentBean) session.getAttribute("bean");
		System.out.println("bean in book "+session);
		
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

}
