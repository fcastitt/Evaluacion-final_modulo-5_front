/**
 * 
 */
/** VALIDACION CONTACTO **/

$(document).ready(function () {
	$("#formContacto").validate({
		
		rules: {
			nomContacto: {
					required: true,
					minlength: 1,
					maxlength: 50},

			mailContacto: {
					required: true,
					email: true},

			telContacto: {
					required: true,
					pattern: "(+56)[0-9]{8}"},

			menContacto: {
					required: true,
					minlength: 1,
					maxlength: 250},

			genContacto: {
					required: true,},},
		
		messages: {
			nomContacto: {
					required: "Obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},

			mailContacto: {
					required: "Obligatorio",
					email: "Se requiere email valido"},

			telContacto: {
					required: "Obligatorio",
					pattern: "Se requiere el siguienye formato: +569XXXXXXXX"},

			menContacto: {
					required: "Obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 250 caracteres"},

			genContacto: {
					required: "Obligatorio"},}
			
			});
		});




/** CREAR CAPACITACION **/
$(document).ready(function () {
  	$("#formCap").validate({
		
		rules: {
			fechaCap: {
					required: true,
					delimiter: '/',
    				datePattern: ['Y', 'M', 'D']},

			horaCap: {
					required: true},
			
			lugCap: {
					required: true,
					minlength: 1,
					maxlength: 100},

			durCap: {
					required: true,
					max: 4},

			rutCap: {
					required: true, 
					max: 999999999,
					pattern: "\d{3,8}-[\d|kK]{1}" },},
		
		messages: {
			fechaCap: {
					required: "Obligatorio",
					delimiter: "Se requiere el siguiente formato: [DD/MM/YYYY]",
    				datePattern: "Se requiere el siguiente formato: [DD/MM/YYYY]"},

			horaCap: {
					required: "Obligatorio"},
				
			lugCap: {
					required: "Obligatorio",
				 	minlength: "Se requiere al menos un caracter",
				 	maxlength: "Se requiere menos de 100 caracteres"},

			durCap: {
					required: "Obligatorio",
					max: "Se requieren menos de 1000 horas"},

			rutCap: {
					required: "Obligatorio",
					max: "Se requiere el siguiente formato: XX.XXX.XXX-X"}
				}
			});	
		});