<html>
	<head>
		
	</head>
	<body>
		<h1>Ejemplo de Declaraciones</h1>
		<%! 

			private int resultado;
			
			
			public int metodoSuma(int num1, int num2)
			{
				
				resultado = num1 + num2;
				
				return resultado;
				
			}
			
			public int metodoResta(int num1, int num2)
			{
				
				resultado = num1 - num2;
				
				return resultado;
				
			}
			
			public int metodoMult(int num1, int num2)
			{
				
				resultado = num1 * num2;
				
				return resultado;
				
			}

		%>
		
		Los resultados son: <%=
		
		
			metodoSuma(7,5);
			
			metodoResta(7,5);
			
			metodoMult(7,5);
		
		%>
		
	</body>
</html>