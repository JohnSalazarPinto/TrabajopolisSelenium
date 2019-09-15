/*
 * @(#) SimpleSearchStep.java Copyright (c) 2019 Jala Foundation.
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

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import project.ui.pages.*;

import java.util.Map;

/**
 * SimpleSearchStep class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class SimpleSearchStep {
    private MainPage mainPage;
    private ResultSearch resultSearch;
    private JobOffer offer;

    /**
     * Constructor class init vulues.
     */
    public SimpleSearchStep() {
        new PageTransport();
        this.mainPage = new MainPage();
        this.resultSearch = new ResultSearch();
        this.offer = new JobOffer();
    }

    /**
     * This step goes to the main page.
     */
    @When("the user unregistered navigates to principal search page")
    public void theUserUnregisteredNavigatesToPrincipalSearchPage() {
        PageTransport.visitMainPage();
    }

    /**
     * This step send the key word for the search.
     *
     * @param keyWord - User key word for the search.
     */
    @When("the user searches for a job by {string} keyword")
    public void theUserSearchesForAJobByKeyword(final String keyWord) {
        mainPage.fillSimpleSearch(keyWord);
        mainPage.clickSearch();
    }

    /**
     * This method confirm the keyword on the result.
     *
     * @param keyWord -User keyword of the search.
     */
    @Then("the job {string} is displayed in the results page")
    public void theJobIsDisplayedInTheResultsPage(final String keyWord) {
        resultSearch.clickFirstResult();
        Assert.assertTrue(offer.getMessageCategory().contains(keyWord));
    }

    /**
     * This step fill the characteristics for the search.
     *
     * @param bodyFields - User data search.
     */
    @When("the user searches with the following characteristics")
    public void theUsErSearchesWithTheFollowingCharacteristics(final Map<String, String> bodyFields) {
        mainPage.fillSimpleSearch(bodyFields.get("keyword"));
        mainPage.setText(bodyFields.get("Category"), bodyFields.get("City"),
                bodyFields.get("Type"), bodyFields.get("Posted withing"));
        mainPage.clickSearch();
    }

    /**
     * This step confirm the last search by characteristics.
     */
    @Then("the job with the following information is displayed in the results page")
    public void theJobWithTheFollowingInformationIsDisplayedInTheResultsPage() {
        resultSearch.clickFirstResult();
        offer.publishedWithin();
    }
}
