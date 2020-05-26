<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

</script>

</head>
<body>

<h1>기상청 날씨 api에서 날씨정보를 받아 데이터 베이스에 업데이트 합니다.</h1>



<form action="insertres.do" id="insert" method="post"></form>

<button onclick="document.getElementById('insert').submit()">데이터 업데이트!</button>
</body>
</html>