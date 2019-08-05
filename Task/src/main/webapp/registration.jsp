<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration form</title>
<style>
body
{
background-image:url(se.jpg);
}
.middle{
background-color:#ede6ea;
margin-left:35%;
margin-right:35%;
margin-top:50px;
width:40%;
height:80%;
/ align:center; /
bottom:20px;
}
.button{
background-color:cyan;
}
</style>
</head>
<center>
<body>

<form action="P1"  ... onsubmit="return checkForm(this);" method = "post" target="_blank">
<div class="middle">
<h2>Registration Form</h2>
<pre>
NAME        :<input type="text" required pattern="\w+" name="name" ><br>
PASSWORD    :<input type="password" name="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}"><br>
COLLEGE NAME:<input type="text" required name="collegename"><br>
STUDENT ID  :<input type="text" required name="studentid"><br>
EMAIL ID    :<input type="email"  required name="email"><br>
PHONE NUMBER:<input type="number" required name="contact"><br>
  <input class="button" type="submit" value="Save and Continue" >
</pre>
</div>
</form>
</center>



 -->
</body>
</html>