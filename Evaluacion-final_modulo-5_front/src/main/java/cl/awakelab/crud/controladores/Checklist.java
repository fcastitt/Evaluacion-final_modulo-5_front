package cl.awakelab.crud.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class Checklist {
		@GetMapping("/responderChecklist")

		public String ejecutarChecklist() {
			return "responderChecklist" ;
		}
	}
