/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.26
 * Generated at: 2024-09-26 02:29:58 UTC
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
import java.util.ArrayList;
import com.google.gson.Gson;
import java.util.List;
import utils.Pagination;
import utils.Util;

public final class myPage_002dres_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(10);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("utils.Pagination");
    _jspx_imports_classes.add("utils.Util");
    _jspx_imports_classes.add("com.google.gson.Gson");
    _jspx_imports_classes.add("domain.qna.vo.Qna");
    _jspx_imports_classes.add("domain.qna.dao.QnaDao");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


	Gson gson = new Gson();
	String jsonText = "";
	int USERNO = (Integer) session.getAttribute("USERNO");
	String section = request.getParameter("section");
	int pageNo = Util.toInt(request.getParameter("page"));
	if ("purchase".equals(section)) {
		domain.purchase.dao.BoardDao boardDao = new domain.purchase.dao.BoardDao();
		int purchaseTotalRows = boardDao.getTotalRowsByUserNo(USERNO);
		Pagination purchasePagination = new Pagination(pageNo, purchaseTotalRows, 5, 5);
		int purchaseRowNumber = purchaseTotalRows - purchasePagination.getBegin() + 1;
		
		// rowNumber를 넣기 위해 List를 새로 생성해서 거기다가 rowNumber와 함께 집어넣었다.
		List<domain.purchase.vo.Board> tmps = boardDao.getBoardsByUserNo(USERNO, purchasePagination.getBegin(), purchasePagination.getEnd());
		List<domain.purchase.vo.Board> purchaseBoards = new ArrayList<>();
		
		for(domain.purchase.vo.Board board : tmps) {
			board.setRowNum(purchaseRowNumber--);
			purchaseBoards.add(board);
		}
		jsonText = gson.toJson(purchaseBoards);
		
	} else if ("sell".equals(section)) {
		domain.sell.dao.BoardDao boardDao = new domain.sell.dao.BoardDao();
		int sellTotalRows = boardDao.getTotalRowsByUserNo(USERNO);
		Pagination sellPagination = new Pagination(pageNo, sellTotalRows, 5, 5);
		int sellRowNumber = sellTotalRows - sellPagination.getBegin() + 1;
		
		List<domain.sell.vo.Board> tmps = boardDao.getBoardsByUserNo(USERNO, sellPagination.getBegin(), sellPagination.getEnd());
		List<domain.sell.vo.Board> sellBoards = new ArrayList<>();
		
		for(domain.sell.vo.Board board : tmps) {
			board.setRowNum(sellRowNumber--);
			sellBoards.add(board);
		}
		jsonText = gson.toJson(sellBoards);
		
	} else if ("qna".equals(section)) {
		QnaDao qnaDao = new QnaDao();
		int qnaTotalRows = qnaDao.getTotalQnaRowsByUserNo(USERNO);
		Pagination qnaPagination = new Pagination(pageNo, qnaTotalRows, 5, 5);
		int qnaRowNumber = qnaTotalRows - qnaPagination.getBegin() + 1;
		
		List<Qna> tmps = qnaDao.getQnaBoardsByUserNo(USERNO, qnaPagination.getBegin(), qnaPagination.getEnd());
		List<Qna> qnaBoards = new ArrayList<>();
		
		for(Qna qna : tmps) {
			qna.setRowNum(qnaRowNumber--);
			qnaBoards.add(qna);
		}
		jsonText = gson.toJson(qnaBoards);
		
	} else if ("report".equals(section)) {
		QnaDao reportDao = new QnaDao();
		int reportTotalRows = reportDao.getTotalReportRowsByUserNo(USERNO);
		Pagination reportPagination = new Pagination(pageNo, reportTotalRows, 5, 5);
		int reportRowNumber = reportTotalRows - reportPagination.getBegin() + 1;
		
		List<Qna> tmps = reportDao.getReportBoardsByUserNo(USERNO, reportPagination.getBegin(), reportPagination.getEnd());
		List<Qna> reportBoards = new ArrayList<>();
		
		for(Qna report : tmps) {
			report.setRowNum(reportRowNumber--);
			reportBoards.add(report);
		}
		jsonText = gson.toJson(reportBoards);
	}
	
	out.write(jsonText);

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
