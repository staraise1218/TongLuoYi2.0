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
		<td>销售收入金额</td>
		<td>押金收入总额</td>
		<td>扫码总收入</td>
		<td>平台收入总额</td>
	</tr>
	<tr>
		<c:forEach items="${list }" var="f">
			<td>${f.get("gm") }</td>
			<td>${f.get("zy") }</td>
			<td>${f.get("xf") }</td>
			<td>${f.get("gm")+f.get("zy")+f.get("xf") }</td>
		</c:forEach>
	</tr>
</table>
</body>
</html>