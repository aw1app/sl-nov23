package com.simpli;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form-processing-servlet")
public class UserLoginFormProcessingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter(); 
		
		String uname = request.getParameter("username");
		String upwd = request.getParameter("passwd");
		
		String rememberme = request.getParameter("rememberMe");
		
		System.out.printf(" user submitted  username=%s passwd=%s rememberMe=%s \n", uname, upwd,rememberme );	
		
		pw.write("Hey "+ uname + ", thanks for logging in!");
		
		pw.close();

	}

}
