<%@page import="hr.vo.Emp"%>
<%@page import="java.util.List"%>
<%@page import="hr.dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 관리</title>
</head>
<body>
<!-- 
	요청 URL
		http://localhost/hr/emp/list.jsp
	요청 URL
		/hr/emp/list.jsp
	요청 방식
		GET
	쿼리스트링
		없음
		
	요청파라미터 정보
		없음
 -->
<%
	// 1. 전체 직원 정보를 조회하기 위해서 EmpDao 객체를 생성한다.
	EmpDao empDao = new EmpDao();

	// 2. 전체 직원 정보를 반환하는 getAllEmployees() 메소드를 실행해서
	// 전체 직원 정보를 획득한다.
	List<Emp> employees = empDao.getAllEmployees();
%>

	<h1>전체 직원 목록</h1>
	<p>전체 직원 목록을 확인하세요</p>
	
	<table border="1" style="width:90%;">
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>이메일</th>
				<th>연락처</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
<%
	for (Emp emp : employees) {
%>
			<tr>
				<td><%=emp.getId() %></td>
				<td><a href="detail.jsp?id=<%=emp.getId()%>"><%=emp.getFirstName()%><%=emp.getLastName()%></a></td>
				<td><%=emp.getEmail()%></td>
				<td><%=emp.getPhoneNumber() %></td>
				<td><a href="modifyform.jsp?id=<%=emp.getId()%>">수정</a></td>
			</tr>
<%
	}
%>
		</tbody>
	</table>
</body>
</html>