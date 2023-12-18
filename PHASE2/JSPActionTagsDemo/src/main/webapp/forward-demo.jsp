<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
  <jsp:include page="header.jsp"></jsp:include>
    
    Self content from this page is this WONT be seen, beacuse this page is forward it to a.jsp.

<br><br> Below is cotent included from a.jsp:<br>
    <jsp:forward page="a.jsp"></jsp:forward>
  
  