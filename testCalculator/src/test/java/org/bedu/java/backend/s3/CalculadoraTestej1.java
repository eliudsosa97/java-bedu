package org.bedu.java.backend.s3;


import bedu.java.backend.s3.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraTestej1 {

    private Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Prueba suma")
    void sumaTest(){
        int esperado = 5;

        assertEquals(esperado, calculadora.suma(2, 3));
    }

    @Test
    @DisplayName("Prueba resta")
    void restaTest() {
        int esperado = 1;

        assertEquals(esperado, calculadora.resta(3, 2));
    }

    @Test
    @DisplayName("Prueba multiplicación")
    void multiplicaTest() {
        int esperado = 6;

        assertEquals(esperado, calculadora.multiplica(3, 2));
    }

    @Test
    @DisplayName("Prueba division")
    void divideTest() {

        assertThrows(IllegalArgumentException.class, () -> calculadora.division(100, 0),
                "No es podible dividir un valor entre 0");
    }
}
