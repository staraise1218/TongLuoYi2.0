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
		<td>微信ID</td>
		<td>昵称</td>
		<td>姓名</td>
		<td>性别</td>
		<td>出生日期</td>
		<td>手机号码</td>
		<td>所在城市</td>
		<td>钱包余额</td>
		<td>积分</td>
		<td>使用次数</td>
		<td>一级上线</td>
		<td>二级上线</td>
		<td>一级下线</td>
		<td>二级下线</td>
	</tr>
	<c:forEach items="${list }" var="m">
		<tr>
			<td>${m.get("wxid") }</td>
			<td>${m.get("nickname") }</td>
			<td>${m.get("name") }</td>
			<td>${m.get("sex") }</td>
			<td>${m.get("date") }</td>
			<td>${m.get("phonenum") }</td>
			<td>${m.get("city") }</td>
			<td><a href="<%=path%>/finance/selectbyfinance?wxid=${m.get('wxid') }">${m.get("money") }</a></td>
			<td><a href="<%=path%>/integral/selectByIntegral?wxid=${m.get('wxid') }">${m.get("sum") }</a></td>
			<td><a href="<%=path%>/userstatistics/selectbyus?mid=${m.get('mid') }">${m.get("num") }</a></td>
			<td><a href="<%=path%>/member/onone?wxid=${m.get('wxid') }">一级上线</a></td>
			<td><a href="<%=path%>/member/ontwo?wxid=${m.get('wxid') }">二级上线</a></td>
			<td><a href="<%=path%>/member/upone?wxid=${m.get('wxid') }">一级下线</a></td>
			<td><a href="<%=path%>/member/uptwo?wxid=${m.get('wxid') }">二级下线</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>