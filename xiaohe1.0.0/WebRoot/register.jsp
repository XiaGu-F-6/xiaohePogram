<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <title>用户注册</title>  
  </head>
  
  <body>  
    <form action="${pageContext.request.contextPath }/user/addUser.action" method = "post">  
        <table border="1"> 
         	<tr>  
                <td>id</td>  
                <td><input type="text" name="id" value="${user.userId}"></td>  
            </tr> 
            <tr>  
                <td>用户名</td>  
                <td><input type="text" name="username" value="${user.username}"></td>  
            </tr>  
            <tr>  
                <td>密码</td>  
                <td><input type="password" name="password" value="${user.password}"></td>  
            </tr>
            <tr>  
                <td>姓名</td>  
                <td><input type="text" name="name" value="${user.name}"></td>  
            </tr>
            <tr>  
                <td>性别</td>  
                <td><input type="text" name="sex" value="${user.sex}"></td>  
            </tr>
            <tr>  
                <td>年龄</td>  
                <td><input type="text" name="age" value="${user.age}"></td>  
            </tr>
            <tr>  
                <td>电话号码</td>  
                <td><input type="text" name="phoneNum" value="${user.phoneNum}"></td>  
            </tr>  
            <tr>  
                <td><input type="submit" value="注册"></td>  
            </tr>  
        </table>  
    </form>  
</html>
