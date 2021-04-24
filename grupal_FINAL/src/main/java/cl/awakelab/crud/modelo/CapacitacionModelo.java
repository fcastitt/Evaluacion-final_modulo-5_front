package cl.awakelab.crud.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CapacitacionModelo {

	private String idCapacitacion;
	private String capFecha;
	private String capHora;
	private String capLugar;
	private Integer capDuracion;
	private Integer clienteRutCliente;
	
}
