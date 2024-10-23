/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.26
 * Generated at: 2024-09-27 02:52:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import domain.purchase.dao.BoardDao;
import domain.purchase.vo.Board;
import domain.book.vo.Book;
import java.util.List;
import utils.Util;
import utils.Util;
import domain.user.vo.User;
import domain.admin.dao.AdminDao;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(10);
    _jspx_imports_classes.add("domain.purchase.dao.BoardDao");
    _jspx_imports_classes.add("domain.purchase.vo.Board");
    _jspx_imports_classes.add("domain.book.vo.Book");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("utils.Util");
    _jspx_imports_classes.add("domain.user.vo.User");
    _jspx_imports_classes.add("domain.admin.dao.AdminDao");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>2조 세미 메인</title>\n");
      out.write("  ");
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

      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("\n");
      out.write("<div id=\"divContents\">\n");
      out.write("  <div class=\"center container\">\n");
      out.write("    <section class=\"row g-2\">\n");
      out.write("    	<div class=\"bookSection row section\">\n");
      out.write("	    	<div class=\"col-8\">\n");

	// sell ranking (full package) - 거래글이 많이 올라온 순으로 조회 (거래가 되어야 하는 순)
	domain.sell.dao.BoardDao boardDaoBySell = new domain.sell.dao.BoardDao();
	List<Book> booksBySell = boardDaoBySell.getBooksBySellRanking();

      out.write("\n");
      out.write("		      	<div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("			        <h6 class=\"title1\">이 책은 어떠세요?</h6>\n");
      out.write("		      	</div>\n");
      out.write("				<ul class=\"sellBook d-flex text-center\">\n");

for(Book bookBySell : booksBySell) {

      out.write("\n");
      out.write("					<li>\n");
      out.write("						<div class=\"object-fit-sm-cover\">\n");
      out.write("							<a href=\"/book/detail.jsp?bookNo=");
      out.print(bookBySell.getNo() );
      out.write("\">\n");
      out.write("								<span class=\"imgW\">\n");
      out.write("									<img src=\"");
      out.print(bookBySell.getCover() );
      out.write("\" class=\"bookImg\" alt=\"");
      out.print(bookBySell.getTitle() );
      out.write("\">\n");
      out.write("								</span>\n");
      out.write("								<span class=\"ellipsis\">");
      out.print(bookBySell.getTitle() );
      out.write("</span>\n");
      out.write("							</a>\n");
      out.write("		                </div>\n");
      out.write("					</li>\n");

}

      out.write("\n");
      out.write("		      	</ul>\n");
      out.write("		      </div>\n");

	// purchase ranking
	BoardDao boardDao = new BoardDao();
	List<Book> books = boardDao.getBooksByPurchaseRanking();

      out.write("\n");
      out.write("	      <div class=\"col-4\">\n");
      out.write("	      	<div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("		        <h6 class=\"title1\">많이 찾는 도서</h6>\n");
      out.write("		        <a href=\"/purchase/list.jsp\" class=\"btn btn-sm btn-outline-secondary\">게시판으로 이동하기</a>\n");
      out.write("	      	</div>\n");
      out.write("			<ul class=\"purchaseBook d-flex text-center flex-column\">\n");

