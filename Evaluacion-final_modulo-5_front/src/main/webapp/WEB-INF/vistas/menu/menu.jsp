
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>


<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
	        <button class="navbar-toggler" 
	        		type="button" 
	        		data-bs-toggle="collapsed"
	            	data-bs-target="#navbarNavDropdown" 
	            	aria-controls="navbarNavDropdown"
	            	aria-expanded="false" 
	            	aria-label="Toggle navigation">
	           	 	<span class="navbar-toggler-icon"></span>
	        </button>
	        
	    	
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active">
				<a class="nav-link" href="/">Inicio<span class="sr-only">(current)</span></a></li>

				<li class="nav-item">
				<a class="nav-link" href="/cliente/contacto">Contacto</a></li>
					
				<li class="nav-item dropdown">
        		<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Capacitacion</a>
        			<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          				<a class="dropdown-item" href="/cliente/crearCapacitacion">Crear Capacitacion</a>
          				<div class="dropdown-divider"></div>
         				<a class="dropdown-item" href="/cliente/listarCapacitacion">Listado de Capacitaciones</a>
        			</div>
      			</li>	
					
				<li class="nav-item dropdown">
        		<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Usuarios</a>
        			<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          				<a class="dropdown-item" href="/administrativo/crearUsuario">Crear Usuario</a>
          				<a class="dropdown-item" href="/administrativo/listadoUsuario">Listado de Usuarios</a>
          				<!-- Lo comento porque según modulos anteriores el link se hace desde Listado de Usuario
          				<div class="dropdown-divider"></div>
         				<a class="dropdown-item" href="editarCliente">Editar Cliente</a>
         				<a class="dropdown-item" href="editarProfesional">Editar Profesional</a>
         				<a class="dropdown-item" href="editarAdministrativo">Editar Administrativo</a>
        				-->
        			</div>
      			</li>	

				
				<li class="nav-item dropdown">
        		<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Pagos</a>
          			 <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          				<a class="dropdown-item" href="/administrativo/crearPago">Ingresar un pago</a>
          				<div class="dropdown-divider"></div>
         				<a class="dropdown-item" href="/administrativo/listadoPago">Listado de pagos</a>
        			</div>
      			</li>	
			
				<li class="nav-item"><a class="nav-link" href="/profesional/listadoVisitas">Visitas</a></li>
	
				<li class="nav-item"><a class="nav-link" href="/profesional/responderChecklist">Checklist</a></li>
				
				<li class="nav-item"><a class="nav-link"
					href="../login"> Login</a></li>	
				
				<li class="nav-item"><a class="nav-link"
					href="../logout"> Logout</a></li>
			</ul>
		</div>
		<div>
			<form class="form-inline my-2 my-lg-0">
      			<input class="form-control mr-sm-2" type="search" placeholder="Buscar" aria-label="Search">
    		</form>
    	</div>
    </div>
</nav>
        