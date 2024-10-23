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
	<h1>브라우저 내장객체</h1>
	
	<h3>confirm 창</h3>
	<p>
		<button onclick="checkDelete();">삭제</button>
	</p>
	
	<h3>입력 창</h3>
	<p>
		<button onclick="checkInput();">입력하기</button>
	</p>
	
	<h3>새 창</h3>
	<p>
		<button onclick="open1()">새창 열기</button>
		<button onclick="open2()">새창 열기</button>
		<button onclick="open3()">새창 열기</button>
	</p>
	
	<h3>페이지 이동하기</h3>
	<p>
		<button onclick="move1()">이동하기</button>
		<button onclick="move2()">이동하기</button>
		<button onclick="move3()">이동하기</button>
	</p>
	
<script>
	function move1() {
		location.href = "http://www.daum.net";
	}
	function move2() {
		location.href = "demo2.jsp";
	}
	function open1() {
		// 스펙을 지정하지 않으면 새 탭으로 열린다.
		open("http://www.daum.net");
	}
	
	function open2() {
		// 스펙을 지정하면 시스템 팝업으로 새 창이 열린다.
		open("http://www.daum.net", "daum", "width=400, height=200, left=300, top=300, resizable=no");		
	}
	
	function open3() {
		// 스펙을 지정하면 시스템 팝업으로 새창이 열린다.
		open("obj5-popup.jsp", "popup", "width=400, height=200, left=300, top=300, resizable=no")
	}
	function checkInput() {
		// 확인버튼을 클릭하면 입력필드에 입력한 값이 result에 대입된다.
		let result = prompt("이름을 입력하세요", "홍길동");
		console.log(result)
	}

	function checkDelete() {
		// confirm 창에서 확인버튼을 클릭하면 result에 true가 대입된다.
		let result = confirm("삭제하시겠습니까?");
		if (result) {
			console.log("삭제버튼이 클릭되었습니다.");
		} else {
			console.log("취소버튼이 클릭되었습니다.")
		}
	}
</script>
<script type="text/javascript">
	// 브라우저 내장객체
	/*
		브라우저 내장객체
			- 브라우저가 기본으로 제공하는 객체
		Window 객체
			+ 웹브라우저의 화면을 표현하는 객체
			+ 브라우저 환경에서의 global 객체다.
				* <script> 태그 내에서 생성한 모든 변수, 모든 함수는
				  전부 Window 객체에 포함된다.
			+ 다른 브라우저 내장객체도 포함하고 있다.
			+ global 객체에 포함된 프로퍼티와 메소드는
			  어디에서나 바로 사용할 수 있다.
			+ window가 참조하는 Window 객체의 프로퍼티와 메소드는
			  window 없이 사용가능하다.
			  예시)
			  	* parseInt() 함수는 Window객체의 메소드다.
			  	window.parseInt("100");
			  	parseInt("100");
			  	
			  	window.console.log("안녕");
			  	console.log("안녕");
			  	
			  	window.document.getElementById("btn-add");
			  	document.getElementById("btn-add");
			  	
			  	window.history.back();
			  	history.back();
			
			 + property
			 	document
			 		Document 객체를 반환한다.
			 	history	
			 		History 객체를 반환한다.
			 	location
			 		Location 객체를 반환한다.
			 	navigator 
			 		Navigator 객체를 반환한다.
			 	screen	
			 		Screen 객체를 반환한다.
			 	opener 
			 		현재 화면(Window객체)을 생성한 화면(Window 객체)을 반환한다.
			
			 + method
				alert(메시지)
			 		메세지와 OK 버튼이 있는 경고창을 표시한다.
			 	confirm(메세지)
			 		메세지와 확인/취소버튼이 있는 확인창을 표시한다.
			 		확인버튼을 클릭하면 true를 반환하고,
			 		취소버튼을 클릭하면 false를 반환한다.
			 	prompt("메세지", 기본값)
			 		메세지와 기본값, 확인/취소버튼이 있는 입력창을 표시한다.
			 		확인버튼을 클릭하면 입력필드에 입력한 값이 반환된다.
			 	open(url, name, spec)
			 		새 화면을 연다.
			 	close()
			 		현재 화면을 닫는다.
			 	
		Document 객체
		
		History 객체
			+ 웹 페이지 방문기록 정보를 표현하는 객체다.
			+ method
				back()
			 		이전 페이지로 되돌아간다.
			 	forward()
			 		다음 페이지로 이동시킨다.
			 	go()
			 		지정된 숫자만큼 이전/다음으로 이동한다.
			 		양수는 다음 페이지, 음수는 이전 페이지이다.
			 		
		Location 객체
			+ 주소창의 주소정보를 표현하는 객체다.
			+ property
				href
					주소창의 주소를 반환한다.
				search 
					주소창 주소의 쿼리스트링을 반환한다.
			method
				reload()	
			 		현재 페이지를 새로고침한다.
		Navigator 객체
			+ 웹브라우저의 정보를 표현하는 객체다.
			+ property
				appName
					브라우저 이름을 반환한다.
				appVersion
					브라우저 버전을 반환한다.
				platform
					브라우저 플랫폼을 반환한다.
				userAgent
					user-agent 헤더정보를 반환한다.
		Screen 객체
			+ 사용자 모니터 정보를 표현하는 객체다.
			+ property
				width
					스크린의 너비를 반환한다.
				height
					스크린의 높이를 반환한다.
	*/
</script>
</body>
</html>