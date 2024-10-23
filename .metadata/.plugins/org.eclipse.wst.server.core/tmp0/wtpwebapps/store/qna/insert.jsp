<%@page import="dao.QnaDao"%>
<%@page import="vo.QnaCategory"%>
<%@page import="vo.User"%>
<%@page import="vo.Qna"%>
<%@page import="util.Utils"%>
<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%--
	요청 URL
		http://localhost/store/qna/insert.jsp
	폼 데이터
		catNo=100&title=연습&question=연습입니다....
		
	요청파라미터
		name		value
		------------------------------
		"catNo"		"100"
		"title"		"연습"
		"question"	"연습입니다...."
		------------------------------
		
	요청처리 절차
		* 요구사항- 1:1문의 입력폼에서 입력한 질문을 로그인한 사용자를
		            작성자로 지정해서 테이블에 저장한다.
		1. 로그인여부 체크한다.
		2. 요구사항 처리에 필요한 값 수집
			* 작성자 : 세션에서 로그인한 사용자번호를 수집한다.
			* 질문   : 요청파라미터에서 카테고리, 제목, 질문내용을 수집한다.
		3. Qna객체를 생성해서 수집한 정보를 저장한다.
		4. QnaDao의 insertQna(Qna qna)메소드에 Qna객체를 전달해서 
		   테이블에 저장시킨다.
		5. 1:1 문의내역을 요청하는 URL을 응답으로 보낸다.
--%>
<%
	// 로그인을 체크한다.
	if (session.getAttribute("USERNO") == null) {
		response.sendRedirect("../user/login-form.jsp?deny");
		return;
	}

	// 필요한 값을 수집한다.
	int userNo = (Integer) session.getAttribute("USERNO");
	int catNo = Utils.toInt(request.getParameter("catNo"));
	String title = request.getParameter("title");
	String question = request.getParameter("question");
	
	System.out.println("카테고리 번호: " + catNo);
	System.out.println("제목: " + title);
	System.out.println("질문내용: " + question);
	
	// Qna객체를 생성해서 수집한 값을 담는다.
	Qna qna = new Qna();
	qna.setUser(new User(userNo));
	qna.setCategory(new QnaCategory(catNo));
	qna.setTitle(title);
	qna.setQuestion(question);
	
	// QnaDao의 insertQna(Qna qna)메소드를 호출하낟.
	QnaDao qnaDao = new QnaDao();
	qnaDao.insertQna(qna);
	
	// 1:1문의 내역을 요청하는 URL을 응답으로 보낸다.
	response.sendRedirect("list.jsp");
	
%>











