<%@page import="org.apache.commons.io.IOUtils"%>
<%@page import="java.io.File"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.InputStream"%>
<%@page import="org.apache.commons.fileupload2.core.FileItem"%>
<%@page import="org.apache.commons.fileupload2.jakarta.servlet6.JakartaServletDiskFileUpload"%>
<%@page import="org.apache.commons.fileupload2.jakarta.servlet6.JakartaServletFileUpload"%>
<%@page import="org.apache.commons.fileupload2.core.DiskFileItemFactory"%>
<%@page import="vo.ProductBenefit"%>
<%@page import="dao.ProductDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vo.Benefit"%>
<%@page import="vo.Status"%>
<%@page import="vo.Company"%>
<%@page import="vo.Category"%>
<%@page import="vo.Product"%>
<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%--
	요청 URL
		http://localhost/store/admin/product/insert.jsp
	요청 URI
		/store/product/insert.jsp
	폼 데이터
		catNo=1000
		&name=LG Gram 노트북 14인치
		&price=2000000
		&discountPrice=1800000
		&stock=5
		&companyNo=1001
		&statusNo=10
		&description=LG Gram 초경량 노트북입니다.
		&benefitNo=10
		&benefitNo=13
		
	요청파라미터 정보
		-----------------------------------------------
		name			value
		-----------------------------------------------
		catNo			1000
		name			LG Gram 노트북 14인치
		price			2000000
		discountPrice	1800000
		stock			5
		companyNo		1001
		statusNo		10
		description		LG Gram 초경량 노트북입니다.
		benefitNo		10
		benefitNo		13
		-----------------------------------------------
 --%>
<%
	/*
		Apache Commons Fileupload API를 이용한 멀티파트 요청처리
		 1. DiskFileItemFactory 생성
			* DiskFileItemFactory는 멀티파트 요청을 분석하는 
			  JakartaServletFileUpload객체가 파일업로드 처리를
			  수행할 때 필요한 정보를 제공하는 객체다.
		 2. JakartaServletFileUpload 생성
		 	* JakartaServletFileUpload는 요청객체를 전달받아서
		 	  멀티파트 요청을 처리하고, 처리 결과를 반환한다.
		 3. JakartaServletFileUpload의 parseRequest(HttpServletRequest req)를
		    실행해서 멀티파트 요청을 처리하고, 처리결과를 List<FileItem>으로
		    반환받는다.
		    
		 4. FileItem 객체는 입력필드로 입력한 정보를 표현하는 객체다.
		 	* FileItem 객체의 isFormField() 메소드가 true를 반환하면
		 	  일반 입력필드고, false를 반환하면 첨부파일 업로드 입력필드다.
			* 주요 API
				String getFieldName()
					- 입력필드의 이름을 반환한다.
				String getString()
					- 입력필드에 입력한 값을 반환한다.
				String getName()
					- 업로드된 첨부파일의 이름을 반환하는 메소드
				String getInputStream()
					- 서버의 임시디렉토리에 저장된 첨부파일과 연결된
					  읽기전용 입력스트림을 반환하는 메소드
				boolean isFormField()
					- 일반 입력필드일 때 true를 반환하는 메소드다.
	*/
	
	DiskFileItemFactory factory = DiskFileItemFactory.builder()
		.setCharset("UTF-8")
		.get();
	JakartaServletFileUpload upload = new JakartaServletFileUpload(factory);
	List<FileItem> items = upload.parseRequest(request);
	
	Product product = new Product();
	List<ProductBenefit> benefits = new ArrayList<>();
	
	for (FileItem item : items) {
			String name = item.getFieldName();
			String value = item.getString();
			if ("catNo".equals(name)) {
				int catNo = Integer.parseInt(value);
				product.setCategory(new Category(catNo));
				
			} else if ("name".equals(name)) {
				product.setName(value);
				
			} else if ("price".equals(name)) {
				int price = Integer.parseInt(value);
				product.setPrice(price);
				
			} else if ("discountPrice".equals(name)) {
				int discountPrice = Integer.parseInt(value);
				product.setDiscountPrice(discountPrice);
				
			} else if ("stock".equals(name)) {
				int stock = Integer.parseInt(value);
				product.setStock(stock);
				
			} else if ("companyNo".equals(name)) {
				int companyNo = Integer.parseInt(value);
				product.setCompany(new Company(companyNo));
				
			} else if ("statusNo".equals(name)) {
				int statusNo = Integer.parseInt(value);
				product.setStatus(new Status(statusNo));
				
			} else if ("description".equals(name)) {
				product.setDescription(value);
				
			} else if ("benefitNo".equals(name)) {
				int benefitNo = Integer.parseInt(value);
				ProductBenefit productBenefit = new ProductBenefit();
				productBenefit.setBenefitNo(benefitNo);
				
				benefits.add(productBenefit);
				
			} else if ("photofile".equals(name)) {
				String filename = item.getName();
				product.setFilename(filename);
				
				InputStream input = item.getInputStream();
				
				String directory = "C:\\projects\\web-workspace\\store\\src\\main\\webapp\\resources";
				OutputStream output = new FileOutputStream(new File(directory, filename));
				
				IOUtils.copy(input, output);
			}
	
	}

	ProductDao productDao = new ProductDao();
	int productNo = productDao.getSequence();
	product.setNo(productNo);
	
	productDao.insertProduct(product);
	
	for (ProductBenefit benefit : benefits) {
		benefit.setProductNo(productNo);
		productDao.insertProductBenefit(benefit);
	}
	
	response.sendRedirect("home.jsp");
	
/*

	// 1. 요청 파라미터 정보를 조회한다.
	int catNo = Integer.parseInt(request.getParameter("catNo"));
	String name = request.getParameter("name");
	int price = Integer.parseInt(request.getParameter("price"));
	int discountPrice = Integer.parseInt(request.getParameter("discountPrice"));
	int stock = Integer.parseInt(request.getParameter("stock"));
	int companyNo = Integer.parseInt(request.getParameter("companyNo"));
	int statusNo = Integer.parseInt(request.getParameter("statusNo"));
	String description = request.getParameter("description");
	String[] benefitNoArr = request.getParameterValues("benefitNo");
	
	// 2. Product객체를 생성해서 요청파라미터정보를 담는다.
	Product product = new Product();
	product.setCategory(new Category(catNo));
	product.setName(name);
	product.setPrice(price);
	product.setDiscountPrice(discountPrice);
	product.setStock(stock);
	product.setCompany(new Company(companyNo));
	product.setStatus(new Status(statusNo));
	product.setDescription(description);
	
	// 3. ProductDao객체를 생성하기
	ProductDao productDao = new ProductDao();
	
	// 4. 상품 일변번호를 조회한다.
	int productNo = productDao.getSequence();
	// 5. Product객체에 상품일련번호를 담는다.
	product.setNo(productNo);	

	// 6. 새 상품정보를 저장하기
	productDao.insertProduct(product);
	
	// 7. 체크된 추가 혜택정보를 저장시킨다.
	for (String value : benefitNoArr) {
		int benefitNo = Integer.parseInt(value);
		
		ProductBenefit productBenefit = new ProductBenefit();
		productBenefit.setProductNo(productNo);
		productBenefit.setBenefitNo(benefitNo);
		
		productDao.insertProductBenefit(productBenefit);
	}
	
	// 8. home.jsp를 재요청하는 URL을 응답으로 보낸다.
	response.sendRedirect("home.jsp");	
	
*/
%>
















