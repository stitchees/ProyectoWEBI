<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Lista de destinos</title>
</head>
<body>

	<div class="container mt-3">
		
		<table class="table table-hover">



			
				<c:forEach var="destino" items="${destinos}" varStatus="status">
					<tr>
						<td><b>${destino.nombre}</b></td>
						
						
						 
					

					</tr>

			

				</c:forEach>

			</tbody>
		</table>
		<a class="btn btn-primary mb-5" role="button" href="javascript:history.back()"> Volver</a>

	</div>
		
		
		
</body>
</html>