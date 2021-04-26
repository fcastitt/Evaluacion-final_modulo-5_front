package cl.awakelab.mod5.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.mod5.dto.Usuarios;
import cl.awakelab.mod5.servicio.InterfasServicios;

@Controller
@RequestMapping("/usuario")
public class UsuariosControlador {
	
	@Autowired
	InterfasServicios<Usuarios> usuarioService;
	
		@GetMapping("/crearUsuario")
		public String ejecutarUsuario() {
			return "crearUsuario" ;
		}
		
		@PostMapping("/crearUsuario")
		public String crearUsuario() { 
			return "crearUsuario" ;
		}
			
		@GetMapping("/listadoUsuario")
		public String ejecutarListaUsuario(ModelMap modelLista) {
			modelLista.put("claveListaUsuario", usuarioService.listar());
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