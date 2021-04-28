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
public class Pago {

	private Integer pagMonto;
	private String pagMes;
	private Integer pagAnno;
	private String pagRut;
	private String pagFecha;
}
