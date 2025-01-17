<%@page import="hr.dao.LocDao"%>
<%@page import="hr.vo.Loc"%>
<%@page import="hr.vo.Emp"%>
<%@page import="java.util.List"%>
<%@page import="hr.dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서관리</title>
</head>
<body>
	<h1>신규 부서 등록 페이지</h1>
	<p>부서명, 부서관리자, 부서소재지를 지정하고 새 부서를 등록시킨다.</p>
	
<%
	EmpDao empDao = new EmpDao();
	List<Emp> employees = empDao.getAllEmployees();
	
	LocDao locDao = new LocDao();
	List<Loc> locations = locDao.getAllLocations();
%>
	<form method="post" action="register.jsp">
		<div>
			<label>부서이름</label><br />
			<input type="text" name="name" />
		</div>
		<div>
			<label>부서관리자</label><br />
			<select name="managerId">
<%
	for (Emp emp : employees) {
%>
				<option value="<%=emp.getId() %>"> <%=emp.getFirstName() %> <%=emp.getLastName() %></option>
<%
	}
%>
			</select>
		</div>
		<div>
			<label>부서소재지</label><br />
			<select name="locationId">
<% 
	for (Loc loc : locations) {
%>
				<option value="<%=loc.getId() %>"> <%=loc.getCity() %>(<%=loc.getCountryId() %>)</option>
<%
	}
%>
			</select>
		</div>
		<button type="submit">등록</button>
	</form>
</body>
</html>