<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
HttpSession sess = request.getSession();

if(sess.getAttribute("login")==null){
response.setStatus(401);
response.getWriter().append("Not Login");
return;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
WELCOME
</body>
</html>