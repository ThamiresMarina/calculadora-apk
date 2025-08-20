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

    public String raizQuadrada(String num) {
    // Clica no botão raiz quadrada
    driver.findElement(AppiumBy.accessibilityId("square root")).click();

    // Digita o número (ex: "25")
    for (char c : num.toCharArray()) {
        driver.findElement(AppiumBy.accessibilityId(String.valueOf(c))).click();
    }

    // Clica no igual para confirmar
    driver.findElement(AppiumBy.accessibilityId("equals")).click();

    // Pega o resultado no campo final
    WebElement resultado = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
    return resultado.getText();

    }

    // método potência

    public String potencia(String base, String expoente) {
        // Digita a base
        for (char c : base.toCharArray()) {
            driver.findElement(AppiumBy.accessibilityId(String.valueOf(c))).click();
        }

        // Clica no botão de potência
        driver.findElement(AppiumBy.accessibilityId("power")).click();

        // Digita o expoente
        for (char c : expoente.toCharArray()) {
            driver.findElement(AppiumBy.accessibilityId(String.valueOf(c))).click();
        }

        // Clica no igual para calcular
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Captura o resultado
        WebElement resultado = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
        return resultado.getText();
    }

    public String somarTresNumeros(String n1, String n2, String n3) {
        // Primeiro número
        for (char c : n1.toCharArray()) {
            driver.findElement(AppiumBy.accessibilityId(String.valueOf(c))).click();
        }

        // +
        driver.findElement(AppiumBy.accessibilityId("plus")).click();

        // Segundo número
        for (char c : n2.toCharArray()) {
            driver.findElement(AppiumBy.accessibilityId(String.valueOf(c))).click();
        }

        // +
        driver.findElement(AppiumBy.accessibilityId("plus")).click();

        // Terceiro número
        for (char c : n3.toCharArray()) {
            driver.findElement(AppiumBy.accessibilityId(String.valueOf(c))).click();
        }

        // =
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Captura o resultado
        WebElement resultado = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
        return resultado.getText();

        
        }


    public String percentual(String base, String valor) {
        // Digita a base (ex: "50")
        for (char c : base.toCharArray()) {
            driver.findElement(AppiumBy.accessibilityId(String.valueOf(c))).click();
        }

        // Pressiona o botão de porcentagem
        driver.findElement(AppiumBy.accessibilityId("percent")).click();

        // Digita o valor (ex: "10")
        for (char c : valor.toCharArray()) {
            driver.findElement(AppiumBy.accessibilityId(String.valueOf(c))).click();
        }

        // Pressiona "="
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Captura o resultado final
        WebElement resultado = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
        return resultado.getText();
    }
    



}
