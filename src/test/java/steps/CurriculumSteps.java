/*
 * @(#) CurriculumSteps.java Copyright (c) 2019 Jala Foundation.
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

import core.utils.TrabajopolisUtils;
import trabajopolis.entities.Context;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import trabajopolis.ui.pages.FormPageOne;
import trabajopolis.ui.pages.FormPageTwo;
import trabajopolis.ui.pages.FormPageFour;
import trabajopolis.ui.pages.FormPageThree;
import trabajopolis.ui.pages.CurriculumManager;
import trabajopolis.ui.pages.CurriculumPage;

import java.util.Map;

/**
 * CurriculumSteps class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class CurriculumSteps {
    private FormPageOne formPageOne;
    private FormPageTwo formPageTwo;
    private FormPageThree formPageThree;
    private FormPageFour formPageFour;
    private CurriculumManager curriculumManager;
    private Context context;
    private CurriculumPage curriculumPage;

    /**
     * Constructor class init vulues.
     */
    public CurriculumSteps() {
        this.formPageOne = new FormPageOne();
        this.formPageTwo = new FormPageTwo();
        this.formPageThree = new FormPageThree();
        this.formPageFour = new FormPageFour();
        this.curriculumManager = new CurriculumManager();
        this.context = new Context();
        this.curriculumPage = new CurriculumPage();
    }

    /**
     * User navigates CV summary page
     */
    @When("the user navigates to CV summary page")
    public void theUserNavigatesToCurriculumPage() {
        formPageOne.visitCurriculumPage();
    }

    /**
     * User fill data of the first form page.
     *
     * @param bodyFields - User Data
     */
    @When("the user fill the datas in the first form page with the following characteristics")
    public void theUserFillTheDatasInTheFirstFormPageWithTheFollowingCharacteristics(final Map<String, String> bodyFields) {
        String name = bodyFields.get("Nombre");
        String lastName = bodyFields.get("Apellido");
        String cellPhone = bodyFields.get("Celular");
        String document = bodyFields.get("Documento");
        String idDocument = bodyFields.get("Numero documento");
        String born = bodyFields.get("Fecha de nacimiento");
        String sex = bodyFields.get("Sexo");
        String address = bodyFields.get("Direccion");
        String civilStatus = bodyFields.get("Estado civil");
        context.getCurriculum().setName(name);
        context.getCurriculum().setLastName(lastName);
        context.getCurriculum().setBornDate(born);
        formPageOne.fillCurriculumFormPageOne(name, lastName, cellPhone, idDocument, address);
        formPageOne.fillOptions(civilStatus, document, born);
    }

    /**
     * User fill data of the second form page.
     *
     * @param bodyFields - User Data
     */
    @When("the user fill the datas in the second form page with the following characteristics")
    public void theUserFillTheDatasInTheSecondFormPageWithTheFollowingCharacteristics(final Map<String, String> bodyFields) {
        String jobTitle = bodyFields.get("Cargo en la empresa");
        String companyName = bodyFields.get("Nombre de la empresa");
        String country = bodyFields.get("País");
        String city = bodyFields.get("Ciudad");
        String initDate = bodyFields.get("Fecha de Inicio");
        String endDate = bodyFields.get("Fecha de Fin");
        context.getWorkExperience().setTitle(jobTitle);
        context.getWorkExperience().setCompanyName(companyName);
        context.getWorkExperience().setWorkingFromDate(TrabajopolisUtils.trasnformDateToLiteral(initDate));
        context.getWorkExperience().setWorkingUntilDate(TrabajopolisUtils.trasnformDateToLiteral(endDate));
        formPageTwo.fillForm(jobTitle, companyName, city);
        formPageTwo.fillComboBox(country);
        formPageTwo.fillDate(initDate, endDate);
    }

    /**
     * User fill data of the third form page.
     *
     * @param bodyFields - User Data
     */
    @When("the user fill the datas in the third form page with the following characteristics")
    public void theUserFillTheDatasInTheThirdFormPageWithTheFollowingCharacteristics(final Map<String, String> bodyFields) {
        String school = bodyFields.get("Colegio o Institución");
        String schoolLevel = bodyFields.get("Nivel de Estudio");
        String country = bodyFields.get("País");
        String city = bodyFields.get("Ciudad");
        String initSchool = bodyFields.get("Fecha de Inicio del colegio");
        String endSchool = bodyFields.get("Fecha de Fin del colegio");
        String university = bodyFields.get("Universidad o Institución");
        String career = bodyFields.get("Carrera, Curso o Seminario");
        String universityLevel = bodyFields.get("Nivel de Estudio Universitario");
        String countryUniversity = bodyFields.get("País Universidad");
        String universityCity = bodyFields.get("Ciudad Universidad");
        String initUniversity = bodyFields.get("Fecha de Inicio Universidad");
        String endUniversity = bodyFields.get("Fecha de Fin Universidad");
        String language = bodyFields.get("Idioma");
        String writingLevel = bodyFields.get("Nivel Escrito");
        String speakingLevel = bodyFields.get("Nivel Oral");
        String readingLevel = bodyFields.get("Nivel Lectura");
        context.getLanguage().setLanguage(language);
        context.getLanguage().setReadingLevel(readingLevel);
        context.getLanguage().setWritingLevel(writingLevel);
        context.getLanguage().setSpeakingLevel(speakingLevel);
        formPageThree.fillForm(school, city, university, career, universityCity);
        formPageThree.selectComboBox(schoolLevel, country, universityLevel, countryUniversity);
        formPageThree.selectLanguage(language, writingLevel, speakingLevel, readingLevel);
        formPageThree.selectDate(initSchool, endSchool, initUniversity, endUniversity);
    }

    /**
     * User fill data of the four form page.
     *
     * @param bodyFields - User Data
     */
    @When("the user fill the datas in the four form page with the following characteristics")
    public void theUserFillTheDatasInTheFourFormPageWithTheFollowingCharacteristics(final Map<String, String> bodyFields) {
        String title = bodyFields.get("Título");
        String category = bodyFields.get("Categoría");
        String contract = bodyFields.get("Contrato");
        String salaryPretension = bodyFields.get("Pretensión Salarial (Bs.)");
        String country = bodyFields.get("País de residencia");
        String city = bodyFields.get("Ciudad actual");
        String curriculumPrivacity = bodyFields.get("Privacidad del Currículum");
        context.getCurriculum().setTitle(title);
        context.getCurriculum().setSalary(salaryPretension);
        formPageFour.fillForm(title, salaryPretension);
        formPageFour.fillComboForm(category, contract, country, city, curriculumPrivacity);
    }

    /**
     * User confirm his data in the curriculum that was created.
     */
    @Then("the curriculum is created with and the following basic information is displayed in the curriculum page")
    public void theCurriculumIsCreatedWithAndTheFollowingBasicInformationIsDisplayedInTheCurriculumPage() {
        curriculumManager.clickCurriculum();
        Assert.assertTrue(curriculumPage.getNameCurriculum().contains(context.getCurriculum().getName()) &&
                curriculumPage.getLastNameCurriculum().contains(context.getCurriculum().getLastName()) &&
                curriculumPage.getSalaryCurriculum().contains(context.getCurriculum().getSalary()) &&
                curriculumPage.getTitleCurriculum().contains(context.getCurriculum().getTitle()) &&
                curriculumPage.getDateBornToCurriculumFormat().contains(context.getCurriculum().getBornDate()));
    }

    /**
     * User confirm his language data in the curriculum that was created.
     */
    @Then("the curriculum with the following user language information is displayed in the results page")
    public void theCurriculumWithTheFollowingUserLanguageInformationIsDisplayedInTheResultsPage() {
        Assert.assertTrue(curriculumPage.getAllDataLanguage().contains(context.getLanguage().getLanguage()) &&
                curriculumPage.getAllDataLanguage().contains(context.getLanguage().getReadingLevel()) &&
                curriculumPage.getAllDataLanguage().contains(context.getLanguage().getSpeakingLevel()) &&
                curriculumPage.getAllDataLanguage().contains(context.getLanguage().getWritingLevel()));
    }

    /**
     * User confirm his work experience data in the curriculum that was created.
     */
    @Then("the curriculum with the following user work experience information is displayed in the results page")
    public void theCurriculumWithTheFollowingUserWorkExperienceInformationIsDisplayedInTheResultsPage() {
        Assert.assertTrue(curriculumPage.getWorkExperienceCurriculum().contains(context.getWorkExperience().getTitle()) &&
                curriculumPage.getWorkExperienceCurriculum().contains(context.getWorkExperience().getCompanyName()) &&
                curriculumPage.getWorkExperienceCurriculum().contains(context.getWorkExperience().getWorkingFromDate()) &&
                curriculumPage.getWorkExperienceCurriculum().contains(context.getWorkExperience().getWorkingUntilDate()));
    }
}
