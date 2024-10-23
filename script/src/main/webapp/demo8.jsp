<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>애플리케이션</title>
</head>
<body>
	<h1>제어문</h1>
	
	검색어: <input type="text" name="keyword"> <button onclick="checkField()">조회</button>
<script type="text/javascript">
	// 제어문
	// if(조건식) {
	//		수행문;
	//	}
	// * 조건식을 판정해서 true로 판정되면 블록내의 수행문을 실행한다.
	// * 조건식에는 비교연산자/논리연산자를 이용한 연산식이 위치할 수 있고,
	// 	 단순한 값이 위치할 수 있다.
	// * 조건식의 수행결과가 true/false로 아닌 경우
	// 	 0, '', undefined, null, NaN은 false로 판정하고 그 외는 전부 true로 판정한다. 
	
	function checkField() {
		// 입력필드의 입력값 조회하기
		let keyword = document.querySelector('input[name=keyword]').value;
		
		if (keyword.trim()) {
			alert(`\${keyword}로 데이터를 검색합니다.`);
		} else {
			alert("검색어를 입력하세요");
		}
		/*
		if (keyword == "") {
			alert("검색어를 입력하세요");
		} else {
			alert(`\${keyword}로 데이터를 검색합니다.`);
		}
		*/
	}
</script>
</body>
</html>