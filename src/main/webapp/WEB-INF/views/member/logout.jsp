<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
logout.jsp
<br>
<h1> request : <%= request.getAttribute("key") %></h1><!-- 잘 안씀/ 밑의 두개를 잘씀 -->
<h1>requestScope : ${requestScope.key }</h1>
<h1>request(el): ${key }</h1>
이 세개다 동일한 문법
</body>
</html>