package cl.awakelab.crud.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Pagos {
	
	@GetMapping("/crearPago")
	public String ejecutarPago() {
		return "crearPago" ;
	}
	
	@PostMapping("/crearPago")
	public String crearPago() { 
		return "crearPago" ;
	
	}
		
	@GetMapping("/listadoPago")
	public String ejecutarListaPago() {
		return "listadoPago" ;
	}
}
