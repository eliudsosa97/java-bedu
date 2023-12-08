package com.example.postwork7.service;

import org.springframework.stereotype.Service;

// Anotación que indica que esta clase es un componente de servicio gestionado por Spring
// y debe ser escaneado durante el proceso de configuración
@Service
public class FormateadorTelefono {

    // Patrón para el formato inicial del número de teléfono
    private static final String FORMATO_INICIAL_TELEFONO = "(\\d{2})(\\d{4})(\\d+)";

    // Patrón para el formato final deseado del número de teléfono
    private static final String FORMATO_FINAL_TELEFONO = "($1)-$2-$3";

    // Método que formatea un número de teléfono según un formato específico
    public String formatea(String telefono) {
        // Utiliza el método replaceFirst para aplicar el formato deseado
        return String.valueOf(telefono).replaceFirst(FORMATO_INICIAL_TELEFONO, FORMATO_FINAL_TELEFONO);
    }
}
