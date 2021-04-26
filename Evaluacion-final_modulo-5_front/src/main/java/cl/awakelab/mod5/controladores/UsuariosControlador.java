package cl.awakelab.mod5.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import cl.awakelab.mod5.dto.Usuarios;
import cl.awakelab.mod5.servicio.InterfasServicios;

@Controller
@RequestMapping("/administrativo")
public class UsuariosControlador {
	
	@Autowired
	InterfasServicios<Usuarios> usuarioService;
	
	@GetMapping("/listadoUsuario")
	public String ejecutarListaUsuario(ModelMap modelLista) {
		modelLista.put("claveListaUsuario", usuarioService.listar());
		return "listadoUsuario" ;
	}
	
	
	@GetMapping("/crearUsuario")
	public String ejecutarUsuario() {
		return "crearUsuario" ;
	}
		

	@PostMapping("/crearUsuario")
	public RedirectView crearUsuario(@ModelAttribute ("FormCrearUsuario") Usuarios formulario) { 
		
		System.out.println("entra al controlador");
		usuarioService.crear(formulario);
		
		return new RedirectView("/administrativo/listadoUsuario") ;
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