package cl.awakelab.mod5.controladores;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.mod5.controladores.Capacitacion;
import cl.awakelab.mod5.dto.CapacitacionModelo;
import cl.awakelab.mod5.servicio.ICapacitacionService;


@Controller
@RequestMapping("/capacitacion")
public class Capacitacion {
	
	@Autowired
	ICapacitacionService capService;
	
	org.slf4j.Logger consola = LoggerFactory.getLogger(Capacitacion.class);


	@GetMapping("/crearCapacitacion")
	public String ejecutacrearcap() {
		return "crearCapacitacion" ;
	}
	
	@PostMapping ("/crearCapacitacion")
	public String crearCapacitacion(@ModelAttribute("FormCrearCapacitacion") CapacitacionModelo nuevaCapacitacion) { 
		
		capService.crearCapacitacion(nuevaCapacitacion);
	
		consola.info("-------SE HA CREADO UNA NUEVA CAPACITACION----");
		
		return "crearCapacitacion";
	}
	
	
	@GetMapping("/listarCapacitacion")
	public String ejecutalistarcap(ModelMap mostrar) {
		
		List<CapacitacionModelo> listarCapacitacion = capService.obtenerCapacitacion();
		
		mostrar.put("listaCapacitacion" , listarCapacitacion);
		
		consola.info("-------ESTO MUESTRA QUE LISTARCAPACITACION SIRVE----");
		
		return "listarCapacitacion"; 
	}
	
}
