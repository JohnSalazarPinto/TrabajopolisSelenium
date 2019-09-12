package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import project.ui.pages.CurriculumPage;
import project.ui.pages.PageTransport;

import java.util.Map;

public class CurriculumSteps {
    @When("the user navigates curriculum page")
    public void theUserNavigatesCurriculumPage() {
        CurriculumPage.visitCurriculumPage();
        CurriculumPage.clickFillForm();
    }

    @And("the user fill the data with the following characteristics")
    public void theUserFillTheDataWithTheFollowingCharacteristics(Map<String, String> bodyFields) {
        //   mainPage.sendKeyWord(bodyFields.get("keyword"));
        //   mainPage.selectJobsCategory(bodyFields.get("Category"));
        CurriculumPage.fillCurriculumFormPageOne(bodyFields.get("Nombre"), bodyFields.get("Apellido")
                , bodyFields.get("Celular"), bodyFields.get("Numero documento"), bodyFields.get("Direccion"));
        CurriculumPage.fillOptions(bodyFields.get("Documento"), bodyFields.get("Estado civil"));
        CurriculumPage.goNextPage();
    }

}
