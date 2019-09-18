<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1" %>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<html>
	<head>
		<title>JSP</title>
	</head>
	<body>
	
		<c:forEach var="tempProductos" items="$(lista_productos)">
		
			${tempProductos}<br>
		
		</c:forEach>
	
	</body>
</html>