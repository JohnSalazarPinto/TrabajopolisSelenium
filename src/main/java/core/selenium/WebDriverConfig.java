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

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * WebDriverConfig class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class WebDriverConfig {
    InputStream input;
    Properties properties;
    String browser;
    String waitImplicitChrome;
    String waitExplicitChrome;
    String waitImplicitFirefox;
    String waitExplicitFirefox;

    public static WebDriverConfig webDriverConfig;

    private WebDriverConfig() {
        properties = browser();
    }

    public static WebDriverConfig getInstance() {
        if (webDriverConfig == null) {
            webDriverConfig = new WebDriverConfig();
        }
        return webDriverConfig;
    }

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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static void main(String[] args) {
        WebDriverConfig webDriverConfig = new WebDriverConfig();
        webDriverConfig.getInstance();
    }

    public String getBrowser() {
        return browser;
    }

    public String getWaitImplicitChrome() {
        return waitImplicitChrome;
    }

    public String getWaitExplicitChrome() {
        return waitExplicitChrome;
    }

    public String getWaitImplicitFirefox() {
        return waitImplicitFirefox;
    }

    public String getWaitExplicitFirefox() {
        return waitExplicitFirefox;
    }
}
