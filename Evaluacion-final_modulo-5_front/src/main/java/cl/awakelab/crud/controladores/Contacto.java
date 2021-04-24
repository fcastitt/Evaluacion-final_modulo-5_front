package cl.awakelab.crud.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contacto {
	@GetMapping("/contacto")

	public String ejecutacontacto() {
		return "contacto" ;
	}
}
