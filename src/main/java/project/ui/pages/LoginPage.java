/*
 * @(#) LoginPage.java Copyright (c) 2019 Jala Foundation.
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

import org.openqa.selenium.By;
import project.ui.Base;

/**
 * LoginPage class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class LoginPage extends Base {

    public void login() {
        //    driver.get("https://www.amazon.com//");
        driverConnection();
        //    driver.findElement(By.cssSelector("#nav-link-accountList > .nav-line-2")).click();
        click(By.cssSelector("#nav-link-accountList > .nav-line-2"));
        // driver.findElement(By.id("ap_email")).sendKeys("johnpiterzon@gmail.com");
        sendKey(By.id("ap_email"), "johnpiterzon@gmail.com");
        //   driver.findElement(By.cssSelector(".a-button-inner > #continue")).click();
        click(By.cssSelector(".a-button-inner > #continue"));
        //    driver.findElement(By.id("ap_password")).sendKeys("Holamundo@1");
        sendKey(By.id("ap_password"), "Holamundo@1");
        //    driver.findElement(By.id("signInSubmit")).click();
        click(By.id("signInSubmit"));
    }

    /**
     * Get the result of the math operation.
     */
    public String message() {
        return message(By.className("a-row"));
    }
}