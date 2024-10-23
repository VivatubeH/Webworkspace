<%@page import="vo.Qna"%>
<%@page import="java.util.List"%>
<%@page import="util.Pagination"%>
<%@page import="dao.QnaDao"%>
<%@page import="util.Utils"%>
<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>애플리케이션</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</head>
<body>
<%
	String menu = "문의";
%>
<%@ include file="../common/nav.jsp" %>

<div class="container mt-4 mb-5">
	<h1>내 문의 내역</h1>
	<p>내 문의 내역을 확인하세요. 새 1:1 문의를 등록해보세요.</p>
<%--
	요청 URL
		http://localhost/store/qna/list.jsp
		http://localhost/store/qna/list.jsp?page=2
	쿼리스트링
		page=2
	요청파라미터정보
		name		value
		--------------------------------
		"page"		"2"
		--------------------------------
		
	요청처리 절차
		* 요구사항 : 로그인한 그 사용자의 1:1문의 내역이 표시된다.
		1. 로그인여부를 체크한다.
			* 비로그인 상태라면 user/login-form.jsp?deny를 응답으로 보낸다.
		2. 필요한 정보를 수집한다.
			* 로그인한 사용자의 사용자번호 수집
			* 요청파라미터 정보에서 요청한 페이지번호 수집
		3. 사용자번호를 전달해서 해당 사용자가 작성한 문의 갯수를 조회한다.
		4. Pagination 객체를 생성한다.
		5. 조회범위에 맞는 문의 내역을 조회한다.
		6. 조회된 문의내역을 표시한다.
		7. 페이지 내비게이션를 표시한다.
 --%>
 <%
 	// 로그인 여부를 체크한다.
 	if (loginedUserId == null) {
 		response.sendRedirect("../user/login-form.jsp?deny");
 		return;
 	}
 	// 필요한 정보를 수집한다.
 	int userNo = (Integer) session.getAttribute("USERNO");
 	int pageNo = Utils.toInt(request.getParameter("page"), 1);
 	
 	QnaDao qnaDao = new QnaDao();
 	// 로그인한 사용자가 작성한 총 문의갯수를 조회한다.
 	int totalRows = qnaDao.getTotalRowsByUserNo(userNo);
 	// Pagination객체를 생성한다.
 	Pagination pagination = new Pagination(pageNo, totalRows);
 	
 	// 요청한 페이지번호에 맞는 문의 내역을 조회한다.
 	int begin = pagination.getBegin();
 	int end = pagination.getEnd();
 	List<Qna> qnaList = qnaDao.getQnaListByUserNo(userNo, begin, end);
 %>
	
	<table class="table">
		<colgroup>
			<col width="10%">
			<col width="*">
			<col width="15%">
			<col width="15%">
			<col width="15%">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>상태</th>
				<th>등록일자</th>
				<th>답변일자</th>
			</tr>
		</thead>
		<tbody>
			<!-- 
				등록된 질문이 하나도 없으면 아래의 내용이 출력된다.
			 -->
<%
	if (qnaList.isEmpty()) {
%>
			<tr>
				<td colspan="5" class="text-center">등록된 질문이 없습니다.</td>
			</tr>
<%
	} 
%>
			
			<!-- 
				등록된 질문이 하나 이상 있으면 아래와 같이 출력된다.
			 -->
<%
	for (Qna qna : qnaList) {
%>
			<tr>
				<td><%=qna.getNo() %></td>
				<td><a href="detail.jsp?no=<%=qna.getNo() %>"><%=qna.getTitle() %></a></td>
				<td>
<%
		if ("답변대기".equals(qna.getStatus())) {
%>
					<span class="badge text-bg-secondary">답변대기</span>
<%
		} 
		if ("답변완료".equals(qna.getStatus())) {
%>
					<span class="badge text-bg-primary">답변완료</span>
<%
		}
%>
				</td>
				<td><%=qna.getCreatedDate() %></td>
				<td><%=Utils.nullToBlank(qna.getAnsweredDate()) %></td>
			</tr>
<%
	}
%>
		</tbody>
	</table>
	
<%
	if (pagination.getTotalRows() > 0) {
		boolean isFirst = pagination.isFirst();		// 첫페이지인지 여부
		boolean isLast = pagination.isLast();		// 마지막페이지인지 여부
		int prevPage = pagination.getPrev();		// 이전페이지번호
		int nextPage = pagination.getNext();		// 다음페이지번호
		int beginPage = pagination.getBeginPage();	// 시작페이지번호
		int endPage = pagination.getEndPage();		// 끝페이지번호
%>
	<div>
		<ul class="pagination justify-content-center">
			<li class="page-item">
				<a class="page-link <%=isFirst ? "disabled" : "" %>" 
					href="list.jsp?page=<%=prevPage %>">이전</a>
			</li>
<%
		for (int num = beginPage; num <= endPage; num++) {
%>
			<li class="page-item <%=num == pageNo ? "active" : "" %>">
				<a class="page-link" 
					href="list.jsp?page=<%=num %>"><%=num %></a>
			</li>
<%
		}
%>
			<li class="page-item">
				<a class="page-link <%=isLast ? "disabled" : "" %>" 
					href="list.jsp?page=<%=nextPage %>">다음</a>
			</li>
		</ul>
	</div>
<%
	}
%>
	
	<div class="text-end">
		<a href="form.jsp" class="btn btn-primary">새 1:1문의</a>
	</div>
</div>
</body>
</html>