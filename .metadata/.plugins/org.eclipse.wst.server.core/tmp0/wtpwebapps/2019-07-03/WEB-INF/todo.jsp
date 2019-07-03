<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    ArrayList<String> todo = (ArrayList<String>)request.getAttribute("todo");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>todolist</title>
</head>
<body>
<h1>TO DO LIST</h1>
<form>
<input name ="keyword" placeholder="フィルタ" />
</form>

<form method = post>
<ul>
<% for (String e:todo){ %>
<li><%=e %>
<%} %></li></ul>
<li><input name = todo_item placeholder ="新規">
</ul>
</body>
</html>