<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.koreait.board.BoardVO" %>        
<% 
	String no = request.getParameter("no");
	BoardVO vo = (BoardVO) request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
	<h1>디테일 <%=no %></h1>	
	<div><%=request.getParameter("no") %></div>	
	<div>제목 : <%=vo.getTitle() %> </div>
	<div><%=vo.getCtnt() %></div>
</body>
</html>



