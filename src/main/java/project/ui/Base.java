/*
 * @(#) Base.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package project.ui;

import core.selenium.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Base class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class Base {
    private WebDriver driver;
    WebDriverManager webDriverManager;
    private static String url = "https://www.calculadora.org/";

    /**
     * Constructor class init connection for set driver.
     */
    public Base(){
        driverConnection();
    }
    /**
     * Method for connect with chrome.
     *
     * @return driver
     */
    public void driverConnection() {
        driver = WebDriverManager.getInstance().getDriver();
    }

    /**
     * This method makes click acction.
     *
     * @param locator - Locator type for do the acction.
     */
    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void sendKey(By locator,String key){
        driver.findElement(locator).sendKeys(key);
    }

    /**
     * This method visit the page.
     *
     * @param url - The page for test.
     */
    public void visit(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    /**
     * This method get the result for assert.
     *
     * @param locator - Locator type.
     * @return value - Value for the assertion.
     */
    public String value(By locator) {
        String value = driver.findElement(locator).getAttribute("value");
        return value;
    }

    /**
     * This method get the result for assert.
     *
     * @param locator - Locator type.
     * @return value - Value for the assertion.
     */
    public String message(By locator) {
        String value = driver.findElement(locator).getText();
        return value;
    }

    /*
     * This method close the browser after of the test.
     */
    public void close() {
        driver.close();
    }

    public void clean(){
        driver.findElement(By.linkText("C")).click();
    }

    /**
     * Time for wait that the page load.
     *
     * @param wait - Number in seconds.
     */
    public void implicitWait(int wait) {
        driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
    }
}
