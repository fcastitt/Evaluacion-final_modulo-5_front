package cl.awakelab.mod5.controladores;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.mod5.dto.Contacto;

@Controller
@RequestMapping("/cliente")
public class ContactoControlador {
	
private static final Logger log = LoggerFactory.getLogger("Log de contacto");
	
	@GetMapping("/contacto")
	public String contacto() {
		return "/contacto";
	}
	
	@PostMapping("/contacto")
	public String contactoPost(@ModelAttribute("formContacto")Contacto contacto) {
		log.info("IFORMACION DE FORMULARIO DE CONTACTO INGRESADA");
		System.out.println("Nombre: "+contacto.getNomContacto());
		System.out.println("Email: "+contacto.getMailContacto());
		System.out.println("Telefono: "+contacto.getTelContacto());
		System.out.println("Mensaje: "+contacto.getMenContacto());
		System.out.println("Genero: "+contacto.getGenContacto());
		return "/contacto";
	}
}
