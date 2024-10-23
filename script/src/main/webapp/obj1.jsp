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
	<h1>객체</h1>
	
<script type="text/javascript">
	// 자바스크립트의 객체
	/*
		객체
			- key:value의 쌍으로 구성된 프로퍼티
			- 자바스크립트의 객체는 Property들의 집합(순서없는 콜렉션)이다.
			
		객체의 생성
			- 빈(Empty) 객체 생성하기
				let obj = {};	// 객체 리터럴을 이용해서 빈 객체 생성한다. 
			- 프로퍼티가 있는 객체 생성하기
				let user = {
					// 프로퍼티 정의
					name : "홍길동",
					email : "hong@gmail.com",
					tel: "010-1111-1111",
					skill1 : 'java',
					skill2 : 'python',
					skill3 : 'c++',
					skill4 : 'javascript', 
					getName: function() {
						return this.name;
					}
				}
			- 프로퍼티의 사용
				+ 프로퍼티값 조회하기
					let value = user.name;
					let value = user['name'];
					let value = user.skill1;
					let value = user.skill2;
					let value = user['skill3'];
					let value = user['skill4'];
					
					for(let num = 1; num <= 4; num++) {
						let value = user['skill' + num]; // 이거는 가능하다.
						// 프로퍼티를 변수화 할 수 있다.
					}
				+ 프로퍼티값 변경하기
					user.name = "김유신";
					user['name'] = "김유신";
					
				- 프로퍼티의 추가/삭제
					+ 프로퍼티 추가
						let user = {};
				
						user.name = "홍길동";
						user.age = 30;
						
						user.age = 40; // 이렇게 하면 변경된다. name에 일치하는 게 있으면 변경됨.
						// 추가와 삭제를 같은 메커니즘으로 수행 가능하다.
						
						* user가 참조하는 객체에 
							age 프로퍼티가 없으면 새 프로퍼티 추가
							age 프로퍼티가 있으면 값 변경
					+ 프로퍼티 삭제
						delete user.name;
						
			자바의 기본자료형(원시자료형)
			정수형	
				short, byte, int, long
			실수형
				float, double
			문자형
				char
			불린형
				boolean
		* 기본자료형은 오직 데이터를 하나만 담을 수 있다.
		* 자바객체의 필드로 다양한 타입의 데이터를 담을 수 있다.
		  자바객체의 메소드로 다양한 기능을 표현할 수 있다.
		  
		자바스크립트의 기본자료형(원시자료형)
			숫자형
			문자열
			불린형
			undefined
			null
		* 기본자료형은 오직 데이터를 하나만 담을 수 있다.
		* 자바스크립트의 객체는 key:value의 쌍으로 구성된 프로퍼티로 다양한 데이터와 기능을 표현한다.
		* 프로퍼티는 key:value의 쌍으로 구성된다.
			value의 값으로 가능한 것
				- 원시자료형 타입의 값
				- 배열
				- 다른 객체
				- 함수 
		
	*/
	
	// 빈 객체 생성하기
	let user = {};
	console.log(user);
	
	// 객체의 프로퍼티값 조회하기
	// 존재하지 않는 프로퍼티를 사용하면 오류가 아닌 undefined가 출력됨.
	// 오류가 발생하는 대신 undefined 값이 출력된다.
	console.log(user.name); // undefined 값이 출력된다.
	
	// 새로운 프로퍼티 추가하기
	user.name = "홍길동";
	user['email'] = "hong@gmail.com";
	user['tel'] = '010-1111-1111';
	user.info = function info(){
		console.log("실행");
		console.log(this.name);
		console.log(this.email);
		console.log(this.tel);
	};
	
	console.log(user);
	
	// 프로퍼티값 조회하기
	console.log(user.name);
	console.log(user.email);
	console.log(user['tel']);
	// 자바스크립트에서 객체.프로퍼티명은 무조건 조회임.
	// 반면에, 객체.프로퍼티명 = 값;처럼 값이 있으면 변경임.
	
	// 메소드 실행하기
	user.info();
	
</script>
</body>
</html>