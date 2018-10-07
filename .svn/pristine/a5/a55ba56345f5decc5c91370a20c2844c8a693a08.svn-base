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
		<td>合伙人ID</td>
		<td>单台押金</td>
		<td>一级上线微信ID</td>
		<td>二级上线微信ID</td>
	</tr>
	<c:forEach items="${list }" var="f">
		<tr>
			<td>${f.get("type") }</td>
			<td>${f.get("number") }</td>
			<td>${f.get("name") }</td>
			<td>${f.get("wxid") }</td>
			<td>${f.get("cashpledge") }</td>
			<td>${f.get("onewxid") }</td>
			<td>${f.get("twowxid") }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>