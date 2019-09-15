/*
 * @(#) BasePage.java Copyright (c) 2019 Jala Foundation.
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * BasePage class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class BasePage {
    private WebDriver driver;

    /**
     * Method for connect with chrome.
     */
    public BasePage() {
        driver = WebDriverManager.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }
}
