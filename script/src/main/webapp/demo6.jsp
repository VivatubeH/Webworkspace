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
	<h1>변수</h1>
<script type="text/javascript">
	// 변수
	// 변수는 let 키워드를 이용해서 생성한다.
	// 자바스크립트에서 변수의 타입은 저장되는 값에 따라서 결정된다.
	// 변수의 타입은 가변적이고, 저장되는 값에 따라서 동적으로 변한다.
	
	let value;
	
	// console.log(값)
	// console은 자바스크립트의 내장객체인 Console 객체를 참조하는 참조변수다.
	// log(값)은 Console 객체의 메소드다. 
	// console.log(값)은 브라우저의 콘솔창에 값을 출력한다.
	console.log('변수 value의 자료형', typeof value);
	
	value = "홍길동";
	console.log('변수 value의 자료형', typeof value);
	
	value = 100;
	console.log('변수 value의 자료형', typeof value);
	
	value = false;
	console.log('변수 value의 자료형', typeof value);
</script>
</body>
</html>