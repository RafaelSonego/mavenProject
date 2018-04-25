package com.rafaelsonego;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/sampleServlet" })
public class SampleServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3177714591709998851L;
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<html><h1>Rafael Sonego - Sample Servlet</h1></html>");
		writer.close();
	}
}
