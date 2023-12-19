<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<jsp:include page="header.jsp"></jsp:include>
    
    <jsp:useBean id="order1" class="com.simpli.Order" scope="session"></jsp:useBean>
    
    Order Details: <br>
     Order Id:<jsp:getProperty property="orderId" name="order1" /> <br>
     Amount: <jsp:getProperty property="amount"  name="order1" /> <br>
     Customer : <jsp:getProperty property="customerName" name="order1" /><br>
     
     
     