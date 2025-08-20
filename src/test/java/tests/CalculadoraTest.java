package tests;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import pages.CalculadoraPage;
import utils.DriverFactory;



@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculadoraTest {
    private static CalculadoraPage calc;

    @BeforeAll
    public static void setUp() {
        calc = new CalculadoraPage(DriverFactory.getDriver());
    }

    @Test
    @Order(1)
    public void deveDividir200Por10() {
        String resultado = calc.dividir("200", "10");
        assertEquals("20", resultado);
    }   

   @Test
   @Order(2)
    public void deveCalcularRaizQuadradaDe25() {
        String resultado = calc.raizQuadrada("25");
        assertEquals("5", resultado);
    }

    @Test
    @Order(3)
    public void deveCalcularPotenciaDe2ElevadoA3() {
        String resultado = calc.potencia("2", "3");
        assertEquals("8", resultado);
    }

    @Test
    @Order(4)
    public void deveSomarTresNumeros() {
        String resultado = calc.somarTresNumeros("5", "3", "4");
        assertEquals("12", resultado);
    }

    @Test
    @Order(5)
    public void deveCalcularDezPorCentoDeCinquenta() {
        String resultado = calc.percentual("50", "10");
        assertEquals("5", resultado);
    }


    @AfterAll
        public static void tearDown() {
            DriverFactory.quitDriver();
    }   


}
