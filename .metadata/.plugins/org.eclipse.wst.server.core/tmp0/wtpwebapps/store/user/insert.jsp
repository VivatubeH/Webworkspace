<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
<%@page import="vo.User"%>
<%@page import="dao.UserDao"%>
<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%--
	요청 URL
		http://localhost/store/user/insert.jsp
	요청 URI
		/store/user/insert.jsp
	쿼리스트링
		없음
	폼 데이터
		id=hong
		&password=zxcv1234
		&name=홍길동
		&email=hong@gmail.com
	
	요청파라미터 정보
		name		value
		---------------------------
		"id"		"hong"
		"password"	"zxcv1234"
		"name"		"홍길동"
		"email"		"hong@gmail.com"
		
	처리내용
		1. 요청파라미터값을 조회한다.
		2. 아이디 중복여부를 체크한다.
		3. 이메일 중복여부를 체크한다.
		4. 비밀번호를 암호화한다.
		5. User객체를 생성해서 요청파라미터로 조회된 값을 담는다.
		6. User객체를 UserDao로 insertUser(User user)메소드로 전달해서
		   데이터베이스에 저장시킨다.
		7. 회원가입 완료 페이지를 재요청하는 URL을 응답으로 보낸다.
--%>
<%
	// 1. 요청파라미터 값을 조회한다.
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	
	// 2. 아이디 중복여부를 체크한다.
	UserDao userDao = new UserDao();
	User savedUser = userDao.getUserById(id);
	
	// savedUser가 null이 아닌 경우는 해당 아이디로 사용자정보가 조회된 것이다.
	// 즉, 해당 아이디로 이미 가입된 정보가 있다는 의미다.
	if (savedUser != null) {
		response.sendRedirect("form.jsp?error");
		return;
	}
	
	// 3. 비밀번호를 암호화한다.
	String sha256Password = DigestUtils.sha256Hex(password);
	
	// 4. User객체를 생성해서 요청파라미터값을 저장한다.
	// User user = new User();
	// user.setId(id);
	// user.setPassword(sha256Password);
	// user.setName(name);
	// user.setEmail(email);
	User user = User.builder()
			.id(id)
			.password(sha256Password)
			.name(name)
			.email(email)
			.build();
	
	// 5. UserDao객체의 insertUser() 메소드를 실행해서 데이터베이스에 저장하기
	userDao.insertUser(user);
	
	// 6. completed.jsp를 재요청하는 URL을 응답으로 보내기
	response.sendRedirect("completed.jsp");
	
%>









