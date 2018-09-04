<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	String str = (String) request.getAttribute("str");
%>

</head>
<body>
	ㅎㅇ result : "<%=str%>"
	<br> 
	<br>


	<c:forEach var="result" items="${resultList}" varStatus="status">
		<tr>
			<td align="center" class="listtd">  <c:out value="${result.id}" /></td>
			<td align="center" class="listtd"> 	<c:out value="${result.name}" />&nbsp;</>
			<td align="center" class="listtd"> 	<c:out value="${result.phone}" />&nbsp;</td>
			<td align="center" class="listtd">	<c:out value="${result.address}" />&nbsp;</td>
		</tr><br>
	</c:forEach>
</body>
</html>