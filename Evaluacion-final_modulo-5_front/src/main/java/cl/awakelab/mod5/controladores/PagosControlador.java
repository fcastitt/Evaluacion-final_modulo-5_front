package cl.awakelab.mod5.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import cl.awakelab.mod5.dto.Pago;
import cl.awakelab.mod5.servicio.InterfasServicios;

@Controller
@RequestMapping("/administrativo")
public class PagosControlador {
	
	@Autowired
	InterfasServicios<Pago> ipagos;
	
	@GetMapping("/listadoPago")
	public String ejecutarListaPago(ModelMap modelLista) {
		modelLista.put("claveListaPagos", ipagos.listar());
		return "listadoPago" ;
		
	}
	@GetMapping("/crearPago")
	public String ejecutarPago() {
		return "crearPago" ;
	}
	
	@PostMapping("/crearPago")
	public RedirectView crearPago(@ModelAttribute ("formCrearPago") Pago nuevoPago) { 
		
		System.out.println("controlador de crear pago");
		ipagos.crear(nuevoPago);
	
		return new RedirectView("/administrativo/listadoPago") ;
	}
		
	
}
