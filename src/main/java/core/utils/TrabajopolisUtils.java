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
import core.selenium.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * TrabajopolisUtils class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class TrabajopolisUtils {
    private static WebDriver driver = WebDriverManager.getInstance().getDriver();
    private TrabajopolisConfig amazonConfig;

    /**
     * This method select an option from combo box.
     *
     * @param webElement - WebElement of the combo box
     * @param value      - Option of the combo box
     */
    public static void selectComboBox(final WebElement webElement, final String value) {
        new Select(webElement).selectByValue(value);
    }

    /**
     * This method select date on date helper.
     *
     * @param webElementMonth - WebElement for select month.
     * @param webElementYear  - WebElement for select year.
     * @param value           - Number of the day.
     */
    public static void selectDate(final WebElement webElementMonth,
                                  final WebElement webElementYear, final String value) {
        String[] date = value.split("-");
        date[1] = String.valueOf(Integer.parseInt(date[1]) - 1);
        selectComboBox(webElementMonth, date[1]);
        selectComboBox(webElementYear, date[2]);
        selectDateDay(Integer.parseInt(date[0]));
    }

    /**
     * This method do click on the day of the table date helper.
     *
     * @param day - Number of the day.
     */
    public static void selectDateDay(final int day) {
        int row = 6;
        int column = 7;
        int dayForm;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                try {
                    dayForm = Integer.parseInt(driver.findElement(
                            By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[" + i + "]/td[" + j + "]/a"))
                            .getText());
                } catch (Exception e) {
                    continue;
                }
                if (dayForm == day) {
                    driver.findElement(
                            By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[" + i + "]/td[" + j + "]/a"))
                            .click();
                }
            }
        }
    }

    /**
     * This method makes click action.
     *
     * @param locator - Locator type for do the action.
     */
    public static void click(final By locator) {
        driver.findElement(locator).click();
    }

    /**
     * This method makes click action.
     *
     * @param element - Element type for do the action.
     */
    public static void click(final WebElement element) {
        element.click();
    }

    /**
     * This method works for fill data.
     *
     * @param element - WebElement of the text field.
     * @param text    - String for the text field.
     */
    public static void setText(final WebElement element, final String text) {
        element.clear();
        element.sendKeys(text);
    }

    /**
     * This method get the result for assert.
     *
     * @param locator - Locator type.
     * @return value - Value for the assertion.
     */
    public static String value(final By locator) {
        String value = driver.findElement(locator).getAttribute("value");
        return value;
    }

    /**
     * This method get the result for assert.
     *
     * @param element - Locator type.
     * @return value - Text of the locator.
     */
    public static String getMessage(final WebElement element) {
        String message = element.getText();
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
