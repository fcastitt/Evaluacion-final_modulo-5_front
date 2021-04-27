package cl.awakelab.mod5.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		usuarioService.crear(formulario);
		return new RedirectView("/administrativo/listadoUsuario") ;
	}	
	
	
	
		@GetMapping("/Cliente")
		public String ejecutarEditarCliente(@RequestParam("rut")String rutUsuario, ModelMap modelClie) {		
			modelClie.put("rutUsuario", rutUsuario);	
			return "editarCliente" ;
		}
		@PostMapping("/Cliente")
		public RedirectView EditarCliente(@ModelAttribute ("FormEditarUsuario") Usuarios formulario) {
			usuarioService.modificar(formulario);
			return new RedirectView("/administrativo/listadoUsuario") ;
		}
		
		
		
		@GetMapping("/Profesional")
		public String ejecutarEditarProfesional(@RequestParam("rut")String rutUsuario, ModelMap modelPro) {
			modelPro.put("rutUsuario", rutUsuario);	
			return "editarProfesional" ;
		}
		@PostMapping("/Profesional")
		public RedirectView EditarProfesional(@ModelAttribute ("FormEditarUsuario") Usuarios formulario) {
			usuarioService.modificar(formulario);
			return new RedirectView("/administrativo/listadoUsuario") ;
		}
		

		
		@GetMapping("/Administrativo")
		public String ejecutarEditarAdministrativo(@RequestParam("rut")String rutUsuario, ModelMap modelAdm) {	
			modelAdm.put("rutUsuario", rutUsuario);	
			return "editarAdministrativo" ;
		}
		@PostMapping("/Administrativo")
		public RedirectView EditarAdministrativo(@ModelAttribute ("FormEditarUsuario") Usuarios formulario) {
			usuarioService.modificar(formulario);
			return new RedirectView("/administrativo/listadoUsuario") ;
		}
		
		
		
		@GetMapping("/buscar")
		public  String buscarUsuario(@RequestParam("rut")String rutUsuario, ModelMap modelbuscar) {
			
			modelbuscar.put("claveRutUsuario", usuarioService.buscarPorId(rutUsuario));
			
			return  null;
		}

	
}