package com.Project;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;

public class DataBase1 
{
	public static ResultSet getConnection() throws Exception {
		
			Class.forName("com.mysql.jdbc.Driver");  
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute","root","techouts");  
		    Statement st = con.createStatement();
		    ResultSet rs=st.executeQuery("select * from language");
			return  rs;
				
		  
		
		    
		  
		    
		   
	 }
	}

