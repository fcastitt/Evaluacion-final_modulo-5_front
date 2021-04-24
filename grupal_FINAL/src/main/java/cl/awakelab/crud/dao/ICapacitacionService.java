package cl.awakelab.crud.dao;

import java.util.List;

import cl.awakelab.crud.modelo.CapacitacionModelo;


public interface ICapacitacionService {
		
		public List<CapacitacionModelo> obtenerCapacitacion();
		
		public CapacitacionModelo crearCapacitacion(CapacitacionModelo subir); 

	}
