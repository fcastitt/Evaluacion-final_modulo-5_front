package cl.awakelab.mod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import cl.awakelab.mod5.dto.Pago;

public class PagoImp implements InterfasServicios<Pago> {

	@Autowired
	RestTemplate retTemp;
	
	@Override
	public List<Pago> listar() {
		return null;
	}

	@Override 
	public void borrar (Pago dato) {
		
	}

	@Override
	public Pago crear(Pago dato) {
		return null;
	}

	@Override
	public Pago modificar(Pago dato) {
		return null;
	}

	@Override
	public Pago buscarPorId(String runUsuario) {
		return null;
	}
}
