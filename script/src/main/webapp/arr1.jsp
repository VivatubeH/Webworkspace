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
	//	배열
	/*
		배열
			- 순서가 있는 콜렉션이다.
			- 자바스크립트의 배열은 가변길이 배열이다.
				* 자바의 ArrayList와 유사하다.
		
		배열의 선언
			let arr1 = [];
			let arr2 = [값, 값, 값, 값, ...];
			
		배열에 요소 수정/추가하기
			let arr1 = [];
		 	arr1[0] = 값; // arr1 ---> [값]
		 	arr1[1] = 값; // arr1 ---> [값, 값]
		 	arr1[4] = 값; // arr1 ---> [값, 값, undefined, undefined, 값]
		 	* 인덱스를 활용해서 배열의 특정위치에 값을 저장할 수 있다.
		 	* 배열에 값이 저장될 때마다 배열의 크기는 자동으로 변한다.
		 	
		 배열의 값 변경하기
		 	let arr1 = ['김유신', '강감찬', '홍길동'];
		 	arr1[1] = "류관순"; arr1 ----> ['김유신', '류관순', '홍길동']
		 	* 인덱스를 활용해서 지정된 위치의 값을 변경할 수 있다.
		 	
		 배열의 length 프로퍼티
		 	length 프로퍼티는 배열의 길이를 나타낸다.
		 	let arr1 = ['김유신', '강감찬', '홍길동'];
		 	console.log(arr1.length); // 3이 출력된다.
		 	
		 * 자바스크립트 배열의 length는 쓰기가 가능하다.
		 	let arr1 = ['김유신', '강감찬', '홍길동'];
		 	arr1.length = 1 ; arr1 ----> ['김유신']
		 * 배열의 모든 요소를 지우기
		 	arr1.length = 0;  arr1 ----> []
		 	
	*/
	
	// 배열의 선언
	let arr1 = [];
	let arr2 = ['김유신', '강감찬', '홍길동'];
	
	// 배열에 값 추가하기
	arr1[0] = 100;
	arr1[1] = 200;
	arr1[4] = 300;
	
	console.log(arr1);
	console.log('배열의 길이', arr1.length);
	console.log('배열의 길이', arr2.length);
	
	arr1.length = 0;
	arr2.length = 1;
	
	console.log(arr1);
	console.log(arr2);
</script>
</body>
</html>