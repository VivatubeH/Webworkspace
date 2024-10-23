<%@page import="java.util.Locale"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>요청객체의 주요 API</h1>
<%
	///////////////////////////////////
	// 요청라인 정보 조회
	///////////////////////////////////
	// 요청방식 조회하기
	String method = request.getMethod();
	// 요청URL 조회하기
	String requestURI = request.getRequestURI();

	///////////////////////////////////
	// 요청헤더 정보 조회
	//////////////////////////////////
	String accept = request.getHeader("Accept");
	String acceptEncoding = request.getHeader("Accept-Encoding");
	String acceptLanguage = request.getHeader("Accept-Language");
	String userAgent = request.getHeader("User-Agent");

	//////////////////////////////////
	// 추가적인 정보
	//////////////////////////////////
	String clientIp = request.getRemoteAddr();
	Locale locale = request.getLocale(); 
%>

	<h3>요청라인 정보</h3>
	<dl>
		<dt>요청방식</dt><dd><%=method %></dd>
		<dt>요청URL</dt><dd><%=requestURI %></dd>
	</dl>
	
	<h3>요청헤더 정보</h3>
	<dl>
		<dt>브라우저 지원하는 컨텐츠 타입</dt><dd><%=accept %></dd>
		<dt>브라우저 지원하는 압축방식</dt><dd><%=acceptEncoding %></dd>
		<dt>브라우저 지원하는 언어</dt><dd><%=acceptLanguage %></dd>
		<dt>브라우저 정보</dt><dd><%=userAgent %></dd>
	</dl>
	
	<h3>추가적인 정보</h3>
	<dl>
		<dt>클라이언트 ip주소</dt>
		<dd><%=clientIp %></dd>
		<dt>클라이언트 로케일정보</dt>
		<dd><%=locale.getLanguage() %><%=locale.getDisplayLanguage() %></dd>
	</dl>
</body>
</html>