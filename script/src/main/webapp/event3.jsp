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
			width: 200px;
			height: 400px;
			border: 1px solid black;
			padding: 20px;
			padding-left: 60px;
			margin-left: -180px;
		}
	</style>
</head>
<body>
	<h1>이벤트 버블링</h1>
	
	<div id="box" onclick="toggleBox(event)">
		<h3 onclick="showMenu(event, 'book')">도서</h3>
		<ul id="book" style="display:none;">
			<li>소설</li>
			<li>소설</li>
			<li>소설</li>
			<li>소설</li>
			<li>소설</li>
			<li>소설</li>
		</ul>
		
		<h3 onclick="showMenu(event, 'ticket')">티켓</h3>
		<ul id="ticket" style="display:none;">
			<li>콘서트</li>
			<li>콘서트</li>
			<li>콘서트</li>
			<li>콘서트</li>
			<li>콘서트</li>
		</ul>
		<h3></h3>
	</div>

<script type="text/javascript">
	let boxShown = false; // 박스가 접혀져있으면 false, 펼쳐져있으면 true
	
	function showMenu(event, id) {
		event.stopPropagation();
		document.getElementById(id).style.display = "";
	}
	function toggleBox(event) {
		let div = document.getElementById("box");
		
		if (boxShown) {
			div.style.marginLeft = "-180px";
			boxShown = false;
		} else {
			div.style.marginLeft = "-40px";
			boxShown = true;
		}
	}
</script>
</body>
</html>