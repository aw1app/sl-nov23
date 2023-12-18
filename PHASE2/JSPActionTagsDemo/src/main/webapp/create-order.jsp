<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <jsp:include page="header.jsp"></jsp:include>
      
    <jsp:useBean id="order1" class="com.simpli.Order" scope="session"></jsp:useBean>
    
      <jsp:setProperty property="*" name="order1" />
      
     Your order is created!
    