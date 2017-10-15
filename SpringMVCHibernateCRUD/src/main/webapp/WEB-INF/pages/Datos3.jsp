<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Actividad</title>
</head>
<body>
	<div align="center">
		<h1>Lista de Actividad</h1>
		
		<table border="1">

			<th>Nombre</th>
			<th>Descripcion</th>
			<th>Fecha</th>
			<th>Accion</th>

			<c:forEach var="actividad" items="${listActividad}">
				<tr>

					<td>${actividad.nombre}</td>
					<td>${actividad.descripcion}</td>
					<td>${actividad.fecha}</td>
					<td><a href="editarActividad?codigoActividad=${actividad.codigoActividad}">Editar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="borrarActividad?codigoActividad=${actividad.codigoActividad}">Borrar</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			Inicio <a href="">Ir</a>
		</h4>
	</div>
</body>
</html>