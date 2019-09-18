<html>

	<body>
	
		<%@
		
		page import="java.sql.*"
		
		%>
		<%
		
			
			String usuario = request.getParameter("usuario");
			
			String contra = request.getParameter("contra");

			Class.forName("com.mysql.jdbc.Driver");

			try
			{
				
				Connection miConexion = DriverManager.getConnection("jdbc:mysql//localhost:3306/proves","root","");
		
				PreparedStatement c_preparada = miConexion.PreparedStatement("SELECT * FROM usuarios WHERE usuario=? AND contrasena=?");
			
				c_preparada.setString(1, usuario);
				
				c_preparada.setString(2, contra);
				
				ResultSet miResultset = c_preparada.executeQuery();
				
				if(miResultset.absolute(1))
				{
					
					out.println("Usuario autorizado!!!");
					
				}
				
				else
				{
					
					out.println("ERROR!!!");
					
				}
			
			}
			
			catch(Exception e)
			{
				
				out.println("ERROR!!!");
				
			}
		
		%>
	
	</body>

</html>