package com.simpli;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;


public class JDBCDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		
		// 1. Loading the JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.
		Connection connection  = DriverManager.getConnection("localhost:3306","root","rootroot" );
		
		//3.
		Statement stmt = connection.createStatement();
		
		stmt.executeQuery("CREATE DATABASE ecommerce");
		
		//4. Process the results
		
	}

	

}
