<%@page import="vo.Board"%>
<%@page import="dao.BoardDao"%>
<%@page import="vo.Reply"%>
<%@page import="dao.ReplyDao"%>
<%@page import="util.Utils"%>
<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%--
	요청 URL
		http://localhost/store/board/delete-reply.jsp?rno=10&bno=15&page=1
	쿼리스트링
		rno=10&bno=15&page=1
	요청파라미터 정보
		name 			value
		--------------------------
		"rno"			"10"	삭제할 댓글번호
		"bno"			"15"	게시글 번호
		"page"			"1"		요청할 페이지번호
		
	요청처리 절차
		1. 로그인여부를 체크한다.
		2. 요청처리에 필요한 값을 수집한다.
			* 요청파라미터에서 수집하는  값
				rno, bno, page
			* 세션에서 수집하는 값
				userNo
		3. rno로 댓글정보를 조회한다.
		4. 댓글작성자와 로그인한 사용자가 동일인이면 댓글을 삭제한다.
		6. 게시글 상세페이지를 재요청하는 URL을 응답으로 보낸다.
--%>
<%
	if (session.getAttribute("USERNO") == null) {
		response.sendRedirect("../user/login-form.jsp?deny");
		return;
	}
	// 로그인한 사용자번호 조회하기
	int userNo = (Integer) session.getAttribute("USERNO");

	// 요청처리에 필요한 값 수집하기
	int replyNo = Utils.toInt(request.getParameter("rno"));
	int boardNo = Utils.toInt(request.getParameter("bno"));
	int pageNo = Utils.toInt(request.getParameter("page"));
	
	// 댓글정보를 조회한다.
	ReplyDao replyDao = new ReplyDao();
	Reply reply = replyDao.getReplyByNo(replyNo);
	
	// 댓글 작성자와 로그인한 사용자가 동일인이면 댓글을 삭제한다.
	if (reply.getUser().getNo() == userNo) {
		// 댓글을 삭제한다.
		replyDao.deleteReplyByNo(replyNo);
		
		// 게시글정보의 댓글 수를 감소시킨다.
		BoardDao boardDao = new BoardDao();
		Board board = boardDao.getBoardByNo(boardNo);
		board.setReplyCnt(board.getReplyCnt() - 1);
		
		boardDao.updateBoard(board);
	}	
	
	// 게시글 상세정보를 요청하는 URL을 응답으로 보낸다.
	response.sendRedirect("detail.jsp?no=" + boardNo + "&page=" + pageNo);
%>



