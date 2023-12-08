package com.example.postwork7.service;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;


// Anotación que indica que esta clase es un componente de servicio gestionado por Spring
// y debe ser escaneado durante el proceso de configuración
@Service
public class ValidadorTelefono {

    // Método que elimina todos los caracteres no numéricos de un número de teléfono
    public String limpiaNumero(String telefono) {
        // Utiliza expresiones regulares para reemplazar todos los caracteres no numéricos por una cadena vacía
        return telefono.replaceAll("[^0-9]", "");
    }
}

