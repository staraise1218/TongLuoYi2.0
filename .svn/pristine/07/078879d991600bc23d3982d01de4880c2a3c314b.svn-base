<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>附近店铺管理</title>
</head>
<body>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>ID</td>
			<td>名称</td>
			<td>位置</td>
			<td>地理经纬度</td>
			<td>介绍</td>
			<td>图文页面</td>
		</tr>
		<c:forEach items="${list }" var="s">
			<tr>
				<td>${s.sid }</td>
				<td>${s.name }</td>
				<td>${s.address }</td>
				<td>${s.location }</td>
				<td>${s.introduce }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>