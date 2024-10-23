<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>애플리케이션</title>
</head>
<body>
	<h1>함수</h1>
	
<script type="text/javascript">
	// 전역변수, 지역변수, 매개변수
	/*
		전역변수(글로벌변수, 외부변수)
			+ 함수의 바깥에서 정의된 변수다.
			+ 모든 함수에서 접근할 수 있다.
			+ 일반적으로 프로젝트에서 전역변수는 아예 사용하지 않거나 
			  최소한으로 사용한다.
			  단, 프로젝트 전체에서 광범위하게 사용되는 값은 전역변수로
			  관리할 수 있고, 주로 상수로 정의한다.
			  
		지역변수 
			+ 함수 내부에서 정의된 변수다.
			+ 해당 함수내에서만 사용할 수 있다.
			+ 함수 내에서 변수를 정의할 때 let 키워드를 생략하고
			  함수를 정의하면 해당 변수는 무조건 전역변수가 된다.
		
			  function x() {
				let a = 10;
				b = 20;
			  }
	
			  function y() {
				console.log(a);	// 오류
				console.log(b); // 20이 출력된다.
			  }
		매개변수	
			+ 함수 호출 시 인자로 전달된 값을 저장하는 변수다.
			+ 매개변수도 해당 함수내에서만 사용할 수 있다.
			+ 매개변수 선언 시 기본값을 지정할 수 있다.
				function fn(page, rows, sort) {
					수행문;
				}	
				함수호출					매개변수
				-------------------------------------------------
											page	rows	sort
				-------------------------------------------------
				fn();					undefined undefined undefined
				fn(1);					1		  undefined	undefined	
				fn(1, 10);				1		  10 		undefined
				fn(1, 10, 'date');		1		  10		'date'
				-------------------------------------------------
				* 함수 호출 시 인자값은 영향을 주지 않는다.
				  매개변수가 정의되어 있어도 인자값을 전달하지 않아도 된다.
				* 함수 호출 시 인자값을 전달받지 못한 매개변수는
				  undefined 값을 가진다.
				  
				 function fn(page = 1, rows = 10, sort = 'date') {
					수행문;
				}
				함수호출					매개변수
				-------------------------------------------------
											page	rows	sort
				-------------------------------------------------
				fn();						1 		10		'date'
				fn(2);						2		10		'date'	
				fn(3, 4);					3		4 		'date'
				fn(4, 25, 'review');		4	    25		'review'
				-------------------------------------------------
				* 인자값을 전달받은 매개변수는 인자값이 매개변수에 대입되고,
				  인자값을 전달받지 못한 매개변수는 기본값이 매개변수에 대입된다.
				  
				
		
	*/
	
	// 전역변수 정의하기
	
	function showImage(filename) {
		path = "/resources/images/";
		console.log(path + filename);
	}
	
	function showThumbmail(filename) {
		console.log(path + filename);
	}
	
	showImage('a.png');
	showThumbmail('a-small.png');
	
	// 매개변수
	function list1(page, rows, sort) {
		console.log("list1", page, rows, sort);	
	}
	
	function list2(page = 1, rows = 10 , sort = 'date') {
		console.log("list2", page, rows, sort);	
	}
	
	// 기본값 설정이 지원되지 않는 브라우저에서 매개변수가
	// 인자값을 전달받지 못할 때 기본값을 지정하는 방법
	function list3(page, rows, sort) {
		page = page || 1; // false || true
		rows = rows || 10; // false || true
		sort = sort || 'date'; // false || true 
		
		console.log("list3", page, rows, sort);
	}
	
	list1();
	list2();
	list3();
	
	list1(2, 5);
	list2(2, 5);
	
	// 반환값
	/*
		반환값
			* 함수를 호출한 측에게 반환하는 값을 말한다.
			* 함수가 값을 반환하지 않으면 undefined 값을 반환한다.
			* 자바는 값 반환 또는 예외 반환이 필수지만,
			  자바스크립트는 아님. 
			* 함수를 작성할 때 함수 내부에서 값을 반환하는 경우,
			  값을 반환하지 않는 경우가 같이 존재하더라도 상관없다.
			  
			function fn(num) {
				if (num >= 10) {
					return num*2;
				}
			};
			위의 함수는 num이 10이상일 때는 반환값이 있지만
			10 미만일 때는 반환값이 정의되어 있지 않다.
			
			* 함수의 반환값이 경우에 따라서 서로 다른 종류의
			  값이어도 상관없다.
				
	*/
	
	// 값을 반환하지 않는 함수
	function fn1() {
		console.log("fn1 함수가 실행됨");
	}
	
	// 값을 반환하는 함수
	function fn2() {
		console.log("fn2 함수가 실행됨");
		return 10;
	}
	
	let value1 = fn1();
	let value2 = fn2();
	
	console.log('value1', value1); // value1의 값은 undefined
	console.log('value2', value2); // value2의 값은 10이다.
	
	// 경우에 따라서 서로 다른 종류의 값을 반환하는 함수
	// num이 짝수일 때 정수값이 반환된다.
	// num이 홀수일 때 함수가 반환된다.
	function fn3(num) {
		if (num%2 == 0) {
			return num*2;
		} else {
			return (function(x) {
				console.log(x*x);
			});
		}
	}
	
	let value3 = fn3(2);
	let fn4 = fn3(5);
	fn4(4);
</script>
</body>
</html>