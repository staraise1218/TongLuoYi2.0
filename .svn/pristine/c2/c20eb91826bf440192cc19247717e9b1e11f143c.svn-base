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
<script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		//全选
		$("#del").click(function(){
			if(this.checked){
				$("[id^='del_']").prop("checked","true");
			}else{
				$("[id^='del_']").removeAttr("checked");
			}
		});		
		//批量删除
		$("#delete").click(function(){
			var arr = [];
			$("[id^= 'del_']").each(function(){
				if(this.checked == true){
					var ids = this.id.split("_")[1];
					arr.push(ids);
				}
			});
			if(!arr.length > 0){
				alert("请选择你要删除的设备");
				return false;
			}
			$.ajax({
				type:"post",
				url:"<%=path %>/equipmentsublist/deletepro",
				data:{
					arr:arr
				},
				dataType:"json",
				traditional:true,
				success:function(result){
					location.reload();
					if(result == '1'){
						alert("删除失败！");
					}
				}
			});
		});
	});
</script>
</head>
<body>
<form action="<%=path %>/equipmentsublist/selectByProduct" method="post">
	<table>
		<tr>
			<td>设备编号<input type="text" id="number" name="number" value="${number }"></td>
			<td><input type="submit" id="sub" value="查询"></td>
			<td><input type="button" id="delete" value="删除"></td>
		</tr>
	</table>
	<table border="1" cellspacing=0 cellpadding=0>
		<tr>
			<td><input type="checkbox" id="del"></td>
			<td>设备型号</td>
			<td>设备编号</td>
			<td>库存状态</td>
			<td>合伙人</td>
			<td>手机号</td>
			<td>形式</td>
			<td>设备状态</td>
			<td>二维码</td>
			<td>修改</td>
			<td>入库出库明细</td>
		</tr>
		<c:forEach items="${list }" var="e">
			<tr>
				<c:if test="${e.name eq null }">
					<td><input type="checkbox" id="del_${e.id }"></td>
				</c:if>
				<c:if test="${e.name ne null }">
					<td></td>
				</c:if>
				<td>${e.type }</td>
				<td>${e.number }</td>
				<td>${e.status }</td>
				<td>${e.name }</td>
				<td>${e.phonenum }</td>
				<td>${e.form }</td>
				<td>${e.pestatus }</td>
				<td><img width="100px" height="100px" src="<%=path %>/icon?img=${e.number}"></td>
				<td><a href="<%=path%>/equipmentsublist/update.jsp?id=${e.id}&number=${e.number}">修改</a></td>
				<td><a href="<%=path%>/equipmentinoutstorage/selectByNumber?number=${e.number}">入库出库明细</a></td>
			</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>