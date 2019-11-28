package com.ustblobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ust.global.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		
		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info =  dao.auth(id, password);

		PrintWriter out = resp.getWriter();


		if(info==null) {

			out.println("<html>");
			out.println("<h4 style='color:Red'>invalid id or passsword</h4>");
			out.println("</html>");

			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.include(req, resp);
		}else {
			HttpSession session = req.getSession(true);
			session.setAttribute("info",info);
			out.print("<h1>"+session+"</h1>");
			RequestDispatcher dispatcher =req.getRequestDispatcher("/home");
			dispatcher.forward(req, resp);
		}





	}

}
