package cl.awakelab.mod5.dao;

import java.util.ArrayList;
import java.util.List;

import com.springmvc.modulo5.model.CapacitacionModel;


public class CapacitacionDao implements ICapacitacionDao {
	
	@Override
	public List<CapacitacionModel> obtenerCapacitaciones() {    
		
		List<CapacitacionModel> lista = new ArrayList<CapacitacionModel>();
		
		CapacitacionModel a1 = new CapacitacionModel("1","01/01/2021","01:11","Santiago",11,"11.111.111-1");
		CapacitacionModel a2 = new CapacitacionModel("2","02/02/2021","02:22","Arica",22,"22.222.222-2");
		CapacitacionModel a3 = new CapacitacionModel("3","03/03/2021","03:33","Punta Arenas",33,"33.333.333-3");
	
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		
		return lista; 
	
	}

	@Override
	public boolean crearCapacitacion(CapacitacionModel dato) {
		
		
		
		return false;
	}
}


	