/** VALIDACION CLIENTE **/		
$(document).ready(function() {
    $.validator.addMethod("valRut", function (value, element) {
        var pattern = /([0-9]{8})([-]{1})([0-9]{1})/;
        return this.optional(element) || pattern.test(value);
       }, "El formato valido del rut es: XXXXXXXX-X.En caso de terminar con K, reemplacelo con 0");
    
    $(document).ready(function() {
        $.validator.addMethod("valTel", function (value, element) {
            var pattern = /([+]{1})([5]{1}[6]{1}[9]{1})([0-9]{8}$)/;
            return this.optional(element) || pattern.test(value);
            }, "El formato del telefono valido es: +569XXXXXXXX");
    
    $(document).ready(function () {
          $("#FormUsCliente").validate({
            
            rules: {   	
                rutCliente: {
                        required: true,
                        valRut: true},
                
                cliNombres: {
                        required: true,
                        minlength: 1,
                        maxlength: 50},
            
                cliApellidos: {
                        required: true,
                        minlength: 1,
                        maxlength: 50},
            
                cliTelefono: {
                        required: true,
                        valTel: true}, 
                        
                cliAfp: {
                        required: true,
                        minlength: 1,
                        maxlength: 20},
                    
                cliSistemaSalud: {
                        required: true},
                
                cliDireccion: {
                        required: true,
                        minlength: 1,
                        maxlength: 100},
                        
                cliComuna: {
                        required: true,
                        minlength: 1,
                        maxlength: 50},
                        
                cliEdad: {
                        required: true,
                        min: 0,
                        max: 120},
                                    
                usuariosURun: {
                        required: true,
                        valRut: true},},
                
            messages: {
                rutCliente: {
                        required:"Campo obligatorio"},
                
                cliNombres: {
                        required: "Campo obligatorio",
                        minlength: "Se requiere al menos un caracter",
                        maxlength: "Se requiere menos de 50 caracteres"},
            
                cliApellidos: {
                        required: "Campo obligatorio",
                        minlength: "Se requiere al menos un caracter",
                        maxlength: "Se requiere menos de 50 caracteres"},
            
                cliTelefono: {
                        required: "Campo obligatorio"}, 
                        
                cliAfp: {
                        required: "Campo obligatorio",
                        minlength: "Se requiere al menos un caracter",
                        maxlength: "Se requiere menos de 20 caracteres"},
                    
                cliSistemaSalud: {
                        required: "Campo obligatorio"},
                
                cliDireccion: {
                        required: "Campo obligatorio",
                        minlength: "Se requiere al menos un caracter",
                        maxlength: "Se requiere menos de 100 caracteres"},
                        
                cliComuna: {
                        required: "Campo obligatorio",
                        minlength: "Se requiere al menos un caracter",
                        maxlength: "Se requiere menos de 50 caracteres"},
                        
                cliEdad: {
                        required: "Campo obligatorio",
                        min: "Se requiere al menos un valor",
                        max: "Se requiere menos de 120 años"},
                                    
                usuariosURun: {
                        required: "Campo obligatorio"},}
                });	
            });
        });
    });