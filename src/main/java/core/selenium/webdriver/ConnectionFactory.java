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

import java.util.HashMap;
import java.util.Map;

/**
 * ConnectionFactory class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class ConnectionFactory {
    private static WebDriverConfig webDriverConfig = WebDriverConfig.getInstance();
    private static final String FIREFOX = "firefox";
    private static final String CHROME = "chrome";
    private static WebDriver driver;

    /**
     * This method chosse the browser type accord of the properties.
     *
     * @return driver - New browser driver.
     */
    public static WebDriver selector() {
        Map<String, IBrowser> strategyBrowser = new HashMap<>();
        strategyBrowser.put(FIREFOX, new Firefox());
        strategyBrowser.put(CHROME, new Chrome());
        driver = strategyBrowser.get(webDriverConfig.getBrowser().toLowerCase()).init();
        return driver;
    }
}
