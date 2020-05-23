<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<jsp:include page="plantillas/declarations.jsp"></jsp:include>
<script>
<!--Funci�n para darle formato a la Tabla-->
	$(document).ready(function() {
		$('#myTable').DataTable();
		responsive = True;
	});
</script>
</head>
<body>
<jsp:include page="plantillas/menu.jsp"></jsp:include>
	<table border="1" id="myTable">
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Direcci&oacute;n</th>
				<th>C&eacute;dula</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${estudiantes }" var="estudiante">
				<tr>
					<td>${estudiante.nombre }</td>
					<td>${estudiante.apellido }</td>
					<td>${estudiante.direccion }</td>
					<td>${estudiante.cedula }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
<jsp:include page="plantillas/footer.jsp"></jsp:include>
</body>
</html>