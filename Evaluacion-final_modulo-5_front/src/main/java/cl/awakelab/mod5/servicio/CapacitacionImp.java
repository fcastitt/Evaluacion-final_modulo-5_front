package cl.awakelab.mod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.awakelab.mod5.dto.Capacitacion;

@Service
public class CapacitacionImp implements InterfasServicios<Capacitacion> {

	// falta agregar implemetar apis
	
	@Autowired
	RestTemplate retTemp;
	
	@Override
	public List<Capacitacion> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Capacitacion crear(Capacitacion dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Capacitacion dato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Capacitacion modificar(Capacitacion dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Capacitacion buscarPorId(String runUsuario) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


	