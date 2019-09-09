/*
 * @(#) ConnectionFactory.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.selenium.webdriver;

import core.selenium.WebDriverConfig;
import org.openqa.selenium.WebDriver;

/**
 * ConnectionFactory class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class ConnectionFactory {
    private WebDriverConfig webDriverConfig;
    private WebDriver driver;

    /**
     * This method chosse the browser type accord of the properties.
     *
     * @param browser - Type of Browser for the test.
     * @return driver - New browser driver.
     */
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
