/*
 * @(#) WebDriverManager.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.selenium;

import core.selenium.webdriver.ConnectionFactory;
import org.openqa.selenium.WebDriver;

/**
 * WebDriverManager class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public final class WebDriverManager {
    private WebDriverConfig webDriverConfig;
    private static WebDriver driver;
    private static WebDriverManager webDriverManager;

    /**
     * Constructor sets properties.
     */
    private WebDriverManager() {
        ConnectionFactory connection = new ConnectionFactory();
        driver = connection.selector();
    }

    /**
     * Gets instance for init properties.
     *
     * @return webDriverManager.
     */
    public static WebDriverManager getInstance() {
        if (webDriverManager == null) {
            webDriverManager = new WebDriverManager();
        }
        return webDriverManager;
    }

    /**
     * Gets driver for common methods.
     *
     * @return driver
     */
    public WebDriver getDriver() {
        return driver;
    }
}
