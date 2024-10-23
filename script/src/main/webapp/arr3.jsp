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
	<h1>배열객체의 주요 메소드</h1>

	<div>
		<input type="text" name="name" id="name">
		<button id="btn-add">추가</button>
	</div>
	
	<ul id="list-names"></ul>
	
<script type="text/javascript">
	// 입력한 이름을 저장하는 배열
	let names = [];
	
	// 추가버튼을 클릭하면 실행되는 콜백함수를 등록하기
	document.getElementById("btn-add").addEventListener('click', () => {
		// 1. 입력필드의 값을 읽어온다.
		let value = document.getElementById("name").value;
		
		// 2. 배열에 값 추가하기
		names.push(value);
		console.log(names);
		
		// 3. 배열에 저장된 값으로 <li> 태그를 생성해서 표시하기
		let content = "";
		for (let name of names) {
			content += `<li>\${name}</li>`;
		}
		
		// 4. 생성된 HTML 컨텐츠를 화면에 표시하기
		document.getElementById("list-names").innerHTML = content;
	});
	// 배열객체
	/*
		+ push(값)와 pop()
			push(값)	
				배열의 맨 끝에 값을 추가한다.
			pop()
				배열의 맨 끝에 값을 삭제하고, 그 값을 반환한다.
				
		+ unshift(값)과 shitf()
			unshitf(값)
				배열의 맨 앞에 값을 추가한다.
			shitf()
				배열의 맨 앞값을 삭제하고, 그 값을 반환한다.
		
		* 배열의 처음이나 끝에 값을 추가하거나 삭제할 때는
		  인덱스를 사용하지 않고, 위의 메소드를 사용해서 
		  추가/삭제할 수 있다.
		  
		 + splice(인덱스, 삭제할갯수, 값, 값, ...) 
		 	let arr = ['a', 'b', 'c', 'd', 'e', 'f'];
	
			-  삭제하기
				arr.splice(2, 1); --> ['a', 'b', 'd', 'e', 'f']
				arr.splice(2, 3); --> ['a', 'b', 'f']
				
			-  추가하기
				arr.splice(2, 0, 'k');
					['a', 'b', 'k', 'c', 'd', 'e', 'f']
				arr.splice(2, 0, 'k', 'm', 'l');
					['a', 'b', 'k', 'm', 'l', 'c', 'd', 'e', 'f']
					
			삭제하고 추가하기
				arr.splice(2, 1, 'k')
					['a', 'b', 'k', 'd', 'e', 'f']
				arr.splice(2, 3, 'k')
					['a', 'b', 'k', 'f']
				arr.splice(2, 3, 'k', 'l', 'm');
					['a', 'b', 'k', 'l', 'm', 'f']
	*/			
	
	let arr1 = ['김유신'];	console.log(arr1);									
	arr1.push('강감찬');	console.log(arr1);									
	arr1.push('이순신');	console.log(arr1);
	arr1.push('류관순');	console.log(arr1);
	arr1.push('홍길동');	console.log(arr1);
	
	arr1.unshift('워싱턴');		console.log(arr1);
	arr1.unshift('링컨');		console.log(arr1);
	arr1.unshift('케네디');		console.log(arr1);
	arr1.unshift('루즈벨트');	console.log(arr1);
</script>
</body>
</html>