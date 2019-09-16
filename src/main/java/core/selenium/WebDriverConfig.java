/*
 * @(#) WebDriverConfig.java Copyright (c) 2019 Jala Foundation.
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

import core.utils.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * WebDriverConfig class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public final class WebDriverConfig {
    private InputStream input;
    private Properties properties;
    private String browser;
    private String waitImplicitChrome;
    private String waitExplicitChrome;
    private String waitImplicitFirefox;
    private String waitExplicitFirefox;
    private static WebDriverConfig webDriverConfig;

    /**
     * Constructor sets properties.
     */
    private WebDriverConfig() {
        properties = browser();
    }

    /**
     * Gets instance for init properties.
     *
     * @return webDriverConfig.
     */
    public static WebDriverConfig getInstance() {
        if (webDriverConfig == null) {
            webDriverConfig = new WebDriverConfig();
        }
        return webDriverConfig;
    }

    /**
     * Gets values from gradle properties for the tests.
     *
     * @return properties - Properties with all data of the web driver.
     */
    public Properties browser() {
        try {
            input = new FileInputStream(System.getProperty("user.dir") + "/gradle.properties");
            properties = new Properties();
            properties.load(input);
            browser = properties.getProperty("browser");
            waitImplicitChrome = properties.getProperty("waitImplicitChrome");
            waitExplicitChrome = properties.getProperty("waitExplicitChrome");
            waitImplicitFirefox = properties.getProperty("waitImplicitFirefox");
            waitExplicitFirefox = properties.getProperty("waitExplicitFirefox");
        } catch (IOException e) {
            Log.getInstance().getLog().error(e + "File not found.");
            throw new RuntimeException("File not found." + e);
        }
        return properties;
    }

    /**
     * Gets browser name.
     *
     * @return browser
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * Gets implicit wait for chrome.
     *
     * @return waitImplicit
     */
    public String getWaitImplicitChrome() {
        return waitImplicitChrome;
    }

    /**
     * Gets explicit wait for chrome.
     *
     * @return waitExplicit
     */
    public String getWaitExplicitChrome() {
        return waitExplicitChrome;
    }

    /**
     * Gets explicit wait for firefox.
     *
     * @return waitExplicit
     */
    public String getWaitImplicitFirefox() {
        return waitImplicitFirefox;
    }

    /**
     * Gets explicit wait for firefox.
     *
     * @return waitExplicit
     */
    public String getWaitExplicitFirefox() {
        return waitExplicitFirefox;
    }
}
