package com.ustglobal.jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class ExecuteUpdateQuery {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		
		
		
		
		try {
			//step1 load the driver
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			//step2 getting the connection
			
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=mysql";
			conn=DriverManager.getConnection(url);
			
			
			//step3 issue sql query
			String qry="update employee_info set name='ABC',salary=50,gender='m' where id=6";
			stmt=conn.createStatement();
			int count=stmt.executeUpdate(qry);
			
			
			//step4 read the result
			
			System.out.println(count+" rows is updated ");
					
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();

		}
		finally {
			
			try {
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			}
			
		}
	}

