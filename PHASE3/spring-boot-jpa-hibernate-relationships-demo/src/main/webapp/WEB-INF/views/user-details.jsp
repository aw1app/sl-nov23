<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


User Details:
<li>${user.ID}
<li>${user.name} 


<br><br> 

Mobiles:<br> 

<c:forEach var="mobile" items="${user.phones}">
		<li>${mobile.number}
</c:forEach>