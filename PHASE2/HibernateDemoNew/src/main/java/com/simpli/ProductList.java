package com.simpli;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/product-list")
public class ProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Get the Writer object
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// Get the SessionFactory object and the Session object
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		//Business Logic
		List<EProduct> products = session.createQuery("from EProduct").list();
		
		for(EProduct p: products) {
			
			 out.println("ID: " + String.valueOf(p.getID()) +
					 ", Name: " +  p.getName() + 
					 ", Price: " + String.valueOf(p.getPrice()) +
					 ", Date Added: " + p.getDateAdded().toString() + "<br>");
			 
			 
			List<Color> colors = p.getColors();
			for(Color c : colors) {
				out.println("Available in colors " + c.getName() + "<br>");
			}
			
		};	
		
		
		out.println("</body></html>");
		out.close();
	}

}
