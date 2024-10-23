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
	<h1>배열의 메소드</h1>
	
	<h3>고객명단</h3>
	<ul id="customer-list"></ul>
	
<script type="text/javascript">
/*	
	// 배열의 주요 메소드
	// 1. 배열의 모든 값을 소비하기
		배열 forEach(콜백함수) 
		value index array
			+ 배열의 forEach 메소드는 배열의 각 요소에 대해서 콜백함수를 실행한다.
			+ 콜백함수
				입력값			  반환값
				------------------------
				값 -> 콜백함수 -> 없음
			+ 콜백함수
				function(value, index, arr) { ... }
					value : 배열의 현재 값 [ 생략 불가 ]
					index : 배열의 현재 인덱스, 생략 가능
					arr : 현재 배열, 생략 가능
					
	// 2. 배열의 값을 선별하기
		배열 filter(콜백함수)
			+ filter 메소드는 배열의 각 요소에 대하여 콜백함수를 실행한다.
			+ 콜백함수가 true를 반환하는 요소만 선별해서
			  새 배열에 담아서 반환한다.
			+ filter메소드는 배열을 반환한다.
			+ 콜백함수
				입력값				반환값
				--------------------------
				값	-> 콜백함수 -> true/false
				
	// 3. 배열의 값을 변환하기
		배열 map(콜백함수)
			+ map 메소드는 배열의 각 요소에 대하여 콜백함수를 실행한다.
			+ 콜백함수는 배열의 각 요소를 하나씩 전달받아서
			  다른 값으로 변환하고, 그 값을 반환한다.
			+ map 메소드는 콜백함수가 반환하는 값을 새 배열에 담아서
			  반환한다.
			+ 콜백함수
				입력값			반환값
				-----------------------
				값 -> 콜백함수 -> 새로운값
			  
	// 4. 배열의 값을 집계하기
		값	reduce(콜백함수, 초기값)
			+ reduce 메소드는 배열의 각 요소에 대해 콜백함수를 실행한다.
			+ 콜백함수는 배열의 각 값을 집계한다.
			+ reduce 메소드는 최종적으로 값 하나를 반환한다.
			+ 콜백함수
				입력값				반환값
				-----------------------------
				값	-> 콜백함수 -> 중간단계값
			+ 콜백함수	
				function(total, value, index, arr) { ... }
					total : 이전 현재까지 집계된 값
							초기값은 배열의 첫번째값이거나,
							별도의 초기값을 지정했을 때는 
							그 값이 초기값이 된다.
					value : 배열의 현재 값
					index : 배열의 현재 인덱스, 생략 가능
					arr   : 현재 배열, 생략 가능
							
			
*/
	// 배열의 값 소비하기
	let arr1 = [10, 20, 30, 40, 50];

	// forEach 메소드의 콜백함수는 배열의 각 요소를 어떻게 소비할 지
	// 구현된 메소드다.
	arr1.forEach(function(value, index) {
		// 배열의 값을 화면에 출력하는 것으로 소비한다.
		console.log(value);
	});
	
	let total1 = 0;
	arr1.forEach(function(value) {
		total1 += value;
	})
	console.log("합계", total1);
	
	let total2 = 0;
	arr1.forEach(value => total2 += value);
	console.log("합계", total2);
	
	// 배열의 값을 선별하기
	let arr2 = [21, 43, 22, 14, 5, 7, 8, 12, 40];
	
	let arr22 = arr2.filter(function(value, index) {
		return value%2 == 0;
	});
	console.log(arr22);
	
	let arr23 = arr2.filter(value => value%2 == 0);
	console.log(arr23);
	
	// find 와 filter의 차이 
	// filter는 조건을 만족하는 모든 값을 반환
	// find는 조건을 만족하는 첫 번째 값만 반환
	let value24 = arr2.find(value => value%2 == 0);
	console.log(value24);
	
	let arr7 = [2, 4, 6, 8, 10, 12];
	let value77 = arr7.find(value => value%2);
	console.log(value77);
	
	// 배열의 값을 변환하기
	let arr3 = [1, 2, 3, 4, 5];
	let arr31 = arr3.map(function(value, index) {
		if(index == 1 ) return "안녕하세요";
		if(index == 2 ) return value*5;
	});
	console.log(arr31);
	
	let arr32 = arr3.map(value => value*3);
	console.log(arr32);
	
	let arr4 = ["김유신", "강감찬", "이순신", "류관순", "홍길동"];
	let arr41 = arr4.map(function(value, index) {
		return `<li>\${value}</li>`;
	});
	console.log(arr41);
	
	let content4 = arr4.map(value => `<li>\${value}</li>`)
						.join("");
	document.getElementById("customer-list").innerHTML = content4;
	
	// 배열의 값을 집계하기
	// 초기값을 지정하면 -> 첫 번째 값부터 total에 더한다.
	// 초기값을 지정x -> 두 번째 값부터 total에 더한다.
	let arr5 = [10, 20, 30, 40, 50];
	let result = arr5.reduce(function(total, value, index) {
		console.log(`total->\${total}, value->\${value}`);
		
		return total + value;
	});
	console.log(result);
</script>
</body>
</html>













