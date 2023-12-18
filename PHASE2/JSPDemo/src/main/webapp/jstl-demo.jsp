<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:set var="x" value="10">
</c:set>

x is :
<c:out value="${x}"></c:out>

<br><br>
<c:if test="${x<10}">
x is less than 10 
</c:if>

<c:if test="${x>=10}">
x is greater than or equal to 10 
</c:if>


<br><br><br><br>
<c:forEach var="i" begin ="1" end = "5">
<br> Hello World <c:out value="${i}" />
</c:forEach>