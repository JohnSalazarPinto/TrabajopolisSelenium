package core.selenium.webdriver;

import core.selenium.WebDriverConfig;
import org.openqa.selenium.WebDriver;

public class ConnectionFactory {
    public WebDriverConfig webDriverConfig;
    private WebDriver driver;

    public WebDriver selector(String browser) {
        webDriverConfig.getInstance().getBrowser();
        if (browser.contains("chrome")) {
            driver = Chrome.driverConnection();
        } else if (browser.contains("firefox")) {
            driver = Firefox.driverConnection();
        }
        return driver;
    }
}
