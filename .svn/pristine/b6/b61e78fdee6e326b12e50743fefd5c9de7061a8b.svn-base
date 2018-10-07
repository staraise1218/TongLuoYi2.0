<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td>时间</td>
		<td>上期余额</td>
		<td>支出金额</td>
		<td>类型</td>
	</tr>
	<c:forEach items="${list }" var="f">
		<tr>
			<td>${f.strtime }</td>
			<td>${f.yue }</td>
			<td>${f.fundmoney }</td>
			<td>${f.strtype }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>