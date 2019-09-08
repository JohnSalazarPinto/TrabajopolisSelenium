package core.selenium.webdriver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox implements IBrowser {
    private static WebDriver driver;

    @Override
    public void connection() {
        driverConnection();
    }

    /**
     * Method for connect with firefox.
     *
     * @return driver -
     */
    public static WebDriver driverConnection() {
        FirefoxDriverManager.getInstance().version("0.24.0").setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--incognito");
        driver = new FirefoxDriver(firefoxOptions);
        driver.get("https://www.calculadora.org/");
        driver.manage().window().maximize();
        return driver;
    }


}
