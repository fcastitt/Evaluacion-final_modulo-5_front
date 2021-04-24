package cl.awakelab.mod5.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuariosControlador {
	
	
		@GetMapping("/crearUsuario")
		public String ejecutarUsuario() {
			return "crearUsuario" ;
		}
		
		@PostMapping("/crearUsuario")
		public String crearUsuario() { 
			return "crearUsuario" ;
		}
			
		@GetMapping("/listadoUsuario")
		public String ejecutarListaUsuario() {
			return "listadoUsuario" ;
		}
	
		@GetMapping("/editarCliente")
		public String ejecutarEditarCliente() {
			return "editarCliente" ;
		}
		
		@GetMapping("/editarProfesional")
		public String ejecutarEditarProfesional() {
			return "editarProfesional" ;
		}

		@GetMapping("/editarAdministrativo")
		public String ejecutarEditarAdministrativo() {
			return "editarAdministrativo" ;
		}
	
}