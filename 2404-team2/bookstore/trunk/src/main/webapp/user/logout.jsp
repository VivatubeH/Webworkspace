<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%
  session.invalidate();
  response.sendRedirect("http://localhost/index.jsp");
%>