package cl.awakelab.mod5.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.mod5.dto.Usuarios;
import cl.awakelab.mod5.servicio.InterfasServicios;

@Service
public class AutorizacionServicio {
	
	@Autowired
	InterfasServicios<Usuarios> IntUsu;
	

}
