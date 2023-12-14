package com.simpli;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.simpli.utils.DBUtil;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JDBCInsertDemo extends HttpServlet {

	private Connection connection = null;;

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

		} catch (ClassNotFoundException | SQLException | IOException  e) {
			e.printStackTrace();
		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
			
		try {
			Statement stmt = connection.createStatement();
			
			int count = stmt.executeUpdate("INSERT INTO ORDERS VALUES(null,200.75,'Mr.Jalan')");
			
			pw.printf("<b> %s </b> inserted succesfully",count);			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		pw.close();

	}

}
