<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
    
    
    <sql:setDataSource var="ecommerce" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/ecommerce" user="root" password="rootroot" />
		
	<sql:query dataSource="${ecommerce}" sql="SELECT * FROM orders" var="result" />
	
	<br><br>Orders Table data:
	<br>
	<table border=1>
		<tr>
			<th>ORDER_ID</th>
			<th>AMOUNT</th>
			<th>CUSTOMER</th>
		</tr>
		
		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.ORDER_ID}" /></td>
				<td><c:out value="${row.AMOUNT}" /></td>
				<td><c:out value="${row.CUSTOMER_NAME}" /></td>				
			</tr>
		</c:forEach>		
				
	</table>			
    
    
    
    