<%@page import="java.util.Date" trimDirectiveWhitespaces="true"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>표현식 연습</h1>
<%
	String text = "Java Platform, Standard Edition & Java Development Kit";

	Date now = new Date();
%>
	<p>내용:<%=text %></p>
	<p>글자수:<%=text.length() %></p>
	<p>현재 날짜와 시간:<%=now %></p>
	<p>현재 날짜와 시간:<%=now.toString() %></p>
</body>
</html>