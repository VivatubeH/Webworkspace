/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.26
 * Generated at: 2024-09-24 03:06:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import dao.ReplyDao;
import vo.Reply;
import java.util.List;
import vo.Like;
import vo.Board;
import dao.BoardDao;
import util.Utils;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/common/nav.jsp", Long.valueOf(1724373072163L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(10);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("vo.Board");
    _jspx_imports_classes.add("dao.BoardDao");
    _jspx_imports_classes.add("vo.Reply");
    _jspx_imports_classes.add("util.Utils");
    _jspx_imports_classes.add("vo.Like");
    _jspx_imports_classes.add("dao.ReplyDao");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"utf-8\">\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("	<title>애플리케이션</title>\r\n");
      out.write("	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	String menu = "게시판";

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

	String loginedUserId = (String) session.getAttribute("USERID");
	String loginedUserName = (String) session.getAttribute("USERNAME");

      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
      out.write("				<a class=\"nav-link ");
      out.print("홈".equals(menu) ? "active" : "" );
      out.write("\" href=\"/store/index.jsp\">홈</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
      out.write("				<a class=\"nav-link ");
      out.print("상품".equals(menu) ? "active" : "" );
      out.write("\" href=\"/store/product/list.jsp\">상품</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
      out.write("				<a class=\"nav-link ");
      out.print("게시판".equals(menu) ? "active" : "" );
      out.write("\" href=\"/store/board/list.jsp\">게시판</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
      out.write("				<a class=\"nav-link ");
      out.print("상품관리".equals(menu) ? "active" : "" );
      out.write("\" href=\"/store/admin/product/home.jsp\">상품관리</a>\r\n");
      out.write("			</li>\r\n");
      out.write("		</ul>\r\n");

	if (loginedUserName != null) {

      out.write("\r\n");
      out.write("		<span class=\"navbar-text\">\r\n");
      out.write("			<strong class=\"fw-bold text-white\">");
      out.print(loginedUserName );
      out.write("</strong>님 환영합니다.\r\n");
      out.write("		</span>\r\n");
		
	}

      out.write("\r\n");
      out.write("		<ul class=\"navbar-nav\">\r\n");

	if (loginedUserId == null) {

      out.write("\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
      out.write("				<a class=\"nav-link ");
      out.print("로그인".equals(menu) ? "active" : "" );
      out.write("\" href=\"/store/user/login-form.jsp\">로그인</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
      out.write("				<a class=\"nav-link ");
      out.print("회원가입".equals(menu) ? "active" : "" );
      out.write("\" href=\"/store/user/form.jsp\">회원가입</a>\r\n");
      out.write("			</li>\r\n");

	} else {

      out.write("\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
      out.write("				<a class=\"nav-link ");
      out.print("문의".equals(menu) ? "active" : "" );
      out.write("\" href=\"/store/qna/list.jsp\">내 문의내역</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
      out.write("				<a class=\"nav-link ");
      out.print("장바구니".equals(menu) ? "active" : "" );
      out.write("\" href=\"/store/cart/list.jsp\">장바구니</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
      out.write("				<a class=\"nav-link\" href=\"/store/user/logout.jsp\">로그아웃</a>\r\n");
      out.write("			</li>\r\n");
		
	}

      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("<div class=\"container mt-4 mb-5\">\r\n");
      out.write("	<h1>게시글 상세정보</h1>\r\n");
      out.write("	<p>게시글 상세정보와 댓글을 확인해보세요.</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	if (request.getParameter("error") != null) {

      out.write("\r\n");
      out.write("	<div class=\"alert alert-danger\">\r\n");
      out.write("		수정/삭제는 게시글 작성자만 가능합니다.\r\n");
      out.write("	</div>\r\n");

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	// 요청파라미터값을 조회한다.
	int no = Utils.toInt(request.getParameter("no"));
	int pageNo = Utils.toInt(request.getParameter("page"), 1);
	
	// 전달받은 게시글번호에 해당하는 게시글 상세정보를 조회한다.
	BoardDao boardDao = new BoardDao();
	Board board = boardDao.getBoardByNo(no);

      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<table class=\"table\">\r\n");
      out.write("		<colgroup>\r\n");
      out.write("			<col width=\"15%\">\r\n");
      out.write("			<col width=\"35%\">\r\n");
      out.write("			<col width=\"15%\">\r\n");
      out.write("			<col width=\"35%\">\r\n");
      out.write("		</colgroup>\r\n");
      out.write("		<tbody>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>번호</th>\r\n");
      out.write("				<td>");
      out.print(board.getNo() );
      out.write("</td>\r\n");
      out.write("				<th>작성자</th>\r\n");
      out.write("				<td>");
      out.print(board.getUser().getName() );
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>제목</th>\r\n");
      out.write("				<td colspan=\"3\">");
      out.print(board.getTitle() );
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>조회수</th>\r\n");
      out.write("				<td>");
      out.print(Utils.toCurrency(board.getViewCnt()) );
      out.write("</td>\r\n");
      out.write("				<th>댓글수</th>\r\n");
      out.write("				<td>");
      out.print(Utils.toCurrency(board.getReplyCnt()) );
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>등록일</th>\r\n");
      out.write("				<td>");
      out.print(board.getCreatedDate() );
      out.write("</td>\r\n");
      out.write("				<th>수정일</th>\r\n");
      out.write("				<td>");
      out.print(Utils.nullToBlank(board.getUpdatedDate()) );
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>내용</th>\r\n");
      out.write("				<td colspan=\"3\">");
      out.print(board.getContent() );
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</tbody>\r\n");
      out.write("	</table>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write(' ');

 	// 게시글에 대한 수정/삭제 가능여부를 판정한다.
 	// 로그인되어 있고, 로그인한 사용자번호와 게시글의 작성자번호가
 	// 같은 때 true로 판정한다.
 	boolean canLike = false;
 	boolean showMyLike = false;
 	boolean canModify = false;
 	if (loginedUserId != null) {
 		canLike = true; 		
 		int loginedUserNo = (Integer) session.getAttribute("USERNO");
 		// 로그인한 사용자가 이 게시글에 좋아요를 했는지 조회
 		Like savedLike = boardDao.getLikeByBoardNoAndUserNo(no, loginedUserNo);
 		if (savedLike != null) {
 			showMyLike = true;	// 이 게시글에 좋아요를 했다.
 		}
 		if (loginedUserNo == board.getUser().getNo()) {
 			canModify = true;
 		}
 	}
 	
 
      out.write("\r\n");
      out.write("	<div>\r\n");

	if (canLike) {

      out.write("\r\n");
      out.write("		<a href=\"like.jsp?no=");
      out.print(no );
      out.write("&page=");
      out.print(pageNo );
      out.write("\" \r\n");
      out.write("			class=\"btn btn-outline-success position-relative\">\r\n");
      out.write("			좋아요\r\n");
      out.write("			<i class=\"bi ");
      out.print(showMyLike ? "bi-heart-fill": "bi-heart" );
      out.write("\"></i>\r\n");
      out.write("			<span class=\"position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger\">");
      out.print(board.getLikeCnt() );
      out.write("</span>\r\n");
      out.write("		</a>\r\n");

	} else {

      out.write("\r\n");
      out.write("		<a href=\"\" class=\"btn btn-outline-secondary  position-relative disabled\">			\r\n");
      out.write("			좋아요\r\n");
      out.write("			<span class=\"position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger\">");
      out.print(board.getLikeCnt() );
      out.write("</span>\r\n");
      out.write("		</a>\r\n");
	
	}

      out.write('\r');
      out.write('\n');

	if (canModify) {

      out.write("\r\n");
      out.write("	<div class=\"float-end\">\r\n");
      out.write("		<a href=\"modify-form.jsp\" class=\"btn btn-warning\">수정</a>\r\n");
      out.write("		<a href=\"delete.jsp?no=");
      out.print(no );
      out.write("\" class=\"btn btn-danger\">삭제</a>\r\n");
      out.write("		<a href=\"list.jsp?page=");
      out.print(pageNo );
      out.write("\" class=\"btn btn-primary\">목록</a>\r\n");
      out.write("	</div>\r\n");
 
	} else {

      out.write("\r\n");
      out.write("	<div class=\"float-end\">\r\n");
      out.write("		<a href=\"\" class=\"btn btn-secondary disabled\">수정</a>\r\n");
      out.write("		<a href=\"\" class=\"btn btn-secondary disabled\">삭제</a>\r\n");
      out.write("		<a href=\"list.jsp?page=");
      out.print(pageNo );
      out.write("\" class=\"btn btn-primary\">목록</a>\r\n");
      out.write("	</div>\r\n");

	}

      out.write("\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");

	if (loginedUserId != null) {

      out.write("\r\n");
      out.write("	<form class=\"border bg-light p-3 mt-3\" method=\"post\" \r\n");
      out.write("		action=\"insert-reply.jsp\">\r\n");
      out.write("		<input type=\"hidden\" name=\"bno\" value=\"");
      out.print(board.getNo() );
      out.write("\" />\r\n");
      out.write("		<div class=\"mb-3\">\r\n");
      out.write("			<textarea rows=\"3\" class=\"form-control\" name=\"content\"></textarea>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"text-end\">\r\n");
      out.write("			<button type=\"submit\" class=\"btn btn-primary btn-sm\">등록</button>\r\n");
      out.write("		</div>\r\n");
      out.write("	</form>\r\n");

	}

      out.write("\r\n");
      out.write("	\r\n");

	// 게시글의 댓글 조회하기
	ReplyDao replyDao = new ReplyDao();
	List<Reply> replyList = replyDao.getReplyListByBoardNo(board.getNo());

      out.write("\r\n");
      out.write("	<div class=\"mt-3\">\r\n");

	int userNo = -1;	// 로그인한지 않았다면 userNo는 -1이다.
	if (session.getAttribute("USERNO") != null) {
		userNo = (Integer) session.getAttribute("USERNO");
	}
	
	for (Reply reply : replyList) {
		boolean canReplyModify = false;
		if (userNo == reply.getUser().getNo()) {
			canReplyModify = true;
		}
		

      out.write("\r\n");
      out.write("		<div id=\"reply-");
      out.print(reply.getNo() );
      out.write("\" class=\"border p-2 mb-2\">\r\n");
      out.write("			<div class=\"small d-flex justify-content-between\">\r\n");
      out.write("				<div>\r\n");
      out.write("					<span>");
      out.print(reply.getUser().getName() );
      out.write("</span>\r\n");
      out.write("					<span>");
      out.print(reply.getCreatedDate() );
      out.write("</span>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div>\r\n");

		if (canReplyModify) {

      out.write("\r\n");
      out.write("					<a href=\"mofify-reply-form.jsp\" class=\"btn btn-outline-dark btn-sm\">수정</a>\r\n");
      out.write("					<a href=\"delete-reply.jsp?rno=");
      out.print(reply.getNo() );
      out.write("&bno=");
      out.print(board.getNo() );
      out.write("&page=");
      out.print(pageNo );
      out.write("\" class=\"btn btn-outline-dark btn-sm\">삭제</a>\r\n");
		
		} else {

      out.write("\r\n");
      out.write("					<a class=\"btn btn-outline-dark btn-sm disabled\">수정</a>\r\n");
      out.write("					<a class=\"btn btn-outline-dark btn-sm disabled\">삭제</a>\r\n");
		
		}

      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<p class=\"mb-0\">");
      out.print(reply.getContent() );
      out.write("</p>\r\n");
      out.write("		</div>				\r\n");

	}

      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}