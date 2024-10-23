<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>스트립틀릿 연습</h1>
<%
	// 야유회 참석자 명단을 조회하였음.
	ArrayList<String> names = new ArrayList<>();
	names.add("홍길동");
	names.add("김유신");
	names.add("강감찬");
	names.add("이순신");
	names.add("류관순");
	names.add("안창호");
	names.add("윤봉길");
	names.add("안중근");
%>

	<h3>야유회 참석자 명단</h3>
	<ul>
<%
	for (String name : names) {
%>		
		<li><%=name %></li>	
<%		
	}
%>
	</ul>
</body>
</html>