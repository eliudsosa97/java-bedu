package org.bedu.java.backend.s3;
import bedu.java.backend.s3.Calculadora;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraDivisionTest {
    static Calculadora calculadora = new Calculadora();

    @BeforeAll
    static void setup() {
        calculadora = new Calculadora();

    }

    @Test
    @DisplayName("Prueba división")
    void divideTest() {

        assertThrows(IllegalArgumentException.class, () -> calculadora.division(100, 0),
                "No es podible dividir un valor entre 0");
    }
}
