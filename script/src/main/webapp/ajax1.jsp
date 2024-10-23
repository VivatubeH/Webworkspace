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
	<h1>ajax</h1>
	<p>아이디 중복검사 기능을 ajax로 구현하기</p>
	
	<form>
		<div>
			<label>아이디</label><br />
			<input type="text" name="id" onkeyup="checkId()"/>
			<p id="msg"></p>
		</div>
		<div>
			<label>비밀번호</label> <br />
			<input type="text" name="pwd" />
		</div>
		<div>
			<label>이름</label> <br />
			<input type="text" name="name" />
		</div>
		<div>
			<button type="submit">회원가입</button>
		</div>
	</form>
	
<script type="text/javascript">
	// 입력필드에 글자가 입력될 때마다
	// 아이디값을 서버로 보내서, 중복여부 체크를 요청하고
	// 응답결과를 화면에 표시한다.
	function checkId() {
		let value = document.querySelector("[name=id]").value;
		if (value.length < 3) {
			document.getElementById("msg").textContent = "3글자 이상 입력하세요";
			return;
		}
		
		// 1. XMLHttpRequest 객체 생성하기
		let xhr = new XMLHttpRequest();
		
		// 콜백함수 등록 [ 관례적으로 이벤트 이름은 전부 소문자로 한다. ]
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				// 응답이 오고, 200( 성공한 응답코드 )가 올 때
				let el = document.getElementById('msg')

				let data = xhr.responseText;
				//console.log('응답데이터', data);
				if (data == 'none') {
					el.textContent = "사용가능한 아이디입니다.";	
				} else if (data == 'exist') {
					el.textContent = "이미 사용중인 아이디입니다.";
				}
			}
		};
		// 2. XMLHttpRequest 객체 초기화하기
		//	  요청방식, 요청 URL을 지정한다.
		xhr.open('GET', "ajax1-res.jsp?id=" + value);
		// 3. XMLHttpRequest 객체로 서버에 요청을 보낸다.
		xhr.send();
		
	}

</script>
</body>
</html>