package core.selenium.webdriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements IBrowser {

    private static WebDriver driver;

    @Override
    public void connection() {
        driverConnection();
    }

    /**
     * Method for connect with chrome.
     *
     * @return driver -
     */
    public static WebDriver driverConnection() {
        ChromeDriverManager.getInstance().version("76.0.3809.126").setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.calculadora.org/");
        driver.manage().window().maximize();
        return driver;
    }
}
