<%@page import="java.util.List"%>
<%@page import="hr.vo.DeptList"%>
<%@page import="hr.dao.DeptDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서관리</title>
</head>
<body>
	<h1>부서목록</h1>
	<p>전체 부서목록을 제공합니다.</p>

<%
	// departments 테이블에 대한 CRUD 작업이 구현된 DeptDao 객체 생성
	DeptDao deptDao = new DeptDao();

	// 모든 부서정보를 반환하는 finalAllDepts() 메소드를 실행해서 부서목록을 획득
	List<DeptList> depts = deptDao.findAllDepts();
%>	

	<table border="1">
		<thead>
			<tr>
				<th>부서아이디</th>
				<th>부서명</th>
				<th>부서관리자</th>
				<th>소재지</th>
				<th>소속 직원수</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
<%
	for (DeptList dept : depts) {
		
%>
			<tr>
				<td><%=dept.getId() %></td>
				<td><a href="detail.jsp?id=<%=dept.getId()%>"><%=dept.getName() %></a></td>
				<td><%=dept.getManagerName() %></td>
				<td><%=dept.getCity() %></td>
				<td><%=dept.getCnt() %>명</td>
				<td><a href="modifyform.jsp?id=<%=dept.getId() %>">수정</a></td>
			</tr>
<%
	}
%>			
		</tbody>
	</table>
</body>
</html>