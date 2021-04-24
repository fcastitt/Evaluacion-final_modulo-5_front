package cl.awakelab.crud.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Visitas {
		
		@GetMapping("/listadoVisitas")
		public String ejecutarVisitas() {
			
			return "listadoVisitas" ;
		}
	}