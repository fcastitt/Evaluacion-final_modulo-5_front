package cl.awakelab.mod5.seguridad;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cl.awakelab.mod5.dto.Usuarios;
import cl.awakelab.mod5.servicio.InterfasServicios;

@Service
public class AutServicio implements UserDetailsService{

	@Autowired
	InterfasServicios<Usuarios> intUsu;
	
	
	@Override
	public UserDetails loadUserByUsername(String run) throws UsernameNotFoundException {
		
		Usuarios usuario = intUsu.buscarPorId(run);
		
		if (usuario == null) {
			
			throw new UsernameNotFoundException(run);
			 
		} 
			
		List<GrantedAuthority> rolesUsuario = new ArrayList<GrantedAuthority>();
		
		rolesUsuario.add(new SimpleGrantedAuthority(usuario.getTipoUsuario().toString()));
		
		return new User(usuario.getURun(), usuario.getPassword(), rolesUsuario);
	}

}
