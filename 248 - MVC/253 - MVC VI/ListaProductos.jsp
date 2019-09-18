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
		<table>
			<tr>
				<td>Código Artículo</td>
				<td>Sección</td>
				<td>Nombre Artículo</td>
				<td>Fecha</td>
				<td>Precio</td>
				<td>Importado</td>
				<td>País de Origen</td>
			</tr>
			<% for(Productos tempProd : losProductos){ %>
				<tr>
					<td>
						<%= tempProd.getcArt() %>
					</td>
					<td>
						<%= tempProd.getSeccion() %>
					</td>
					<td>
						<%= tempProd.getnArt() %>
					</td>
					<td>
						<%= tempProd.getFecha() %>
					</td>
					<td>
						<%= tempProd.getPrecio() %>
					</td>
					<td>
						<%= tempProd.getImportado() %>
					</td>
					<td>
						<%= tempProd.getpOrig() %>
					</td>
				</tr>
			<% } %>
		</table>
	</body>
</html>