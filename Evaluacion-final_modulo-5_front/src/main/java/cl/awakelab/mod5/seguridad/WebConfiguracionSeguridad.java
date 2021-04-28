package cl.awakelab.mod5.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebConfiguracionSeguridad extends WebSecurityConfigurerAdapter{

	private AuthenticationSuccessHandler aSH;
	
	@Autowired
	private UserDetailsService uDS;
	
	@Autowired
	public WebConfiguracionSeguridad (AuthenticationSuccessHandler aSH) {
		this.aSH=aSH;
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder aMB) throws Exception {	
		aMB.userDetailsService(uDS).passwordEncoder(passworEncoder());	
	}
	
	@Bean
	public BCryptPasswordEncoder passworEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable()
		.authorizeRequests()
		//.antMatchers("/administrativo/**").hasAuthority("Administrativo")
		//.antMatchers("/cliente/**").hasAuthority("Cliente")
		//.antMatchers("/profesional/**").hasAuthority("Profesional")
		//.antMatchers("/login").permitAll()
		.antMatchers("/**").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login")
		.successHandler(aSH)
		.failureUrl("/login?error=true")
		.usernameParameter("rut")
		.passwordParameter("password")
		.and()
		.exceptionHandling()
		.accessDeniedPage("/prohibido");

	}
	
}
