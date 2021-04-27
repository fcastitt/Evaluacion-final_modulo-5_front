/** VALIDACION CONTACTO **/


$(document).ready(function() {
	$.validator.addMethod("valTel", function (value, element) {
    	var pattern = /([+]{1})([5]{1}[6]{1}[9]{1})([0-9]{8}$)/;
    	return this.optional(element) || pattern.test(value);
    	}, "El formato del telefono valido es: +569XXXXXXXX");

$(document).ready(function() {
	$.validator.addMethod("valEmail", function (value, element) {
    	var pattern = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
    	return this.optional(element) || pattern.test(value);
   		}, "El formato valido del mail es: XX@XX.XX");

$(document).ready(function () {
	$("#formContacto").validate({
		
		rules: {
			nomContacto: {
					required: true,
					minlength: 1,
					maxlength: 50},

			mailContacto: {
					required: true,
					valEmail: true},

			telContacto: {
					required: true,
					valTel: true},

			menContacto: {
					required: true,
					minlength: 1,
					maxlength: 250},

			genContacto: {
					required: true,},},
		
		messages: {
			nomContacto: {
					required: "Campo bligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},

			mailContacto: {
					required: "Campo bligatorio"},

			telContacto: {
					required: "Campo bligatorio"},

			menContacto: {
					required: "Campo bligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 250 caracteres"},

			genContacto: {
					required: "Campo bligatorio"},},
            })
        });
    });
});
