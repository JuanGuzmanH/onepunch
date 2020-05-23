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

<form action="guardar" method="post" enctype="multipart/form-data">
	<jsp:include page="plantillas/menu.jsp"></jsp:include>
	<table border="1" id="myTable">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Telefono</th>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach items="${estudiantes }" var="estudiante">
				<tr>
					<td>${estudiante.id }</td>
					<td>${estudiante.nombre }</td>
					<td>${estudiante.apellido }</td>
					<td>${estudiante.telefono }</td>
				</tr>
			</c:forEach>
			<tr>
				<td><div class="form-group">
						<label for="exampleInputText1">id</label> <input type="number"
							class="form-control" id="id" name="id" placeholder="id" required>
					</div></td>
				<td><div class="form-group">
						<label for="exampleInputText1">Nombre</label> <input type="text"
							class="form-control" id="nombre" name="nombre" placeholder="Nombre" required>
					</div></td>
				<td><div class="form-group">
						<label for="exampleInputText1">Apellido</label> <input type="text"
							class="form-control" id="apellido" name="apellido" placeholder="Apellido" required>
					</div></td>
				<td><div class="form-group">
						<label for="exampleInputText1">Telefono</label> <input type="number"
							class="form-control" id="telefono" name="telefono" placeholder="Telefono" required>
					</div></td>

			</tr>
				
		</tbody>
	</table>
	<button type="submit" class="btn btn-primary">Guardar</button>
	</form>
	<jsp:include page="plantillas/footer.jsp"></jsp:include>
</body>
</html>