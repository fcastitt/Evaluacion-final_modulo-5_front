/** VALIDAR ADMINISTRATIVO **/ 
$(document).ready(function() {
    $.validator.addMethod("valRut", function (value, element) {
        var pattern = /([0-9]{8})([-]{1})([0-9]{1})/;
        return this.optional(element) || pattern.test(value);
       }, "El formato valido del rut es: XXXXXXXX-X.En caso de terminar con K, reemplacelo con 0");
    
    $(document).ready(function() {
        $.validator.addMethod("valEmail", function (value, element) {
            var pattern = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
            return this.optional(element) || pattern.test(value);
       }, "El formato valido del mail es: XX@XX.XX");
    
    $(document).ready(function () {
          $("#FormUsAd").validate({
            
            rules: {
                adRut: {
                        required: true,
                        valRut: true},
                        
                adNombre: {
                        required: true,
                        minlength: 1,
                        maxlength: 50},
                
                adApellido: {
                        required: true,
                        minlength: 1,
                        maxlength: 50},
                        
                adCorreo: {
                        required: true,
                        valEmail: true},
                        
                adArea: {
                        required: true,
                        minlength: 1,
                        maxlength: 50},},
                
            messages: {
                adRut: {
                        required:"Campo obligatorio"},
                        
                adNombre: {
                        required: "Campo obligatorio",
                        minlength: "Se requiere al menos un caracter",
                        maxlength: "Se requiere menos de 50 caracteres"},
                
                adApellido: {
                        required: "Campo obligatorio",
                        minlength: "Se requiere al menos un caracter",
                        maxlength: "Se requiere menos de 50 caracteres"},
                
                adCorreo: {
                        required: "Campo obligatorio"},
                
                adArea: {
                        required: "Campo obligatorio",
                        minlength: "Se requiere al menos un caracter",
                        maxlength: "Se requiere menos de 50 caracteres"},}
                });	
            });
        });    
    });
			