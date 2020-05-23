<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>El Bisio</title>
<jsp:include page="plantillas/declarations.jsp"></jsp:include>
<script>
<!--Función para darle formato a la Tabla-->
	$(document).ready(function() {
		$('#myTable').DataTable();
		responsive = True;
	});
</script>
<style>
.juego {
	padding: 50px;
}

</style>
</head>
<body>
<jsp:include page="plantillas/menu.jsp"></jsp:include>
	<div class="juego" align="center">
		<iframe width="560" height="315"
			allow="fullscreen; autoplay; encrypted-media"
			src="https://games.construct.net/3404/latest" frameborder="0"
			allowfullscreen="true" msallowfullscreen="true"
			mozallowfullscreen="true" webkitallowfullscreen="true"
			allowpaymentrequest="false" referrerpolicy="unsafe-url"
			sandbox="allow-same-origin allow-forms allow-scripts allow-pointer-lock allow-orientation-lock allow-popups"
			scrolling="no"></iframe>
	</div>
	<jsp:include page="plantillas/footer.jsp"></jsp:include>
</body>
</html>