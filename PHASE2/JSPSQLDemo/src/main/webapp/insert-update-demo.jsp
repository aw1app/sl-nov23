<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>   
    
    NOTE: Call this JSP like this http://localhost:8080/JSPSQLDemo/insert-update-demo.jsp?customer=Mohana&amount=25
    ot write a html form to pass the customer name and amount
    
    <sql:setDataSource var="ecommerce" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/ecommerce" user="root" password="rootroot" />
	
	
		
	<sql:update dataSource="${ecommerce}" var="count" >
	INSERT INTO orders(amount,customer_name) values(<%=request.getParameter("amount") %>,'<%=request.getParameter("customer") %>')
	</sql:update>
	
	<br><br>Inserted <c:out value="${count }"></c:out> rows
	
		
    
    
    
    