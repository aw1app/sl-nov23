package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) {
		/// open  DB connection
		/// open the file handles foor reading writing 
		
		System.out.println("Inside init method");
		
		String dbusername = config.getInitParameter("dbusername");
		String dbpassword = config.getInitParameter("dbpassword");
		
		System.out.printf("DB username and password as configured in the web.xml for this servlet is : %s and %s\n",dbusername,dbpassword );
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside doGet method");
		PrintWriter pw = response.getWriter(); // CTRL +Shift + O

		pw.write("<b>Hello</b> World, GET!");
		
		ServletContext sc = request.getServletContext();
		String serverInfo = sc.getServerInfo();		
		
		pw.write("<br> This server's serverInfo " + serverInfo);
		
		// Include the content of some other servlet
		sc.getRequestDispatcher("/SomeServlet").include(request, response);
		
		// continue with our's
		pw.write("<br> TExtra content from the current HW servlet " + serverInfo);

		pw.close();
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter(); 

		pw.write("<b>Hello</b> World, POST!");

		pw.close();
	}
	
	public void destroy() {
		/// closing DB connection
		/// close the file handles
		System.out.println("Inside destroy()   ");
	}

}
