package cl.awakelab.mod5.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Chequeo {
	
	
	private Integer idChequeo;
	private String nombre;
	private String detalle;
	private String estado;
	private Integer clienteRutCliente;

}
