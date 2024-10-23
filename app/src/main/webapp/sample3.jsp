<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>주석 연습</h1>
	
	<%
		String text = null;
	%>
	<p>내용 : <%=text %><p>
	<p>글자수: <%=text.length() %><p>
	<!-- 
		HTML 주석
		이 주석에 포함된 내용은 브라우저가 무시한다.
	 -->
	 
	 <%--
	 	JSP 주석
	 	이 주석에 포함된 내용은 Tomcat이 무시한다.
	 	이 주석에 포함된 내용은 java 코드 생성할 때 제외된다.
	  --%>
</body>
</html>