for(Book book : books) {

      out.write("\n");
      out.write("				<li>\n");
      out.write("					<div class=\"object-fit-sm-cover\">\n");
      out.write("						<a href=\"/book/detail.jsp?bookNo=");
      out.print(book.getNo() );
      out.write("\">\n");
      out.write("							<span class=\"imgW\">\n");
      out.write("								<img src=\"");
      out.print(book.getCover() );
      out.write("\" class=\"bookImg\" alt=\"");
      out.print(book.getTitle() );
      out.write("\">\n");
      out.write("							</span>\n");
      out.write("							<span class=\"ellipsis\">");
      out.print(book.getTitle() );
      out.write("</span>\n");
      out.write("						</a>\n");
      out.write("	                </div>\n");
      out.write("				</li>\n");

}

      out.write("\n");
      out.write("			</ul>\n");
      out.write("			<div class=\"alert alert-secondary mt-2\">구매합니다 게시판에 가장 많이 올라온 책입니다.</div>\n");
      out.write("	      </div>\n");
      out.write("    	</div>\n");
      out.write("    	<div class=\"section row\">\n");
      out.write("			<div class=\"col-6\">\n");
      out.write("				<div class=\"subContent\">\n");
      out.write("				    <h6 class=\"title1\">실시간 판매글</h6>\n");
      out.write("				    <table class=\"table\">\n");
      out.write("				        <caption>List of users</caption>\n");
      out.write("				        <colgroup>\n");
      out.write("				        	<col width=\"25px\">\n");
      out.write("				        	<col width=\"40%\">\n");
      out.write("				        	<col width=\"\">\n");
      out.write("				        	<col width=\"55px\">\n");
      out.write("				        	<col width=\"55px\">\n");
      out.write("				        	<col width=\"\">\n");
      out.write("				        </colgroup>\n");
      out.write("				        <thead>\n");
      out.write("				            <tr>\n");
      out.write("				                <th scope=\"col\">#</th>\n");
      out.write("				                <th scope=\"col\">제목</th>\n");
      out.write("				                <th scope=\"col\">작성자</th>\n");
      out.write("				                <th scope=\"col\">조회수</th>\n");
      out.write("				                <th scope=\"col\">좋아요</th>\n");
      out.write("				                <th scope=\"col\">작성일</th>\n");
      out.write("				            </tr>\n");
      out.write("				        </thead>\n");
      out.write("				        <tbody>\n");
      out.write("				");

					domain.sell.dao.BoardDao sellBoardDao = new domain.sell.dao.BoardDao();
					List<domain.sell.vo.Board> boards = sellBoardDao.getBoards(1, 5);
					int row = 1;
					
					for (domain.sell.vo.Board sellBoard : boards) {
				
      out.write("\n");
      out.write("							<tr>\n");
      out.write("							    <th scope=\"row\">");
      out.print(row++ );
      out.write("</th>\n");
      out.write("								<td>\n");
      out.write("									<div>\n");
      out.write("							           	<div>\n");
      out.write("							              <a href=\"/sell/hit.jsp?no=");
      out.print(sellBoard.getNo() );
      out.write("&page=1\" class=\"article ellipsis\">\n");
      out.write("							              	");
      out.print(sellBoard.getTitle() );
      out.write("\n");
      out.write("							              </a>\n");
      out.write("							           	</div>\n");
      out.write("						            </div>\n");
      out.write("								</td>\n");
      out.write("								<td>");
      out.print(sellBoard.getUser().getNickname() );
      out.write("</td>\n");
      out.write("								<td>");
      out.print(sellBoard.getViewCount() );
      out.write("</td>\n");
      out.write("								<td>");
      out.print(sellBoard.getLikeCount() );
      out.write("</td>\n");
      out.write("								<td>");
      out.print( Util.formatDate(sellBoard.getCreatedDate()) );
      out.write("</td>\n");
      out.write("							</tr>\n");
      out.write("				");

					}
				
      out.write("\n");
      out.write("			            </tbody>\n");
      out.write("			        </table>\n");
      out.write("			  	  </div>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col-6\">\n");
      out.write("					<div class=\"subContent\">\n");
      out.write("			    		<h6 class=\"title1\">실시간 구매글</h6>\n");
      out.write("				   		<table class=\"table\">\n");
      out.write("				        	<caption>List of users</caption>\n");
      out.write("				        	<colgroup>\n");
      out.write("					        	<col width=\"25px\">\n");
      out.write("					        	<col width=\"40%\">\n");
      out.write("					        	<col width=\"\">\n");
      out.write("					        	<col width=\"55px\">\n");
      out.write("					        	<col width=\"55px\">\n");
      out.write("					        	<col width=\"\">\n");
      out.write("					        </colgroup>\n");
      out.write("				        	<thead>\n");
      out.write("					            <tr>\n");
      out.write("					                <th scope=\"col\">#</th>\n");
      out.write("					                <th scope=\"col\">제목</th>\n");
      out.write("					                <th scope=\"col\">작성자</th>\n");
      out.write("					                <th scope=\"col\">조회수</th>\n");
      out.write("					                <th scope=\"col\">좋아요</th>\n");
      out.write("					                <th scope=\"col\">작성일</th>\n");
      out.write("					            </tr>\n");
      out.write("					        </thead>\n");
      out.write("				        	<tbody>\n");
      out.write("		");

			List<Board> boardsList = boardDao.getBoards(1, 5);
			// 게시글을 반복하며 출력
			row = 1;
			for (Board board : boardsList) {
		
      out.write("\n");
      out.write("								<tr>\n");
      out.write("								    <th scope=\"row\">");
      out.print(row++ );
      out.write("</th>\n");
      out.write("									<td>\n");
      out.write("										<div>\n");
      out.write("						                  	<div class=\"\">\n");
      out.write("							                    <a href=\"/purchase/hit.jsp?no=");
      out.print( board.getNo() );
      out.write("&page=1\" class=\"article inline\">\n");
      out.write("						                    		<span class=\"cmt float\" style=\"color: red;\">\n");
      out.write("							                    		[");
      out.print(board.getReplyCount() );
      out.write("]						                    	\n");
      out.write("						                    		</span>\n");
      out.write("						                    		<span class=\"ellipsis titleWithReply\">\n");
      out.write("							                    		");
      out.print( board.getTitle() );
      out.write("\n");
      out.write("							                    	</span>\n");
      out.write("							                    </a>\n");
      out.write("						                  	</div>\n");
      out.write("					                	</div>\n");
      out.write("									</td>\n");
      out.write("									<td>");
      out.print( board.getUser().getNickname() );
      out.write("</td>\n");
      out.write("									<td>");
      out.print( board.getViewCount() );
      out.write("</td>\n");
      out.write("									<td>");
      out.print( board.getLikeCount() );
      out.write("</td>\n");
      out.write("									<td>");
      out.print( Util.formatDate(board.getCreatedDate()) );
      out.write("</td>\n");
      out.write("								</tr>\n");
      out.write("		");

			}
		
      out.write("\n");
      out.write("				            </tbody>\n");
      out.write("				        </table>\n");
      out.write("				    </div>\n");
      out.write("				</div>\n");
      out.write("	    	</div>\n");
      out.write("	    </section>\n");
      out.write("  	</div>\n");
      out.write("</div>\n");
      out.write("\r\n");
      out.write("<footer id=\"divFooter\">\r\n");
      out.write("    <div class=\"center\">\r\n");
      out.write("        <p class=\"bold\">2404 2조</p>\r\n");
      out.write("        <p>SEMI PROJECT</p>\r\n");
      out.write("        <p class=\"contact\">BOOKOREA@naver.com</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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