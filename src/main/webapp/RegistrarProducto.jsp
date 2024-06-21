<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="#c5dec9">
<h1 align="center">
Registrar Producto
</h1>
<form action="ControladorProducto" method="post">
<table align="center">
<tr>
<td>nombre</td>
<td><input type="text" name="nombrecl2"></td>
</tr>
<tr>
<td>Precio</td>
<td><input type="text" name="preciocompcl2"></td>
</tr>
<tr>
<td>PrecioVen</td>
<td><input type="text" name="precioventacl2"></td>
</tr>
<tr>
<td>Estado</td>
<td><input type="text" name="estadocl2"></td>
</tr>
<tr>
<td>Descrip</td>
<td><input type="text" name="descripcl2"></td>
</tr>
<tr>
<td colspan="2" style="text-align:center">
<input type="submit"  value="Registrar">

</td>
</tr>
</table>

</form>
</body>
</html>