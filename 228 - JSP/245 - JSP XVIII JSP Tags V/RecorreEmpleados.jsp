<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.*, java.sql.*, pildoras.com.jsp.Empleado" %>

<%

	ArrayList<Empleado> datos = ArrayList<>();
	
	Class.forName("com.mysql.jdbc.Driver");
	
	try
	{
		
		Connection miConnexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectp_asp","root","");
		
		Statement miStatement = miConnexion.createStatement();
		
		String sql = "SELECT * FROM empleados";
		
		ResultSet rs = miStatement.executeQuery(sql);
		
		while(rs.next())
		{
			
			datos.add(new Empleado(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDouble4)));
			
		}
		
		rs.close();
		
		miConnexion.close();
		
	}
	catch(Exception e)
	{
		
		out.println("ERROR!!!");
		
	}
	
	pageContext.setAttribute("losEmpleados",datos);

%>

<html>
	<head>
		<title>JSP</title>
	</head>
	<body>
	
		<%
		
			/* for(String tempAlumnos : alumnos)
			{
				
				out.println(tempAlumnos + "<br>");
				
			} */
			
			
		
		%>
		
		<c:forEach var="tempEmpleados" items="${losEmpleados}">
		
			${tempEmpleados.nombre} 
			${tempEmpleados.apellido} 
			${tempEmpleados.puesto} 
			${tempEmpleados.salario} 
			<c:choose>
				<c:when test="${EmpTemp.salario<4000}">
					${EmpTemp.salario+5000} 
				</c:when>
				<c:when test="${EmpTemp.salario>4000 && EmpTemp.salario<=5000}">
					${EmpTemp.salario+5000} 
				</c:when>
			</c:choose>
			<c:set var="datos" value="Marc, Villalobos">
				<c:set var="datosArray" value="${fn:split(datos,',')}">
			</c:set>
			
			<input type="text" value="${datosArray[0]}"><br>
			<input type="text" value="${datosArray[1]}"><br>
			<br>
		
		</c:forEach>
	
	</body>
</html>