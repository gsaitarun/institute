<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body
{
background-image:url(es.jpg);
background-size:cover;
background-repeat:no-repeat;
height:100%;
width :100%
}

button {
  background-color:  #66ccff;
  border:  #66ccff;
  
  color: white;
  padding: 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 12px;
  width:8%;
  border-radius:16px;
  font-family: Arial, Helvetica, sans-serif
}
button1 {
  background-color:  #66ccff;
  border:  #66ccff;

  color: white;
  padding: 8px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 12px;
  width:15%;
  border-radius:16px;
  font-family: Arial, Helvetica, sans-serif
}

</style>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
<center><h1><div class ="yo" style = "color:white">login page</div></h1></center>

<form action = "Login" method ="post" target="_blank">
<center><input  name="name" type ="text" placeholder = "enter username" STYLE = "margin-top:2px"></center>
<center><input name="password" type ="password" placeholder = "enter password" STYLE = "margin-top:2px"></center>
<center><button class= "button" STYLE = "margin-top:5px">submit</center>
</form>
<pre>
<form action = "registration.jsp" method ="post">
<center><span><button  class = "button1" style : "margin-top:20px;width:25px">register</button></center></span>
</form>


</pre>

</body>
</html>