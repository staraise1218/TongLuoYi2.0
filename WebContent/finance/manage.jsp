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
		<td>会员级别</td>
		<td>合伙人级别</td>
		<td>收入累计金额(元)</td>
		<td>消费一级下线</td>
		<td>消费二级下线</td>
		<td>租用一级下线</td>
		<td>租用二级下线</td>
		<td>购买一级下线</td>
		<td>购买二级下线</td>
		<td>已提现金额</td>
		<td>钱包余额</td>
	</tr>
	<c:forEach items="${list }" var="f">
		<tr>
			<td>${f.get("level") }</td>
			<td>${f.get("identity") }</td>
			<td>${f.get("sr") }</td>
			<td><a href="<%=path%>/finance/selectByUp?str=xfonewxid">${f.get("xfone") }</a></td>
			<td><a href="<%=path%>/finance/selectByUp?str=xftwowxid">${f.get("xftwo") }</a></td>
			<td><a href="<%=path%>/finance/selectByUp?str=zyonewxid">${f.get("zyone") }</a></td>
			<td><a href="<%=path%>/finance/selectByUp?str=zytwowxid">${f.get("zytwo") }</a></td>
			<td><a href="<%=path%>/finance/selectByUp?str=gmonewxid">${f.get("gmone") }</a></td>
			<td><a href="<%=path%>/finance/selectByUp?str=gmtwowxid">${f.get("gmtwo") }</a></td>
			<td>${f.get("tx") }</td>
			<td>${f.get("ye") }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>