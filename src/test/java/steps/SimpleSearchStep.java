package steps;

import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import core.utils.TrabajopolisUtils;
import org.junit.Assert;
import project.ui.pages.PageTransport;
import project.ui.pages.Jobs;
import project.ui.pages.MainPage;
import project.ui.pages.PageTransport;
import project.ui.pages.ResultSearch;

public class SimpleSearchStep {
    private PageTransport pageTransport = new PageTransport();
    private MainPage mainPage = new MainPage();
    private Jobs jobs = new Jobs();
    TrabajopolisUtils trabajopolisUtils = new TrabajopolisUtils();

    /**
     * Constructor class init vulues.
     */
    public SimpleSearchStep() {
        this.pageTransport = new PageTransport();
        this.jobs= new Jobs();
    }

    @When("the user unregistered navigates to principal search page")
    public void theUserUnregisteredNavigatesToPrincipalSearchPage() {
        PageTransport.visitMainPage();
    }

    @And("the user searches for a job by {string} keyword")
    public void theUserSearchesForAJobByKeyword(String keyWord) {
        mainPage.sendKeyWord(keyWord);
        mainPage.search();
    }

    @Then("the job {string} is displayed in the results page")
    public void theJobIsDisplayedInTheResultsPage(String keyWord) {
        ResultSearch.clickFirstResult();
        System.out.println(Jobs.searchInfo("smallListingInfo"));
        Assert.assertTrue(Jobs.searchInfo("smallListingInfo").contains(keyWord));
    }
}
