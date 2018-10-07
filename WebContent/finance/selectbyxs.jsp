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
		<td>设备型号</td>
		<td>设备SN码</td>
		<td>合伙人</td>
		<td>销售价格</td>
		<td>一级上线微信ID</td>
		<td>一级上线销售提成</td>
		<td>二级上线微信ID</td>
		<td>二级上线销售提成</td>
		<td>公益金</td>
	</tr>
	<c:forEach items="${list }" var="f">
		<tr>
			<td>${f.get("type") }</td>
			<td>${f.get("number") }</td>
			<td>${f.get("name") }</td>
			<td>${f.get("money") }</td>
			<td>${f.get("gmonewxid") }</td>
			<td>${f.get("gmonemoney") }</td>
			<td>${f.get("gmtwowxid") }</td>
			<td>${f.get("gmtwomoney") }</td>
			<td>${f.get("fund") }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>