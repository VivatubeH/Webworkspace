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
	<div class="container">
		<h1>부서목록</h1>
		<div class="row">
			<div class="col-4">
				<ul class="list-group">
					<li class="list-group-item" onclick="getEmps(10)">영업부</li>
					<li class="list-group-item" onclick="getEmps(11)">기술부</li>
					<li class="list-group-item" onclick="getEmps(12)">홍보부</li>
					<li class="list-group-item" onclick="getEmps(13)">연구소</li>
				</ul>
			</div>
			<div class="col-8">
				<table class="table">
					<thead>
						<tr>
							<th>아이디</th>
							<th>이름</th>
							<th>직종</th>
							<th>입사일</th>
							<th>급여</th>
						</tr>
					</thead>
					<tbody></tbody>
				</table>
			</div>
		</div>
	</div>
<script type="text/javascript">
	function getEmps(no) {
		let tbody = document.querySelector(".table tbody");
		tbody.innerHTML = "";		
		let xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				// 응답으로 json형식의 텍스트를 받음
				let text = xhr.responseText;
				// json형식의 텍스트를 자바스크립트 배열로 변환함
				let employees = JSON.parse(text);
				
				for (let emp of employees) {
					let tr = `
						<tr>
							<td>\${emp.id}</td>
							<td>\${emp.firstName}</td>
							<td>\${emp.jobId}</td>
							<td>\${emp.hireDate}</td>
							<td>\${emp.salary}</td>								
						</tr>
					`;					
					tbody.insertAdjacentHTML("beforeend", tr);
				}				
			}
		};
		
		xhr.open("GET", "ajax2-res.jsp?no=" + no);
		xhr.send();
	}
</script>
</body>
</html>







