<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>三峡八家羽毛球组</title>
</head>
<body>

<s:form action="login">
 
  <s:textfield name="userNo" label="用户名" />
  <s:password name="pwd" label="密码" />
     
  <s:submit value="登录" />
 
</s:form>

</body>
</html>