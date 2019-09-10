package steps;

import core.utils.TrabajopolisUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.By;
import project.ui.pages.Jobs;
import project.ui.pages.LoginPage;
import project.ui.pages.MainPage;
import project.ui.pages.PageTransport;

public class SearchSteps {
    private PageTransport pageTransport = new PageTransport();
    private MainPage mainPage = new MainPage();
    private Jobs jobs = new Jobs();
    TrabajopolisUtils trabajopolisUtils = new TrabajopolisUtils();

    @Given("the user goes principal page")
    public void theUserGoesPrincipalPage() {
        pageTransport.visitMainPage();
    }

    @When("user search a specific keyword")
    public void userSearchASpecificKeyword() {
        mainPage.sendKeyWord("cocina");
        mainPage.search();
    }

    @Then("the result conteins in his category this keyword")
    public void theResultConteinsInHisCategoryThisKeyword() {
        trabajopolisUtils.clickMulti();
        System.out.println(jobs.searchInfo("smallListingInfo"));

        Assert.assertTrue(jobs.searchInfo("smallListingInfo").contains("cocina"));
    }
}
