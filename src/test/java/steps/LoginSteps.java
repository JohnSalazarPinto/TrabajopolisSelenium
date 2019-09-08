package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import project.ui.Base;
import project.ui.pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("user go to login page")
    public void userGoToLoginPage() {
        loginPage.click(By.cssSelector("#nav-link-accountList > .nav-line-2"));
    }

    @When("user put username and password")
    public void userPutUsernameAndPassword() {
        loginPage.login();
    }

    @Then("user login succefuly")
    public void userLoginSuccefuly() {
    }
}
