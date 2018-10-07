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
<title>Insert title here</title>
</head>
<body>
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td>设备型号</td>
		<td>设备编码</td>
		<td>设备二维码</td>
		<td>取得形式</td>
		<td>当前状态</td>
		<td>出库时间</td>
		<td>验收时间</td>
	</tr>
	<c:forEach items="${list }" var="p">
		<tr>
			<td>${p.get("type") }</td>
			<td>${p.get("number") }</td>
			<td><img width="100px" height="100px" src="<%=path %>/icon?img=${p.number}"></td>
			<td>${p.get("form") }</td>
			<td>${p.get("status") }</td>
			<td>${p.get("outtime") }</td>
			<td>${p.get("time") }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>