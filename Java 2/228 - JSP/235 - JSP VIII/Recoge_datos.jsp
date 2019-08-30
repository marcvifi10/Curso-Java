<html>
	<body>
		<%@
		
		page import="java.sql.*"
		
		%>
		<%
		
			String nombre = request.getParameter("nombre");
			
			String apellido = request.getParameter("apellido");
			
			String usuario = request.getParameter("usuario");
			
			String contra = request.getParameter("contra");
			
			String pais = request.getParameter("pais");
			
			String tecno = request.getParameter("tecno");

			Class.forName("com.mysql.jdbc.Driver");

			try
			{
				
				Connection miConexion = DriverManager.getConnection("jdbc:mysql//localhost:3306/proves","root","");
		
				Statement miStatement = miConexion.createStatement();
			
				String instruccionSQL = "INSERT INTO usuarios(Nombre,Apellido,Usuario,Contrasena,Pais,Tecnologia) VALUES('nombre','apellido','usuario','contra','pais','tecno')";
		
				miStatement.executeUpdate(instruccionSQL);
			
				out.println("Registrado con éxito!!!");
			
			}
			
			catch(Exception e)
			{
				
				out.println("ERROR!!!");
				
			}
		
		%>
	</body>
</html>