package com.simpli;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class VotingDecisionServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();

		String ageStr = request.getParameter("age");
		int age = Integer.parseInt(ageStr);

		if (age < 18)
			request.getRequestDispatcher("/VotingNotPossibleServlet").forward(request, response);
		else
			request.getRequestDispatcher("/VotingPossibleServlet").forward(request, response);

		pw.write("Some thing extra from VotingDecisionServlet");

		pw.close();
	}

}
