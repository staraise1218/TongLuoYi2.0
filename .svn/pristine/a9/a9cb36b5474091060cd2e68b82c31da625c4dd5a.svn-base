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
		<td>设备名称</td>
		<td>设备SN码</td>
		<td>设备地址</td>
		<td>合伙人姓名</td>
		<td>合伙人微信ID</td>
		<td>联系人姓名</td>
		<td>联系人电话</td>
		<td>故障描述</td>
		<td>工程师判断</td>
		<td>维修记录</td>
		<td>维修结果</td>
	</tr>
	<c:forEach items="${list }" var="e">
		<tr>
			<td>${e.get("name") }</td>
			<td>${e.get("number") }</td>
			<td>${e.get("address") }</td>
			<td>${e.get("pname") }</td>
			<td>${e.get("wxid") }</td>
			<td>${e.get("pname") }</td>
			<td>${e.get("phonenum") }</td>
			<td>${e.get("des") }</td>
			<td>${e.get("judge") }</td>
			<td>${e.get("record") }</td>
			<td>${e.get("result") }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>