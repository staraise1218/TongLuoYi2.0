<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
    %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出入库明细</title>
</head>
<body>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>设备二维码</td>
			<td>设备编号</td>
			<td>入库时间</td>
			<td>设备来源</td>
			<td>出库时间</td>
			<td>绑定合伙人</td>
			<td>合伙人手机号</td>
			<td>使用形式</td>
			<td>平台价格</td>
		</tr>
		<c:forEach items="${list }" var="e">
			<tr>
				<td><img width="100px" height="100px" src="<%=path %>/icon?img=${e.number}"></td>
				<td>${e.get("number") }</td>
				<td>${e.get("entrytime") }</td>
				<td>${e.get("source") }</td>
				<td>${e.get("outtime") }</td>
				<td>${e.get("name") }</td>
				<td>${e.get("phonenum") }</td>
				<td>${e.get("form") }</td>
				<td>${e.get("platformprice") }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>