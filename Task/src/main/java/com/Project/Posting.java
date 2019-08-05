package com.Project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/P1")
public class Posting extends HttpServlet
{

	  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	  {
		
		  String name = req.getParameter("name");
			 String password = req.getParameter("password");
			 String collegename= req.getParameter("collegename");
			  int studentid =Integer.parseInt(req.getParameter("studentid"));
			  String email =req.getParameter("email");
			  String contact =req.getParameter("contact");
			try {  
			  Class.forName("com.mysql.jdbc.Driver");  
			    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","techouts");  
			    Statement st = con.createStatement();
			    String sql="insert into userdetails(name,password,collegename,studentid,email,contact) values('"+name+"','"+password+"','"+collegename+"','"+studentid+"','"+email+"','"+contact+"')"; 
			    int i=st.executeUpdate(sql);
			    if(i!=0)
			    {
			    	System.out.println("data entered");
			    }
			    resp.sendRedirect("login.jsp");
			}catch(Exception e) {}	
		  
	}
		
		  
		  
		
	     
  	       
		
}		



