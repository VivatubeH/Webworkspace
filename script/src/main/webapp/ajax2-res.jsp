<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.HashMap"%>
<%@page import="hr.Employee"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@ page contentType="application/json;charset=utf-8" 
	pageEncoding="utf-8" 
	trimDirectiveWhitespaces="true"%>
<%
	Map<Integer, List<Employee>> db = new HashMap<>();
	db.put(10, List.of(
		new Employee(100, "이상현", "영업", 300, new Date()),
		new Employee(101, "박재언", "영업", 330, new Date()),
		new Employee(102, "최준수", "영업", 430, new Date())
	));
	db.put(11, List.of(
		new Employee(200, "민혜준", "기술", 300, new Date()),
		new Employee(201, "최희연", "기술", 330, new Date()),
		new Employee(202, "이은정", "기술", 430, new Date())
	));
	db.put(12, List.of(
		new Employee(300, "이승준", "홍보", 300, new Date()),
		new Employee(301, "김태윤", "홍보", 330, new Date()),
		new Employee(302, "홍기문", "홍보", 430, new Date())
	));
	db.put(13, List.of(
		new Employee(400, "차민정", "연구소", 300, new Date()),
		new Employee(401, "김근영", "연구소", 330, new Date()),
		new Employee(402, "한결", "연구소", 430, new Date()),
		new Employee(402, "정성민", "연구소", 430, new Date())
	));
	
	int no = Integer.parseInt(request.getParameter("no"));
	
	Gson gson = new Gson();
	String jsonText = gson.toJson(db.get(no));
	
	out.write(jsonText);
%>