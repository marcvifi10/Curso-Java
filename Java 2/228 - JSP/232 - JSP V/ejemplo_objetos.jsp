<html>
	<body>
		<h2>Objetos predefinidos JSP</h2>
		
		Petición datos del servidor: <%= request.getHeader("User-Agent") %>
	
		<br><br>
		
		Petición idioma utilizado: <%= request.getLocale() %>
	<body>
</html>