/** VALIDACION PROFESIONAL **/		
 $(document).ready(function() {
$.validator.addMethod("valRut", function (value, element) {
	var pattern = /([0-9]{8})([-]{1})([0-9]{1})/;
	return this.optional(element) || pattern.test(value);
	}, "El formato valido de rut es: XXXXXXXX-X. En caso de terminar con K, reemplacelo con 0");
    
$(document).ready(function() {
	$.validator.addMethod("valTel", function (value, element) {
    	var pattern = /([+]{1})([5]{1}[6]{1}[9]{1})([0-9]{8}$)/;
    	return this.optional(element) || pattern.test(value);
  		}, "El formato del telefono valido es: +569XXXXXXXX");
 
 $(document).ready(function () {
  	$("#FormUsProf").validate({
		
		rules: {
			
			proRut: {
					required: true,
					valRut: true},
					
			proNombre: {
					required: true,
				minlength: 1,
					maxlength: 50},
		
			proApellido: {
					required: true,
					minlength: 1,
					maxlength: 50},
					
			proTelefono: {
					required: true,
					valTel: true},
					
			proTitulo: {
					required: true,
					minlength: 1,
					maxlength: 50},
					
			proProyecto: {	
					required: true,
					minlength: 1,
					maxlength: 150},
					
			usuariosURun: {
				required: true,
					valRut: true},},
			
		messages: {
			proRut: {
					required:"Campo obligatorio"},
					
			proNombre: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},
			
			proApellido: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},
					
			proTelefono: {
					required: "Campo obligatorio"},
					
			proTitulo: {
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 50 caracteres"},
					
			proProyecto: {	
					required: "Campo obligatorio",
					minlength: "Se requiere al menos un caracter",
					maxlength: "Se requiere menos de 150 caracteres"},
					
			usuariosURun: {
					required: "Campo obligatorio"},},
            });
        });
	});
});