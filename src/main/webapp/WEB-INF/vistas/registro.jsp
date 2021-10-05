<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Registro</title>

		    <link href="css/estilos.css" rel="stylesheet" type="text/css">
		    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
		    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
	
	</head>
	<body>
	
		<main class="container"> <!-- Clase de Bootstrap. Hace que los elementos no lleguen hasta el borde -->
			
			<c:if test="${not empty mensaje}">
  		<div class="alert alert-warning d-flex align-items-center mt-5 mb-5" role="alert">
  		<svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img" aria-label="Warning:"><use xlink:href="#exclamation-triangle-fill"/></svg>
  			<div>
    		${mensaje}
  			</div>
			</div>
		        </c:if>	
			<div style="display: grid; grid-template-columns: 400px 50px 300px; grid-template-rows: 450px;">
			<div style="grid-column: 1; grid-row: 1;">
			<form:form  action="procesarRegistro" method="POST" modelAttribute="cliente" class="row g-3 border border-3 bg-light">
			<h4>Regístrate ahora</h4>
			<div class="col-dm-12">				    
		    <form:input type="text" class="form-control" id="nombre" path="nombre" placeholder="Nombre"/>
		  </div>
		  <div class="col-dm-12">
		    <form:input type="text" class="form-control" id="apellido" path="apellido" placeholder="Apellido"/>
		  </div>
		  <div class="col-dm-12">
			<form:input type="text" class="form-control" path = "localidad" id="localidad" name="localidad" placeholder="Localidad"/>        
		  </div>
		  <div class="col-dm-12">
		    <form:input type="email" class="form-control" id="email" path="email" placeholder="usuario@ejemplo.com"/>
		  </div>
		  <div class="col-dm-12">		    
		    <form:input type="password" class="form-control" id="password" path="password" placeholder="Contraseña"/>
		  </div>
		  <div class="col-dm-12">		    
		    <input type="password" class="form-control" id="repassword" name="repassword" placeholder="Confirmar contraseña">
		  </div> <br>
		  <div class="col-dm-12">
		    <button type="submit" class="btn btn-outline-dark mb-3">Registrarme</button>		    
		  </div>
  		</form:form>
  		
  		</div>
  		
  		</div>
  		<a class="btn btn-dark mb-3" role="button" href="login"> Volver</a>
				
	</main>
	</body>
	</html>