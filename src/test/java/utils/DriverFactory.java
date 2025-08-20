package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverFactory {

    private static AndroidDriver driver;

    //  Inicializa o driver com as capabilities
    public static WebDriver getDriver() {
        if (driver == null) {
            try {
                UiAutomator2Options options = new UiAutomator2Options();
                options.setDeviceName("emulator-5554"); // nome do emulador (ver com `adb devices`)
                options.setPlatformName("Android");
                options.setAutomationName("UiAutomator2");
                options.setAppPackage("com.google.android.calculator"); // pacote da calculadora nativa
                options.setAppActivity("com.android.calculator2.Calculator"); // activity inicial
                options.setNoReset(true);
                options.setUiautomator2ServerLaunchTimeout(Duration.ofSeconds(60)); // aumenta timeout

                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    //  Fecha o driver após os testes
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
