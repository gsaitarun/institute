<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<style>
body{ background-image: url("background.jpg")}"
.t
{
font-size: 20px;
font-style: italic;
font-weight: bold;
}
}
</style>
<meta charset="ISO-8859-1">
<title style = "color:white">Welcome to jsp</title>
</head>
<body>
<center><div class = "t" style = "font-family :Arial, Helvetica, sans-serif"><% 
String name = request.getParameter("username");
out.println("welcome "+name+" to the jsp section"); %></center></div>
</body>
</html>