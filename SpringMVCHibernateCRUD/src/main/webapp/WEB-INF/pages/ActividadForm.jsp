<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulario</title>
</head>
<body>
    <div align="center">
        <h1>Actividad</h1>
        <form:form action="guardarActividad" method="post" modelAttribute="actividad">
        <table>
            <form:hidden path="codigoActividad"/>
            <tr>
                <td>Nombre:</td>
                <td><form:input path="nombre" /></td>
            </tr>
            
            <tr>
                <td>Descripcion:</td>
                <td><form:input path="descripcion" /></td>
            </tr>
            <tr>
                <td>Fecha:</td>
                <td><form:input path="fecha" /></td>
            </tr>
              
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Guardar"></td>
            </tr>
            <tr>
               <a href="">Volver</a>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>