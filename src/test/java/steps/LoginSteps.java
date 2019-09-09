/*
 * @(#) LoginSteps.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package steps;

import core.selenium.AmazonConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import project.ui.pages.LoginPage;

/**
 * LoginSteps class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class LoginSteps {
    private LoginPage loginPage = new LoginPage();
    private AmazonConfig amazonConfig;

    /**
     * This stps do click on register seccion.
     */
    @Given("user go to login page")
    public void userGoToLoginPage() {
        loginPage.visit(amazonConfig.getInstance().getUrl());
    }

    /**
     * Fills all data for user login.
     */
    @When("user put username and password")
    public void userPutUsernameAndPassword() {
        loginPage.fillUserNamePassword();
    }

    /**
     * Get a message of new Authentication.
     */
    @Then("user login successfully")
    public void userLoginSuccefuly() {
        Assert.assertEquals(loginPage.message(), "Authentication required");
        //    loginPage.close();
    }
}
