package com.Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase4 
{
	public static ResultSet getConnection4() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");  
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute","root","techouts");  
	    Statement st = con.createStatement();
	    ResultSet rs=st.executeQuery("select * from language4");
		return rs;
			
	}
}
