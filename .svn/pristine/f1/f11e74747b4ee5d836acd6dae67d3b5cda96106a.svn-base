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
		<td>设备SN码</td>
		<td>开机时间</td>
		<td>本次时长(分钟)</td>
	</tr>
	<c:forEach items="${list }" var="u">
		<tr>
			<td>${u.get("number") }</td>
			<td>${u.get("starttime") }</td>
			<td>${u.get("utilitytime")/60000 }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>