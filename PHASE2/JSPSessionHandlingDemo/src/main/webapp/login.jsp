<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

    <%
	if (request.getParameter("error") != null && request.getParameter("error").equals("1")){
		out.println("<b>Your session has expired or is invalid userid or password.</b><br>");
    	out.println("<b><a href=\"login.html\" >Login again   </a> <br>");
	}
	else if (request.getParameter("error") != null && request.getParameter("error").equals("2")){
		out.println("<b>CREATE ORDER is available only for logged users</b><br>");
    	out.println("<b><a href=\"login.html\" >Login Here   </a> <br>");
	}	
	else{
		
	
		String userId = request.getParameter("userId");
		String pwd = request.getParameter("password");
		
		// Business logic
		if (userId == null || userId.equals("") || pwd == null || pwd.equals("")) {
			response.sendRedirect("login.jsp?error=1");
		} 
		else{
			session.setAttribute("userId", userId);
			session.setAttribute("loggedIn", "true");
			response.sendRedirect("index.jsp");
		}
	
	}
	    
    %>