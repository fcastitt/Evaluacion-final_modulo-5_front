package cl.awakelab.mod5.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Administrativo {

	private Integer adRut;
	private String adNombre;
	private String adApellido;
	private String adCorreo;
	private String adArea;

	
}
