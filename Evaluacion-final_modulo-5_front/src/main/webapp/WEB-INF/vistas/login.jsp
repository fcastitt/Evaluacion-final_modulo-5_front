<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Login</title>

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
		<!--NAV -->	
		<div>
      		<img src="https://evaluaciones.alineosoft.com/gentelella-master/production/images/logo-humanidea.png">
        	<jsp:include page="menu/menu.jsp"></jsp:include>
    	</div>
    
    	<!-- TITULO PAGINA -->
    	<div class="centrar">
        <h1>LOGIN USUARIO</h1></div>
    
		
		<!-- form -->
		<form:form class="formulario" action="/login" method="post" modelAttribute="FormLogin" id="formLogin">		
		
			<div class="">
				<input class="campos-form" type="text" id="rutLogin" name="rut" placeholder="* Rut">
			</div>
	
			<div class="">
				 <input class="campos-form" type="password" id="contraLogin" name="password" placeholder="* Contraseña" >
			</div>
		
			<br>
			<div class="">
				<label for="" class=""> (*) Campos obligatorios</label></div>				<br>
		
			<div class="">
				<input class="submit" id="boton" type="submit" value="Enviar"></div>		
	
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
	        <h1>© 2021  humanidea  ·  Pivacidad  ·  Terminos  · Mapa del Sitios </h1>
	        </footer>
	</body>
</html>