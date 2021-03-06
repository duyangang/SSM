<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分页</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	function jumpPage(page){
		var formId = '${searchForm}';
		$('#cur_page').val(page);
		$('#'+formId).submit();
	}
</script>
</head>
<body>
	<a href="javascript:void()" onclick="jumpPage(1)">首页</a>|
	<a href="javascript:void()" onclick="jumpPage('${pageNum - 1}')">上一页</a>
	&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="javascript:void()" onclick="jumpPage('${pageNum + 1}')">下一页</a>|
	<a href="javascript:void()" onclick="jumpPage('${pages}')">末页</a>
</body>
</html>