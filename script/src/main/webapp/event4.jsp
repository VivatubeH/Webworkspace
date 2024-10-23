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
	<h1>기본동작 실행방지</h1>
	
	<a href="http://wwww.daum.net" onclick="return false;">다음</a>
	
	<h3>로그인 폼</h3>
	<p>form태그의 submit 이벤트에 대한 기본동작 방해</p>
	<form method="post" action="login.jsp" onsubmit="return checkForm();">
		<input type="text" name="id"><br />
		<input type="password" name="pwd"><br />
		<button type="submit">로그인</button>
	</form>
	
	<h3>도서 갤러리</h3>
	<p>a태그의 click 이벤트에 대한 기본동작 방해</p>
	<div id="big-image-box">
		<img src="images/1.jpg" id="big" width="300" height="400" alt="책사진">
	</div> 
	<div id="thumbnail-image-box">
		<a href="images/1.jpg" onclick="changeImage(event)">
			<img src="images/1.jpg" width="60" height="90">
		</a>
		<a href="images/2.jpg" onclick="changeImage(event)">
			<img src="images/2.jpg" width="60" height="90">
		</a>
		<a href="images/3.jpg" onclick="changeImage(event)">
			<img src="images/3.jpg" width="60" height="90">
		</a>
		<a href="images/4.jpg" onclick="changeImage(event)">
			<img src="images/4.jpg" width="60" height="90">
		</a>
		<a href="images/5.jpg" onclick="changeImage(event)">
			<img src="images/5.jpg" width="60" height="90">
		</a>
	</div>
	
	
<script type="text/javascript">
	function checkForm() {
		let id = document.querySelector("[name=id]").value;
		if (id == "") {
			alert("아이디는 필수입력값입니다.");
			document.querySelector("[name=id]").focus();
			return false;
		}
		
		let pwd = document.querySelector("[name=pwd]").value;
		if (pwd == "") {
			alert("비밀번호는 필수입력값입니다.");
			document.querySelector("[name=pwd]").focus();
			return false;
		}
		return true;
	}
	
	/*
		1. thumbnail 이미지를 클릭한다.
		2. click 이벤트가 발생한다.
		3. click 이벤트가 a태그로 전달된다.
		4. a태그의 changeImage() 함수가 실행된다.
// changeImage 함수의 작업내용
		5. changeImage() 함수에서 a태그의 기본동작 실행을 방해한다.
		6. changeImage() 함수에서 event.target을 이용해서 실제 이벤트가
		   발생했던 img 엘리먼트를 조회한다.
		7. img 엘리먼트의 src 속성을 조회해서 이미지 경로를 조회한다.
		8. 이미지를 크게 표시하는 img 엘리먼트를 조회한다.
		9. 이미지를 크게 표시하는 img 엘리먼트의 src 속성값을 7번에서
		   획득한 값으로 변경한다.
	*/
	function changeImage(event) {
		// 이벤트에 대한 기본동작 실행을 방해한다.
		// 여기에서는 click이벤트에 대한 a태그(엘리먼트)이 기본동작
		// 실행을 방해하였다.
		event.preventDefault();
		
		// 이벤트가 발생할 엘리먼트를 조회한다.
		// 여기서는 썸네일을 표시하는 img 엘리먼트다.
		let image = event.target;
		// 썸네일을 표시하는 img 엘리먼트의 src 속성값을 읽어온다.
		let imagePath = image.getAttribute("src");
		
		// 큰 이미지를 표시하는 img 엘리먼트를 조회한다.
		let bigImg = document.querySelector("#big-image-box img");
		// 큰 이미지를 표시하는 img 엘리먼트의 src 속성값을 변경한다.
		bigImg.setAttribute("src", imagePath);
	}
</script>
</body>
</html>