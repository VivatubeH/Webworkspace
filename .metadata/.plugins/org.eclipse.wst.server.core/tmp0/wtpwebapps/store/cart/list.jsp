<%@page import="vo.CartItem"%>
<%@page import="java.util.List"%>
<%@page import="dao.CartItemDao"%>
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
	String menu = "장바구니";
%>
<%@ include file="../common/nav.jsp" %>

<div class="container mt-4 mb-5">
	<h1>장바구니 목록</h1>
	<p>장바구니 목록입니다.</p>
	
<%--
	요청 URL
		http://localhost/store/cart/list.jsp
	쿼리스트링
		없음
	요청파라미터 정보
		없음
		
	요청처리 절차
		* 요구조건 : 로그인한 사용자가 장바구니를 클릭하면 
					 자신이 장바구니에 저장한 상품정보가 출력된다.
		1. 로그인여부 체크한다.
			* 비로그인상태면 로그인폼을 요청하는 URL을 응답으로 보낸다.
		2. 세션에서 로그인한 사용자번호를 조회한다.
		3. 사용자번호의 장바구니에 저장한 아이템을 모두 조회한다.
		4. 조회된 아이템정보들을 표시한다.
		5. 장바구니관련 집계정보를 표시한다.
--%>	

<%
	if (loginedUserId == null) {
		response.sendRedirect("../user/login-form.jsp?deny");
		return;
	}

	int userNo = (Integer) session.getAttribute("USERNO");
	
	CartItemDao cartItemDao = new CartItemDao();
	List<CartItem> items = cartItemDao.getCartItemsByUserNo(userNo);
	
	int totalPrice = 0;
	int totalAmount = 0;
	int totalDiscountPrice = 0; // 총 할인금액은 쿠폰 등을 이용한 할인
%> 
 	<form method="post" action="delete.jsp">
	 	<table class="table">
			<colgroup>
				<col width="5%">
				<col width="*">
				<col width="10%">
				<col width="15%">
				<col width="15%">
				<col width="10%">
			</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>상품명</th>
				<th>수량</th>
				<th>할인가격</th>
				<th>구매금액</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
<%
	if (items.isEmpty()) {
%>
			<tr>
				<td colspan="6" class="text-center">
					장바구니에 저장된 상품이 없습니다.
				</td>
			</tr>
<%
	}

	for (CartItem item : items) { 
		totalPrice += (item.getPrice()*item.getAmount());
		totalAmount += item.getAmount();
		totalDiscountPrice += 0;
%>
			<tr>
				<td>
					<input type="checkbox" name="itemNo" value="<%=item.getNo() %>">
				</td>
				<td>
					<a href="../product/detail.jsp?no=<%=item.getProduct().getNo()%>">
						<%=item.getProduct().getName() %>
					</a>
				</td>	
				<td>
					<%=item.getAmount() %> 개
				</td>
				<td>
					<%=Utils.toCurrency(item.getPrice()) %> 원
				</td>
				<td>
					<%=Utils.toCurrency(item.getPrice()*item.getAmount()) %> 원
				</td>
<%
	}
%>
				<td class="text-end">
					<a href="delete.jsp?itemNo=1" class="btn btn-outline-danger btn-sm">
						삭제
					</a>
				</td>
			</tr>
		</tbody>
	</table>
	
	<div>
			<button type="submit" class="btn btn-outline-secondary btn-sm">선택삭제</button>
			<button type="submit" class="btn btn-outline-secondary btn-sm">전체삭제</button>
			<button type="submit" class="btn btn-primary btn-sm float-end">주문하기</button>
	</div>
	</form>
	
	<table class="table  mt-5 text-center">
		<colgroup>
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
		</colgroup>
		<tr>
			<th>총 주문금액</th>
			<th>총 주문수량</th>
			<th>총 할인금액</th>
			<th class="table-dark">최종 결재금액</th>
		</tr>
		<tr>
			<th><strong><%=Utils.toCurrency(totalPrice) %></strong> 원</th>
			<th><strong><%=Utils.toCurrency(totalAmount) %></strong> 개</th>
			<th><strong><%=Utils.toCurrency(totalDiscountPrice) %></strong> 원</th>
			<th class="table-dark"><strong><%=Utils.toCurrency(totalPrice - totalDiscountPrice) %></strong> 원</th>
		</tr>
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