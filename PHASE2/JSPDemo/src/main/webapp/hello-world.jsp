<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*" %>


<!--JSP Decl tag <%!  %>. Any Java variables or method definitions can be put inside this tag -->
<%! int data; %>
<% data=100; %>

<%! public int add(int a, int b){
	
	return a+b;
}; 
%>


<!--JSP Scriplet tag <%  %>. Any Java code can be put inside this tag -->
<li>
	<%
	out.println("Hello World from JSP 1 <br>");
	%>
</li>
<li>
	<%
	out.println("Hello World from JSP 2 <br>");
	%>
</li>


<br>
<!--JSP Expression tag. The code within JSP Expression tag is written to the output -->
<%=java.util.Calendar.getInstance().getTime()%>
<br>

<br>
Value of data variable is:<%=data%>

<br>
22+100 is :<%=add(22, data)%>

<br>
List Demo
<%
List<String> myList = new ArrayList<String>();
myList.add("Hi");
myList.add("Hello");
%>


<% for (int i = 0; i < myList.size(); i++) {%>
<br><%=myList.get(i)%> 
<%}%>
 