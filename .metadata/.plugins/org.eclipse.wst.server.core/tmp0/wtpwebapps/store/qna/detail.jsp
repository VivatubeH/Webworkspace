<%@page import="vo.Qna"%>
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
	<h1>1:1 문의 상세</h1>
	<p>1:1 문의 상세 내용과 답변을 확인하세요.</p>

<%--
	요청 URL
		http://localhost/store/qna/detail.jsp?no=10
	쿼리스트링
		no=10
	요청파라미터 정보
		name		value
		-------------------------------
		"no"		"10"
		-------------------------------
		
	요청처리 절차
		* 요구사항: 자신의 1:1문의 내역에서 특정 질문을 클릭하면
		            해당 문의에 대한 상세한 정보를 출력한다.
		1. 로그인 여부를 체크한다.
		2. 요청처리에 필요한 정보를 수집한다.
			* 사용자번호 : 로그인한 사용자와 조회하는 질문의 작성자가 동일한
			               사용자인지 체크하기 위해서
			* 질문번호
		3. 질문번호로 질문정보를 조회한다.
		4. 질문정보의 작성자 번호와 로그인한 사용자번호를 비교한다.
		    일치하면 질문 상세정보를 출력한다.
		    일치하지 않으면 오류 메세지를 출력한다.
		5. 답변상태에 따라서 수정/삭제 버튼을 활성화/비활성화한다.
 --%>
	
<%
	// 로그인 여부를 체크한다.
	if (loginedUserId == null) {
		response.sendRedirect("../user/login-form.jsp");
		return;
	}

	// 필요한 정보를 수집한다
	int userNo = (Integer) session.getAttribute("USERNO");
	int qnaNo = Utils.toInt(request.getParameter("no"));
	
	// 질문 상세정보를 조회한다.
	QnaDao qnaDao = new QnaDao();
	Qna qna = qnaDao.getQnaByNo(qnaNo);
	
%>

<%	
	// 작성자와 로그인한 사용자가 동일인이지 체크하기
	if (qna.getUser().getNo() != userNo) {
%>
		<div class="alert alert-danger">
			다른 사용자가 작성한 질문은 조회할 수 없습니다.
		</div>
		
		<div class="text-end">
			<a href="list.jsp" class="btn btn-primary float-end">목록</a>
		</div>
<%
	} else {
%>
	<table class="table">
		<colgroup>
			<col width="15%">
			<col width="35%">
			<col width="15%">
			<col width="35%">
		</colgroup>
		<tbody>
			<tr>
				<th>번호</th>
				<td><%=qna.getNo() %></td>
				<th>종류</th>
				<td><%=qna.getCategory().getName() %></td>
			</tr>
			<tr>
				<th>제목</th>
				<td colspan="3"><%=qna.getTitle() %></td>
			</tr>
			<tr>
				<th>등록일자</th>
				<td><%=qna.getCreatedDate() %></td>
				<th>수정일자</th>
				<td><%=Utils.nullToBlank(qna.getUpdatedDate()) %></td>
			</tr>
			<tr>
				<th>상태</th>
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
				<th>답변일자</th>
				<td><%=Utils.nullToBlank(qna.getAnsweredDate()) %></td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<td colspan="3">
<%
	if (qna.getFilename() != null) {
%>
					<span><%=qna.getOriginalFilename() %></span>
					<a href="download?no=<%=qna.getNo() %>" class="btn btn-outline-primary">다운로드</a>
<%
	} else {
%>
				없음
<%
	}
%>
			</tr>
			<tr>
				<th>질문내용</th>
				<td colspan="3"><%=qna.getQuestion() %></td>
			</tr>
			<!-- 
				답변이 있는 경우 아래의 내용을 표시합니다.
			 -->
<%
		if (qna.getAnswer() != null) {
%>
			<tr>
				<th>답변내용</th>
				<td colspan="3"><%=qna.getAnswer() %></td>
			</tr>
<%
		}
%>
		</tbody>
	</table>
	
	<div>
		<!-- 
			수정/삭제는 답변완료 상태일 때는 비활성화 된다.
		 -->
<%
	if ("답변완료".equals(qna.getStatus())) {
%>
		<a class="btn btn-warning disabled">수정</a>
		<a class="btn btn-danger disabled">삭제</a>
<%	
	} else {
%>
		<a href="modify-form.jsp?no=<%=qna.getNo() %>" class="btn btn-warning">수정</a>
		<a href="delete.jsp?no=<%=qna.getNo() %>" class="btn btn-danger">삭제</a>
<%		
	}
%>
		<a href="list.jsp" class="btn btn-primary float-end">목록</a>
	</div>
<%
	}
%>
</div>
</body>
</html>