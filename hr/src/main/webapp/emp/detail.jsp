<%@page import="hr.vo.EmpSalary"%>
<%@page import="hr.vo.DeptDetail"%>
<%@page import="java.util.Optional"%>
<%@page import="hr.dao.DeptDao"%>
<%@page import="hr.vo.Emp"%>
<%@page import="hr.dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원관리</title>
</head>
<body>
<!-- 
	요청 URL
		http://localhost/hr/emp/detail.jsp?id=101
	요청 URI
		/hr/emp/detail.jsp
	쿼리스트링
		id=101
		
	요청 파라미터
	name	value
	----------------------------
	id 		"101"	직원 아이디
	----------------------------
	
	1. 직원 아이디를 이용해서 직원정보를 조회한다.
	 ( 아이디, 이름, 이메일, 전화번호, 급여, 커미션, 직종아이디, 입사일, 부서아이디 )
	 
	2. 1번에서 획득한 부서아이디로 직원의 소속부서정보를 조회한다.
	 
	3. 직원아이디를 이용해서 직원급여 가상테이블에서 직원의 급여정보 조회하기
-->
	<h1>직원 상세 정보</h1>
	<p>직원의 상세정보를 확인하세요</p>
	
<%
	// 1. 요청파라미터 정보를 조회한다
	int empId = Integer.parseInt(request.getParameter("id"));

	// 2. EmpDao 객체를 생성한다.
	EmpDao empDao = new EmpDao();
	
	// 3. 직원상세정보를 제공하는 getEmployeeById() 메소드를 실행한다.
	Emp emp = empDao.getEmployeeById(empId);
	
	// 3. DeptDao 객체를 생성한다.
	DeptDao deptDao = new DeptDao();
	Optional<DeptDetail> optional = deptDao.getDeptDetail(emp.getDeptId());
	DeptDetail dept = optional.get();
	
	// 4. 직원 급여상세정보 조회한다.
	EmpSalary empSalary = empDao.getEmpSalaryById(empId);
%>
	<h3>직원 정보</h3>
	<table border="1" style="width: 90%;">
		<tr>
			<th>아이디</th><td><%=emp.getId() %></td>
			<th>이름</th><td><%=emp.getFirstName() %><%=emp.getLastName() %></td>
		</tr>
		<tr>
			<th>이메일</th><td><%=emp.getEmail() %></td>
			<th>전화번호</th><td><%=emp.getPhoneNumber() %></td>
		</tr>
		<tr>
			<th>급여</th><td><%=emp.getSalary() %></td>
			<th>커미션</th><td><%=emp.getCommissonPct() %></td>
		</tr>
		<tr>
			<th>직종</th><td><%=emp.getJobId() %></td>
			<th>입사일</th><td><%=emp.getHireDate() %></td>
		</tr>
	</table>
	
	<h3>소속 부서 정보</h3>
	<table border="1" style="width: 90%">
		<tbody>
			<tr>
				<th>부서 아이디</th>
				<td><%=dept.getId() %></td>
				<th>부서명</th>
				<td><%=dept.getName() %></td>
			</tr>
			<tr>
				<th>관리자명</th>
				<td><%=dept.getManagerName() %></td>
				<th>소재지</th>
				<td><%=dept.getCity() %></td>
			</tr>
			
		</tbody>
	</table>
	
	<h3>급여 상세 정보</h3>
	<table border="1" style="width: 90%;">
		<tr>
			<th>급여</th><td><%=empSalary.getSalary() %></td>
			<th>커미션</th><td><%=empSalary.getCommissionPct() %> </td>
		</tr>
		<tr>
			<th>연봉</th><td><%=empSalary.getAnnualSalary() %></td>
			<th>급여등급</th><td><%=empSalary.getGrade() %></td>
		</tr>
	</table>
</body>
</html>