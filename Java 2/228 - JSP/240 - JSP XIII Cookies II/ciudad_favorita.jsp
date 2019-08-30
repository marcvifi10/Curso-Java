<html>
	<head>
		<title>JSP</title>
		<meta charset="utf8">
	</head>
	<body>
		<%
		
			// Leyendo datos del formulario
		
			String ciudad_favorita = request.getParameter("ciudad_favorita");
		
			// Crear la cookie
			
			Cookie laCookie = new Cookie("agencia_viajes.ciudad_favorita",ciudad_favorita,);
		
			// Vida de la cookie = 1 año
			
			laCookie.setMaxAge(365*25*60*60); 
			
			// Enviar al usuario
			
			response.addCookie(laCookie);
		
		%>
		
		Gracias por enviar tus preferencias
		
		<a href="agencia_viajes.jsp">Ir a la agencia de viajes</a>
		
	</body>
</html>