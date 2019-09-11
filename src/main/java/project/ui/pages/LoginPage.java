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

import core.selenium.TrabajopolisConfig;
import core.utils.TrabajopolisUtils;
import org.openqa.selenium.By;

/**
 * LoginPage class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class LoginPage extends TrabajopolisUtils {
    private TrabajopolisConfig amazonConfig;

    /**
     * Fills user name and password.
     */
    public void fillUserNamePassword() {
        sendKey(By.name("username"), amazonConfig.getInstance().getUsername());
        sendKey(By.name("password"), amazonConfig.getInstance().getPassword());
        click(By.cssSelector("fieldset:nth-child(5)"));
        click(By.cssSelector(".button"));
    }

    /**
     * Get the result of the math operation.
     * @return message - Message that contains a locator.
     */
    public String getText() {
        return getMessage(By.cssSelector("fieldset:nth-child(3) > .inputField"));
    }
}
