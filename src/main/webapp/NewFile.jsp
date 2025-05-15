<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="Register2.Reg1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="Register2.user"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
int status=Reg1.register(obj);  
if(status>0)  
out.print("You are successfully registered");  
%>
</body>
</html>