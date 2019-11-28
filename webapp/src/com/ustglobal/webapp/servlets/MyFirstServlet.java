package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		ServletContext context = getServletContext();
		String companyname = context.getInitParameter("company-name");
		
		ServletConfig config = getServletConfig();
		String batchname = config.getInitParameter("batch-name");
		
		
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
			
		Date date = new Date();
		out.println("<h1 style ='color :Red'>Date and Time is:");
		out.println(date.toString());
		out.println("</h1");
		
		out.println("<h2>");
		out.println("companyname");
		out.println("</h2>");
		
		out.println("<h2>");
		out.println("batchname");
		out.println("/h2");

		
		String url = req.getRequestURI();
		String method = req .getMethod();
		out.println("<br>");
		out.println("url = "+url);
		out.println("<br>");
		out.println("method = "+method);
		
		
		out.println("</body>");
		out.println("</html>");		
	}
}
