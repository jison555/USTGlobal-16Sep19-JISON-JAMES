package com.ustglobal.empspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.empspringmvc.dto.EmployeeBean;
import com.ustglobal.empspringmvc.service.EmployeeService;

@Controller
public class EmployeeControler {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor editor= new CustomDateEditor(format,true);
		binder.registerCustomEditor(Date.class,editor);
	}
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/login")
	public String loginPage() {
		
		return "login";
	}
//end of login page =======================================
	@PostMapping("/login")
	public String login(int id,String password,HttpServletRequest request) {
		
		EmployeeBean bean = service.login(id,password);
		if(bean==null) {
			request.setAttribute("msg", "invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();            //making the session value
			session.setAttribute("bean",bean);
			return "home";
		}
	}
//end of login===========================================
	
	
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
//end of register page=====================================	
	
	@PostMapping("/register")
	public String register(EmployeeBean bean,ModelMap map) {
		
		int check = service.register(bean);
		if(check>0) {
			map.addAttribute("msg","you are Registered and ID is "+check);
		}else {
			map.addAttribute("msg","email is repeated");
		}
		return "login";
	}
//end of register======================================================	
	
	@GetMapping("/home")
	public String home(ModelMap map,
			@SessionAttribute(name = "bean" , required=false) EmployeeBean bean) {
		
		if(bean==null) {
			map.addAttribute("msg","Login First!!!");
			return "login";
		}else {
			return "home";
		}
	}
//end of home=============================================================
	@PostMapping("/home")
	public String home() {                          //if it come here it is already loggedin so just go back to home page
		
		return "home";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("id") int id,
			ModelMap map) {
		
		EmployeeBean bean = service.searchEmployee(id);
		if(bean==null) {
			map.addAttribute("msg","data not found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}
	
//end of home=========================================================	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
//end of logout	
	
	@PostMapping("/delete")
	public String deleteProfile(HttpSession session) {
		
		EmployeeBean bean = (EmployeeBean)session.getAttribute("bean");
		try {
		service.deleteEmployee(bean.getId());
		session.invalidate();
	}catch (Exception e) {
		e.printStackTrace();
	}
		session.invalidate();
		return "login";
}
	
	
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {
		
		HttpSession session = request.getSession(false);
		if(session!=null) {
		return "changepassword";
	}else {
		return "login";
	}
}
	
	@PostMapping("/changepassword")
	public String changePassword(String password,
			String confirmpassword,
			@SessionAttribute(name="bean")EmployeeBean bean,
			ModelMap map) {
		
		if(password.equals(confirmpassword)) {
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg","password is changed");
		}else {
			map.addAttribute("msg", "password not matching");
		}
		return "home";
	}
	
	@GetMapping("/update")
	public String updateProfile(@SessionAttribute(name="bean")EmployeeBean bean) {
		
		if(bean!=null) {
			return "updateprofile";
		}else {
			return "login";
		}	
		
	}
	
	
	@PostMapping("/update") 
	public String updateProfile(EmployeeBean empbean,@SessionAttribute(name="bean")EmployeeBean bean,ModelMap map) {
		
		
		if(bean!=null) {
			
			System.out.println(bean.getId());
			empbean.setId(bean.getId());
			boolean value=service.updateEmployee(empbean);
			if(value) {
				bean.setName(empbean.getName());
				bean.setEmail(empbean.getEmail());
				bean.setGender(empbean.getGender());
				bean.setPassword(empbean.getPassword());
				bean.setDoj(empbean.getDoj());
				
				map.addAttribute("msg","profile is updated");
			}else {
				
				map.addAttribute("msg","profile id not updated");
			}
		}
		
		return "login";
	}
		
	
	
}
