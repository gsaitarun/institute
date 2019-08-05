package com.Project;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s4")

public class Task4  extends HttpServlet
{

	  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
		{
		  
		System.out.println("jhdjhdjijsiiosjij");
		  PrintWriter out = res.getWriter();
	       
  	    ResultSet rs = null;
			try {
				rs = DataBase4.getConnection4();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  	    
  	     try {
				while(rs.next())
				          {
					out.print("<html>"
				    		+ "<head>"
				    		+ "<style>"
				    		+ "body{ background-image: url(\"background.jpg\")}"
				    		+ "</style>"
				    		+ "</head>"
				    		+ "<body>      <pre><center><tr><td>"+rs.getInt(1)+"</td>"+"     "+"<td>"+rs.getString(2)+"</td>"+"   "+"<td>"+ rs.getString(3)+"</td></tr><br></center></pre> "
				    		+ "</body>"
				    		+ "</html>");
					
				       // out.println( "<center><tr><td>"+rs.getInt(1)+"</td>"+" "+"<td>"+rs.getString(2)+"</td>"+" "+"<td>"+ rs.getString(3)+"</td></tr><br></center>");
				        String n = ( rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getString(3));
				        System.out.println(n);
				       // res.sendRedirect("index.jsp");
				          }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  	       
		}
}
