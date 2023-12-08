package org.bedu.java.backend.s3;
import bedu.java.backend.s3.Calculadora;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculadoraMultiplicacionTest {
    static Calculadora calculadora = new Calculadora();

    @BeforeAll
    static void setup() {
        calculadora = new Calculadora();

    }

    @Test
    @DisplayName("Prueba Multiplicación")
    void sumaTest() {
        int esperado = 20;
        assertEquals(esperado, calculadora.multiplica(10, 2));
    }
}
