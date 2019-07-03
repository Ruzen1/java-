<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Object id = request.getAttribute("todo");
    ArrayList<String> todo = (ArrayList<String>)id;
    
    id=request.getAttribute("keyword");
    String keyword=(String)id;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>やることリスト</h1>
<form>
<input name ="keyword" placeholder="フィルタ" />
</form>
<form method = post>
<ol>
<% for (String e : todo) { %>
<li><%=e %>
<% } %>
	<li><input name = todo_item placeholder ="新規">
</ol>
</body>
</html>