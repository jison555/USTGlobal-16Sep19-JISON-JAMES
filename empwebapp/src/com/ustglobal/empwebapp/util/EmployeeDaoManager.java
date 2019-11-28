package com.ustglobal.empwebapp.util;

import com.ust.global.empwebapp.dao.EmployeeDAO;
import com.ust.global.empwebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {
	
	private EmployeeDaoManager() {}
	
	public static EmployeeDAO getEmployeeDAO()  {
		
		return new EmployeeDaoJdbcImpl();
		
	}

}
