<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String name = (String) request.getAttribute("name");
String age = (String) request.getAttribute("age");

%>


<html>
<head>
<meta charset="UTF-8">
<title>JSP の　サンプル</title>
</head>
<body>
私の名前は<%= name %>. 年齢は<%= age %>才です。
</body>
</html>