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
	<h1>화살표 함수</h1>
<script>
	// 화살표 함수
	/*
		+ 화살표 함수
			- 함수표현식보다 더 간결하게 함수를 생성할 수 있는 방식이다.
			- 주로 콜백함수를 정의할 때 활용된다.
		+ 화살표 함수의 형식
			let fn = (매개변수, 매개변수, ...) => 표현식
			* 표현식은 수행문이다.
			
		+ 화살표 함수의 작성법
			- 인자가 하나만 있는 경우, 인자를 감싸는 괄호는 생략가능하다.
			- let fn = (a) => console.log(a);
			  let fn = a => console.log(a);
			  
			- 인자가 하나도 없는 경우, 괄호를 비워놓으면 된다.
			  단, 괄호를 생략할 수 없다.
			  let fn = () => console.log("연습");
			  
	        - 표현식의 본문 내용이 여러줄인 경우, 중괄호 안에 코드를 넣는다.
	          let fn = (a, b) => {
					let c = a*b;
					return c;
	          };
	          
	        - 표현식이 단 한 줄인 경우, 중괄호는 생략할 수 있고,
	          표현식의 연산결과가 반환값이 된다. return 키워드를 생략한다.
	          
	          let fn = (a, b) => a*b;
	          	* 표현식이 한 줄이어서 중괄호는 생략했다.
	          	* 표현식이 한 줄이어서 return 키워드는 생략했다.
	          	  fn 함수를 실행하면 a*b의 값이 반환된다.
	          	  
	          let fn = (a,b) => {a*b};
	          	* 위의 화살표 함수는 a*b값을 반환하지 않는다.
	          	* 표현식을 중괄호로 감싸면 명시적으로 return 문을 추가해야 값이 반환된다.
	          	
	*/
	
	// 인자가 없는 화살표 함수
	let fn1 = () => console.log('연습');
	fn1();
	
	// 인자가 한 개 있는 화살표 함수
	let fn2 = (a) => a*2;
	let fn3 = a => a*3;
	
	let value2 = fn2(10);
	let value3 = fn3(10);
	console.log(value2);
	console.log(value3);
	
	// 인자가 두 개 있는 화살표 함수
	let fn4 = (a,b) => a*4;				// 연산결과가 반환된다.
	let fn5 = (a,b) => { a*b };			// 값이 반환되지 않는다.
	let fn6 = (a,b) => { return a*b; };
//	let fn7 = (a,b) => return a+b;		// 문법 오류다.
	
	let value4 = fn4(3, 4);
	let value5 = fn5(3, 4);
	let value6 = fn6(3, 4);
//	let value7 = fn7(3, 4);
	
	console.log(value4);
	console.log(value5);
	console.log(value6);
	
</script>
</body>
</html>