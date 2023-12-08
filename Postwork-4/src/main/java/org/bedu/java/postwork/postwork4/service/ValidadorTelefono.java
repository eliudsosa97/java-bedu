package org.bedu.java.postwork.postwork4.service;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service

public class ValidadorTelefono {


        private static final Pattern PATTERN_TELEFONO = Pattern.compile("^(\\d{2,4}[- .]?){2}\\d{4}$");

        public boolean isValido(String numero) {
            return PATTERN_TELEFONO.matcher(numero).matches();
        }


    public String limpiaNumero(String numero){
        return numero.replaceAll("[^0-9]", "");
    }
}
