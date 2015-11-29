<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
// 	var jump = setTimeout(function(){
// 		window.location.href = "sample!toIndex";
// 	},3000);
</script>
</head>
<body>
	这里可以主页哦!
	<form action="<%=request.getContextPath()%>/uploadAction.action"
		method="post" enctype="multipart/form-data">
		
		username:<input type="text" name="username"><br/>
		
		<input type="file" name="uploadFile"><br/><br/>
		<input type="submit" value="submit">

	</form>
</body>
</html>