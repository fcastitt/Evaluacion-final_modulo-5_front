package cl.awakelab.mod5.servicio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.awakelab.mod5.dto.Usuarios;

@Service
public class UsuarioImp implements InterfasServicios<Usuarios>{

	//private static final String APIUSUARIO2 = "http://localhost:8889/api/v1/usuario2";
	//private static final String APICREARUSUARIO = "http://localhost:8889/api/v1/usuario2/crear";
	private static final String APIBUSCARPORRUN = "http://localhost:8889/api/v1/usuarios/buscar/{idUsuario}";
	
	@Autowired
	RestTemplate restTemp;
	
	@Autowired
	BCryptPasswordEncoder bCPE;
	
	@Override
	public List<Usuarios> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios crear(Usuarios dato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Usuarios dato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuarios modificar(Usuarios dato) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Usuarios buscarPorId(String runUsuario) {
	
		Map<String, String> maparun = new HashMap<String, String>();
		maparun.put("idUsuario", runUsuario);
		
		ResponseEntity<Usuarios> responseUsuario = restTemp.getForEntity(APIBUSCARPORRUN, Usuarios.class, maparun);
		
		return null; //responseUsuario.getBody();
	}

}
