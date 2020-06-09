<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="http://localhost:8080/new_ssm/user/selectById">查询用户</a>
	
	<a href="http://localhost:8080/new_ssm/user/insertByUser">添加用户</a>
	
	<a href="http://localhost:8080/new_ssm/user/deleteById">删除用户</a>
	
	<a href="http://localhost:8080/new_ssm/user/updateByUser">更新用户</a>
	
	<br>
	<c:if test="${user!=null}">
	 	id = ${user.id} 
		username = ${user.username }
		password = ${user.password }
		phone = ${user.phone }
		address = ${user.address }
		email = ${user.email }
		c_id = ${user.c_id }
	</c:if>
		

	${info}
	
	
</body>
</html>