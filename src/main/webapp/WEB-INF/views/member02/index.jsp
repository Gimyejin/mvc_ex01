<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
index.jsp
<h1>기본 페이지입니다</h1>
<h3>request : <%=request.getAttribute("index") %></h3>
<a href="login">로그인 페이지</a>  
<a href="logout">로그아웃 페이지</a>
</body>
</html>