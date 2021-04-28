/** CREAR CAPACITACION **/
$(document).ready(function() {
    $.validator.addMethod("valRut", function (value, element) {
        var pattern = /([0-9]{8})([-]{1})([0-9]{1})/;
        return this.optional(element) || pattern.test(value);
       }, "El formato valido del rut es: XXXXXXXX-X");
    
    
    $(document).ready(function () {
        $("#formCap").validate({
            
            rules: {
                idCapacitacion: {
                        required: true,
                        minlength: 1,
                        maxlength: 50},
                
                capFecha: {
                        required: true},				
                
                capHora: {
                        required: true},			
                
                capLugar: {
                        required: true,
                        minlength: 1,
                        maxlength: 50},
                
                capDuracion: {
                        required: true,
                        min: 1,
                        max: 1000},
                
                clienteRutCliente: {
                        required: true,
                        valRut: true },},
                
            messages: {
                idCapacitacion: {
                        required: "Campo obligatorio",
                        minlength: "Se requiere al menos un caracter",
                         maxlength: "Se requiere menos de 50 caracteres"},		
                
                capFecha: {
                        required: "Campo obligatorio"},				
                
                capHora: {
                        required: "Campo obligatorio"},			
                
                capLugar: {
                        required: "Campo obligatorio",
                        minlength: "Se requiere al menos un caracter",
                         maxlength: "Se requiere menos de 50 caracteres"},		
                
                capDuracion: {
                        required: "Campo obligatorio",
                        min: "Se requiere al menos una hora",
                        max: "Se requiere menos de 1000 horas"},
                
                clienteRutCliente: {
                        required: "Campo obligatorio"},}
            });
        });
    });