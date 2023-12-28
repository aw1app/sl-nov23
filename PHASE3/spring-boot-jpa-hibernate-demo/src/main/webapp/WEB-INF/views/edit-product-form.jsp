<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div align="center">

	<form:form action="edit-product" method="post" modelAttribute="prod">

		<form:label path="name" >Product name:</form:label>
		<form:input path="name" value="${prod.name}" />
		<br />
		<form:label path="price">Product Price:</form:label>
		<form:input path="price" value="${prod.price}"/>
		<br />

		<form:button>Edit and Save</form:button>

	</form:form>