package org.bedu.java.backend.s3;

import bedu.java.backend.s3.Calculadora;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraSumaTest {
    static Calculadora calculadora = new Calculadora();

    @BeforeAll
    static void setup() {
        calculadora = new Calculadora();

    }

    @Test
    @DisplayName("Prueba Suma")
    void sumaTest() {
        int esperado = 12;
        assertEquals(esperado, calculadora.suma(10, 2));
    }
}
