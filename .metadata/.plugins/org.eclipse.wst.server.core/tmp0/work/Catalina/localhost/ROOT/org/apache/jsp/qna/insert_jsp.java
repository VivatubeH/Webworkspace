/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.26
 * Generated at: 2024-09-27 05:40:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.qna;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import domain.qna.dao.QnaDao;
import domain.qna.vo.Qna;
import domain.user.vo.User;
import java.util.Date;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(6);
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("domain.qna.vo.Qna");
    _jspx_imports_classes.add("domain.user.vo.User");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>글 정보 넣기</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

    // 요청 파라미터값 조회하기
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    int categoryNo = Integer.parseInt(request.getParameter("category"));

    
    // 신고 유저 닉네임은 신고 카테고리에서만 사용
    String reportedUserNickname = null; // 신고받는 유저 닉네임 변수
    // 신고 카테고리일 때만 신고 유저 닉네임을 가져옴
    if (categoryNo == 2) { // 카테고리 번호가 2일 때
        reportedUserNickname = request.getParameter("baduser"); // 신고받는 유저 닉네임
    
      
     // 신고 유저 닉네임이 null이 아닌지 확인 
        if (reportedUserNickname == null || reportedUserNickname.isEmpty()) {
            out.println("<script>alert('신고 유저 닉네임이 필요합니다.'); history.back();</script>"); 
            return; 
        }
        // QnaDao 객체 생성
        QnaDao qnaDao = new QnaDao();
        // 유저 닉네임 유효성 검사
        boolean isValidUser = qnaDao.checkUserNickname(reportedUserNickname); 
        if (!isValidUser) {
            out.println("<script>alert('존재하지 않는 유저입니다.'); history.back();</script>"); 
            return; // 
        }
    }
    
    
    // 세션에서 로그인한 사용자번호를 조회한다.
    int userNo = (Integer)session.getAttribute("USERNO");
    User user = new User(userNo); // 신고하는 유저

    // Qna객체를 생성해서 제목, 내용, 게시판 종류, 작성자 정보를 저장한다.
    Qna qna = new Qna();
    qna.setTitle(title);
    qna.setContent(content);
    qna.setCategoryNo(categoryNo);
    qna.setUser(user); // 작성자 유저 설정
    
	QnaDao qnaDao = new QnaDao();
    if(qna.getCategoryNo()==2){
	    int badUserNo = qnaDao.getUserNoByUserNickName(request.getParameter("baduser"));
	    qna.setBadUser(new User(badUserNo)); // 신고 당하는 유저 설정
	}

    // 상태 설정
    String status;
    if (categoryNo == 1) { // 1대1 문의 카테고리 번호를 확인
        status = "N"; // 기본 상태
    } else  {
    	// 관리자 답글이 달렸을때 조건문 후 답변완료로 변경 되게 
        status = "N" ; // 신고 카테고리의 경우 상태 설정 
    }
    
    qna.setStatus(status); // 상태 설정

    // 현재 날짜와 시간을 등록일로 설정
    Date created_Date = new Date(); // 현재 날짜와 시간
    qna.setCreatedDate(created_Date); // Qna 객체에 등록일 설정

    // QnaDao 객체 생성 후 insertBoard 메소드 실행하여 새 게시글 정보를 테이블에 저장
    qnaDao.insertBoard(qna);

    // 카테고리에 따라 리다이렉트 URL 설정
    if (categoryNo == 2) { // 신고 카테고리 번호를 확인
        response.sendRedirect("list-report.jsp"); // 신고 게시판으로 리다이렉트
    } else {
        response.sendRedirect("list.jsp"); // 기본 게시판으로 리다이렉트
    }
    
    

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
