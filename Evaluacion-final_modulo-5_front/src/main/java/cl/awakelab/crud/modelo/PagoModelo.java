package cl.awakelab.crud.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PagoModelo {

	private Integer PagMonto;
	private String PagMes;
	private Integer PagAño;
	private String PagRut;
	private String PagFecha;
}
