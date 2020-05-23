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
<style>
#carouselExampleControls{
	width: 50%;
	margin-left: auto;
	margin-right: auto;
}

#table{
	width: 40%;
	margin-left: auto;
	margin-right: auto;
}


</style>



<script>
<!--Función para darle formato a la Tabla-->
	$(document).ready(function() {
		$('#myTable').DataTable();
		responsive = True;
	});
</script>

</head>
<body>
<jsp:include page="plantillas/menu.jsp"></jsp:include>

	<div id="carouselExampleControls" class="carousel slide" data-ride="carousel" >
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="https://www.infobae.com/new-resizer/riAZWezSupOg6WKoPizxqILvhDY=/750x0/filters:quality(100)/arc-anglerfish-arc2-prod-infobae.s3.amazonaws.com/public/YYS55ENAV5AIVFW3W3MLV6GINY.bmp" alt="First slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="https://www.xgn.nl/images/articles/2019/201908/_970x545_crop_center-center_82_line/personajes-de-one-punch-man-a-hero-nobody-knows-roster-completo-153296.jpg" alt="Second slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="https://areajugones.sport.es/wp-content/uploads/2020/01/genos-one-punch-man.jpg" alt="Third slide">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<br>
	
<jsp:include page="plantillas/footer.jsp"></jsp:include>
</body>
</html>