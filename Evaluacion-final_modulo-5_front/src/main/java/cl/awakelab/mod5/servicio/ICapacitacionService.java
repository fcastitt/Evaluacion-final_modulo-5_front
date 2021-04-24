package cl.awakelab.mod5.servicio;

import java.util.List;

import cl.awakelab.mod5.dto.CapacitacionModelo;


public interface ICapacitacionService {
		
		public List<CapacitacionModelo> obtenerCapacitacion();
		
		public CapacitacionModelo crearCapacitacion(CapacitacionModelo subir); 

	}
