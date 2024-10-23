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
	<h1>HTML DOM</h1>
	
	<h3>DOM 연습</h3>
	<div id="box-1">
		<h5>엘리먼트 검색</h5>
		<p id="intro" class="text-primary">첫번째 본문 내용입니다.</p>
		<p class="text-primary">두번째 본문 내용입니다.</p>
		<p>세번째 본문 내용입니다.</p>
	</div>
<script type="text/javascript">
	// 엘리먼트 찾기
	// 1. 태그명이 h1인 엘리먼트찾기
	let el1 = document.querySelector('h1');
	console.log(el1);
	
	// 2. 태그명이 h3인 엘리먼트 찾기
	let el2 = document.querySelector('h3');
	console.log(el2);
	
	// 3. 본문의 div 엘리먼트 찾기
	let el3 = document.querySelector('div'); 	// "태그선택자"
	let el4 = document.querySelector('#box-1'); // "아이디선택자"
	let el5 = document.getElementById('box-1'); // "아이디"
	console.log(el3);
	console.log(el4);
	console.log(el5);
	
	// 4. 본문의 p 엘리먼트 찾기
	// 모든 p 엘리먼트 찾기
	let elements1 = document.querySelectorAll("p");
	console.log(elements1);
	
	// 클래스가 .text-privmary인 p 엘리먼트 찾기
	let elements2 = document.querySelectorAll('#box-1 p.text-primary');
	console.log(elements2);
	
	// 아이디가 intro인 p 엘리먼트 찾기
	let el6 = document.querySelector("#intro");
	//let el6 = document.getElementById("intro");
	//let el6 = document.querySelector("#box-1 #intro");
	//let el6 = document.querySelector("#box-1 p.#intro");
	console.log(el6);
	
	// HTML DOM
	// Document 객체
	/*
		Document 객체
			+ 현재 HTML을 표현하는 객체다.
			+ Window 객체의 document 프로퍼티에 담겨있다.
			+ HTML을 조작하기 위해서 document 객체에서 조작할 엘리먼트를
			  찾는 것부터 시작한다.
			  
			+ method
				getElementById(아이디)
					- Document 객체에서 지정된 id값을 가진 
					  엘리먼트를 검색해서 반환한다.
					- Element 객체가 한 개 획득된다.
				querySelector(선택자)
					- Document 객체에서 지정된 선택자에 해당하는
					  첫번째 엘리먼트를 검색해서 반환한다.
					- Element 객체가 한 개 획득된다.
				querySelectorAll(선택자)	
					- Document 객체에서 지정된 선택자에 해당하는 모든 
					  엘리먼트를 검색해서 반환한다.
					- Element 객체가 여러 개 획득된다.
					
				createElemet(태그명)
					- 태그명에 해당하는 엘리먼트 객체를 생성한다.
					- 예시)
						let el = document.createElement("p");
			
			Element 객체
				+ html 태그를 표현하는 객체다.
				+ Document 객체의 Element 객체들은 Tree 구조를 가진다.
				+ property
					textContent
						html 태그의 텍스트 컨텐츠를 반환한다.
					innerHTML
						html 태그의 내부 HTML 태그를 반환한다.
					value
						html 태그(input, select, textarea 한정)의 값을 반환한다.
				+ method
	*/
</script>
</body>
</html>