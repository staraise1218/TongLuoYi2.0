<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
<script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#but").click(function(){
		$.ajax({
			type:"post",
			url:"<%=path%>/fund/insert",
			data:{
				type:$("#type").val(),
				money:$("#money").val()
			},
			dataType:"json",
			success:function(result){
				if(result == '1'){
					alert("余额不足！");
				}
				location.reload();
			}
		});
	});
});
</script>
</head>
<body>
<form action="<%=path%>/fund/insert" method="post">
	<table>
		<tr>
			<td>类型</td>
			<td>
				<select id="type" name="type">
					<option value="1">公积金</option>
					<option value="2">维修积金</option>
					<option value="3">运维积金</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>支出金额</td>
			<td><input type="text" id="money" name="money"></td>
		</tr>
		<tr>
			<td><input type="button" id="but" value="提交"></td>
		</tr>
	</table>
</form>
</body>
</html>