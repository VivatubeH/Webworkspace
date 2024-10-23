/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.26
 * Generated at: 2024-09-25 14:40:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import domain.user.vo.User;
import java.util.List;
import domain.admin.dao.AdminDao;
import utils.Util;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/admin/common/sidebar.jsp", Long.valueOf(1727275102869L));
    _jspx_dependants.put("/common/common.jsp", Long.valueOf(1727275102794L));
    _jspx_dependants.put("/admin/common/login.jsp", Long.valueOf(1727275102781L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(6);
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>관리자 메인 페이지</title>\r\n");
      out.write("    ");
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
      out.write("    .sidebar .nav-link:hover {\r\n");
      out.write("        background-color: #444; \r\n");
      out.write("    }\r\n");
      out.write("    .btn-danger {\r\n");
      out.write("        background-color: #dc3545; \r\n");
      out.write("        border-color: #dc3545; \r\n");
      out.write("    }\r\n");
      out.write("    .card-text {\r\n");
      out.write("    	font-size: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    table {\r\n");
      out.write("    	font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("	관리자의 모든 디렉토리에서 관리자인지 여부를 검사하기 위한 공통 기능.	\r\n");
      out.write("-->\r\n");

	// user/login.jsp에서 세션에서 USERID, USERNICKNAME, USERTYPE를 가져온다.
	// 저장된 상태로 admin/index.jsp로 전달된다.
	String userId = (String)session.getAttribute("USERID");
	String userNickName = (String)session.getAttribute("USERNICKNAME");
	String userType = (String)session.getAttribute("USERTYPE");
	
	// 만약에 userType이 "null"이거나 ADMIN이 아니면 관리자로 로그인 된 것이 아니니 
	// 바로 ../user/login-form.jsp로 돌려보낸다.
	if (userType == null || !userType.equals("ADMIN")) {
		response.sendRedirect("/user/login-form.jsp?error=admin");
		return;
	}

      out.write("		\r\n");
      out.write("<!-- \r\n");
      out.write("	관리자의 메인 페이지에서 필요한 데이터\r\n");
      out.write("	: 사이트의 총 회원수,\r\n");
      out.write("	  , 사이트의 총 도서수\r\n");
      out.write("	  , 사이트의 총 조회수\r\n");
      out.write("	  , 사이트의 총 게시글 수\r\n");
      out.write("	  \r\n");
      out.write("	: 관리자의 이름,\r\n");
      out.write("	  이메일,\r\n");
      out.write("	  연락처\r\n");
      out.write(" -->\r\n");
      out.write(" \r\n");

	// DB 엑세스를 위해 AdminDao 객체를 생성한다.
	AdminDao adminDao = new AdminDao();

      out.write("\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write("	<div class=\"\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("	모든 관리자 페이지에서 공통으로 사용할 사이드바	\r\n");
      out.write("-->\r\n");
      out.write(" <div class=\"sidebar p-3\" style=\"background-color: #808080; color:white;\">\r\n");
      out.write("        <div class=\"d-flex align-items-center mb-4\">\r\n");
      out.write("            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"56\" height=\"56\" fill=\"currentColor\" class=\"bi bi-person-gear\" viewBox=\"0 0 16 16\">\r\n");
      out.write(" 			<path d=\"M11 5a3 3 0 1 1-6 0 3 3 0 0 1 6 0M8 7a2 2 0 1 0 0-4 2 2 0 0 0 0 4m.256 7a4.5 4.5 0 0 1-.229-1.004H3c.001-.246.154-.986.832-1.664C4.484 10.68 5.711 10 8 10q.39 0 .74.025c.226-.341.496-.65.804-.918Q8.844 9.002 8 9c-5 0-6 3-6 4s1 1 1 1zm3.63-4.54c.18-.613 1.048-.613 1.229 0l.043.148a.64.64 0 0 0 .921.382l.136-.074c.561-.306 1.175.308.87.869l-.075.136a.64.64 0 0 0 .382.92l.149.045c.612.18.612 1.048 0 1.229l-.15.043a.64.64 0 0 0-.38.921l.074.136c.305.561-.309 1.175-.87.87l-.136-.075a.64.64 0 0 0-.92.382l-.045.149c-.18.612-1.048.612-1.229 0l-.043-.15a.64.64 0 0 0-.921-.38l-.136.074c-.561.305-1.175-.309-.87-.87l.075-.136a.64.64 0 0 0-.382-.92l-.148-.045c-.613-.18-.613-1.048 0-1.229l.148-.043a.64.64 0 0 0 .382-.921l-.074-.136c-.306-.561.308-1.175.869-.87l.136.075a.64.64 0 0 0 .92-.382zM14 12.5a1.5 1.5 0 1 0-3 0 1.5 1.5 0 0 0 3 0\"></path>\r\n");
      out.write("			</svg>\r\n");
      out.write("            <span>admin</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"nav flex-column\">\r\n");
      out.write("        	<li class=\"nav-item\">\r\n");
      out.write("            	<a class=\"nav-link\" href=\"/admin/index.jsp\">\r\n");
      out.write("            		<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-person-gear\" viewBox=\"0 0 16 16\">\r\n");
      out.write("  					<path d=\"M11 5a3 3 0 1 1-6 0 3 3 0 0 1 6 0M8 7a2 2 0 1 0 0-4 2 2 0 0 0 0 4m.256 7a4.5 4.5 0 0 1-.229-1.004H3c.001-.246.154-.986.832-1.664C4.484 10.68 5.711 10 8 10q.39 0 .74.025c.226-.341.496-.65.804-.918Q8.844 9.002 8 9c-5 0-6 3-6 4s1 1 1 1zm3.63-4.54c.18-.613 1.048-.613 1.229 0l.043.148a.64.64 0 0 0 .921.382l.136-.074c.561-.306 1.175.308.87.869l-.075.136a.64.64 0 0 0 .382.92l.149.045c.612.18.612 1.048 0 1.229l-.15.043a.64.64 0 0 0-.38.921l.074.136c.305.561-.309 1.175-.87.87l-.136-.075a.64.64 0 0 0-.92.382l-.045.149c-.18.612-1.048.612-1.229 0l-.043-.15a.64.64 0 0 0-.921-.38l-.136.074c-.561.305-1.175-.309-.87-.87l.075-.136a.64.64 0 0 0-.382-.92l-.148-.045c-.613-.18-.613-1.048 0-1.229l.148-.043a.64.64 0 0 0 .382-.921l-.074-.136c-.306-.561.308-1.175.869-.87l.136.075a.64.64 0 0 0 .92-.382zM14 12.5a1.5 1.5 0 1 0-3 0 1.5 1.5 0 0 0 3 0\"></path>\r\n");
      out.write("					</svg> 관리자 홈\r\n");
      out.write("            	</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"/admin/qna-management/list.jsp\">\r\n");
      out.write("                	 <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-clipboard2\" viewBox=\"0 0 16 16\">\r\n");
      out.write("  					 <path d=\"M3.5 2a.5.5 0 0 0-.5.5v12a.5.5 0 0 0 .5.5h9a.5.5 0 0 0 .5-.5v-12a.5.5 0 0 0-.5-.5H12a.5.5 0 0 1 0-1h.5A1.5 1.5 0 0 1 14 2.5v12a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 14.5v-12A1.5 1.5 0 0 1 3.5 1H4a.5.5 0 0 1 0 1z\"/>\r\n");
      out.write("  					 <path d=\"M10 .5a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5.5.5 0 0 1-.5.5.5.5 0 0 0-.5.5V2a.5.5 0 0 0 .5.5h5A.5.5 0 0 0 11 2v-.5a.5.5 0 0 0-.5-.5.5.5 0 0 1-.5-.5\"/>\r\n");
      out.write(" 					 </svg> 문의/신고 관리\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"/admin/member-management/list.jsp\">\r\n");
      out.write("                 	<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-people\" viewBox=\"0 0 16 16\">\r\n");
      out.write("  					<path d=\"M15 14s1 0 1-1-1-4-5-4-5 3-5 4 1 1 1 1zm-7.978-1L7 12.996c.001-.264.167-1.03.76-1.72C8.312 10.629 9.282 10 11 10c1.717 0 2.687.63 3.24 1.276.593.69.758 1.457.76 1.72l-.008.002-.014.002zM11 7a2 2 0 1 0 0-4 2 2 0 0 0 0 4m3-2a3 3 0 1 1-6 0 3 3 0 0 1 6 0M6.936 9.28a6 6 0 0 0-1.23-.247A7 7 0 0 0 5 9c-4 0-5 3-5 4q0 1 1 1h4.216A2.24 2.24 0 0 1 5 13c0-1.01.377-2.042 1.09-2.904.243-.294.526-.569.846-.816M4.92 10A5.5 5.5 0 0 0 4 13H1c0-.26.164-1.03.76-1.724.545-.636 1.492-1.256 3.16-1.275ZM1.5 5.5a3 3 0 1 1 6 0 3 3 0 0 1-6 0m3-2a2 2 0 1 0 0 4 2 2 0 0 0 0-4\"/>\r\n");
      out.write("					</svg> 회원 관리\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"/admin/statistics-management/list.jsp\">\r\n");
      out.write("                	<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-bar-chart\" viewBox=\"0 0 16 16\">\r\n");
      out.write("  					<path d=\"M4 11H2v3h2zm5-4H7v7h2zm5-5v12h-2V2zm-2-1a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h2a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1zM6 7a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1v7a1 1 0 0 1-1 1H7a1 1 0 0 1-1-1zm-5 4a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1v3a1 1 0 0 1-1 1H2a1 1 0 0 1-1-1z\"/>\r\n");
      out.write("					</svg> 사이트 통계\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"/index.jsp\">\r\n");
      out.write("                	<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-house-door\" viewBox=\"0 0 16 16\">\r\n");
      out.write("  					<path d=\"M8.354 1.146a.5.5 0 0 0-.708 0l-6 6A.5.5 0 0 0 1.5 7.5v7a.5.5 0 0 0 .5.5h4.5a.5.5 0 0 0 .5-.5v-4h2v4a.5.5 0 0 0 .5.5H14a.5.5 0 0 0 .5-.5v-7a.5.5 0 0 0-.146-.354L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293zM2.5 14V7.707l5.5-5.5 5.5 5.5V14H10v-4a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5v4z\"/>\r\n");
      out.write("					</svg> 사이트 홈\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"mt-auto\">\r\n");
      out.write("            <a class=\"btn btn-danger w-100\" href=\"/user/logout.jsp\" style=\"color: white;\">LOGOUT</a>\r\n");
      out.write("        </div>\r\n");
      out.write("  </div>");
      out.write("\r\n");
      out.write("	    \r\n");
      out.write("	    <div class=\"main-content p-3 text-center\">\r\n");
      out.write("			\r\n");
      out.write("			<h3 style=\"text-align: left;\">");
      out.print(userNickName );
      out.write(" 관리자님 환영합니다.</h3>\r\n");
      out.write("			<br />\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("	    		<div class=\"col-md-6\">\r\n");
      out.write("	        		<div class=\"card mb-3\">\r\n");
      out.write("	            		<div class=\"card-body\">\r\n");
      out.write("	                		<h5 class=\"card-title\"><mark>사이트 총 회원수 \r\n");
      out.write("	                		<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-person-circle\" viewBox=\"0 0 16 16\">\r\n");
      out.write("	  						<path d=\"M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0\"/>\r\n");
      out.write("	  						<path fill-rule=\"evenodd\" d=\"M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8m8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1\"/>\r\n");
      out.write("							</svg>\r\n");
      out.write("							</mark></h5>\r\n");
      out.write("	                			<h6 class=\"card-text\"><strong>");
      out.print(adminDao.countTotalMembersInBookstore() );
      out.write(" 명</strong></h6>\r\n");
      out.write("	            		</div>\r\n");
      out.write("	        		</div>\r\n");
      out.write("	    		</div>\r\n");
      out.write("	        		\r\n");
      out.write("	        	<div class=\"col-md-6\">\r\n");
      out.write("	            	<div class=\"card mb-3\">\r\n");
      out.write("	                	<div class=\"card-body\">\r\n");
      out.write("	                    	<h5 class=\"card-title\"><mark>사이트에 등록된 총 도서수\r\n");
      out.write("	                    	<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-book\" viewBox=\"0 0 16 16\">\r\n");
      out.write("	  						<path d=\"M1 2.828c.885-.37 2.154-.769 3.388-.893 1.33-.134 2.458.063 3.112.752v9.746c-.935-.53-2.12-.603-3.213-.493-1.18.12-2.37.461-3.287.811zm7.5-.141c.654-.689 1.782-.886 3.112-.752 1.234.124 2.503.523 3.388.893v9.923c-.918-.35-2.107-.692-3.287-.81-1.094-.111-2.278-.039-3.213.492zM8 1.783C7.015.936 5.587.81 4.287.94c-1.514.153-3.042.672-3.994 1.105A.5.5 0 0 0 0 2.5v11a.5.5 0 0 0 .707.455c.882-.4 2.303-.881 3.68-1.02 1.409-.142 2.59.087 3.223.877a.5.5 0 0 0 .78 0c.633-.79 1.814-1.019 3.222-.877 1.378.139 2.8.62 3.681 1.02A.5.5 0 0 0 16 13.5v-11a.5.5 0 0 0-.293-.455c-.952-.433-2.48-.952-3.994-1.105C10.413.809 8.985.936 8 1.783\"/>\r\n");
      out.write("							</svg>\r\n");
      out.write("	                    	</mark></h5>\r\n");
      out.write("	                    		<h6 class=\"card-text\"><strong>");
      out.print(adminDao.countTotalBooksInBookstore() );
      out.write(" 권</strong></h6>\r\n");
      out.write("	               		</div>\r\n");
      out.write("	            	</div>\r\n");
      out.write("	        	</div>\r\n");
      out.write("	        		\r\n");
      out.write("	        	<div class=\"col-md-6\">\r\n");
      out.write("	           		<div class=\"card mb-3\">\r\n");
      out.write("	                	<div class=\"card-body\">\r\n");
      out.write("	                    	<h5 class=\"card-title\"><mark>사이트 게시글의 총 조회수\r\n");
      out.write("	                    	<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-search\" viewBox=\"0 0 16 16\">\r\n");
      out.write("	  						<path d=\"M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001q.044.06.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1 1 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0\"/>\r\n");
      out.write("							</svg>\r\n");
      out.write("	                    	</mark></h5>\r\n");
      out.write("	                    		<h6 class=\"card-text\"><strong>");
      out.print(adminDao.countTotalViewsInPurchaseBoards()+adminDao.countTotalViewsInSellBoards() );
      out.write(" 회</strong></h6>\r\n");
      out.write("	                	</div>\r\n");
      out.write("	            	</div>\r\n");
      out.write("	        	</div>\r\n");
      out.write("	    		\r\n");
      out.write("	    		<div class=\"col-md-6\">\r\n");
      out.write("	           		<div class=\"card mb-3\">\r\n");
      out.write("	                	<div class=\"card-body\">\r\n");
      out.write("	                    	<h5 class=\"card-title\"><mark>사이트 총 게시글수\r\n");
      out.write("	                    	<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-file-earmark-post\" viewBox=\"0 0 16 16\">\r\n");
      out.write("	  						<path d=\"M14 4.5V14a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V2a2 2 0 0 1 2-2h5.5zm-3 0A1.5 1.5 0 0 1 9.5 3V1H4a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h8a1 1 0 0 0 1-1V4.5z\"/>\r\n");
      out.write("	  						<path d=\"M4 6.5a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-.5.5h-7a.5.5 0 0 1-.5-.5zm0-3a.5.5 0 0 1 .5-.5H7a.5.5 0 0 1 0 1H4.5a.5.5 0 0 1-.5-.5\"/>\r\n");
      out.write("							</svg>\r\n");
      out.write("	                    	</mark></h5>\r\n");
      out.write("	                    		<h6 class=\"card-text\"><strong>");
      out.print(adminDao.countTotalPostsInPurchaseBoards()+adminDao.countTotalPostsInSellBoards()+adminDao.countTotalPostsInQnaBoards() );
      out.write(" 개</strong></h6>\r\n");
      out.write("	                	</div>\r\n");
      out.write("	            	</div>\r\n");
      out.write("	        	</div>\r\n");
      out.write("	    	</div>\r\n");
      out.write("		\r\n");
      out.write("	    <h3 style=\"text-align: left;\">관리자 비상 연락망</h3>\r\n");
      out.write("	    <br/>\r\n");
      out.write("	    <table class=\"table table-info table-bordered\" style=\"width: 70%;\">\r\n");
      out.write("	        <thead class=\"table-light\">\r\n");
      out.write("	            <tr>\r\n");
      out.write("	                <th>아이디</th>\r\n");
      out.write("	                <th>닉네임</th>\r\n");
      out.write("	                <th>이메일</th>\r\n");
      out.write("	                <th>연락처</th>\r\n");
      out.write("	            </tr>\r\n");
      out.write("	        </thead>\r\n");
      out.write("	        <tbody class=\"table-group-divider\">\r\n");
      out.write("	");

		// DB에서 모든 관리자를 조회한다.
		List<User> users = adminDao.getAllAdministrator();
	
      out.write('\r');
      out.write('\n');
      out.write('	');

		for (User user : users) {
	
      out.write("\r\n");
      out.write("	            <tr>\r\n");
      out.write("	                <td>");
      out.print(user.getId() );
      out.write("</td>\r\n");
      out.write("	                <td>");
      out.print(user.getNickname() );
      out.write("</td>\r\n");
      out.write("	                <td>");
      out.print(user.getEmail() );
      out.write("</td>\r\n");
      out.write("	                <td>");
      out.print(user.getPhone() );
      out.write("</td>\r\n");
      out.write("	            </tr>\r\n");
      out.write("	");

		}
	
      out.write("\r\n");
      out.write("	        </tbody>\r\n");
      out.write("	    </table>\r\n");
      out.write("	    </div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("</div>\r\n");
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