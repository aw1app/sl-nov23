package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DashboardServlet extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		
		 String userId = req.getParameter("userid");
		 
         if (userId == null ) {
        	 pw.println("No UserId was found in the URL.<br>");
         } else {
        	 pw.println("UserId obtained from URL Rewriting:" + userId + "<br>");
         }
         
         pw.close();
	}
	
}
