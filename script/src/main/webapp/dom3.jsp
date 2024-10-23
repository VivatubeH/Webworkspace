<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>애플리케이션</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
   <style type="text/css">
   		div {
   			border: 1px solid black;
   			margin: 10px;
   			padding: 15px;
   		}
   </style>
</head>
<body>
	<h1>엘리먼트 객체 생성,추가,삭제</h1>
	
	<h3>엘리먼트 추가</h3>
	<div id="box-1"></div>
	
	<h3>엘리먼트 추가</h3>
	<div>
		<div id="box-2">
			<p>내용</p>
			<p>내용</p>
			<p>내용</p>
		</div>
	</div>
	
	<h3>엘리먼트 추가</h3>
	<div>
		<div id="box-3">
			<p>내용</p>
			<p>내용</p>
			<p>내용</p>
		</div>
	</div>
	
	<script type="text/javascript">
		// 엘리먼트 객체 생성하기
		// <p>안녕하세요</p>
		let el1 = document.createElement('p');
		el1.classList.add('text-primary');
		el1.textContent = "안녕하세요1";
		
		let el2 = document.createElement('p');
		el2.classList.add('text-danger');
		el2.textContent = "안녕하세요2";
		
		// 생성된 엘리먼트 추가하기
		document.getElementById('box-1').append(el1);
		document.getElementById('box-1').append(el2);
		
		// 엘리먼트 객체를 생성하고 추가하기
		let el3 = document.createElement("p");
		let el4 = document.createElement("p");
		let el5 = document.createElement("p");
		let el6 = document.createElement("p");
		el3.textContent = "prepend";
		el4.textContent = "append";
		el5.textContent = "before";
		el6.textContent = "after";
		
		document.getElementById('box-2').prepend(el3); // 첫 번째 자식으로 추가
		document.getElementById('box-2').append(el4); // 마지막번째 자식으로 추가
		document.getElementById('box-2').before(el5); // 형 엘리먼트로 추가
		document.getElementById('box-2').after(el6); // 동생 엘리먼트로 추가
		
// html 컨텐츠를 추가하기
		document.getElementById("box-3").insertAdjacentHTML("afterbegin", "<p>prepend</p>");
		document.getElementById("box-3").insertAdjacentHTML("beforeend", "<p>append</p>");
		document.getElementById("box-3").insertAdjacentHTML("beforebegin", "<p>before</p>");
		document.getElementById("box-3").insertAdjacentHTML("afterend", "<p>after</p>");
		
		/*
			[beforebegin]
			<div id="box-3"> <---- begin
				[afterbegin]
				<p>내용</p>
				<p>내용</p>
				[beforeend]
			</div>			 <---- end
			[afterend]
		*/
	</script>
</body>
</html>