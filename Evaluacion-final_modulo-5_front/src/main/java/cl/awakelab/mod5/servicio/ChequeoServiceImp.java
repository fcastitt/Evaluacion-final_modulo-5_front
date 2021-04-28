package cl.awakelab.mod5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.awakelab.mod5.dto.Chequeo;

@Service
public class ChequeoServiceImp implements InterfasServicios<Chequeo>{

	public static final String APILISTACHEQUEO = "http://localhost:8889/api/v1/chequeo";
	
	@Autowired
	RestTemplate restTemp;
	
	@Override
	public List<Chequeo> listar() {
		
		HttpHeaders header = new HttpHeaders();
		
		HttpEntity<Chequeo> entityChequeo = new HttpEntity<Chequeo>(header);
		
		ResponseEntity<List<Chequeo>> responseChequeo = restTemp.exchange(APILISTACHEQUEO, HttpMethod.GET, entityChequeo, new ParameterizedTypeReference<List<Chequeo>>(){	
		});
		
		return responseChequeo.getBody();
	}

	@Override
	public Chequeo crear(Chequeo dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Chequeo dato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Chequeo modificar(Chequeo dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Chequeo buscarPorId(String runUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
