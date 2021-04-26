<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.koreait.board.*" %>
<%
	List<BoardVO> list = (List<BoardVO>) request.getAttribute("list");
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<style>
	table, th, td {
		border: 1px solid black;
		border-collapse: collapse;
	}
</style>
</head>
<body>
	<h1>리스트</h1>
	<div>
		<a href="/write">글쓰기</a>
	</div>
	<div>
		<table>
			<tr>
				<th>no</th>
				<th>제목</th>
			</tr>	
			
		<% for(int i=0; i<list.size(); i++) { %>
		<%		BoardVO vo = list.get(i);	  %>
		
				<tr>
					<td><%=i %></td>
					<td>
						<a href="/detail?no=<%=i %>"><%=vo.getTitle() %></a>
					</td>
				</tr>
		<% } %>
		</table>
	</div>
</body>
</html>