<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String msg=(String ) request.getAttribute("msg");
    out.print(msg);
  %>
<form  action="in" method="post">
<table border="1" bgcolor="blue">
<tr>
<td>name:<input type="text" name="name1"/></td></tr>
<tr>
<td>email:<input type="text" name="email"/></td></tr>
<tr>
<td>gender:<input type="radio" name="gender" value="male"/>male
          <input type="radio" name="gender" value="female"/>female
</td></tr>
<tr>
<td>dept:<select name="dept">
<option value="">select</option>
<option value="cse">cse</option>
<option value="eee">eee</option>
<option value="ece">ece</option>
<option value="civil">civil</option>
<option value="mech">mech</option>
<option value="mca">mca</option></select>
</td></tr>
<tr>
<td>exp:<select name="exp">
<option value="">select</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option></select>
</td></tr>
<tr><td><input type="submit" value="submit" align="center"/></td></tr>
</table>
<br>
<a href="view.jsp">view emp details</a>
</form>


</body>
</html>