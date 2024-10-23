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
	<h1>엘리먼트 조작하기</h1>
	
	<h3>innerHTML 연습</h3>
	<div id="box-1">
		<p>연습하기</p>
	</div>
	
	<h3>innerHTML 연습</h3>
	<div id="box-2">
		<p>내용1</p>
		<p>내용1</p>
		<p>내용1</p>
		<p>내용1</p>
		<p>내용1</p>
		<p>내용1</p>
	</div>
	
	<h3>innerHTML 연습</h3>
	<div id="box-3"></div>
	
<script type="text/javascript">
	// div내의 HTML 컨텐츠 변경하기
	document.getElementById("box-1").innerHTML = '<p class="text-primary">공부하기</p>'
	
	// div내의 모든 HTML 컨텐츠 삭제하기
	document.getElementById("box-2").innerHTML = "";
	
	// div내에 새로운 HTML 컨텐츠 추가하기
	let names = ['김유신', '홍길동', '강감찬'];
	let contents = "";
	for (let name of names) {
		contents += `<p>\${name}</p>`;
	}
	document.getElementById('box-3').innerHTML = contents;
</script>
</body>
</html>