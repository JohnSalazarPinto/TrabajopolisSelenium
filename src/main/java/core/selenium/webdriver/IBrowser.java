package core.selenium.webdriver;

import org.openqa.selenium.WebDriver;

/**
 * IBrowser class
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public interface IBrowser {

    /**
     * Defines a method for get a WebDriver object.
     *
     * @return a WebDriver object.
     */
    public WebDriver init();
}
