<%@page import="dao.CartItemDao"%>
<%@page import="vo.User"%>
<%@page import="vo.CartItem"%>
<%@page import="dao.ProductDao"%>
<%@page import="vo.Product"%>
<%@page import="util.Utils"%>
<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%--
	요청 URL
		http://localhost/store/cart/add.jsp
	쿼리스트링
		없음
	폼 데이터
		no=5210&amount=2
	요청 파라미터
		name		value
		---------------
		"no"		"5210" 장바구니에 추가할 상품번호
		"amount" 	"2"	   장바구니에 추가할 상품수량
	요청처리 절차
		* 요구조건	
			상품상세화면에서 장바구니 담기 버튼을 클릭하면 
			현재 로그인한 사용자번호로
			지금 보고 있는 상품이 장바구니에 저장된다.
		1. 로그인 여부를 체크한다.
			* 비로그인이면 ../user/login-form.jsp?deny를 재요청하게 한다.
		2. 필요한 정보를 수집한다.
			* 사용자번호	-- 세션
			* 상품번호		-- 요청파라미터
			* 상품 수량		-- 요청파라미터
		3. 상품번호로 상품정보를 조회한다. 
		4. CartItem 객체를 생성해서 수집한 값을 담는다.
		5. CartItem 객체를 insertCartItem() 메소드에 전달해서 저장시킨다.
		6. 내 장바구니를 요청하는 URL을 응답으로 보낸다.
--%>
<%
	if (session.getAttribute("USERNO") == null) {
		response.sendRedirect("../user/login-from.jsp?deny");
		return;
	}
	// 요청처리에 필요한 값 수집하기
	int userNo = (Integer) session.getAttribute("USERNO");
	int productNo = Utils.toInt(request.getParameter("no"));
	int amount = Utils.toInt(request.getParameter("amount"));
	
	CartItemDao cartItemDao = new CartItemDao();
	// 사용자번호와 상품번호로 장바구니 아이템 정보를 조회한다.
	CartItem savedCartItem = cartItemDao.getCartItemByUserNoAndProductNo(userNo, productNo);
	
	// 저장된 장바구니 아이템 정보가 존재한다면 해당 상품은 이미 
	// 장바구니에 등록된 상품이므로 수량만 증가시킨다.
	if (savedCartItem != null) {
		savedCartItem.setAmount(savedCartItem.getAmount() + amount);
		cartItemDao.updateCartItem(savedCartItem);
	} else {
		// 상품번호로 상품 상세정보를 조회한다.
		ProductDao productDao = new ProductDao();
		Product product = productDao.getProductByNo(productNo);
		
		CartItem item = new CartItem();
		item.setUser(new User(userNo));
		item.setProduct(product); // Product 객체에는 모든 상품정보가 있다.
		item.setAmount(amount);
		item.setPrice(product.getDiscountPrice());
		
		cartItemDao.insertCartItem(item);
	}
	
	response.sendRedirect("list.jsp");
%>