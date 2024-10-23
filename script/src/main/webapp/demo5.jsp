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
	<h1>변수와 상수</h1>
	
<script type="text/javascript">
	// 변수: 데이터를 저장할 때 사용하는 이름이 있는 저장소다.
	//		 자바스크립트에서는 let 키워드를 이용해서 변수를 생성한다.
	//		 예전에는 var 키워드를 이용해서 변수를 생성하였다.
	
	// 상수 : 한번 저장된 값이 변화되지 않는 변수다.
	//		  자바스크립트에서는 const 키워드를 이용해서 상수를 생성한다.
	//		  상수의 값을 변경하면 오류가 발생한다.
		
	// 변수의 선언
	
	// value1 변수는 변수를 생성하고 값을 대입하지 않았다.
	// value1 변수의 자료형은 undefined 타입이다.
	// value1 변수는 undefined 값을 가진다.
	// undefined는 자료형의 이름이다.
	// undefined는 undefined 자료형의 변수가 가지는 유일한 값이다.
	// 변수를 생성하고 초기화하지 않으면 무조건 undefined이다.
	let value1;	
	
	// value2 변수는 변수를 생성하고 값을 대입하였다.
	// value2 변수는 number 타입이다.
	// * 자바스크립트는 정수, 실수 상관없이 전부 number 타입이다.
	// 자바스크립트에서 타입 확인은 typeof 변수명 으로 확인한다.
	let value2 = 100;
	value2 = 80; // 변수는 다른 값을 대입할 수 있다.
	value2 = 70; // 변수의 값은 변경 가능하다.
	
	// value3 변수는 변수를 생성하고 값을 대입하였다.
	// value3 변수는 number 타입이다.
	let value3 = 3.14;
	
	// value4 변수는 변수를 생성하고 값을 대입하였다.
	// value4 변수는 String 타입이다.
	let value4 = "홍길동";
	
	// value5 변수는 object 타입이다.
	// value5 변수는 null 값을 가진다.
	// null을 가지는 변수의 타입이 object 타입이다.
	// null 값은 어떤 객체도 참조하고 있지 않다는 것을 의미하는 것이다.
	let value5 = null;
	
	// 상수
	// 		상수는 값을 재할당할 수 없기 때문에 상수를 생성할 때
	//		무조건 값을 할당해야 한다. 값을 할당하지 않으면 오류가 발생한다.
	// 		상수명은 변수와 구별하기 위해서 전부 대문자로 적는다.
	const MIN_PASSWORD_LENGTH = 9;
	
	// 아래 수행문은 오류가 발생한다.
	// 상수는 값을 변경할 수 없다.
//  MIN_PASSWORD_LENGTH = 10;
</script>
</body>
</html>