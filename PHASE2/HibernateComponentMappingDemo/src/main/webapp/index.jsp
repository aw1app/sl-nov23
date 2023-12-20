<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.simpli.*,org.hibernate.*,java.util.*" %>
<%

SessionFactory sessionFactory = HibernateUtil.getSessionFactory();	
Session hibSession = sessionFactory.openSession();
out.println("Hibernate Session opened.<br>");
List<com.simpli.EProduct> products = hibSession.createQuery("from EProduct").list();

for(com.simpli.EProduct p: products) {
	
	out.println("<br><br>");
	 out.println("ID: " + String.valueOf(p.getID()) +
			 ", Name: " +  p.getName() + 
			 ", Price: " + String.valueOf(p.getPrice()) +
			 ", Date Added: " + p.getDateAdded().toString() + "<br>");
	 
	//Component Details
	out.println("Component Details: " + "<br>");
	ProductParts parts = p.getParts();
	
	out.println("HDD: " + parts.getHdd() + "<br>");
	out.println("CPU: " + parts.getCpu()+ "<br>");
	out.println("RAM: " + parts.getRam() + "<br>");
	
};	

hibSession.close();
out.println("Hibernate Session closed.<br>");

%>