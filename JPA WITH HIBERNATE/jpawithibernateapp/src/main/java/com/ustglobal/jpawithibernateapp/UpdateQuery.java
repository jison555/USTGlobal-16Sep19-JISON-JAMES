package com.ustglobal.jpawithibernateapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateQuery {
	
	public static final String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	public static final String sql = "update employee_info set name='afra',sal=45500 where id=3;";
	
	public static void main(String[] args) {
		
		try(Connection conn =DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
	
			int count = pstmt.executeUpdate();
			System.out.println(count+ " is updated");
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

		
	
		
	}

}
