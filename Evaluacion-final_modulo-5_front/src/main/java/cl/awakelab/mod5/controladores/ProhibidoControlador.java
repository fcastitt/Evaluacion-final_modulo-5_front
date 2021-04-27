package cl.awakelab.mod5.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/prohibido")
@Controller
public class ProhibidoControlador {

	@GetMapping
	public String prohibido() {
		return "prohibido";
	}
	
}
