package fr.uphf;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Receive one invocation in the server");
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\" />");
		out.println("<title>Second</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		Date currentDate = new Date();
		//Add more java code (query a database, call a web service... etc)
		
		out.println("<p>Date!!" + currentDate.toLocaleString() + "!</p>");
		
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\" />");
		out.println("<title>Second</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		Date currentDate = new Date();
		out.println("<p>Post message!!" + currentDate.toLocaleString() + "!</p>");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}