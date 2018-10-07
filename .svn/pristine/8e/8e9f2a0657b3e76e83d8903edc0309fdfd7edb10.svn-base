<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改设备</title>
<script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		//将售价和价格进行隐藏
		var type = $("#type").val();
		var value = type.substring(type.length-1,type.length);
		if(value == 'Z'){
			$("#tr1").show();
			$("#tr2").hide();
		}
		if(value == 'X'){
			$("#tr2").show();
			$("#tr1").hide();
		}
		//验证名称是否为空
		$("#name").blur(function(){
			if($("#name").val() == ''){
				alert("设备名称不能为空！");
			}
		});
		//提交表单
		$("#but").click(function(){
			//验证名称是否为空
			if($("#name").val() == ''){
				alert("设备名称不能为空！");
				return false;
			}
			//验证设备型号是否正确
			var type = $("#type").val();
			var val = type.split("-");
			if(val.length != 3){
				alert("设备型号格式不正确！");
				return false;
			}
			//判断是否是大写的英文字母
			var str = /^[A-Z]+$/;
			if((val[0].length != 3 || val[0].length != 4) && !str.test(val[0])){
				alert("设备型号格式不正确！");
				return false;
			}
			var ival = parseInt(val[1]);
			if(val[1].length != 2 || isNaN(ival)){
				alert("设备型号格式不正确！");
				return false;
			}
			if(val[2] != value){
				alert("设备型号格式不正确！");
				return false;
			}
			//验证型号是否存在
			var flag = true;
			$.ajax({
				type:"post",
				url:"<%=path%>/equipment/selectEByTypes",
				data:{
					types:$("#types").val(),
					type:$("#type").val()
				},
				dataType:"json",
				success:function(result){
					if(result == '1'){
						alert("已经存在不可增加！");
						flag = false;
					}else{
						$("#form").submit();
					}
				}
			});
		});
	});
</script>
</head>
<body>
	<form id="form" action="<%=path %>/equipment/update" method="post">
		<table>
			<input type="hidden" id="types" name="types" value="${e.type }">
			<input type="hidden" id="id" name="id" value="${e.id }">
			<tr>
				<td>设备名称</td>
				<td><input type="text" id="name" name="name" value="${e.name }"></td>
			</tr>
			<tr>
				<td>设备型号</td>
				<td><input type="text" id="type" name="type" value="${e.type }"></td>
			</tr>
			<tr id="tr1">
				<td>押金</td>
				<td><input type="text" id="cashpledge" name="cashpledge" value="${e.cashpledge }" onkeyup="this.value=this.value.replace(/[^\d\.]/g,'')"></td>
			</tr>
			<tr id="tr2">
				<td>售价</td>
				<td><input type="text" id="price" name="price" value="${e.price }" onkeyup="this.value=this.value.replace(/[^\d\.]/g,'')"></td>
			</tr>
			<tr>
				<td><input type="button" id="but" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>