package com.simpli;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.simpli.utils.DBUtil;

public class PreparedStatementInsertDemo extends HttpServlet {
	private Connection connection = null;
	
	public void init(ServletConfig config) {

		try {
			// STEP 2 Load the properties file
			InputStream in = config.getServletContext().getResourceAsStream("/WEB-INF/database.properties");
			Properties props = new Properties();
			props.load(in);
			String url = props.getProperty("url");
			String userid = props.getProperty("userid");
			String password = props.getProperty("password");

			// STEP 3 Connect to the database;
			DBUtil dbUtil = new DBUtil(url, userid, password);

			connection = dbUtil.getConnection();

		} catch (ClassNotFoundException | SQLException | IOException  e) {			e.printStackTrace(); 		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		String amtStr = request.getParameter("amount");
		float amount = Float.parseFloat(amtStr);
		
		String customerName =  request.getParameter("customer");
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO ORDERS VALUES(null,?,?)");
			
			preparedStatement.setFloat(1, amount);
			preparedStatement.setString(2, customerName);
			
			int count = preparedStatement.executeUpdate();
			
			pw.printf("<b> %s </b> inserted succesfully",count);
			
		} catch (SQLException e) {			
			e.printStackTrace();
			pw.printf("Inserted Failed!!");
		}
		
		pw.close();
		
	}

}
