<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Encargado</title>
</head>
<body>
	<div align="center">
		<h1>Lista de Encargados</h1>
		
		<table border="1">

			<th>Nombre</th>
			<th>Rut</th>
			<th>Apellido</th>
			<th>Fecha Ingreso</th>
			<th>Monto</th>
			<th>Curso:</th>
			<th>Accion</th>

			<c:forEach var="encargado" items="${listEncargado}">
				<tr>

					<td>${encargado.nombre}</td>
					<td>${encargado.rut}-${encargado.dv}</td>
					<td>${encargado.apellido}</td>
					<td>${encargado.fechaIngreso}</td>
					<td>$${encargado.monto}</td>
					<td>${encargado.curso}</td>
					<td><a href="editarEncargado?codigoEncargado=${encargado.codigoEncargado}">Editar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="borrarEncargado?codigoEncargado=${encargado.codigoEncargado}">Borrar</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			Inicio <a href="">Ir</a>
		</h4>
	</div>
</body>
</html>