<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
    String path = request.getContextPath();
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增产品</title>
<script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#tr1").hide();
		$("#tr2").hide();
		//根据设备名称查出设备型号实现级联操作
		$("#esid").change(function(){
			$.ajax({
				type:"post",
				url:"<%=path%>/equipment/selectEByType",
				data:{
					name:$("#esid").val()
				},
				dataType:"json",
				success:function(result){
					var e = document.getElementById("eid");
					e.length=1;
					$.each(result,function(){
						e.add(new Option(this.type,this.id));
					});
				}
			});
		});
		//判断是租用机型还是销售机型如果是租用机型就显示平台价格
		$("#eid").change(function(){
			var type = $("#eid option:selected").text();
			var value = type.substring(type.length-1,type.length);
			if(value == 'Z'){
				$("#platformprice").val('');
				$("#tr1").show();
				$("#tr2").show();
			}
			if(value == 'X'){
				$("#tr1").hide();
				$("#tr2").hide();
			}
		});
		//提交时进行验证
		$("#but").click(function(){
			if($("#esid").val() == ''){
				alert("请选择设备名称！");
				return false;
			}
			if($("#eid").val() == ''){
				alert("请选择设备型号！");
				return false;
			}
			var type = $("#eid option:selected").text();
			var value = type.substring(type.length-1,type.length);
			if(value == 'Z'){
				if($("#platformprice").val() == ''){
					alert("请输入平台价格！");
					return false;
				}
				var r = /^[0-9]*[1-9][0-9]*$/;
				if(!r.test($("#servicetime").val())){
					alert("使用时长格式不正确！");
					return false;
				}
			}
			if(value == 'X'){
				$("#platformprice").val(0);
			}
			var str = /^[0-9]*[1-9][0-9]*$/;
			if(!str.test($("#pcs").val())){
				alert("数量格式不正确！");
				return false;
			}
			$("#form").submit();
		});
	});
</script>
</head>
<body>
<form action="<%=path%>/equipmentsublist/insertes" method="post" id="form" enctype="multipart/form-data">
	<table>
		<tr>
			<td>设备名称</td>
			<td>
				<select id="esid" name="esid">
					<option value="">请选择</option>
					<c:forEach items="${list }" var="es">
						<option value="${es }">${es }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>设备型号</td>
			<td>
				<select id="eid" name="eid">
					<option value="">请选择</option>
				</select>
			</td>
		</tr>
		<tr id="tr1">
			<td>平台价格</td>
			<td><input type="text" id="platformprice" name="platformprice" onkeyup="this.value=this.value.replace(/[^\d\.]/g,'')"></td>
		</tr>
		<tr id="tr2">
			<td>使用时长</td>
			<td><input type="text" id="servicetime" name="servicetime" ></td>
		</tr>
		<tr>
			<td>数量</td>
			<td><input type="text" id="pcs" name="pcs"></td>
		</tr>
		<tr>
			<td>图片</td>
			<td id="imgWrap"><input type="file" id="files" name="files" onchange="onc()" multiple="multiple"></td>
		</tr>
		<!-- <tr>
			<td></td>
			<td><input id="addBtn" type="button" value="+"></td>
		</tr> -->
		<tr>
			<td><input type="button" value="提交" id="but"></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
function onc(){
	var files = document.getElementById("files").files;
	for(var i=0; i< files.length; i++){
		alert(input.files[i].name);
	}
} 
window.onload=function(){
	var imgWrap=document.getElementById("imgWrap")
	var btn=document.getElementById("addBtn")
	btn.onclick=function(){
		var input=document.createElement("input")
		input.type="file"
		input.name="filename"
		imgWrap.appendChild(input)
	}
}
</script>
</body>
</html>