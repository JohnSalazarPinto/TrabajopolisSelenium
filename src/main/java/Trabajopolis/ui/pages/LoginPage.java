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

package Trabajopolis.ui.pages;

import core.utils.TrabajopolisUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Trabajopolis.ui.BasePage;

/**
 * LoginPage class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class LoginPage extends BasePage {
    @FindBy(name = "username")
    private WebElement userTextBox;

    @FindBy(name = "password")
    private WebElement passwordTextBox;

    @FindBy(css = ".button")
    private WebElement loginBtn;

    /**
     * This method send username.
     *
     * @param userName - User username.
     */
    private void setUserName(final String userName) {
        TrabajopolisUtils.setText(userTextBox, userName);
    }

    /**
     * This method sends password.
     *
     * @param password - User password.
     */
    private void setPassword(final String password) {
        TrabajopolisUtils.setText(passwordTextBox, password);
    }

    /**
     * This method do click on login button.
     *
     * @return hompage - CurriculumPage home page.
     */
    private HomePage clickLoginBtn() {
        TrabajopolisUtils.click(loginBtn);
        return new HomePage();
    }

  /**
     * Fills user name and password.
     *
     * @param userName - User username
     * @param password - User password
     * @return hompage - CurriculumPage home page.
     */
    public HomePage loginSuccessfully(final String userName, final String password) {
        setUserName(userName);
        setPassword(password);
        return clickLoginBtn();
    }
}
