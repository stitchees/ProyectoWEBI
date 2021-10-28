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
			<h1>Bienvenidos a Taller Web 1</h1>
		</div>
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
		<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
		<h1>Mostrar Paquetes</h1>
		<div class="card">

			  <div class="form-group">
			    <label for="exampleInputEmail1">Presupuesto</label>
			    <input type="text" class="form-control" id="presupuesto">
			    <small id="emailHelp" class="form-text text-muted" >Ingrese el presupuesto maximo que desea invertir</small>
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Destino</label>
			    <input type="text" class="form-control" id="destino">
			  </div>
			  <button class="btn btn-primary" onClick="redireccionar()">Buscar</button>
			  <button class="btn btn-primary" onClick="redireccionarDestino()">Buscar por Destino</button>

		</div>
		<h1>Armar Paquete</h1>
		
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
			function redireccionarDestino()
			{
				var url = "homeDestino/";
				console.log(url);
				location.href= url;
			}
		</script>
	
	</body>
</html>