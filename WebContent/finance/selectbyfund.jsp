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
<table border="1" cellspacing=0 cellpadding=0>
	<tr>
		<td>时间</td>
		<td>形式</td>
		<td>设备SN码</td>
		<td>公益金收入</td>
		<td>维修基金</td>
		<td>运维基金</td>
	</tr>
	<c:forEach items="${list }" var="f">
		<tr>
			<td>${f.get("time") }</td>
			<td>${f.get("type") }</td>
			<td>${f.get("number") }</td>
			<td>${f.get("fund") }</td>
			<td>${f.get("wxfund") }</td>
			<td>${f.get("ywfund") }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>