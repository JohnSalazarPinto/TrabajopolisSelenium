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
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import project.ui.pages.LoginPage;
import project.ui.pages.PageTransport;

/**
 * LoginSteps class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class LoginSteps {
    private LoginPage loginPage;
    private TrabajopolisConfig amazonConfig;
    private PageTransport pageTransport;

    /**
     * Constructor class init vulues.
     */
    public LoginSteps() {
        this.loginPage = new LoginPage();
        this.pageTransport = new PageTransport();
    }

    /**
     * This stps do click on register seccion.
     */
    @Given("the user goes to login page")
    public void userGoToLoginPage() {
        PageTransport.visitLogin();
    }

    /**
     * Fills all data for user login.
     */
    @When("the user puts his username and password")
    public void userPutUsernameAndPassword() {
        loginPage.fillUserNamePassword();
    }

    /**
     * Get a message of new Authentication.
     */
    @Then("user login successfully")
    public void userLoginSuccefuly() {
        PageTransport.visitLogin();
        Assert.assertEquals(loginPage.getMessage(By.className("indexDiv")),
                "Usted Está Conectado Como johnpiterzon@gmail.com");
    }

    /**
     * Goes to account page.
     */
    @Given("the user goes to account page")
    public void theUserGoesToAcoountPage() {
        PageTransport.visitProfile();
    }

    /**
     * Get a message of new Authentication.
     */
    @Then("user confirm his correct data successfully")
    public void userConfirmHisCorrectDataSuccessfully() {
        Assert.assertEquals(loginPage.getText(), "johnpiterzon@gmail.com");
    }
}
