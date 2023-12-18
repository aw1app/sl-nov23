<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="x" value="10">
</c:set>

x is :
<c:out value="${x}"></c:out>

<br>
<br>
<c:if test="${x<10}">
x is less than 10 
</c:if>

<c:if test="${x>=10}">
x is greater than or equal to 10 
</c:if>


<br>
<br>
<c:forEach var="i" begin="1" end="5">
	<br> Hello World <c:out value="${i}" />
</c:forEach>

<br><br><br><br> Jstl Format  tag demo
<c:set var="now" value="<%=new java.util.Date()%>" />
<br>Raw Date: </b> <c:out value="${now}" /></b>
<br>Formatted Date: <b><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${now}" /></b>