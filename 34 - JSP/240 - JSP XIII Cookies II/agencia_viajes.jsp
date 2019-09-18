<html>
	<head>
	
	</head>
	<body>
		<h1>Agencia de viajes</h1>
		<%
		
			// Valor por defecto
			
			String ciudad_favorita = "Madrid";
			
			// Lee la cookie de la peticion del navegador
			
			Cookie[] lasCookies = request.getCookies();
			
			// Buscar las preferencias. La ciudad favorita
			
			if(lasCookies != null)
			{
				
				for(Cookie cookie_temporal : lasCookies)
				{
					
					if("agencia_viajes.ciudad_favorita".equals(cookie_temporal.getName()))
					{
						
						ciudad_favorita = cookie_temporal.getValue();
						
						break;
						
					}
					
				}
				
			}
		
		%>
		<h3>Vuelos a <%= ciudad_favorita %></h3>
		<p>Texto de ejemplo</p>
		<p>Texto de ejemplo</p>
		<p>Texto de ejemplo</p>
		<p>Texto de ejemplo</p>
		<p>Texto de ejemplo</p>
		
		<h3>Hoteles en <%= ciudad_favorita %></h3>
		<p>Texto de ejemplo</p>
		<p>Texto de ejemplo</p>
		<p>Texto de ejemplo</p>
		<p>Texto de ejemplo</p>
		<p>Texto de ejemplo</p>
		
		<h3>Descuentos en restaurantes de <%= ciudad_favorita %></h3>
		<p>Texto de ejemplo</p>
		<p>Texto de ejemplo</p>
		<p>Texto de ejemplo</p>
		<p>Texto de ejemplo</p>
		<p>Texto de ejemplo</p>
	</body>
</html>