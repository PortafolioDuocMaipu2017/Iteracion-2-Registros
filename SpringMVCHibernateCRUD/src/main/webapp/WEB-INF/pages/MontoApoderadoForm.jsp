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
        <h1>Apoderado</h1>
        <form:form action="guardarMontoApoderado" method="post" modelAttribute="apoderado">
        <table>
            <form:hidden path="codigoApoderado"/>
            <tr>
                <td>Monto:</td>
                <td><form:input path="monto" /></td>
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