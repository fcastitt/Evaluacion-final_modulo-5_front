package cl.awakelab.crud.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class UsuariosModelo {

	private String uRun;
	private String usuNombre;
	private String usuApellido;
	private String usuFechaNacimiento;
	private String usTipo;
	
}