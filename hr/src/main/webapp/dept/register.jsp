<%@page import="hr.dao.DeptDao"%>
<%@page import="hr.vo.Dept"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
   		/*
   			요청 URL
   				http://localhost/hr/dept/register.jsp	
   			요청 URI
   				/hr/dept/regist.jsp
   			폼 데이터
   				name=xxx&managerId=xxx&locationId=xxx
   				
   			요청파라미터 정보
   			--------------------
   			name 			value
   			--------------------
   			name			xxx
   			managerId		xxx
   			locationId		xxx
   			--------------------
   			
   		*/
   		
   		// 요청파라미터값 조회하기
   		String name = request.getParameter("name");
   		int managerId = Integer.parseInt(request.getParameter("managerId"));
   		int locationId = Integer.parseInt(request.getParameter("locationId"));
   		
   		// Dept 객체를 생성해서 요청파라미터 값을 담는다.
   		Dept dept = new Dept();
   		dept.setName(name);
   		dept.setManagerId(managerId);
   		dept.setLocationId(locationId);
   		
   		// departments에 대한 CRUD 기능이 구현된 DeptDao 객체를 생성한다.
   		DeptDao deptDao = new DeptDao();
   		
   		// DeptDao 객체의 insertDept() 메소드에 새 부서정보가 있는 Dept객체를 전달해서 실행시킨다.
   		deptDao.insertDept(dept);
   		
   		// 부서목록을 제공해주는 list.jsp를 재요청하게 하는 응답을 보낸다.
   		response.sendRedirect("list.jsp");
%>