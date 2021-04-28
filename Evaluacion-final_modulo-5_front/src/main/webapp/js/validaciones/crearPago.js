/** VALIDAR PAGO **/ 
$(document).ready(function() {
    $.validator.addMethod("valRut", function (value, element) {
        var pattern = /([0-9]{8})([-]{1})([0-9]{1})/;
        return this.optional(element) || pattern.test(value);
       }, "El formato valido del rut es: XXXXXXXX-X.En caso de terminar con K, reemplacelo con 0");
        
        $(document).ready(function () {
              $("#formPago").validate({
                
                rules: {	
                    PagMonto: {
                            required: true,
                            min: 1,
                            max: 1000000000},
                    
                    PagMes: {
                            required: true},
                    
                    PagAño: {
                            required: true,
                            min: 2000,
                            max: 2021},
                    
                    PagRut: {
                            required: true,
                            valRut: true},
                    
                    PagFecha: {
                            required: true},},
                    
                messages: {
                    PagMonto: {
                            required: "Campo obligatorio",
                            min: "Se requiere al menos un valor",
                            max: "Se requiere menos de $1.000.000.000"},
                    
                    PagMes: {
                            required: "Campo obligatorio"},
                                
                    PagAño: {
                            required: "Campo obligatorio",
                            min: "Se requiere introducir un año superior a 2000",
                            max: "Se requiere introducir un menor inferior a 2022"},
                            
                    PagRut: {
                            required:"Campo obligatorio"},
                    
                    PagFecha: {
                            required: true},},
                        });
                    });
                });