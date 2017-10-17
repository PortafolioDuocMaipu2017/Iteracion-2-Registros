<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Apoderados</title>
</head>
<body>
	<div align="center">
		<h1>Lista de Apoderados</h1>
		
		<table border="1">

			<th>Nombre</th>
			<th>Apellido</th>
			<th>Fecha Ingreso</th>
			<th>Monto</th>
			<th>Rut de Alumno a Cargo:</th>
			<th>Accion</th>

			<c:forEach var="apoderado" items="${listApoderado}">
				<tr>

					<td>${apoderado.nombre}</td>
					<td>${apoderado.apellido}</td>
					<td>${apoderado.fechaIngreso}</td>
					<td>${apoderado.monto}</td>
					<td>${apoderado.rutAlCargo}-${apoderado.dv}</td>
					<td><a href="editarApoderado?codigoApoderado=${apoderado.codigoApoderado}">Editar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="borrarApoderado?codigoApoderado=${apoderado.codigoApoderado}">Borrar</a>
						&nbsp;&nbsp;&nbsp;&nbsp;<a
						href="montoApoderado?codigoApoderado=${apoderado.codigoApoderado}">Agregar Monto</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			Inicio <a href="">Ir</a>
		</h4>
	</div>
</body>
</html>