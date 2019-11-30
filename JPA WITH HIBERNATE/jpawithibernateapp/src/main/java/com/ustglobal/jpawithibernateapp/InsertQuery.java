package com.ustglobal.jpawithibernateapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertQuery {
	
	public static final String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	public static final String sql = "insert into employee_info values(4,'wazim',23000,'m');";
	
	public static void main(String[] args) {
		
		try(Connection conn =DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
	
			int count = pstmt.executeUpdate();
			System.out.println(count+ " is inserted");
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

		
	
		
	}

}
