/*
 * @(#) PageTransport.java Copyright (c) 2019 Jala Foundation.
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

import core.selenium.TrabajopolisConfig;
import org.openqa.selenium.WebDriver;
import project.ui.BasePage;

/**
 * PageTransport class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class PageTransport {
    private static WebDriver driver;
    private static TrabajopolisConfig amazonConfig;

    /**
     * Init driver.
     */
    public PageTransport() {
        this.driver = new BasePage().driverConnection();
    }

    /**
     * This method visit the page.
     */
    public static void visitLogin() {
        driver.get(amazonConfig.getInstance().getUrlLogin());
    }

    /**
     * This method visit the profile page.
     */
    public static void visitProfile() {
        driver.get(amazonConfig.getInstance().getUrlProfile());
    }

    /**
     * This method visit the profile page.
     */
    public static void visitMainPage() {
        driver.get(amazonConfig.getInstance().getUrlBase());
    }
}
