<%@ page 	language="java" 
			contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>
    		
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
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
        <jsp:include page="menu/menu.jsp"></jsp:include>
    </div>
		
		<h1 class="centrar">INICIO</h1>
		<div class="contenido">

			<h2>�Cu�l es el objetivo del sistema de informaci�n?</h2>
			<p>Permite administrar los principales procesos que se llevan a
				cabo en ella d�a a d�a. Recientemente, un grupo de profesionales
				fund� una compa��a de asesor�as laborales, detectando inmediatamente
				la necesidad de contar con una soluci�n tecnol�gica que le permita
				administrar toda la informaci�n que se desprende de sus procesos,
				tener un control del recurso humano.</p>

			<h2>�Quienes deber�an usarlo?</h2>
			<p>La plana administrativa de la empresa y los distintos Perfiles
				de usuario.</p>

			<h2>�Qu� procesos considera la plataforma actualmente?</h2>

			<ol type="1">
				<li>Registrar los diferentes tipos de chequeos que se pueden
					hacer en la empresa, referenciarlos a la visita respectiva e
					indicar el estado de avance (Cumple, No Cumple, Observaciones).</li>
				<li>Registra los datos importantes de clientes (Usuarios),
					almacen�ndolos en la plataforma.</li>
				<li>Registro de pagos de clientes, por n�meros correlativos
					�nicos.</li>
				<li>Registro de las asesor�as realizadas, los datos importantes
					y la identificaci�n clara del profesional a cargo del trabajo.
					registro de las actividades de mejora que resultan de las asesor�as
					efectuadas, con un identificado �nico, descripci�n y plazos de
					resoluci�n.</li>
			</ol>
		</div>		
		
	 <!-- BootStrap -->
    <script
        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"
        integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG"
        crossorigin="anonymous"></script>
    <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js"
        integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc"
        crossorigin="anonymous"></script>
        
        <footer>
        <h1>� 2021  humanidea  �  Pivacidad  �  Terminos  � Mapa del Sitios </h1>
        </footer>
	</body>
</html>