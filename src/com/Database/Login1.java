package com.Database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


@WebServlet("/Login1")
public class Login1 extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();
		
		
		 String a=request.getParameter("n1");
		 String b=request.getParameter("n2");
		
		
		try
		{
	Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/New","root","anitsingh");
	 PreparedStatement stmt=con. prepareStatement("select * from Reg1 where UserName= ? and password= ?");
	 
     stmt.setString(1, a);
     stmt.setString(2, b);
    ResultSet rs=stmt.executeQuery();
    boolean status = rs.next();
    
	 
	out.println(" Successfully Login");
	 
	response.sendRedirect("Fram");
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		Object status;
	
	}

}
