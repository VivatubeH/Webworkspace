<%@page import="java.util.Set"%>
<%@ page contentType="text/plain;charset=utf-8" 
	pageEncoding="utf-8"
	trimDirectiveWhitespaces="true" %>
<%
	Set<String> names = Set.of(
		"hong", "lee", "kim", "kang", "park", "ahn", 
		"hong1", "hong12", "hong123",
		"kim1",  "kim12",  "kim123",
		"kang1", "kang12", "kang123",
		"lee1",  "lee12",  "lee123"
	);

	/*
		요청 URL
			http://localhost/script/ajax1-res.jsp?id=hong
		쿼리스트링
			id=hong
		요청파라미터
			name		value
			------------------
			"id"		"hong"
	*/
	
	// 1. 요청파라미터 값을 조회한다.
	String id = request.getParameter("id");
	System.out.println("아이디: " + id);
	
	// 2. 아이디 중복여부를 확인한다.
	boolean isExist = names.contains(id);
	
	// 3. 결과를 텍스트 응답으로 보낸다.
	if (isExist) {
		out.write("exist");
	} else {
		out.write("none");
	}
%>