<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page import="java.util.*, com.pildoras.productos.*"%>
<html>
	<head>
	
	</head>
	<body>
		<%
		
			List<Productos> losProductos = (List<Productos>) request.getAttribute("LISTAPRODUCTOS");
		
		%>
		
		<%=
		
			losProductos
		
		%>
	</body>
</html>