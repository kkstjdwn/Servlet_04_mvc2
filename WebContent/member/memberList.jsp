<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String msg = (String)request.getAttribute("msg");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>m-l</title>
</head>
<body>
	<h1>member List</h1>
	<h1><%=msg %></h1>
</body>
</html>