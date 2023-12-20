<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.simpli.*,org.hibernate.*,java.util.*" %>
<%

SessionFactory sessionFactory = HibernateUtil.getSessionFactory();	
Session hibSession = sessionFactory.openSession();
out.println("Hibernate Session opened.<br>");
List<com.simpli.EProduct> products = hibSession.createQuery("from EProduct").list();

for(com.simpli.EProduct p: products) {
	
	 out.println("ID: " + String.valueOf(p.getID()) +
			 ", Name: " +  p.getName() + 
			 ", Price: " + String.valueOf(p.getPrice()) +
			 ", Date Added: " + p.getDateAdded().toString() + "<br>");
	 
	 
	List<com.simpli.Color> colors = p.getColors();
	for(com.simpli.Color c : colors) {
		out.println("Available in colors " + c.getName() + "<br>");
	}
	
};	

hibSession.close();
out.println("Hibernate Session closed.<br>");

%>