<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<form action="<%=path%>/partnerequipment/insert" method="post">
	<table>
		<tr>
			<td>合伙人</td>
			<td>
				<select id="pid" name="pid">
					<option value="">请选择</option>
					<c:forEach items="${pl }" var="p">
						<option value="${p.id }">${p.name }--${p.wxid }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>产品</td>
			<td>
				<select id="eid" name="eid">
					<option value="">请选择</option>
					<c:forEach items="${esl }" var="es">
						<option value="${es.id }">${es.number }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>类型</td>
			<td>
				<select id="form" name="form">
					<option value="">请选择</option>
					<option value="1">租用</option>
					<option value="2">购买</option>
				</select>
			</td>
		</tr>
		<tr>
			<td><input type="submit" value="提交"></td>
		</tr>
	</table>
</form>
</body>
</html>