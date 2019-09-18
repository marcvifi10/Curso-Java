<html>
	<head>
	
	</head>
	<body>
		<h1>Actualizar Producto</h1>
		<form name="form1" method="get" action="ControladorProductos">
			<input type="hidden" name="instruccion" value="actualizarBBDD">
			<input type="hidden" name="CArt" value="${ProductoActualizar.cArt}">
			<table>
				<tr>
					<td>Sección</td>
					<input type="text" id="seccion" name="seccion" value="${ProductoActualizar.seccion}">
				</tr>
				<tr>
					<td>Nombre Artículo</td>
					<input type="text" id="n_art" name="n_art" value="${ProductoActualizar.n_art}">
				</tr>
				<tr>
					<td>Fecha</td>
					<input type="text" id="fecha" name="fecha" value="${ProductoActualizar.fecha}">
				</tr>
				<tr>
					<td>Precio</td>
					<input type="text" id="precio" name="precio" value="${ProductoActualizar.precio}">
				</tr>
				<tr>
					<td>Importado</td>
					<input type="text" id="importado" name="importado" value="${ProductoActualizar.importado}">
				<tr>
					<td>País de Origen</td>
					<input type="text" id="p_orig" name="p_orig" value="${ProductoActualizar.p_orig}">
				</tr>
			</table>
			<div id="contenedorBoton">
				<input type="submit" name="envio" id="envio" value="Enviar">
				<input type="reset" name="borrar" id="borrar" value="Borrar">
			</div>
		</form>
	</body>
</html>