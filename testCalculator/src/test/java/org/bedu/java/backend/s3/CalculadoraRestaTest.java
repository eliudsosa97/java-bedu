package org.bedu.java.backend.s3;
import bedu.java.backend.s3.Calculadora;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    class CalculadoraRestaTest {
        static Calculadora calculadora = new Calculadora();

        @BeforeAll
        static void setup() {
            calculadora = new Calculadora();

        }

        @Test
        @DisplayName("Prueba Resta")
        void sumaTest() {
            int esperado = 8;
            assertEquals(esperado, calculadora.resta(10, 2));
        }
    }

