<%@page import="java.util.List"%>
<%@page import="com.weather.model.dto.WeatherDTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("UTF-8");
   response.setContentType("text/html; charset=UTF-8");%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>List</h1>

	<table border="1">
		<col width="100">
		<col width="100">
		<col width="50">
		<col width="50">

		<tr>
			<th>날짜</th>
			<th>시간</th>
			<th>온도</th>
			<th>습도</th>

		</tr>

		<c:choose>
			<c:when test="${empty list }">
				<tr>
					<td colspan="4">------불러올 데이터가 없습니다------</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${list }" var="dto">

					<tr>
						<td>${dto.baseDate }</td>
						<td>${dto.baseTime }</td>
						<td>${dto.t3h }</td>
						<td>${dto.reh }</td>
					</tr>

				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>

	<form action="insertres.do" method="post">
	
		<table>
			<tr>
				<td colspan="4" align="right">
				<input type="submit" value="데이터받아오기" onclick="location.href='list.do'">
					
				</td>
			</tr>
		</table>

	</form>



</body>
</html>