/*
 * @(#) Chrome.java Copyright (c) 2019 Jala Foundation.
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

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Chrome class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class Chrome implements IBrowser {
    private static WebDriver driver;

    /**
     * Method for connect with chrome.
     *
     * @return driver - WebDriver.
     */
    public WebDriver init() {
        ChromeDriverManager.getInstance().version("76.0.3809.126").setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        return driver;
    }
}
