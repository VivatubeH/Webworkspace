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
	<h1>함수</h1>
	
<script type="text/javascript">
	// 콜백함수(Callback function)
	/*
	콜백함수
		+ 함수의 매개변수 인자값으로 전달되는 함수를 말한다.
		+ 호출하는 함수에게 값(데이터)를 전달하는 대신에
		  함수(행동)을 전달하는 것이다.
			  
		+ 콜백함수 전달하기
			+ 콜백함수를 전달받는 함수
			function check(kor, eng, math, fn) {
				let average = (kor + eng + math)/3;
				if (average >= 60) {
					fn();	// 콜백함수 실행하기
				}
			}
			
			이름있는 함수 전달하기
				// 이름있는 함수
				function success() {
					console.log("합격입니다.");
				}
				
				// 이름 있는 함수를 콜백함수로 전달하기
				check(100, 100, 100, success);	
				
			익명함수 전달하기
				// 익명함수를 콜백함수로 전달하기 
				check(100, 100, 100, function() {
					console.log("합격입니다.");
				})
			
			화살표함수 전달하기
				check(100, 100, 100, )
	*/
	
	// 합격일 때 수행할 작업이 정의된 함수
	function success(score) {
		console.log(score, "합격입니다.");
	}
	
	// 불합격일 때 수행할 작업이 정의된 함수
	function fail() {
		console.log("불합격입니다.");
	}
	
	// fn1과 fn2 매개변수로 전달받은 함수가 콜백함수다.
	function check(kor, eng, math, fn1, fn2) {
		let total = kor + eng + math;
		let average = total / 3;
		
		if (average >= 60) {
			fn1(average);
		} else {
			fn2();
		}
	}
	
	// 이름 있는 함수를 콜백함수로 전달한 경우
	// check(60, 60, 61, success, fail);
	
	// 익명함수를 콜백함수로 전달하는 경우
	/*
	check(60, 60, 61, 
		function(score) {
			console.log(score, "합격입니다.");
		}, function() {
			console.log("불합격입니다.");	
		});
	*/
	
	// 화살표함수를 콜백함수로 전달하는 경우
	check(100, 100, 100, 
			(score) => console.log(score, "합격입니다."),
			() => console.log("불합격입니다."));
	
	check(10, 20, 50, 
			(score) => console.log(score, "합격입니다."),
			() => console.log("불합격입니다."));
</script>
</body>
</html>