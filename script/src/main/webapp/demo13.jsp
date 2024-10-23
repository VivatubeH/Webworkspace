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
	<h1>콜백함수의 활용</h1>
	
	<div>
		<button id="btn-del">삭제</button>
		<button id="btn-save">저장</button>
		<button id="btn-save1">저장1</button>
		<button id="btn-save2">저장2</button>
	</div>
	
<script type="text/javascript">
	// 이벤트처리
	/*
		이벤트와 이벤트처리
			- 사용자가 화면의 HTML 요소와 상호작용할 때마다
			해당 HTML 요소(엘리먼트)가 발생시키는 신호
			- HTML 요소가 발생시키는 신호는 이벤트 객체를 만든다.
			이벤트 객체에는 상호작용이 발생한 엘리먼트(HTML 요소)
							상호작용의 종류(click, mousemove, keyup, ...)
							기타 정보가 포함되어 있다.
							
		+ 이벤트 처리
			- 이벤트 처리는 이벤트가 발생할 때 실행될 이벤트 핸들러(콜백함수)
			  등록하는 것이다.
			- 이벤트 핸들러는 사용자의 상호작용에 어떻게 행돌할 지
			  자바스크립트 코드로 구현해놓은 것이다.
			- 웹 브라우저는 이벤트가 발생하면 등록된 이벤트 핸들러를 실행시킨다.
		
		+ 이벤트 처리 절차
			1. 사용자와 상호작용하는 HTML 요소(엘리먼트)를 선정한다.
			2. 이벤트 처리에 사용될 상호작용의 종류를 선정한다.
			3. 이벤트에 반응해서 실행될 이벤트핸들러 함수를 작성한다.
			4. 1번에서 선정한 엘리먼트에서 2번에서 선정한 상호작용이
			  발생했을 때, 3번에서 작성한 이벤트핸들러가 실행되도록
			  이벤트핸들러를 등록한다.
			
			1. 사용자와 상호작용하는 HTML 요소는 삭제버튼이다.
			2. 상호작용의 종류는 click이다.
			3. 이벤트핸들러 함수를 작성한다.
				function handler() {
					수행문;
					수행문;
				}
			4. let btn1 = document.getElementById("btn-del")
			   btn1.addEventListerner("click", handler);
		<div>
			<button id="btn-del">삭제</button>
			<button id="btn-save">저장</button>
			<button id="btn-save1">저장1</button>
			<button id="btn-save2">저장2</button>
		</div>
	*/
	
		let btn1 = document.getElementById("btn-del");
	    let btn2 = document.getElementById("btn-save");
	    let btn3 = document.getElementById("btn-save1");
	    let btn4 = document.getElementById("btn-save2");
	    
	    btn1.addEventListener("click", function() {
	        alert("삭제버튼이 클릭되었습니다.");
	    });
	    btn2.addEventListener("click", function() {
	        alert("저장버튼이 클릭되었습니다.");
	    });
	    
	    btn3.addEventListener("click", () => alert("저장1버튼이 클릭됨"));
	    btn4.addEventListener("click", () => alert("저장2버튼이 클릭됨"));
</script>
</body>
</html>