package com.ustblobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ust.global.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession session = req.getSession(false);
		
		if(session==null) {
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
			
		}
		int id= Integer.parseInt(req.getParameter("id"));
		EmployeeDAO dao =EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info =  dao.searchEmployee(id);
		
		req.setAttribute("info", info);
		RequestDispatcher dispatcher =req.getRequestDispatcher("/search.jsp");
		dispatcher.forward(req, resp);
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.println("<a href='./home'>Home</a>");
		out.println("<a style='float:right' href='#'>Logout</a>");
		
		if(info!=null) {
		
		out.print("<table align='center'>");
		out.print("<tr>");
		out.print("<th>ID</th> <th>NAME</th> <th>EMAIL</th>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print(info.getId());
		out.print("</td>");
		
		out.print("<td>");
		out.print(info.getName());
		out.print("</td>");
		
		out.print("<td>");
		out.print(info.getEmail());
		out.print("</td>");
		
		out.print("</tr>");		
		out.print("</table>");		
		out.print("</body>");
		out.print("</html>");
		
		}else {
			out.println("<h2>No Data Found</h2>");
		}
		
	}//end of doget
	
	

}
