/*
 * @(#) TrabajopolisUtils.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.utils;

import core.selenium.TrabajopolisConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project.ui.BasePage;

import java.util.concurrent.TimeUnit;

/**
 * TrabajopolisUtils class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class TrabajopolisUtils {
    private WebDriver driver;
    private TrabajopolisConfig amazonConfig;

    /**
     * Constructor class init connection for set driver.
     */
    public TrabajopolisUtils() {
        driverConnection();
    }

    /**
     * Method for connect with chrome.
     */
    public void driverConnection() {
        BasePage basePage = new BasePage();
        driver = basePage.driverConnection();
    }

    /**
     * This method makes click action.
     *
     * @param locator - Locator type for do the action.
     */
    public void click(final By locator) {
        driver.findElement(locator).click();
    }

    /**
     * This method makes click action.
     *
    // * @param locator - Locator type for do the action.
     */
    public void clickMulti() {
       driver.findElement(By.className("priorityListing")).findElement(By.className("anuncio-estandar-content")).findElement(By.className("anuncio-estandar-titulo")).click();
    }

    /**
     * This method works for fill data.
     *
     * @param locator - where we will fill the data.
     * @param key     - Data that will be fill.
     */
    public void sendKey(final By locator, final String key) {
        driver.findElement(locator).sendKeys(key);
    }

    /**
     * This method get the result for assert.
     *
     * @param locator - Locator type.
     * @return value - Value for the assertion.
     */
    public String value(final By locator) {
        String value = driver.findElement(locator).getAttribute("value");
        return value;
    }

    /**
     * This method get the result for assert.
     *
     * @param locator - Locator type.
     * @return value - Text of the locator.
     */
    public String message(final By locator) {
        String message = driver.findElement(locator).getText();
        return message;
    }

    /**
     * This method close the browser after of the test.
     */
    public void close() {
        driver.close();
    }

    /**
     * This method quit the browser after of the test.
     */
    public void quit() {
        driver.quit();
    }

    /**
     * Time for wait that the page load.
     *
     * @param wait - Number in seconds.
     */
    public void implicitWait(final int wait) {
        driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
    }
}
