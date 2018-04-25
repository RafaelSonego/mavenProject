package com.rafaelsonego;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rafaelsonego.pojo.User;

@WebServlet(urlPatterns = { "/sampleServlet" })
public class SampleServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3177714591709998851L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User("Rafael Silva", 33);
		PrintWriter writer = resp.getWriter();
		writer.println("<html><h1>" + user.getName() + " Age: " + user.getAge() + "</h1></html>");
		writer.close();
	}
}
