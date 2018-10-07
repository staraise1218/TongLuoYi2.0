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
		<td>微信ID</td>
		<td>提成金额</td>
		<td>时间</td>
	</tr>
	<c:forEach items="${list }" var="f">
		<tr>
			<td>${f.strwxid }</td>
			<td>${f.strmoney }</td>
			<td>${f.strtime }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>