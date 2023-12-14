package com.simpli;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCQueryDemo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();

		// 1. Loading the JDBC Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;

		try {
			// 2. Get the connection to the data base
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "rootroot");

			// 3.
			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM ORDERS");

			// 4. Process the results. Loop through all the rows of the query results
			pw.write("QUERY RESULTS <hr>");
			pw.write("<table border=1>");
			pw.write("<th>ID<th>AMOUNT<th>CUSTOMER NAME");
			while (rs.next()) {

				int orderId = rs.getInt("ORDER_ID");
				float amount = rs.getFloat("AMOUNT");
				String customerName = rs.getString("CUSTOMER_NAME");

				pw.printf("<tr> <td> %s <td> %s <td> %s", orderId, amount, customerName);
			}
			pw.write("</table>");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
