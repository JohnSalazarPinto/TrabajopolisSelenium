/*
 * @(#) MainPage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package project.ui.pages;

import core.selenium.WebDriverManager;
import core.utils.TrabajopolisUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * MainPage class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class MainPage extends TrabajopolisUtils {

    /**
     * This method works for fill data.
     *
     * @param key - Data that will be fill.
     */
    public void sendKeyWord(final String key) {
        sendKey(By.id("keywords"), key);
    }

    /**
     * This method makes click action.
     */
    public void search() {
        click(By.id("btnSearch"));
    }

    /**
     * This method makes click action.
     */
    public void selectJobsCategory(String value) {
        WebDriverManager.getDriver().findElement(By.xpath("//*[@id=\"quickSearchForm\"]/form/fieldset[1]/div[1]/select/option[3]")).click();
        new Select(WebDriverManager.getDriver().findElement(By.id("quickSearchForm")).
                findElement(By.name("JobCategory[multi_like][]"))).selectByValue(value);
    }
}
