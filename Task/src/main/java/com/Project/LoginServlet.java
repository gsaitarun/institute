package com.Project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String name = req.getParameter("name");
		 String password = req.getParameter("password");
		 System.out.println(name+" "+password);
		try {  
			  Class.forName("com.mysql.jdbc.Driver");  
			    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","techouts");  
			   String sql="select name,password from userdetails where name=? and password=?";
			    PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
			    st.setString(1, name);
				st.setString(2, password);
			    ResultSet rs=st.executeQuery();
			    while(rs.next())
			    {	resp.sendRedirect("index.jsp");
			        return ;
			    }
			    resp.sendRedirect("Testing.jsp");
			    return;
			   }catch(Exception e) {}	
	}
}
