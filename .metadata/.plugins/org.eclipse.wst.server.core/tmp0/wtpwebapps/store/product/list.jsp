<%@page import="vo.Product"%>
<%@page import="java.util.List"%>
<%@page import="util.Utils"%>
<%@page import="util.Pagination"%>
<%@page import="dao.ProductDao"%>
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
	String menu = "상품";
%>
<%@ include file="../common/nav.jsp"%>

<div class="container mt-4 mb-5">
	<h1>상품 목록</h1>
	<p>상품목록에서 상품을 확인해보세요.</p>

<%--
	요청 URL
		http://localhost/store/product/list.jsp
		http://localhost/store/product/list.jsp?page=2
	쿼리스트링	
		page=2 		페이지번호를 클릭해서 list.jsp를 요청할 때
	요청파라미터
		name		value
		-----------------------------
		"page"		"2"		* page이 요청파라미터는 없을 수도 있다.
							* 이 요청파라미터가 없을 때는 언제나 요청하는 페이지가
								1페이지로 간주한다.
--%>	
<%
	// 요청파라미터 값을 조회한다.
	int pageNo = Utils.toInt(request.getParameter("page"), 1);

	// 1. DB에서 전체 상품 개수를 조회한다. 
	ProductDao productDao = new ProductDao();
	int totalRows = productDao.getTotalRows()
			;
	// Pagination 객체를 생성한다 <--- 페이지번호, 총 상품갯수
	Pagination pagination = new Pagination(pageNo, totalRows);
	
	// 요청한 페이지에 맞는 제품목록을 조회한다.
	int begin = pagination.getBegin();
	int end = pagination.getEnd();
	List<Product> products = productDao.getProducts(begin, end);
%>

	<table class="table">
		<colgroup>
			<col width="10%">
			<col width="15%">
			<col width="*">
			<col width="15%">
			<col width="15%">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>종류</th>
				<th>상품명</th>
				<th>가격</th>
				<th>제조회사</th>
			</tr>
		</thead>
		<tbody>
<%
	for (Product product : products) {
%>
			<tr>
				<td><%=product.getNo() %></td>
				<td><%=product.getCategory().getName() %></td>
				<td><a href="detail.jsp?no=<%=product.getNo() %>&page=<%=pageNo%>"><%=product.getName() %></a></td>
				<td><%=Utils.toCurrency(product.getDiscountPrice()) %> 원</td>
				<td><%=product.getCompany().getName() %></td>
			</tr>
<%
	}
%>
		</tbody>
	</table>
	
	<div>
		<ul class="pagination justify-content-center">
			<li class="page-item">
				<a href="" class="page-link">이전</a>
			</li>
			<li class="page-item">
				<a href="" class="page-link">1</a>
			</li>
			<li class="page-item">
				<a href="" class="page-link">2</a>
			</li>
			<li class="page-item">
				<a href="" class="page-link">다음</a>
			</li>
		</ul>
	</div>
</div>
</body>
</html>