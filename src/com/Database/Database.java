package com.Database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class Database
 */
@WebServlet("/Database")
public class Database extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();
		
	String a,b,c,d,f;
	a=req.getParameter("n1");
	b=req.getParameter("n2");
	c=req.getParameter("n3");
	d=req.getParameter("n4");
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/New","root","anitsingh");
		 
		 Statement stmt=con.createStatement();
		 stmt.execute("insert into Reg1 values('"+a+"','"+b+"','"+c+"','"+d+"')");
		 out.println("Record inserted Successfully");
		 response.sendRedirect("login.jsp");
		  
		
	}
	catch(Exception e){
		out.println(e);
	}
	}

}
