<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%

	String alumnos[] = ["Marc","Alex"];
	
	pageContext.setAttribute("losAlumnos",alumnos);

%>

<html>
	<head>
		<title>JSP</title>
	</head>
	<body>
	
		<%
		
			/* for(String tempAlumnos : alumnos)
			{
				
				out.println(tempAlumnos + "<br>");
				
			} */
			
			
		
		%>
		
		<c:forEach var="tempAlumnos" items="${losAlumnos}">
		
			${losAlumnos} <br>
		
		</c:forEach>
	
	</body>
</html>