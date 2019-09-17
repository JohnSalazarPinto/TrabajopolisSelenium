/*
 * @(#) Firefox.java Copyright (c) 2019 Jala Foundation.
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

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Firefox class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class Firefox implements IBrowser {
    private static WebDriver driver;

    /**
     * Method for connect with firefox.
     *
     * @return driver
     */
    public WebDriver init() {
        FirefoxDriverManager.getInstance().version("0.24.0").setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--incognito");
        driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().maximize();
        return driver;
    }
}
