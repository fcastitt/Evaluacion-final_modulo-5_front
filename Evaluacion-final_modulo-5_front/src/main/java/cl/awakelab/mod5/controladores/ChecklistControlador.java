package cl.awakelab.mod5.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	@RequestMapping("/profesional")
	public class ChecklistControlador {
		
		@GetMapping("/responderChecklist")
		public String ejecutarChecklist() {
			return "responderChecklist" ;
		}
	}
