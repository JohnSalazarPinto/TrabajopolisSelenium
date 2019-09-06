package core.selenium.webdriver;

import org.openqa.selenium.WebDriver;

public interface IBrowser {

    WebDriver driver = null;

    public static WebDriver DriverConnection() {
        return driver;
    }
}
