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
	<h1>배열</h1>
	
<script type="text/javascript">
	// 배열에 저장된 값을 반복처리하기
	/*
		for문을 이용하면 배열의 저장된 값을 순회하며 처리할 수 있다.
		
		let arr = ['김유신', '홍길동', '강감찬'];
	
		+ 전통적인 for문으로 배열 반복처리하기
			for (let index = 0; index < arr.length; index++) {
				let value = arr[index];
				console.log(index, value);
			}
		
		+ for..of 구문으로 배열 반복처리하기
			for (let value of arr) {
				console.log(value);
			} 
		// 자바의 향상된 for문과 유사함 
	*/
	let arr = ['김유신', '홍길동', '강감찬'];
		
	for (let index = 0; index < arr.length; index++) {
		let value = arr[index];
		console.log(index, value);
	}
	
	// for..of 구문으로 배열 반복처리하기
	// java의 향상된 for문과 유사하다.
	// index는 알 수 없음. [ 인덱스가 필요하지 않을 때 ]
	for (let value of arr) {
		console.log(value);
	}
</script>
</body>
</html>