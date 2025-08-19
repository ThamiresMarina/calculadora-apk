package tests;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.CalculadoraPage;
import utils.DriverFactory;



public class CalculadoraTest {
    private CalculadoraPage calc;

    @BeforeEach
    public void setUp() {
        calc = new CalculadoraPage(DriverFactory.getDriver());
    }

    @Test
    public void deveDividir200Por10() {
        String resultado = calc.dividir("200", "10");
        assertEquals("20", resultado);
    }

    @AfterEach
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
