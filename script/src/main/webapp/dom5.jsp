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
	<h1>폼입력요소</h1>
	
	<form method="post" action="add.jsp">
		<div>
			<label>아이디</label><br />
			<input type="text" name="id" />
		</div>
		<div>
			<label>비밀번호</label><br />
			<input type="text" name="password" />
		</div>
		<div>
			<label>이름</label><br />
			<input type="text" name="name" />
		</div>
		<div>
			<label>성별</label><br />
			<input type="radio" name="gender" id="gender-1" value="female" checked>여성
			<input type="radio" name="gender" id="gender-2" value="male">남성
		</div>
		<div>
			<label>이메일</label><br />
			<input type="text" name="email1" />
			@
			<select name="email2">
				<option value="" selected disabled> 선택하세요</option>
				<option value="naver.com"> naver.com</option>
				<option value="daum.net"> daum.net</option>
				<option value="hanmail.net"> hanmail.net</option>
				<option value="gmail.com"> gmail.com</option>
				<option value="x"> 직접입력</option>
			</select>
			<input type="text" name="email2" disabled/>
		</div>
		<div>
			<label>전화번호</label><br />
			<input type="text" name="tel" />
		</div>
	</form>
	
<script type="text/javascript">
	// 폼 입력요소의 값 조회 및 변경
	/*
		일반 입력필드의 입력값 조회하기
			let value1 = document.querySelector("[name=tel]").value;
		일반 입력필드의 입력값 변경하기
			document.querySelector("[name=tel]").value = "010-1111-1111";
		
		라디오, 체크박스를 체크하기
			document.querySelector("#gender-1").checked = true;
		라디오, 체크박스 체크상태를 체크하지 않음으로 변경하기
		  	document.querySelector("#gender-1").checked = false;
		
		셀렉트 박스에서 현재 선택된 값 조회하기
			let value2 = document.querySelector("name=email2").value;
		셀렉트 박스에서 지정된 값을 가진 옵션이 선택되게 하기
			document.querySelector("[name=email2]").value = "naver.com";
		셀렉트 박스에서 지정된 인덱스(0번부터 시작)번째의 옵션이 선택되게 하기
			document.querySelector("[name=email2]").selectedIndex = 1;
		
		폼입력요소를 비활성화 시키기
			document.querySelector("[name=password]").disabled = true;
		폼입력요소를 활성화 시키기
			document.querySelector("[name=password]").disabled = false;
	*/
	
	// 입력 필드의 값 변경하기
	document.querySelector("input[name=id]").value = "hong";
	
	// 라디오버튼의 체크여부 변경하기
	document.querySelector("#gender-2").checked = true;
	
	// select 박스에서 특정값을 가진 옵션을 선택하기
	document.querySelector("select[name=email2]").value = 'x';
	
	// input, radio, checkbox, select, textarea, button를 비활성화 여부 변경하기
	document.querySelector("input[name=name]").disabled = true;

	// 화면에 표시되지 않게 하기
	document.querySelector("input[name=email2]").style.display = "none";
</script>
</body>
</html>