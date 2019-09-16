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

import core.selenium.TrabajopolisConfig;
import core.selenium.WebDriverManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import trabajopolis.ui.pages.LoginPage;
import trabajopolis.ui.pages.PageTransport;

/**
 * LoginSteps class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class LoginSteps {
    private LoginPage loginPage;

    /**
     * Constructor class init vulues.
     */
    public LoginSteps() {
        this.loginPage = new LoginPage();
        new PageTransport();
    }

    /**
     * This step do click on register seccion.
     */
    @Given("the user goes to login page")
    public void userGoToLoginPage() {
        PageTransport.visitLogin();
    }

    /**
     * Fills all data for user loginSuccessfully.
     */
    @When("the user puts his username and password")
    public void userPutUsernameAndPassword() {
        String userName = TrabajopolisConfig.getInstance().getUsername();
        String password = TrabajopolisConfig.getInstance().getPassword();
        loginPage.loginSuccessfully(userName, password);
    }

    /**
     * User confirm his login by title of the new page.
     */
    @Then("user login successfully")
    public void userLoginSuccessfully() {
        Assert.assertTrue(WebDriverManager.getDriver().getTitle().contains("Mi Cuenta | Trabajopolis.bo"));
    }
}
