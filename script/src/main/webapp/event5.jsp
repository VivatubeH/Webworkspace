<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>애플리케이션</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
	<style type="text/css">
		#thumbnail-image-box img {
			width: 60px;
			height: 90px;
			opacity: 0.4;
		}
	</style>
</head>
<body>
	<h1>마우스 이벤트</h1>
	<div id="big-image-box">
		<img src="images/1.jpg" id="big" width="300" height="400" alt="책사진">
	</div> 
	<div id="thumbnail-image-box">
		<img src="images/1.jpg" width="60" height="90" onmouseenter="fn1(event)" onmouseleave="fn2(event)">
		<img src="images/2.jpg" width="60" height="90" onmouseenter="fn1(event)" onmouseleave="fn2(event)">
		<img src="images/3.jpg" width="60" height="90" onmouseenter="fn1(event)" onmouseleave="fn2(event)">
		<img src="images/4.jpg" width="60" height="90" onmouseenter="fn1(event)" onmouseleave="fn2(event)">
		<img src="images/5.jpg" width="60" height="90" onmouseenter="fn1(event)" onmouseleave="fn2(event)">
	</div>
</body>
<script type="text/javascript">
	function fn1(event) {
		let thumbImg = event.target;
		thumbImg.style.opacity = "1.0";
		
		let imagePath = thumbImg.getAttribute("src");
		document.getElementById('big').setAttribute("src", imagePath);
	}
	
	function fn2(event) {
		let thumbImg = event.target;
		thumbImg.style.opacity = "0.4";
	}
</script>
</html>