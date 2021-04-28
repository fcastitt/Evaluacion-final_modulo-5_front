/** VALIDACION USUARIO **/
$(document).ready(function() {
    $.validator.addMethod("valRut", function (value, element) {
        var pattern = /([0-9]{8})([-]{1})([0-9]{1})/;
        return this.optional(element) || pattern.test(value);
       }, "El formato valido del rut es: XXXXXXXX-X.En caso de terminar con K, reemplacelo con 0");
    
    $(document).ready(function () {
          $("#formUs").validate({
            
            rules: {
                uRun: {
                        required: true,
                        valRut: true},
                        
                usuNombre: {
                        required: true,
                        minlength: 1,
                        maxlength: 50},
            
                usuApellido: {
                        required: true,
                        minlength: 1,
                        maxlength: 50},
            
                usuFechaNacimiento:{
                        required: true}, 
                                
                usTipo: {
                        required: true},},
            
            messages: {
                uRun: {		
                        required: "Campo obligatorio"},
                        
                usuNombre: {
                        required:"Campo obligatorio",
                        minlength: "Se requiere al menos un caracter",
                         maxlength: "Se requiere menos de 50 caracteres"},		
                        
                usuApellido: {
                        required:"Campo obligatorio",
                        minlength: "Se requiere al menos un caracter",
                         maxlength: "Se requiere menos de 50 caracteres"},		
                    
                usuFechaNacimiento: {
                        required: "Campo obligatorio"},
                        
                usTipo: {
                        required: "Campo obligatorio"},}, 
        });
    });
});