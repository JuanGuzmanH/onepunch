<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Versus</title>
<jsp:include page="plantillas/declarations.jsp"></jsp:include>
<script>
<!--Funci�n para darle formato a la Tabla-->
	$(document).ready(function() {
		$('#myTable').DataTable();
		responsive = True;
	});
</script>
<style>
.texto {
	position: center;
	padding-left: 630px;
	padding-top: 50px;
	font-size: 42;
	padding-bottom: 50px;
}
</style>
</head>
<body>
	<jsp:include page="plantillas/menu.jsp"></jsp:include>
	<div class="texto">
		<table>
			<thead>
				<tr>
				<c:forEach items="${re }" var="res">
						<th>${res.nombre }</th>
					</c:forEach>
				<c:forEach items="${h }" var="he">
						<th>${he.nombre }</th>
					</c:forEach>
				</tr>
			</thead>
		</table>
	</div>
	<jsp:include page="plantillas/footer.jsp"></jsp:include>
</body>
</html>