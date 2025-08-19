package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class CalculadoraPage {
    private WebDriver driver;

    public CalculadoraPage(WebDriver driver) {
        this.driver = driver;
    }

    // Método para dividir dois números
    public String dividir(String num1, String num2) {
        // digita o primeiro número
        for (char c : num1.toCharArray()) {
            driver.findElement(AppiumBy.accessibilityId(String.valueOf(c))).click();
        }

        // operador divisão
        driver.findElement(AppiumBy.accessibilityId("divide")).click();

        // digita o segundo número
        for (char c : num2.toCharArray()) {
            driver.findElement(AppiumBy.accessibilityId(String.valueOf(c))).click();
        }

        // clica em igual
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

    WebElement resultado = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
        System.out.println("Resultado capturado: " + resultado.getText());
        return resultado.getText();

    }
}
