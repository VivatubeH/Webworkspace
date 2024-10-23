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
	<h1>폼관련 이벤트</h1>
	
	<form method="post" action="order.jsp" onsubmit="return fn2()">
		<table class="table">
			<thead>
				<tr>
					<th><input type="checkbox" name="all" onchange="fn1()"></th>
					<th>이름</th>
					<th>가격</th>
					<th>수량</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="checkbox" name="cartNo" value="10" onchange="fn3()"></td>
					<td>삼성노트북</td>
					<td>2,000,000원</td>
					<td>1 개</td>
				</tr>
				<tr>
					<td><input type="checkbox" name="cartNo" value="20" onchange="fn3()"></td>
					<td>레노버 노트북</td>
					<td>2,000,000원</td>
					<td>1 개</td>
				</tr>
				<tr>
					<td><input type="checkbox" name="cartNo" value="30" onchange="fn3()"></td>
					<td>아수스 노트북</td>
					<td>2,000,000원</td>
					<td>1 개</td>
				</tr>
				<tr>
					<td><input type="checkbox" name="cartNo" value="40" onchange="fn3()"></td>
					<td>갤럭시 노트북</td>
					<td>2,000,000원</td>
					<td>1 개</td>
				</tr>
				<tr>
					<td><input type="checkbox" name="cartNo" value="50" onchange="fn3()"></td>
					<td>맥북 프로 16인치 노트북</td>
					<td>2,000,000원</td>
					<td>1 개</td>
				</tr>
				<tr>
					<td><input type="checkbox" name="cartNo" value="60" onchange="fn3()"></td>
					<td>LG 그램 노트북</td>
					<td>2,000,000원</td>
					<td>1 개</td>
				</tr>
			</tbody>
		</table>
		
		<div>
			<button type="submit">주문</button>
		</div>
	</form>
<script type="text/javascript">
	// 각 상품의 체크박스 체크상태가 변경될 때 마다 실행된다.
	function fn3() {
		let checkboxes = document.querySelectorAll('[name=cartNo]');
		// 전체 체크박스의 갯수 조회
		let checkboxesLength = checkboxes.length;
		
		// 체크된 체크박스의 갯수 계산
		let checkedLength = 0;
		for (let el of checkboxes) {
			if (el.checked) {
				checkedLength++;
			}
		}
		
		if (checkboxesLength == checkedLength) {
			document.querySelector('[name=all]').checked = true;
		} else {
			document.querySelector('[name=all]').checked = false;
		}
	}
	function fn2() {
		// 체크된 체크박스가 존재하는지 확인하고,
		// 존재하지 않으면 오류창을 표시하고, 폼입력값을 제출하지 않는다.
		let checkboxes = document.querySelectorAll('[name=cartNo]')
		let exist = false;
		for (let el of checkboxes) {
			if (el.checked) {
				exist = true;
				break;
			}
		}
		if (!exist) {
			alert("선택된 상품이 없습니다.");
			return false;
		}
		
		return true;
	}
	
	function fn1() {
		let isChecked = document.querySelector('[name=all]').checked;
		console.log('체크여부', isChecked);
		/*
			checkboxes => [체크박스엘리먼트, 체크박스엘리먼트, ...]
			
			checkboxes.forEach(function(e)) {

			})
			function(e) { ... }는 배열에 포함된 체크박스의 갯수만큼 실행한다.
			함수가 실행될 때마다 매개변수 e는 체크박스 엘리먼트를
			순서대로 하나씩 전달받는다.
		*/
		let checkboxes = document.querySelectorAll('[name=cartNo]');
		checkboxes.forEach(function(el) {
			el.checked = isChecked;
		})
	}
</script>
</body>
</html>
















