<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<!-- Bootstrap core CSS -->
	    <link href="css/bootstrap.min.css" rel="stylesheet" >
	    <!-- Bootstrap theme -->
	    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
	</head>
	<body>
		<div class = "container">
			<h1>Obtener Planes</h1>
		</div>
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
		<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
		<p>presupuesto ${presupuesto} destino ${destino}</p>
		<script type="text/javascript">
			function redireccionar()
			{
			var presupuesto = document.getElementById("presupuesto").value;
			var destino = document.getElementById("destino").value;
				if(presupuesto == null || presupuesto == 0){
					alert('Para continuar complete los campos');
				}
				else{
					var url = "obtenerPlanes/"+presupuesto+"/"+destino;
					console.log(url);
					location.href= url;
				}
			}
		</script>
	
	</body>
</html>