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
		<td>设备SN码</td>
		<td>扫码时间</td>
		<td>合伙人ID</td>
		<td>扫码价格</td>
		<td>平台价格</td>
		<td>经营收益</td>
		<td>租用一级上线</td>
		<td>租用一级上线级别</td>
		<td>租用一级上线提成</td>
		<td>租用二级上线</td>
		<td>租用二级上线级别</td>
		<td>租用二级上线提成</td>
		<td>公益金</td>
		<td>扫码会员</td>
		<td>消费一级上线</td>
		<td>消费一级上线提成</td>
		<td>消费二级上线</td>
		<td>消费二级上线提成</td>
		<td>维修基金</td>
		<td>运维基金</td>
	</tr>
	<c:forEach items="${list }" var="f">
		<tr>
			<td>${f.get("number") }</td>
			<td>${f.get("time") }</td>
			<td>${f.get("pid") }</td>
			<td>${f.get("emoney") }</td>
			<td>${f.get("platformincome") }</td>
			<td>${f.get("operatingincome") }</td>
			<td>${f.get("zyonewxid") }</td>
			<td>${f.get("onemlid") }</td>
			<td>${f.get("zyonemoney") }</td>
			<td>${f.get("zytwowxid") }</td>
			<td>${f.get("twomlid") }</td>
			<td>${f.get("zytwomoney") }</td>
			<td>${f.get("fund") }</td>
			<td>${f.get("smwxid") }</td>
			<td>${f.get("xfonewxid") }</td>
			<td>${f.get("xfonemoney") }</td>
			<td>${f.get("xftwowxid") }</td>
			<td>${f.get("xftwomoney") }</td>
			<td>${f.get("wxfund") }</td>
			<td>${f.get("ywfund") }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>