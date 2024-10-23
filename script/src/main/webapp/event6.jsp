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
	<h1>키보드 이벤트</h1>
	<form>
		<label>아이디</label>
		<input type="text" name="id" 
			onkeyup="fn3(event)"/>
		<p id="msg"></p>
	</form>
	
<script type="text/javascript">
	// 키보드 이벤트
	/*
		키보드 이벤트
			- 키보드의 키를 입력할 때 마다 발생하는 이벤트다.
			- keydown, keypress, keyup 이벤트가 있다.
			- 키보드를 입력하면 keydown -> keypress -> keyup의 순서로
			  이벤트가 발생한다.
			- 사용자와 상호작용에 주로 활용하는 이벤트는 keyup 이벤트다.
				* keyup 이벤트가 발생했을 때는 입력필드에 지금 입력한 글자가 
				  나타난다.
				* 즉, 사용자가 입력필드에 입력한 내용을 읽어올 수 있다.
		
		입력필드에서 onchage 이벤트
			- 입력필드에서 입력을 끝내고 포커스가 다른 곳으로 이동했을 때 발생한다.
				(단, 입력필드의 원래값과 값이 달라져야 한다.)
				* 입력필드에 글자를 입력할 때마다 발생하는 것이 아니다.
				* 입력필드에 대해서 onchange 이벤트를 사용하지 않는다.
			
	*/
	
	// 아이디 정규 표현식
	/*
		- //는 정규표현식 객체를 생성하는 리터럴이다.
		- ^는 시작을 나타낸다.
		- $는 끝을 나타낸다.
		- []는 사용가능한 문자를 내부에 포함한다.
			[abc]는 abc 중 아무 문자가 가능하다.
			[a-z]는 영어소문자중 아무 문자나 가능하다.
			[a-zA-Z0-9]는 영어 소문자, 영어 대문자, 숫자 중 아무 문자나 가능하다.
			^가 [] 내부에 있으면 부정이다. ( 그거 빼고 가능 )
			- [a-z]+는 영어소문자가 한 글자 이상이라는 의미다.
			- {}는 등장횟수를 지정한다.
			  {1, } 1글자 이상
			  {1, 6} 1글자 이상 6글자 이하
			- [a-z0-9]{5,19}는 영어소문자와 숫자가 5글자 이상 19글자 이하
						/표현식/
	*/
	// 영어소문자로 시작하고, 영어소문자, 숫자 포함 6글자 이상 20글자 이하
	let regexp = /^[a-z]+[a-z0-9]{5,19}$/;
	
	function fn3(e) {
		let value = document.querySelector("[name=id]").value;
		
		if (regexp.test(value)) {
			document.querySelector("#msg").textContent = "유효한 아이디입니다.";
		} else {
			document.querySelector("#msg").textContent = "유효한 형식의 아이디가 아닙니다.";
		}
	}
</script>
</body>
</html>