/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.26
 * Generated at: 2024-09-27 05:12:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sell;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import domain.sell.vo.Reply;
import java.util.List;
import domain.sell.dao.ReplyDao;
import domain.sell.vo.Like;
import domain.sell.vo.Board;
import domain.sell.dao.BoardDao;
import utils.Util;
import utils.Util;
import domain.user.vo.User;
import domain.admin.dao.AdminDao;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/common/common.jsp", Long.valueOf(1727275102794L));
    _jspx_dependants.put("/common/header.jsp", Long.valueOf(1727405496026L));
    _jspx_dependants.put("/common/footer.jsp", Long.valueOf(1727395435161L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(12);
    _jspx_imports_classes.add("domain.sell.dao.ReplyDao");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("utils.Util");
    _jspx_imports_classes.add("domain.sell.vo.Board");
    _jspx_imports_classes.add("domain.sell.vo.Like");
    _jspx_imports_classes.add("domain.sell.vo.Reply");
    _jspx_imports_classes.add("domain.user.vo.User");
    _jspx_imports_classes.add("domain.admin.dao.AdminDao");
    _jspx_imports_classes.add("domain.sell.dao.BoardDao");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/guide.css\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\r\n");

	// 전에 온 페이지 주소 저장
	String returnURL = request.getRequestURL().toString();
	String queryString = request.getQueryString();
	returnURL += queryString != null ? "?" + queryString : "";

	session.setAttribute("returnURL", returnURL);	
	
	// 캐시 삭제
	response.setHeader("Cache-Control", "no-cache, no-store");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);

      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>판매글</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        header { margin-bottom: 50px;}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header id=\"divHeader\">\r\n");
      out.write("    <div class=\"headerTop\">\r\n");
      out.write("        <div class=\"center flexBetween\">\r\n");
      out.write("            <a href=\"/index.jsp\" class=\"logo\">\r\n");
      out.write("            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"28\" height=\"28\" fill=\"currentColor\" class=\"bi bi-book\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                    <path d=\"M1 2.828c.885-.37 2.154-.769 3.388-.893 1.33-.134 2.458.063 3.112.752v9.746c-.935-.53-2.12-.603-3.213-.493-1.18.12-2.37.461-3.287.811zm7.5-.141c.654-.689 1.782-.886 3.112-.752 1.234.124 2.503.523 3.388.893v9.923c-.918-.35-2.107-.692-3.287-.81-1.094-.111-2.278-.039-3.213.492zM8 1.783C7.015.936 5.587.81 4.287.94c-1.514.153-3.042.672-3.994 1.105A.5.5 0 0 0 0 2.5v11a.5.5 0 0 0 .707.455c.882-.4 2.303-.881 3.68-1.02 1.409-.142 2.59.087 3.223.877a.5.5 0 0 0 .78 0c.633-.79 1.814-1.019 3.222-.877 1.378.139 2.8.62 3.681 1.02A.5.5 0 0 0 16 13.5v-11a.5.5 0 0 0-.293-.455c-.952-.433-2.48-.952-3.994-1.105C10.413.809 8.985.936 8 1.783\"/>\r\n");
      out.write("                </svg>   \r\n");
      out.write("                <span class=\"bold\">BOOKOREA</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul id=\"divGlobalMenu\" class=\"flex\">\r\n");
      out.write("                ");

                    int USERNO = (Integer) session.getAttribute("USERNO");
                    String USERID = (String) session.getAttribute("USERID");
                    String USERNICKNAME = (String) session.getAttribute("USERNICKNAME");
                    String USERTYPE = (String) session.getAttribute("USERTYPE");
                    
                    if (USERID != null && !USERID.isEmpty() && USERTYPE.equals("USER")) {
                
      out.write("\r\n");
      out.write("                <li>\r\n");
      out.write("                	<strong>");
      out.print(USERNICKNAME);
      out.write("</strong>님 환영합니다.\r\n");
      out.write("                	<a href=\"/user/logout.jsp\" class=\"btn btn-sm\">로그아웃</a>\r\n");
      out.write("               	</li>\r\n");
      out.write("                ");

                } else if (USERID != null && !USERID.isEmpty() && USERTYPE.equals("ADMIN")) {
                
      out.write("\r\n");
      out.write("                <li>\r\n");
      out.write("	                <strong>");
      out.print(USERNICKNAME);
      out.write("</strong>님 환영합니다.\r\n");
      out.write("                	<a href=\"/user/logout.jsp\" class=\"btn btn-sm\">로그아웃</a>\r\n");
      out.write("               	</li>\r\n");
      out.write("                <li><a href=\"../admin/index.jsp\" class=\"\"><mark>관리자 홈페이지로 이동</mark></a></li>\r\n");
      out.write("                ");

                } else {
                
      out.write("\r\n");
      out.write("                <li><a href=\"/user/login-form.jsp\">로그인</a></li>\r\n");
      out.write("                <li><a href=\"/user/join-form.jsp\">회원가입</a></li>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"headerBot\">\r\n");
      out.write("        <div class=\"center\">\r\n");
      out.write("            <div class=\"searchW\">\r\n");
      out.write("                <p class=\"bold\">찾고 있는 중고 도서를 검색해보세요</p>\r\n");
      out.write("                <div class=\"searchForm\">\r\n");
      out.write("                    <form action=\"/book/list.jsp\" method=\"get\" class=\"inputBox\">\r\n");
      out.write("                        <fieldset class=\"searchBox flex\">\r\n");
      out.write("                            <legend>도서 검색</legend>\r\n");
      out.write("                            <label for=\"searchBook\" class=\"searchBook\">\r\n");
      out.write("                                <input type=\"text\" id=\"searchBook\" name=\"keyword\" class=\"searchInput\" placeholder=\"도서명을 입력해주세요.\" autocomplete=\"off\" onkeyup=\"checkInput();\">\r\n");
      out.write("                            </label>\r\n");
      out.write("                            <input type=\"image\" src=\"/images/search.svg\" class=\"searchBtn\" alt=\"도서 검색\">\r\n");
      out.write("                        </fieldset>\r\n");
      out.write("                    </form>\r\n");
      out.write("            		<div class=\"searchList hide\">\r\n");
      out.write("	       				<ul class=\"searchUl p-0\"></ul>\r\n");
      out.write("	       			</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"divTopMenu\">\r\n");
      out.write("        <div class=\"center\">\r\n");
      out.write("            <ul class=\"flexCenter\">\r\n");
      out.write("                <li><a href=\"/book/list.jsp\">전체 도서</a></li>\r\n");
      out.write("                <li><a href=\"/sell/list.jsp\">책 판매합니다</a></li>\r\n");
      out.write("                <li><a href=\"/purchase/list.jsp\">책 구매합니다</a></li>\r\n");
      out.write("                <li><a href=\"/qna/list.jsp\">문의 게시판</a></li>\r\n");
      out.write("                ");

                    if (USERID != null && !USERID.isEmpty()) {
                
      out.write("\r\n");
      out.write("                <li><a href=\"/user/myPage.jsp\">마이 페이지</a></li>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("<script>\r\n");
      out.write("	const searchInput = document.querySelector(\"#searchBook\");\r\n");
      out.write("	const searchBox = document.querySelector(\".searchList\");\r\n");
      out.write("	const searchUl = document.querySelector(\".searchUl\");\r\n");
      out.write("	\r\n");
      out.write("	/* input type text(#searchBook)의 onkeyup 이벤트 */\r\n");
      out.write("	const checkInput = () => {\r\n");
      out.write("	    const beforeInput = searchInput.value;\r\n");
      out.write("	    timer(beforeInput);\r\n");
      out.write("	}\r\n");
      out.write("	const timer = (beforeInput) => {\r\n");
      out.write("	    // 검색창 비었으면 키워드 창 hide처리\r\n");
      out.write("	    if(searchInput.value === \"\") {\r\n");
      out.write("			searchBox.classList.add(\"hide\");	\r\n");
      out.write("	    } else {\r\n");
      out.write("			searchBox.classList.remove(\"hide\");\r\n");
      out.write("	    }\r\n");
      out.write("\r\n");
      out.write("	    setTimeout(() => {\r\n");
      out.write("	    	if(searchInput.value === beforeInput) {\r\n");
      out.write("				loadData(searchInput.value);\r\n");
      out.write("	    } \r\n");
      out.write("	  }, 200);\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	/* 데이터 가져옴 */\r\n");
      out.write("	const loadData = (input) => {\r\n");
      out.write("	  const url = `/book/search.jsp?keyword=${input}`;\r\n");
      out.write("	  // 매개변수 input 값에 따라 서버에서 해당 검색어가 포함된 책 데이터를 가져옴\r\n");
      out.write("	  fetch(url)\r\n");
      out.write("		.then((res) => res.json())\r\n");
      out.write("		.then(books => fillSearch(books))\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	/* 데이터 보여줌 */\r\n");
      out.write("	const fillSearch = (books) => {\r\n");
      out.write("		searchUl.innerHTML = \"\";\r\n");
      out.write("		for (let book of books) {\r\n");
      out.write("			let li = `\r\n");
      out.write("				<li>\r\n");
      out.write("					<a href=\"/book/detail.jsp?bookNo=${book.no}\">${book.title}</a>\r\n");
      out.write("				</li>\r\n");
      out.write("			`;\r\n");
      out.write("			searchUl.innerHTML += li;\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");

	if (request.getParameter("error") != null) {

      out.write("\r\n");
      out.write("	<div class=\"alert alert-danger\">\r\n");
      out.write("		수정/삭제는 게시글 작성자만 가능합니다.\r\n");
      out.write("	</div>\r\n");

	}

      out.write("\r\n");
      out.write("\r\n");

	int boardNo = Util.toInt(request.getParameter("no")); // 요청파라미터 조회
	int pageNo = Util.toInt(request.getParameter("page"), 1);
	
	
	// 전달받은 게시글 번호에 해당하는 게시글 상세정보를 조회한다.
	BoardDao boardDao = new BoardDao();
	Board board = boardDao.getBoardByNo(boardNo);
	
    if (board == null) {

      out.write("\r\n");
      out.write("        <div class=\"alert alert-danger\">게시글 정보를 불러오는 데 실패했습니다.</div>\r\n");

        return; // 나머지 코드를 실행하지 않도록 종료
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("            <p class=\"text-end\">조회수 ");
      out.print( Util.toCurrency(board.getViewCount()));
      out.write("  추천수");
      out.print( Util.toCurrency(board.getLikeCount()) );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("            <table class=\"table\">\r\n");
      out.write("                <colgroup>\r\n");
      out.write("                    <col width=\"25%\">\r\n");
      out.write("                    <col width=\"10%\">\r\n");
      out.write("                    <col width=\"27%\">\r\n");
      out.write("                    <col width=\"10%\">\r\n");
      out.write("                    <col width=\"27%\">\r\n");
      out.write("                </colgroup>\r\n");
      out.write("                <tbody class=\"align-middle\">\r\n");
      out.write("					<tr>\r\n");
      out.write("	                    <td rowspan=\"6\"><img src=\"");
      out.print(board.getBook().getCover() );
      out.write("\"></td>\r\n");
      out.write("	                    <th>판매상태</th>\r\n");
      out.write("	                    <td>");
      out.print(board.getStatus() );
      out.write("</td>\r\n");
      out.write("	                    <th>작성자</th>\r\n");
      out.write("	                    <td>");
      out.print(board.getUser().getNickname() );
      out.write("</td>\r\n");
      out.write("	                </tr>\r\n");
      out.write("	                <tr>\r\n");
      out.write("	                    <th>글제목</th>\r\n");
      out.write("	                    <td colspan=\"3\">");
      out.print(board.getTitle() );
      out.write("</td>\r\n");
      out.write("	                </tr>	                \r\n");
      out.write("	                <tr>\r\n");
      out.write("	                    <th>책제목</th>\r\n");
      out.write("	                    <td>");
      out.print(board.getBook().getTitle() );
      out.write("</td>\r\n");
      out.write("	                    <th>저자</th>\r\n");
      out.write("	                    <td>");
      out.print(board.getBook().getAuthor() );
      out.write("</td>\r\n");
      out.write("	                </tr>\r\n");
      out.write("	                <tr>\r\n");
      out.write("	                    <th>출판사</th>\r\n");
      out.write("	                    <td>");
      out.print(board.getBook().getPublisher() );
      out.write("</td>\r\n");
      out.write("	                    <th>가격</th>\r\n");
      out.write("	                    <td>");
      out.print(Util.toCurrency(board.getPrice()) );
      out.write(" 원</td>\r\n");
      out.write("	                </tr>\r\n");
      out.write("	                <tr>\r\n");
      out.write("	                    <th>등록일</th>\r\n");
      out.write("	                    <td>");
      out.print(board.getCreatedDate() );
      out.write("</td>\r\n");
      out.write("	                    <th>수정일</th>\r\n");
      out.write("	                    <td>");
      out.print(Util.nullToBlank(board.getUpdatedDate()) );
      out.write("</td>\r\n");
      out.write("	                </tr>\r\n");
      out.write("	                <tr>\r\n");
      out.write("	                	<th>상세내용</th>\r\n");
      out.write("	                	<td colspan=\"3\">");
      out.print(board.getContent().replace(System.lineSeparator(), "<br>") );
      out.write("</td>\r\n");
      out.write("	                </tr>               \r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write('\r');
      out.write('\n');
      out.write(' ');

 	// 게시글에 대한 수정/삭제 가능여부를 판정한다.
 	// 로그인되어 있고, 로그인한 사용자번호와 게시글의 작성자번호가
 	// 같은 때 true로 판정한다.
 	boolean canLike = false;	// 로그인한 계정과 게시글을 작성한 계정이 일치하지 않는다.
 	boolean canModify = false; // 로그인한 계정과 게시글을 작성한 계정이 일치하는가
 	boolean showMyLike = false;
 	
 	int loginedUserNo = -1;
 	if (USERID != null) {
 		canLike = true; 		
 		loginedUserNo = (Integer) session.getAttribute("USERNO");
 		// 로그인한 사용자가 이 게시글에 좋아요를 했는지 조회
 		Like savedLike = boardDao.getSellLikeByBoardNoAndUserNo(boardNo, loginedUserNo);
 		if (savedLike != null) {
 			showMyLike = true;	// 이 게시글에 좋아요를 했다.
 		}
 		if (loginedUserNo == board.getUser().getUserNo()) {
 			canModify = true;
 		}
 	}
 
      out.write("  \r\n");
      out.write(" 	<div class=\"row\">          \r\n");
      out.write("		<div class=\"col-12 p-2 mb-2\">\r\n");

 		if(canLike) {

      out.write("\r\n");
      out.write("	        <a href=\"like.jsp?no=");
      out.print(boardNo );
      out.write("&page=");
      out.print(pageNo );
      out.write("\" \r\n");
      out.write("	            class=\"btn btn-outline-warning position-relative ");
      out.print(loginedUserNo == board.getUser().getUserNo() ? "d-none" : "" );
      out.write("\">추천\r\n");
      out.write("	            <i class=\"bi ");
      out.print(showMyLike ? "bi-heart-fill" : "bi-heart" );
      out.write("\"></i>\r\n");
      out.write("	            <span class=\"position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger\">\r\n");
      out.write("	                ");
      out.print(board.getLikeCount() );
      out.write("\r\n");
      out.write("	            </span>\r\n");
      out.write("	        </a>\r\n");
      out.write("	        <a href=\"../qna/form-report.jsp?sno=");
      out.print(board.getUser().getNickname() );
      out.write("\" class=\"btn btn-outline-danger ");
      out.print(loginedUserNo == board.getUser().getUserNo() ? "d-none" : "" );
      out.write("\">신고</a>\r\n");

 			} else {

      out.write("\r\n");
      out.write("	        <a href=\"\" class=\"btn tn-outline-secondary position-relative d-none\">추천\r\n");
      out.write("	            <span class=\"position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger\">\r\n");
      out.write("	                ");
      out.print(board.getLikeCount() );
      out.write("\r\n");
      out.write("	            </span>\r\n");
      out.write("	        </a>\r\n");
      out.write("	        <a href=\"../qna/list-report.jsp\" class=\"btn btn-outline-danger d-none\">신고</a>\r\n");

 			}

      out.write('\r');
      out.write('\n');

			if (canModify) {

      out.write("\r\n");
      out.write("			<div class=\"float-end\">\r\n");
      out.write("		        <a href=\"modify-form.jsp?no=");
      out.print(board.getNo() );
      out.write("&bno=");
      out.print(board.getBook().getNo() );
      out.write("\" class=\"btn btn-btn-warning\">수정</a>\r\n");
      out.write("		        <a href=\"delete.jsp?no=");
      out.print(boardNo );
      out.write("\" class=\"btn btn-danger \">삭제</a>\r\n");
      out.write("		        <a href=\"list.jsp?");
      out.print(pageNo );
      out.write("\" class=\"btn btn-info text-white\">목록</a>\r\n");
      out.write("		    </div>\r\n");
 
			} else { 

      out.write("\r\n");
      out.write("	 		<div class=\"float-end\">\r\n");
      out.write("				<a href=\"\" class=\"btn btn-secondary d-none\">수정</a>\r\n");
      out.write("				<a href=\"\" class=\"btn btn-secondary d-none\">삭제</a>\r\n");
      out.write("				<a href=\"list.jsp?page=");
      out.print(pageNo );
      out.write("\" class=\"btn btn-info text-white\">목록</a>\r\n");
      out.write("	 		</div>\r\n");

			}

      out.write("\r\n");
      out.write("	 	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("	<div>\r\n");
      out.write("		<dl>\r\n");
      out.write("			<dt>로그인 여부</dt><dd>");
      out.print(USERID );
      out.write("</dd>\r\n");
      out.write("			<dt>수정할 수 있나</dt><dd>");
      out.print(canModify );
      out.write("</dd>\r\n");
      out.write("			<dt>판매상태</dt><dd>");
      out.print(board.getStatus() );
      out.write("</dd>\r\n");
      out.write("		</dl>\r\n");
      out.write("	</div>\r\n");
      out.write("-->\r\n");

	

	if (USERID != null && !canModify && !"판매완료".equals(board.getStatus())) {
		if (!canModify) {

      out.write("	\r\n");
      out.write("\r\n");
      out.write("		    <div class=\"col-12 mb-3\">\r\n");
      out.write("				<form class=\"border bg-light p-3 mt-3\" method=\"post\"\r\n");
      out.write("					action=\"insert-reply.jsp\">\r\n");
      out.write("					<input type=\"hidden\" name=\"bno\" value=\"");
      out.print(board.getNo() );
      out.write("\" />\r\n");
      out.write("		        	<div class=\"mb-3\">\r\n");
      out.write("		             	<textarea rows=\"5\" class=\"form-control\" name=\"content\">거래방법(직거래,택배) :&#13;&#10;희망금액 :&#13;&#10;추가내용 :&#13;&#10;전화번호 :</textarea>\r\n");
      out.write("		         	</div>\r\n");
      out.write("		         	<div class=\"text-end\">\r\n");
      out.write("		            	<button type=\"submit\" class=\"btn btn-primary\" >등록</button>\r\n");
      out.write("		         	</div>\r\n");
      out.write("		    	</form>\r\n");
      out.write("		    </div>\r\n");

		} 
	}

      out.write("\r\n");
      out.write("\r\n");
 
	// 게시글의 댓글 조회하기
	ReplyDao replyDao = new ReplyDao();
	List<Reply> replyList = replyDao.getReplyListByBoardNo(board.getNo());

      out.write("	\r\n");
      out.write("            <div class=\"mt-3\">\r\n");

	int userNo = -1; // 로그인하지 않았다면 userNo는 -1이다.
	if (session.getAttribute("USERNO") != null) {
		userNo = (Integer) session.getAttribute("USERNO");
	}
	
	for (Reply reply : replyList) {
		boolean canReplyModify = false;
		if (userNo == reply.getUser().getUserNo()) {
			canReplyModify = true;
	    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div id=\"reply-");
      out.print(reply.getNo() );
      out.write("\" class=\"border p-2 mb-2\">\r\n");
      out.write("                    <div class=\"small d-flex justify-content-between\">\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <span>");
      out.print(reply.getUser().getNickname() );
      out.write("</span>\r\n");
      out.write("                            <span>");
      out.print(reply.getCreatedDate() );
      out.write("</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div>\r\n");

				if (canReplyModify) {

      out.write("\r\n");
      out.write("                            <a href=\"delete-reply.jsp?rno=");
      out.print(reply.getNo()  );
      out.write("&bno=");
      out.print(board.getNo() );
      out.write("&page=");
      out.print(pageNo );
      out.write("\" class=\"btn btn-outline-danger btn-sm\">삭제</a>\r\n");
      out.write("                            <a href=\"../qna/list-report.jsp\" class=\"btn btn-outline-danger btn-sm d-none\">신고</a>\r\n");
      out.write("                            <a href=\"\" class=\"btn btn-success btn-sm d-none\">수락 </a>\r\n");

				} else {

      out.write("                      	\r\n");
      out.write("							<a class=\"btn btn-outline-dark btn-sm d-none\">삭제</a>\r\n");
      out.write("							<a href=\"../qna/form-report.jsp?sno=");
      out.print(reply.getUser().getNickname() );
      out.write("\" class=\"btn btn-outline-danger btn-sm ");
      out.print(userNo == -1 ? "d-none" : "" );
      out.write("\">신고</a>\r\n");
      out.write("							<a href=\"approve.jsp?rno=");
      out.print(reply.getNo() );
      out.write("&bno=");
      out.print(board.getNo() );
      out.write("&page=");
      out.print(pageNo );
      out.write("\" \r\n");
      out.write("								class=\"btn btn-success btn-sm ");
      out.print(userNo == board.getUser().getUserNo() && "판매중".equals(board.getStatus()) ? "" : "d-none" );
      out.write("\">수락\r\n");
      out.write("							</a>\r\n");

				}

      out.write("							\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p class=\"mb-0\">");
      out.print(reply.getContent().replace(System.lineSeparator(), "<br>") );
      out.write("</p>\r\n");
      out.write("                </div>\r\n");

	}

      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<footer id=\"divFooter\">\r\n");
      out.write("    <div class=\"center\">\r\n");
      out.write("        <p class=\"bold\">2404 2조</p>\r\n");
      out.write("        <p>SEMI PROJECT</p>\r\n");
      out.write("        <p class=\"contact\">BOOKOREA@naver.com</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("</html>\r\n");
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
