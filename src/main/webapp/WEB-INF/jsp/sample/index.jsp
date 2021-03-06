<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表</title>
</head>
<body>
	<div style="margin: 0px auto;width:800px;">
		<h2 style="text-align:center;">列表页面</h2>
		<a href="<%=request.getContextPath()%>/sample!toAdd">增加</a>
		<a href="<%=request.getContextPath()%>/sample!exportExcel">导出Excel</a>
		<form action="<%=request.getContextPath()%>/sample!toIndex" method="post" id="form">
			<input type="hidden" name="curPage" id="cur_page">
			<fieldset style="margin-bottom: 10px;">
				<legend>查询</legend>
				编号：<input type="text" name="id">
				名字：<input type="text" name="name">
				<input type="submit" value="查询">
			</fieldset>
			<table border="1" bordercolor="#ccc" cellspacing="0" cellpadding="10" width="100%">
				<thead>
					<tr>
						<th>编号</th>
						<th>姓名</th>
						<th>年龄</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="sample">
						<tr>
							<td>
								${sample.id}
							</td>
							<td>
								${sample.name}
							</td>
							<td>
								${sample.age}
							</td>
							<td>
								<a href="javascript:void();" onclick="del('${sample.id}')">Delete</a>
								<a href="<%=request.getContextPath()%>/sample!toUpdate?model.id=${sample.id}">Update</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="4" style="text-align: center;">
							<c:set var="searchForm" value="form" scope="request"></c:set>
							<c:import url="/WEB-INF/common/jsp/pages.jsp"></c:import>
						</td>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
</body>
<script type="text/javascript">
	function del(id){
		if(confirm("are you sure to delete it ?")){
			window.location.href="<%=request.getContextPath()%>/sample!del?model.id="+id;
		}
	}
</script>
</html>