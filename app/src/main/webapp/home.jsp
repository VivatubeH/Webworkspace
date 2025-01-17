<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP 연습</h1>
	<h2>JSP 내장객체 - 요청객체</h2>
	
	<h3>요청객체의 주요 메소드 실행해보기</h3>
	<ul>
		<li><a href="req.jsp">req.jsp</a></li>
	</ul>
	
	<h3>쿼리스트링을 이용해서 서버에 요청파라미터 전달하기</h3>
		<li><a href="req2.jsp?opt=title&keyword=java">req2.jsp</a></li>
		<li><a href="req2.jsp?opt=title&keyword=스프링">req2.jsp</a></li>
		<li><a href="req2.jsp?opt=publisher&keyword=한빛출판사">req2.jsp</a></li>
	</ul>
	
	<h3>입력폼을 이용해서 서버에 요청파라미터 전달하기</h3>
	<form method="post" action="req2.jsp">
		<select name="opt">
			<option value="title"> 제목</option>
			<option value="writer"> 저자</option>
			<option value="publisher"> 출판사</option>
		</select>
		<input type="text" name="keyword">
		<button type="submit">검색</button>
	</form>
</body>
</html>