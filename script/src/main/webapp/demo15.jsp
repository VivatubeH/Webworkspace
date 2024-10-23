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
	<h1>자동실행 함수</h1>
	
<script type="text/javascript">
	// 즉시 실행 함수
	/*
		즉시실행 함수
			- 함수를 정의하자마자 실행하는 함수를 말한다.
			- 웹페이지가 로딩되자마자 바로 실행해야 되는 작업을
			  즉시실행함수로 구현한다.
			- 전역 변수 충돌을 방지할 수 있다.
			
		즉시 실행함수의 형식
			+ 매개변수가 없는 즉시실행함수
			(function() {
				수행문;
				수행문;
			})();
	
			+ 매개변수가 있는 즉시실행함수
			(function(a, b) {
				수행문;
				수행문;
			})(값1 , 값2);
			
	*/
	(function fn() {
		console.log("즉시 실행함수가 실행됩니다.");
	})();

</script>
</body>
</html>