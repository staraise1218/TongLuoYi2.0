<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
    String path = request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>设备管理</title>
</head>
<body>
<table border="1" cellspacing=0 cellpadding=0>
	<tr>
		<td>名称</td>
		<td>型号</td>
		<td>押金(元/台)</td>
		<td>售价(元/台)</td>
		<td>库存数量(台)</td>
		<td>修改</td>
	</tr>
	<c:forEach items="${list }" var="e">
		<tr>
			<td>${e.get("name") }</td>
			<td>${e.get("type") }</td>
			<td>${e.get("cashpledge") }</td>
			<td>${e.get("price") }</td>
			<td>${e.get("count") }</td>
			<td><a href="<%=path%>/equipment/selectOne?id=${e.id}">修改</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>