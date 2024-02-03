<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href ="index.jsp">add new data</a>
<form action="select" method="post">
<table border="1">
<tr>
<td>gender</td><td><select name="gender">
<option value="">select</option>
           <option value="male">male</option>
           <option value="female">female</option>
</select>
</td>
</tr>
<tr>
<td>dept</td><td><select name="dept">
<option value="">select</option>
<option value="cse">cse</option>
<option value="eee">eee</option>
<option value="ece">ece</option>
<option value="civil">civil</option>
<option value="mech">mech</option>
<option value="mca">mca</option></select>
</td></tr>
<tr>
<td>exp</td><td><select name="exp">
<option value="">select</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option></select>
</td></tr>
<tr><td><input type="submit" value="search"/></td></tr>
</table>
</form>
<hr/>
<table><thead>
<tr><th>s.no</th><th>name</th><th>gender</th><th>empdept</th>
<th>exp</th>
</tr></thead>
<tbody>
<c:forEach items="${emps}" var="employee" varStatus="index">
       <tr>
       <td>${index.count }</td>
       <td>${employee.ename}</td>
       
       <td>${employee.gender }</td>
       <td>${employee.empdept }</td>
       <td>${ employee.experience}</td></tr>
</c:forEach>

</tbody>
</table>
</body>
</html>