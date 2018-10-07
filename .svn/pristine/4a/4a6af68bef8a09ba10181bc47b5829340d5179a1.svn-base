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
<form action="<%=path%>/partner/insert" method="post">
	<table>
		<tr>
			<td>会员</td>
			<td>
				<select id="wxid" name="wxid">
					<option value="">请选择</option>
					<c:forEach items="${list }" var="m">
						<option value="${m.wxid }">${m.name }--${m.wxid }</option>
					</c:forEach>
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