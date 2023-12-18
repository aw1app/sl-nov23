<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    <%! int x=10; %>
    
    <% if (x<10) {  %>
    	x is less than 10 
    <% } else {  %>
    x is greater than or equal to 10
    <% } %> 
    
    <br><br> 
    
   <% for (int i=0; i<5; i++ ) { %>
     
     <br> Hello World <%= i %> 
    
   <% } %>
   
      
   <br><br> Another approach
   
    <% for (int i=0; i<5; i++ ) { 
     
     out.println("<br> Hello World");
    
    } %>
    
    <br><br> 
    <% for (int i=1;i<6;i++){
      out.println("<br> Hello World"+i);
    } %>
    
    
    <br><br> Another approach
   
    <% for (int i=0; i<5; i++ ) { %>
     
     <%= "<br> Hello World"  %>
    
     <% } %>
     
     
    
    
    
    