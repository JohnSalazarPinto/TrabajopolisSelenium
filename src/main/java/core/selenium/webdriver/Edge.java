package core.selenium.webdriver;

import io.github.bonigarcia.wdm.EdgeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edge {
    private static WebDriver driver;

    /**
     * Method for connect with edge.
     *
     * @return driver
     */
    public static WebDriver driverConnection() {
        EdgeDriverManager.getInstance().version("6.17134").setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.calculadora.org/");
        driver.manage().window().maximize();
        return driver;
    }
}
