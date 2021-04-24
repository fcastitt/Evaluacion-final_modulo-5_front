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
public class Cliente {

	private Integer rutCliente;
	private String cliNombres;
	private String cliApellidos;
	private String cliTelefono;
	private String cliAfp;
	private String cliSistemaSalud;
	private String cliDireccion;
	private String cliComuna;
	private String cliEdad;
	private Integer usuariosURun;
}
