package cl.awakelab.mod5.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.mod5.dto.Chequeo;
import cl.awakelab.mod5.servicio.InterfasServicios;

	@Controller
	@RequestMapping("/profesional")
	public class ChecklistControlador{
		
		@Autowired
		InterfasServicios<Chequeo> iChequeoService;
		
		@GetMapping("/responderChecklist")
		public String ejecutarChecklist(ModelMap listamap) {
			listamap.put("listaChequeo", iChequeoService.listar());
			return "responderChecklist" ;
		}
	}
	