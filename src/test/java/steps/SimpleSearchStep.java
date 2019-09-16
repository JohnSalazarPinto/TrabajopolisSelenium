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

import Trabajopolis.entities.Context;
import Trabajopolis.ui.pages.PageTransport;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import Trabajopolis.ui.pages.MainPage;
import Trabajopolis.ui.pages.JobOffer;
import Trabajopolis.ui.pages.ResultSearch;

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
    private Context context;

    /**
     * Constructor class init vulues.
     */
    public SimpleSearchStep() {
        this.mainPage = new MainPage();
        this.resultSearch = new ResultSearch();
        this.offer = new JobOffer();
        this.context = new Context();
    }

    /**
     * This step goes to the main page.
     */
    @When("the user unregistered navigates to principal search page")
    public void theUserUnregisteredNavigatesToPrincipalSearchPage() {
        new PageTransport();
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
    @Then("the job with the category {string} is displayed in the results page")
    public void theJobIsDisplayedInTheResultsPage(final String keyWord) {
        resultSearch.clickFirstResult();
        System.out.println(offer.getMessageCategory());
        Assert.assertTrue(offer.getMessageCategory().contains(keyWord));
    }

    /**
     * This step fill the characteristics for the search.
     *
     * @param bodyFields - User data search.
     */
    @When("the user searches with the following characteristics")
    public void theUsErSearchesWithTheFollowingCharacteristics(final Map<String, String> bodyFields) {
        String keyword = bodyFields.get("Palabra de busqueda");
        String category = bodyFields.get("Categoría");
        String city = bodyFields.get("Ciudad");
        String contract = bodyFields.get("Contrato");
        String postedWithin = bodyFields.get("Publicado Dentro de");
        context.getSearch().setCategory(category);
        context.getSearch().setCity(city);
        context.getSearch().setContract(contract);
        context.getSearch().setPostedWithin(postedWithin);
        context.getSearch().setKeyword(keyword);
        mainPage.fillSimpleSearch(keyword);
        mainPage.setText(category, city, contract, postedWithin);
        mainPage.clickSearch();
    }

    /**
     * This step confirm the last search by characteristics.
     */
    @Then("the job with the following information is displayed in the results page")
    public void theJobWithTheFollowingInformationIsDisplayedInTheResultsPage() {
        resultSearch.clickFirstResult();
        Assert.assertTrue(offer.getMessageCategory().contains(context.getSearch().getCategory()) &&
                offer.getMessageCity().contains(context.getSearch().getCity()) &&
                offer.getMessageType().contains(context.getSearch().getContract()));
    }
}
