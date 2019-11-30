package com.ustglobal.jpawithibernateapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectQuery {
	
	public static final String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	public static final String sql = "select * from employee_info;";
	
	public static void main(String[] args) {
		
		try(Connection conn =DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			try(ResultSet rs = pstmt.executeQuery()) {
				
				while(rs.next()) {
					
					System.out.println(rs.getInt("id"));
					System.out.println(rs.getString("name"));
					System.out.println(rs.getInt("sal"));
					System.out.println(rs.getString("gender"));
					
				}
				
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
