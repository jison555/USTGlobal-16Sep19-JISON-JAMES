package com.ustglobal.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public class HelloController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor editor= new CustomDateEditor(format,true);
		binder.registerCustomEditor(Date.class,editor);
	}
	
	@RequestMapping(path="/hello/{name1}/{id1}")           //HandlerMapping will map to this method
	public String hello(@PathVariable("name")String name1,
						@PathVariable("id") int id1,
						@RequestParam("name")String name,
						@RequestParam("id") int id,
						ModelMap map) {
		
		
		map.addAttribute("msg","Hello World");//instead of request object we use ModelMap
		map.addAttribute("name",name);
		map.addAttribute("id",id);
		
		map.addAttribute("name", name1);
		map.addAttribute("id", id1);
		
		
		return "index";                        //controller will pass this String object to DispatcherServlet
											//and this will pass to viewResolver get the current path from root-servlet.xml							
	}
		@RequestMapping(path="form")  //by default it is GET
		public String formPage() {
			
			return "form";	
	}
		@RequestMapping(path="/form",method = RequestMethod.POST) //by default it is GET
		public String form(Employee employee,
							ModelMap map) {
			
			map.addAttribute("id",employee.getId());
			map.addAttribute("name",employee.getName());
			map.addAttribute("password",employee.getPassword());
			map.addAttribute("gender",employee.getGender());
			map.addAttribute("doj",employee.getDoj());
			
			
			return "formOutput";
		}
		
		@RequestMapping(path="create-cookie")                         //create cookie
		public String createCookie(ModelMap map,
									HttpServletResponse response) {
			
			Cookie cookie = new Cookie("name","Divya");
			response.addCookie(cookie);
			return "createcookie";
		}
		
		@RequestMapping(path="read-cookie")                             //reading cookie
		public String readCookie(ModelMap map,
								@CookieValue(name = "name" ,required=false) String name) {
			
			map.addAttribute("name", name);
			return "readcookie";
		}
		@RequestMapping(path="/redirect")
		public String redirect() {
			
			
			return "redirect: https://www.google.com";
		}
		
		@RequestMapping(path="forward")
		public String forward() {
			
			return "forward:/create-cookie";
		}

}
