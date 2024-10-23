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
	<h1>클래스와 속성 조작하기</h1>
	
	<h3>클래스 조작하기</h3>
	<div>
		<button id="btn-1" class="btn btn-primary btn-sm">버튼</button>
	</div>
	
	<h3>속성 조작하기</h3>
	<div>
		<a id="link-1" href="http://www.daum.net" title="다음">다음</a>
	</div>
<script type="text/javascript">
	// 클래스와 속성 조작하기
	
	// 엘리먼트 객체의 classList 프로퍼티는 클래스 속성값을 포함하는
	// DOMTokenList객체를 반환한다.
	/*
		DOMTokenList 객체의 주요 메소드
			add(값)
				지정된 값을 클래스 속성값으로 추가한다.
			remove(값)
				지정된 값을 클래스 속성값에서 삭제한다.
			contains(값)
				지정된 값이 클래스 속성값에 있으면 true를 반환한다.
			toggle(값)
				지정된 값이 클래스 속성값에 있으면 삭제하고,
											없으면 추가한다.
			replace(값1, 값2)
				값1을 찾아서 값2로 변경한다.
	*/
	// .classList.add('disabled')
	// disabled를 클래스 속성값으로 추가한다.
	document.getElementById("btn-1").classList.add('disabled');

	// .classList.remove('disabled')
	// disabled를 클래스 속성값에서 삭제한다.
	document.getElementById("btn-1").classList.remove('disabled');
	document.getElementById("btn-1").classList.remove('btn-sm');

// 속성 조작하기
	/*
		.getAttribute("속성명")
			지정된 속성명의 속성값을 반환한다.
		.setAttribute("속성명", "속성값")
			속성을 변경한다.
		.removeAttribute("속성명")
			지정된 속성명의 소성값을 삭제한다.
		.hasAttribute("속성명")
			지정된 속성명이 존재하면 true를 반환한다.
	*/
	// 속성값 조회하기
	let value1 = document.getElementById("link-1").getAttribute("href");
	let value2 = document.getElementById("link-1").getAttribute("title");
	console.log("href 속성값", value1);
	console.log("title 속성값", value2);
	
	// 속성값 변경하기
	document.getElementById("link-1").setAttribute("href", "http://www.naver.com");
	document.getElementById("link-1").setAttribute("title", "네이버");
	document.getElementById("link-1").textContent = "Naver";
</script>
</body>
</html>