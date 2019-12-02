package com.ustglobal.springmvcassesment.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.springmvcassesment.dto.ProductBean;
import com.ustglobal.springmvcassesment.dto.RetailerBean;
import com.ustglobal.springmvcassesment.service.RetailerService;
@Controller
public class RetailerController {
	@Autowired
	private RetailerService service;// = new EmployeeServiceImpl();

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of loginPage()

	@PostMapping("/login")//after login
	public String login(int id,String password,HttpServletRequest request) {
		RetailerBean bean = service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}//end of login()

	@GetMapping
	public String registerPage() {
		return "register";
	}//end of registerPage()

	@PostMapping(path="/register")
	public String register(RetailerBean bean,ModelMap map) {
		int check = service.registerRetailer(bean);
		if(check>0) {
			map.addAttribute("msg","You Are Registered and Your Id is "+check+" please remember your Id");
		}else {
			map.addAttribute("msg","You are not Registered Please Provide Different details");
		}
		return "login";
	}//end of register()

	@GetMapping(path="/home")
	public String home(ModelMap map,
			@SessionAttribute(name = "bean",required = false)RetailerBean bean) {
		if(bean==null) {
			map.addAttribute("msg","Login First!!!!");
			return "login";
		}else {
			return "home";	
		}
	}//end of home()

	@PostMapping(path="/home")
	public String home() {
		return "home";
	}//end of home()

	@GetMapping(path="/search")
	public String search(@RequestParam("productid")int productid,ModelMap map) {
		ProductBean bean = service.searchProduct(productid);
		if(bean==null) {
			map.addAttribute("msg","Product Not Found");
		}else {
			map.addAttribute("bean",bean);
		}
		return"home";
	}

	@GetMapping(path="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//end of logout()

	@GetMapping("/updatepassword")
	public String updatePassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session!=null) {
			return "updatepassword";
		}else {
			return "login";
		}

	}//end of changePassword()

	@PostMapping("/updatepassword")
	public String updatePassword(String password,
			String confirmpassword,
			@SessionAttribute(name="bean")RetailerBean bean,
			ModelMap map) {
		if(password.equals(confirmpassword)) {
			service.updateRetailer(bean.getId(), password);
			map.addAttribute("msg","Password Changed Successfully");
		}else {
			map.addAttribute("msg","Password is Not Matching");
		}
		return "home";
	}//end of changepassword()

}
