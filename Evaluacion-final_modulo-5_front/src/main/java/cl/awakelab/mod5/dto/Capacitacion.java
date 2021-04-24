package cl.awakelab.mod5.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Capacitacion {

	private String idCapacitacion;
	private String capFecha;
	private String capHora;
	private String capLugar;
	private Integer capDuracion;
	private Integer clienteRutCliente;
	
}