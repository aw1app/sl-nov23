<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.simpli.*,org.hibernate.*,org.hibernate.query.*,java.util.*" %>
<%

SessionFactory sessionFactory = HibernateUtil.getSessionFactory();	
Session hibSession = sessionFactory.openSession();

Transaction tx=hibSession.beginTransaction(); 

Query query =hibSession.createQuery("update EProduct set price=:p where ID>:i");
query.setParameter("p", 10024);
query.setParameter("i", 1);

int count = query.executeUpdate();
tx.commit();
hibSession.close();
out.println("Updated "+count+ " row(s).<br>");

%>