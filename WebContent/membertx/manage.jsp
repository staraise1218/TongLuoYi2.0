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
<title>设备管理</title>
</head>
<body>
<table border="1" cellspacing=0 cellpadding=0>
	<tr>
		<td>申请提现时间</td>
		<td>提现人微信id</td>
		<td>账户余额</td>
		<td>申请提现金额</td>
		<td>税率%</td>
		<td>代扣税额</td>
		<td>实际到账金额</td>
		<td>凭证号码</td>
	</tr>
	<c:forEach items="${list }" var="m">
		<tr>
			<td>${m.get("time") }</td>
			<td>${m.get("wxid") }</td>
			<td>${m.get("mwmoney") }</td>
			<td>${m.get("memoney") }</td>
			<td>${m.get("sl") }</td>
			<td>${m.get("dkse") }</td>
			<td>${m.get("sjmoney") }</td>
			<td>${m.get("num") }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>