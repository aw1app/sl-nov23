<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!--JSP Decl tag <%!  %>. Any Java variables or method definitions can be put inside this tag -->
<%! int data=100; %>
 

<!--JSP Scriplet tag <%  %>. Any Java code can be put inside this tag -->
<li> <% out.println("Hello World from JSP 1 <br>");%>
<li> <% out.println("Hello World from JSP 2 <br>");%>


<br>
<!--JSP Expression tag. The code within JSP Expression tag is written to the output stream of the response -->
<%=java.util.Calendar.getInstance().getTime()%>
<br>

<br>
Value of data variable is:<%= data %>
