<%@ page
    import="java.util.*, com.simpli.*" 
    language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
      
    errorPage="error.jsp"
       
    %>

    <br>
    Time now is:
    <%=Calendar.getInstance().getTime()%>
    
    <%! Car c1 = new Car("Maruti"); %>
    
    
    <br><br>
    Car model is:
    <%=c1.getModelName()%>