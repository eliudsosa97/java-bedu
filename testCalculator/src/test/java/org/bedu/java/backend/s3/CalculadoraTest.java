package org.bedu.java.backend.s3;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculadoraSumaTest.class, CalculadoraRestaTest.class,
        CalculadoraMultiplicacionTest.class, CalculadoraDivisionTest.class})
class CalculadoraTest {

}
