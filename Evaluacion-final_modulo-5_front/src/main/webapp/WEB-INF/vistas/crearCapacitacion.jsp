<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Crear Capacitacion</title>
	<!-- BootStrap -->
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
		crossorigin="anonymous">
	<!-- css-->
	<style type="text/css"> <%@include file="/css/style.css"%></style> 	
</head>


	<body>

		<!--nav -->	
		<div>
	        <img src="https://evaluaciones.alineosoft.com/gentelella-master/production/images/logo-humanidea.png">
	        <jsp:include page="menu/menu.jsp"></jsp:include></div>
    
    	<!-- TITULO PAGINA -->
    	<h1 class="centrar">CREAR CAPACITACION</h1>
	
		<!-- form -->
		<form:form class="formulario" action="/capacitacion/crearCapacitacion" method="post" modelAttribute="FormCrearCapacitacion" id="formCap">
		
			<div class="">
				<input type="number" class="campos-form" id="" name="idCapacitacion" placeholder="* ID capacitacion">
			</div>
			
			<div class="">
				 <input type="text" placeholder="* Fecha" class="campos-form" id="fechaCap" name="capFecha" onfocus="(this.type='date')">
			</div>
			<div class="">
			
				<input type="text" placeholder="* Hora" class="campos-form" id="horaCap" name="capHora" onfocus="(this.type='time')">
			</div>
	
			<div class="">
				 <input type="text" class="campos-form" id="lugCap" name="capLugar" placeholder="* Lugar">
			</div>
	
			<div class="">
				<input type="number" class="campos-form" id="durCap" name="capDuracion" placeholder="* Duraci�n">
			</div>
	
			<div class="">
				 <input type="number" class="campos-form" id="rutCap" name="clienteRutCliente" placeholder="* Rut Cliente">
			</div>
			
		
			<br>
			<div class="">
				<label for="" class=""> (*) Campos obligatorios</label></div>
			<br>
			<div class="">
				<input class="submit" id="boton" type="submit" value="Enviar"></div>		
			</div>
		</form:form>
	

	<!-- BootStrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"
		integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js"
		integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc"
		crossorigin="anonymous"></script>
	
	<!-- jquery -->		
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	 
	 <!-- jquery validate -->
	 <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>
	 
	 <!-- archivo JavaScript -->
	 <script type="text/javascript" src="/js/validaciones.js"></script>
		
  <footer>
        <h1>� 2021  humanidea  �  Pivacidad  �  Terminos  � Mapa del Sitios </h1>
  </footer>
</body>
</html>