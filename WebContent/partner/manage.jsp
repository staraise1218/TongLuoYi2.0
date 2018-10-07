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
		<td>合伙人类型</td>
		<td>合伙人级别</td>
		<td>钱包余额</td>
		<td>设备信息</td>
		<td>一级上线</td>
		<td>二级上线</td>
		<td>一级下线</td>
		<td>二级下线</td>
		<td>店铺管理员</td>
	</tr>
	<c:forEach items="${list }" var="p">
		<tr>
			<td>${p.get("wxid") }</td>
			<td>${p.get("nickname") }</td>
			<td>${p.get("name") }</td>
			<td>${p.get("sex") }</td>
			<td>${p.get("date") }</td>
			<td>${p.get("phonenum") }</td>
			<td>${p.get("city") }</td>
			<td>${p.get("form") }</td>
			<td>${p.get("plid") }</td>
			<td><a href="<%=path%>/finance/selectbyfinance?wxid=${p.get('wxid') }">${p.get("money") }</a></td>
			<td><a href="<%=path%>/partnerequipment/selectByPe?pid=${p.get('pid') }">设备</a></td>
			<td><a href="<%=path%>/member/onone?wxid=${p.get('wxid') }">一级上线</a></td>
			<td><a href="<%=path%>/member/ontwo?wxid=${p.get('wxid') }">二级上线</a></td>
			<td><a href="<%=path%>/member/upone?wxid=${p.get('wxid') }">一级下线</a></td>
			<td><a href="<%=path%>/member/uptwo?wxid=${p.get('wxid') }">二级下线</a></td>
			<td><a href="<%=path%>/administrator/selectByA?pid=${p.get('pid') }">店铺管理员</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>