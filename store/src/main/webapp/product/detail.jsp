<%@page import="java.util.List"%>
<%@page import="vo.Benefit"%>
<%@page import="vo.Product"%>
<%@page import="dao.ProductDao"%>
<%@page import="util.Utils"%>
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
<%@ include file="../common/nav.jsp" %>
<div class="container mt-5 mb-5">
	<h1>상품 상세정보</h1>
	<p>상품의 상세정보를 확인하고, 장바구니에 담아보세요</p>

<%--
	요청 URL
		http://localhost/store/detail.jsp?no=5210&page=2
	쿼리스트링
		no=5210&page=2
	요청파라미터 정보
		name	value
		--------------
		"no"	"5210"	상세정보를 보고싶은 상품번호
		"page"	"2"		
		--------------
		
	요청처리 절차
		1. 요청처리에 필요한 값 수집
		2. 상품번호로 상품 상세정보를 조회하고 표시한다.
			상품정보 = 상품정보 + 카테고리정보 + 제조회사정보 + 상태정보
		3. 상품번호로 해당 상품과 관련된 추가혜택정보를 조회하고 표시한다.
 --%>	
<%
	// 요청파라미터 정보 조회
	int productNo = Utils.toInt(request.getParameter("no"));
	int pageNo = Utils.toInt(request.getParameter("page"), 1);	
	
	ProductDao productDao = new ProductDao();
	// 상품 상세정보 조회
	Product product = productDao.getProductByNo(productNo);
	// 상품 추가혜택 정보 조회
	List<Benefit> benefits = productDao.getBenefitsByProductNo(productNo);
	
%>
	<table class="table">
		<colgroup>
			<col width="15%">
			<col width="35%">
			<col width="15%">
			<col width="35%">
		</colgroup>
		<tbody>
			<tr>
				<th>상품명</th>
				<td><%=product.getName() %></td>
				<th>번호</th>
				<td><%=product.getNo() %></td>
			</tr>
			<tr>
				<th>종류</th>
				<td><%=product.getCategory().getName() %></td>
				<th>제조회사</th>
				<td><%=product.getCompany().getName() %></td>
			</tr>
			<tr>
				<th>할인가격</th>
				<td><%=Utils.toCurrency(product.getDiscountPrice()) %>원</td>
				<th>가격</th>
				<td><%=Utils.toCurrency(product.getPrice()) %> 원</td>
			</tr>
			<tr>
				<th>재고수량</th>
				<td><%=Utils.toCurrency(product.getStock()) %> 개</td>
				<th>상태</th>
				<td><%=product.getStatus().getName() %></td>
			</tr>
			<tr>
				<th>설명</th>
				<td colspan="3"><%=product.getDescription() %></td>
			</tr>
			<tr>
				<th>추가혜택</th>
				<td colspan="3">
<%
	for (Benefit benefit : benefits) {
%>
					<span class="badge text-bg-success"><%=benefit.getName() %></span>
<%
	}
%>
				</td>
			</tr>
		</tbody>
	</table>
	
	<div class="d-flex justify-content-end">
		<form class="border bg-light w-100 p-3 mt-3 row  row-cols-md-auto g-3 align-items-center"
			method="post" action="../cart/add.jsp">
				<input type="hidden" name="no" value="<%=product.getNo() %>">
				<div class="col-12">
					 <label class="form-label">수량</label>
				</div>
				<div class="col-12">
					 <input type="number" class="form-control"  name="amount" value="1" min="1">
				</div>
				<div class="col-12">
					 <button type="submit" class="btn btn-primary">장바구니</button>
				</div>
		</form>
	</div>
</div>
</body>
</html>