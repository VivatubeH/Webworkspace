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
   			padding: 20px;
   			margin: 15px;
   		}
   </style>
</head>
<body>
	<h1>이벤트 버블링</h1>
	
	<div onclick="fn1(event)">
		<div onclick="fn2(event)">
			<button onclick="fn3(event)">버튼</button>
		</div>
	</div>
	
<script type="text/javascript">
	function fn1(event) {
		console.log("fn1 함수가 실행됨")
	}
	function fn2(event) {
		console.log("fn2 함수가 실행됨")
	}
	function fn3(event) {
		event.stopPropagation();
		console.log("fn3 함수가 실행됨")
	}
</script>
</body>
</html>