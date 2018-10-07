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
		<td>级别</td>
		<td>身份</td>
		<td>一级消费提成</td>
		<td>二级消费提成</td>
		<td>一级租用提成</td>
		<td>二级租用提成</td>
		<td>一级购买提成</td>
		<td>二级购买提成</td>
	</tr>
	<c:forEach items="${list }" var="c">
		<tr>
			<td>${c.strlevel }</td>
			<td>${c.stridentity }</td>
			<td>${c.xfone }</td>
			<td>${c.xftwo }</td>
			<td>${c.zyone }</td>
			<td>${c.zytwo }</td>
			<td>${c.xsone }</td>
			<td>${c.xstwo }</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>