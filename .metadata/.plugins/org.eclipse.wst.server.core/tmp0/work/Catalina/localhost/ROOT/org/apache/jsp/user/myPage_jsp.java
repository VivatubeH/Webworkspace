/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.26
 * Generated at: 2024-09-27 05:42:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import domain.qna.vo.Qna;
import domain.qna.dao.QnaDao;
import java.util.List;
import utils.Util;
import utils.Pagination;
import domain.purchase.vo.Board;
import domain.purchase.dao.BoardDao;
import domain.user.vo.User;
import domain.user.dao.UserDao;
import utils.Util;
import domain.user.vo.User;
import domain.admin.dao.AdminDao;

public final class myPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(14);
    _jspx_imports_classes.add("domain.purchase.vo.Board");
    _jspx_imports_classes.add("domain.purchase.dao.BoardDao");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("utils.Util");
    _jspx_imports_classes.add("utils.Pagination");
    _jspx_imports_classes.add("domain.user.dao.UserDao");
    _jspx_imports_classes.add("domain.qna.vo.Qna");
    _jspx_imports_classes.add("domain.user.vo.User");
    _jspx_imports_classes.add("domain.admin.dao.AdminDao");
    _jspx_imports_classes.add("domain.qna.dao.QnaDao");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>마이페이지</title>\r\n");
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
      out.write("<style>\r\n");
      out.write(".subContent {\r\n");
      out.write("	background-color: #ffffff;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button-container {\r\n");
      out.write("	padding-left: 1100px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
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
      out.write("	<div class=\"container mt-4\">\r\n");
      out.write("		<h6 class=\"title1\">내 정보</h6>\r\n");
      out.write("		<table class=\"table table-bordered\">\r\n");
      out.write("			<colgroup>\r\n");
      out.write("				<col width=\"15%\">\r\n");
      out.write("				<col width=\"35%\">\r\n");
      out.write("				<col width=\"15%\">\r\n");
      out.write("				<col width=\"35%\">\r\n");
      out.write("			</colgroup>\r\n");

	UserDao userDao = new UserDao();
	User user = userDao.getUserByUserNo(USERNO);

      out.write("\r\n");
      out.write("			<tbody>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th class=\"table-light text-center align-middle\">아이디</th>\r\n");
      out.write("					<td class=\"align-middle\">");
      out.print(user.getId() +"("+ user.getType() );
      out.write(")</td>\r\n");
      out.write("					<th class=\"table-light text-center align-middle\">이메일</th>\r\n");
      out.write("					<td class=\"align-middle\">");
      out.print(user.getEmail() );
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th class=\"table-light text-center align-middle\">닉네임</th>\r\n");
      out.write("					<td class=\"align-middle\">");
      out.print(user.getNickname() );
      out.write("</td>\r\n");
      out.write("					<th class=\"table-light text-center align-middle\">핸드폰 번호</th>\r\n");
      out.write("					<td class=\"align-middle\">");
      out.print(user.getPhone() );
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th class=\"table-light text-center align-middle\">가입 날짜</th>\r\n");
      out.write("					<td class=\"align-middle\">");
      out.print(user.getCreatedDate() );
      out.write("</td>\r\n");
      out.write("					<th class=\"table-light text-center align-middle\">내 정보 최근 수정 날짜</th>\r\n");

	if (user.getUpdatedDate() == null) {

      out.write("\r\n");
      out.write("				<td class=\"align-middle\">-</td>\r\n");

	} else {

      out.write("\r\n");
      out.write("					<td class=\"align-middle\">");
      out.print(user.getUpdatedDate() );
      out.write("</td>\r\n");

	}

      out.write("\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th class=\"table-light text-center align-middle\">주소</th>\r\n");
      out.write("					<td colspan=\"3\" class=\"align-middle\">");
      out.print(user.getAddress() );
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</tbody>\r\n");
      out.write("		</table>\r\n");
      out.write("		<div class=\"text-center mt-3 button-container d-flex justify-content-end\">\r\n");
      out.write("			<a href=\"myPage-updateForm.jsp\"><button type=\"submit\" class=\"btn btn-secondary btn-sm\">내 정보 수정</button></a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div id=\"divContents\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row g-4\">\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<div class=\"subContent p-4 mb-4\">\r\n");
      out.write("						<h6 class=\"mb-3 fw-bold title1\">내가 작성한 구매합니다.</h6>\r\n");
      out.write("						<table class=\"table table-hover\">\r\n");
      out.write("							<thead>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"col\">글 번호</th>\r\n");
      out.write("									<th scope=\"col\">글 제목</th>\r\n");
      out.write("									<th scope=\"col\">책 제목</th>\r\n");
      out.write("									<th scope=\"col\">구매하고 싶은 가격</th>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</thead>\r\n");
      out.write("							<tbody id=\"purchaseTbody\">\r\n");
      out.write("								<!-- 동적으로 추가되는 부분 -->\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("						<nav aria-label=\"Page navigation\">\r\n");
      out.write("							<ul id=\"purchaseNavigation\" class=\"pagination justify-content-center mt-3\">\r\n");
      out.write("								<!-- 동적으로 추가되는 부분 -->\r\n");
      out.write("							</ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<div class=\"subContent p-4 mb-4\">\r\n");
      out.write("						<h6 class=\"mb-3 fw-bold title1\">내가 작성한 판매합니다.</h6>\r\n");
      out.write("						<table class=\"table table-hover\">\r\n");
      out.write("							<thead>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"col\">글 번호</th>\r\n");
      out.write("									<th scope=\"col\">글 제목</th>\r\n");
      out.write("									<th scope=\"col\">책 제목</th>\r\n");
      out.write("									<th scope=\"col\">판매하고 싶은 가격</th>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</thead>\r\n");
      out.write("							<tbody id=\"sellTbody\">\r\n");
      out.write("								<!-- 동적으로 추가되는 부분 -->\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("						<nav aria-label=\"Page navigation\">\r\n");
      out.write("							<ul id=\"sellNavigation\" class=\"pagination justify-content-center mt-3\">\r\n");
      out.write("								<!-- 동적으로 추가되는 부분 -->\r\n");
      out.write("							</ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<div class=\"subContent p-4 mb-4\">\r\n");
      out.write("						<h6 class=\"mb-3 fw-bold title1\">내가 작성한 문의 글</h6>\r\n");
      out.write("						<table class=\"table table-hover\">\r\n");
      out.write("							<thead>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"col\">글 번호</th>\r\n");
      out.write("									<th scope=\"col\">글 제목</th>\r\n");
      out.write("									<th scope=\"col\">작성 날짜</th>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</thead>\r\n");
      out.write("\r\n");
      out.write("							<tbody id=\"qnaTbody\">\r\n");
      out.write("								<!-- 동적으로 추가되는 부분 -->\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("\r\n");
      out.write("						<nav aria-label=\"Page navigation\">\r\n");
      out.write("							<ul id=\"qnaNavigation\" class=\"pagination justify-content-center mt-3\">\r\n");
      out.write("								<!-- 동적으로 추가되는 부분 -->\r\n");
      out.write("							</ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<div class=\"subContent p-4 mb-4\">\r\n");
      out.write("						<h6 class=\"mb-3 fw-bold title1\">내가 작성한 신고 글</h6>\r\n");
      out.write("						<table class=\"table table-hover\">\r\n");
      out.write("							<thead>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"col\">글 번호</th>\r\n");
      out.write("									<th scope=\"col\">글 제목</th>\r\n");
      out.write("									<th scope=\"col\">내가 신고한 유저</th>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</thead>\r\n");
      out.write("							<tbody id=\"reportTbody\">\r\n");
      out.write("								<!-- 동적으로 추가되는 부분 -->\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("						<nav aria-label=\"Page navigation\">\r\n");
      out.write("							<ul id=\"reportNavigation\" class=\"pagination justify-content-center mt-3\">\r\n");
      out.write("								<!-- 동적으로 추가되는 부분 -->\r\n");
      out.write("							</ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		function asyncPaging(section, pageNo) {\r\n");
      out.write("			let tbody = document.getElementById(section + \"Tbody\");\r\n");
      out.write("			tbody.innerHTML = \"\";\r\n");
      out.write("			// ajax\r\n");
      out.write("            let xhr = new XMLHttpRequest();\r\n");
      out.write("            xhr.onreadystatechange = function () {\r\n");
      out.write("                if (xhr.readyState === 4 && xhr.status === 200) {\r\n");
      out.write("        			// 응답으로 json형식의 텍스트를 받음\r\n");
      out.write("        			let text = xhr.responseText;\r\n");
      out.write("        			// json형식의 텍스트를 자바스크립트 배열로 변환함\r\n");
      out.write("        			let boards = JSON.parse(text);\r\n");
      out.write("	        		\r\n");
      out.write("	        		if(boards.length !== 0) {\r\n");
      out.write("	                	for(let board of boards) {\r\n");
      out.write("	                		if(section === 'purchase') {\r\n");
      out.write("	                			let tr = `\r\n");
      out.write("		                		<tr>\r\n");
      out.write("									<th scope=\"row\">${board.rowNum}</th>\r\n");
      out.write("									<td><a href=\"../purchase/detail.jsp?no=${board.no}\">${board.title}</a></td>\r\n");
      out.write("									<td>${board.book.title}</td>\r\n");
      out.write("									<td>${board.price.toLocaleString()} 원</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("			                	`;\r\n");
      out.write("		                		tbody.insertAdjacentHTML(\"beforeend\", tr);\r\n");
      out.write("	                		}\r\n");
      out.write("	                		else if(section === 'sell') {\r\n");
      out.write("	                			let tr = `\r\n");
      out.write("	                				<tr>\r\n");
      out.write("		                				<th scope=\"row\">${board.rowNum}</th>\r\n");
      out.write("										<td><a href=\"../sell/detail.jsp?no=${board.no}\">${board.title}</a></td>\r\n");
      out.write("										<td>${board.book.title}</td>\r\n");
      out.write("										<td>${board.price.toLocaleString()} 원</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("	                			`;\r\n");
      out.write("	                			tbody.insertAdjacentHTML(\"beforeend\", tr);\r\n");
      out.write("	                		}\r\n");
      out.write("	                		else if(section === 'qna') {\r\n");
      out.write("	                			let tr = `\r\n");
      out.write("	                				<tr>\r\n");
      out.write("		                				<th scope=\"row\">${board.rowNum}</th>\r\n");
      out.write("										<td><a href=\"../qna/detail.jsp?no=${board.no}\">${board.title}</a></td>\r\n");
      out.write("										<td>${board.createdDate}</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("	                			`;\r\n");
      out.write("	                			tbody.insertAdjacentHTML(\"beforeend\", tr);\r\n");
      out.write("	                		}\r\n");
      out.write("	                		else if(section === 'report') {\r\n");
      out.write("\r\n");
      out.write("	                			console.log(board);\r\n");
      out.write("	                			let tr = `\r\n");
      out.write("	                				<tr>\r\n");
      out.write("		                				<th scope=\"row\">${board.rowNum}</th>\r\n");
      out.write("		                				<td><a href=\"../qna/detail.jsp?no=${board.no}\">${board.title}</a></td>\r\n");
      out.write("										<td>${board.badUser.nickname}</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("	                			`;\r\n");
      out.write("	                			tbody.insertAdjacentHTML(\"beforeend\", tr);\r\n");
      out.write("	                		}\r\n");
      out.write("	                	}\r\n");
      out.write("	        		} else {\r\n");
      out.write("	        			let tr = `\r\n");
      out.write("	        				<tr>\r\n");
      out.write("								<td colspan=\"4\" class=\"text-center\">작성한 글이 없습니다.</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("	                	`;\r\n");
      out.write("                		tbody.insertAdjacentHTML(\"beforeend\", tr);\r\n");
      out.write("	        		}\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("			xhr.open(\"GET\", \"myPage-res.jsp?section=\" + section + \"&page=\" + pageNo);\r\n");
      out.write("			xhr.send();\r\n");
      out.write("		};\r\n");
      out.write("		\r\n");
      out.write("		// 매개변수는 내비게이션 prev next의 실제 값\r\n");
      out.write("		function asyncNavigation(section, pageNo) {\r\n");
      out.write("			let navigation = document.getElementById(section + \"Navigation\");\r\n");
      out.write("			navigation.innerHTML = \"\";\r\n");
      out.write("			// ajax\r\n");
      out.write("			let xhr = new XMLHttpRequest();\r\n");
      out.write("            xhr.onreadystatechange = function () {\r\n");
      out.write("                if (xhr.readyState === 4 && xhr.status === 200) {\r\n");
      out.write("        			// 응답으로 json형식의 텍스트를 받음\r\n");
      out.write("        			let text = xhr.responseText;\r\n");
      out.write("        			// json형식의 텍스트를 자바스크립트 객체로 변환함\r\n");
      out.write("        			let pageObj = JSON.parse(text);\r\n");
      out.write("        			if (pageObj.totalRows > 0) {\r\n");
      out.write("	             		let li1 = `\r\n");
      out.write("	               			<li class=\"page-item ${pageObj.isFirst ? \"disabled\" : \"\"}\">\r\n");
      out.write("							<a class=\"page-link\" onclick=\"loadPage('${section}', ${pageObj.prev});\">Previous</a></li>\r\n");
      out.write("	                	`;\r\n");
      out.write("	               		navigation.insertAdjacentHTML(\"beforeend\", li1);\r\n");
      out.write("	               		\r\n");
      out.write("	               		for (let num = pageObj.beginPage; num <= pageObj.endPage; num++) {\r\n");
      out.write("		               		let li2 = `\r\n");
      out.write("		               			<li class=\"page-item\">\r\n");
      out.write("			                    	<a onclick=\"loadPage('${section}', ${num});\" class=\"page-link ${pageNo == num ? \"active\" : \"\"}\">\r\n");
      out.write("			                    		${num}\r\n");
      out.write("									</a>\r\n");
      out.write("	                        	</li>\r\n");
      out.write("		               		`;\r\n");
      out.write("		               		navigation.insertAdjacentHTML(\"beforeend\", li2);\r\n");
      out.write("	               		}\r\n");
      out.write("	               		\r\n");
      out.write("	               		let li3 = `\r\n");
      out.write("	               			<li class=\"page-item ${pageObj.isLast ? \"disabled\" : \"\"}\">\r\n");
      out.write("	               			<a class=\"page-link\" onclick=\"loadPage('${section}', ${pageObj.next});\">Next</a></li>\r\n");
      out.write("	               		`;\r\n");
      out.write("	               		navigation.insertAdjacentHTML(\"beforeend\", li3);\r\n");
      out.write("	                }\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("			xhr.open(\"GET\", \"myPage-navi.jsp?section=\" + section + \"&page=\" + pageNo);\r\n");
      out.write("			xhr.send();\r\n");
      out.write("		};\r\n");
      out.write("		\r\n");
      out.write("		// 페이지 로드 및 페이지 변경 함수\r\n");
      out.write("		function loadPage(section, page) {\r\n");
      out.write("			asyncPaging(section, page);\r\n");
      out.write("		    asyncNavigation(section, page);\r\n");
      out.write("		};\r\n");
      out.write("\r\n");
      out.write("		// 초기 페이지 로드\r\n");
      out.write("		document.addEventListener('DOMContentLoaded', function() {\r\n");
      out.write("		    loadPage('purchase', 1);\r\n");
      out.write("		    loadPage('sell', 1);\r\n");
      out.write("		    loadPage('qna', 1);\r\n");
      out.write("		    loadPage('report', 1);\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<footer id=\"divFooter\">\r\n");
      out.write("    <div class=\"center\">\r\n");
      out.write("        <p class=\"bold\">2404 2조</p>\r\n");
      out.write("        <p>SEMI PROJECT</p>\r\n");
      out.write("        <p class=\"contact\">BOOKOREA@naver.com</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("</body>\r\n");
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