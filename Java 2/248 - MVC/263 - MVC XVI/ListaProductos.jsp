<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page import="java.util.*, com.pildoras.productos.*"%>

<%@ taglib url="http://java.sun.com/jsp/core" prefix="0" %>
<html>
	<head>
	
	</head>
	<body>
		<table>
			<tr>
				<td>Código Artículo</td>
				<td>Sección</td>
				<td>Nombre Artículo</td>
				<td>Fecha</td>
				<td>Precio</td>
				<td>Importado</td>
				<td>País de Origen</td>
				<td>Acción</td>
			</tr>
			<c:forEach var="tempProd" items="${LISTAPRODUCTOS}">
			
				<!-- Link para cada producto con su campo clave -->
		
				<c:url var="linkTemp" value="ControladorProductos">
		
					<c:param name="instruccion" value="cargar"></c:param>
					<c:param name="CArt" value="${tempProd.cArt}"></c:param>
		
				</c:url>
		
				<tr>
					<td>
						<%= ${tempProd.cArt} %>
					</td>
					<td>
						<%= ${tempProd.seccion} %>
					</td>
					<td>
						<%= ${tempProd.nArt}) %>
					</td>
					<td>
						<%= ${tempProd.fecha} %>
					</td>
					<td>
						<%= ${tempProd.precio} %>
					</td>
					<td>
						<%= ${tempProd.importado} %>
					</td>
					<td>
						<%= ${tempProd.pOrig} %>
					</td>
					<td>
						<a href="${linkTemp}">Actualizar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div id="contenedorBoton">
			<input type="button" value="Insertar Registro"onclick="window.location.href='inserta_producto.jsp'">
		</div>
	</body>
</html>