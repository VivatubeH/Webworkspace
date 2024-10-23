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
	<h1>form 관련 이벤트</h1>
	
	<form>
		<div>
			<label>모집분야</label>
			<select name="type" onchange="fn1()">
				<option value="" disabled selected> 선택하세요</option>
				<option value="1"> 인턴직</option>
				<option value="2"> 계약직</option>
				<option value="3"> 경력직</option>
			</select>
		</div>
		<div class="box-year d-none" id="year-1">
			<label>연수기간</label>
			<input type="text" name="year" >년
		</div>
		<div class="box-year d-none" id="year-2">
			<label>계약기간</label>
			<input type="text" name="year" >년
		</div>
		<div class="box-year d-none" id="year-3">
			<label>경력기간</label>
			<input type="text" name="year" >년
		</div>
	</form>
<script type="text/javascript">
	/*
		select 박스와 이벤트
			- select 박스는 onchange 이벤트를 주로 사용한다.
				* onchange 이벤트가 선택된 옵션이 변경될 때마다 발생한다.
				* 사용자가 다른 옵션을 선택할 때마다 거기에 맞는 적절한 작업을 수행한다.
			- 옵션이 변경될 때마다 현재 선택된 옵션의 value값을 확인하고
			  그에 맞는 적절한 작업을 수행하는 이벤트 핸들러 함수를 정의한다.
	*/
	function fn1() {
		// console.log("onchange 이벤트 발생");
		let typeNo = document.querySelector('[name=type]').value;
		console.log('타입번호', typeNo);
		
		// 전부 다 안 보이게 한 다음에
		let boxes = document.querySelectorAll('.box-year')
		for (let box of boxes) {
			box.classList.add('d-none');
		}
		
		// 해당되는 것만 보이도록
		if (typeNo == "1") {
			document.getElementById("year-1").classList.remove('d-none');
		} else if (typeNo == "2") {
			document.getElementById("year-2").classList.remove('d-none');
		} else if (typeNo == "3") {
			document.getElementById("year-3").classList.remove('d-none');
		}
	}
</script>
</body>
</html>