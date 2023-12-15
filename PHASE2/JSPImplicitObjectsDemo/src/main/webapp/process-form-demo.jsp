<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%
//response.setContentType("application/zip");

String amtStr = request.getParameter("amount");
float amount = Float.parseFloat(amtStr);

String custName = request.getParameter("customer");

out.println("You order with amount="+amount+" and customer="+custName);

//Demo response object
//response.sendRedirect("index.jsp");

//PageContext Demo
pageContext.setAttribute("attrName1", "90001", PageContext.APPLICATION_SCOPE);

session.setAttribute("session-attrName1", "ABC");

//application.getRequestDispatcher("/page2.jsp").forward(request, response);
%>


sasas
asasas
saasas
<p>asdsdsd
<p>asdsdsd
<p>asdsdsd
<p>asdsdsd

<%=pageContext.getAttribute("attrName1")%>