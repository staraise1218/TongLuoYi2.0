<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td>微信ID</td>
		<td>获取时间</td>
		<td>消费</td>
		<td>星评</td>
		<td>留言</td>
	</tr>
	<c:forEach items="${list }" var="i">
		<tr>
			<td>${i.wxid }</td>
			<td>${i.strtime }</td>
			<td>${i.consumption }</td>
			<td>${i.starrating }</td>
			<td>${i.leaveword }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>