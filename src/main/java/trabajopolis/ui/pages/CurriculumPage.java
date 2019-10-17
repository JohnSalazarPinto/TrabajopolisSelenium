/*
 * @(#) CurriculumPage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package trabajopolis.ui.pages;

import trabajopolis.ui.BasePage;
import core.utils.TrabajopolisUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * CurriculumPage class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class CurriculumPage extends BasePage {
    @FindBy(xpath = "//li[@class=\"rounded-sprite content\"] //div[contains(strong,\"Nombre\")]")
    private WebElement nameCurriculum;

    @FindBy(xpath = "//li[@class=\"rounded-sprite content\"] //div[contains(strong,\"Apellido\")]")
    private WebElement lastNameCurriculum;

    @FindBy(xpath = "//li[@class=\"rounded-sprite content\"] //div[contains(strong,\"Fecha de Nacimiento\")]")
    private WebElement dateBornCurriculum;

    @FindBy(xpath = "//li[@class=\"rounded-sprite content\"] //div[contains(strong,\"Pretensión Salarial\")]")
    private WebElement salaryCurriculum;

    @FindBy(xpath = "//div[@class=\"resume-block\"] //span[contains(.,\"Nivel\")]")
    private WebElement languageCurriculum;

    @FindBy(xpath = "//*[@id=\"rounded-lh-cap\"]/ul/li[3]/div/h1/strong")
    private WebElement titleCurriculum;

    @FindBy(xpath = " //*[@id=\"rounded-lh-cap\"]/ul/li[3]/div/div[3]/ul/li")
    private WebElement workExpirence;

    /**
     * This method get name.
     *
     * @return name
     */
    public String getNameCurriculum() {
        return TrabajopolisUtils.getMessage(nameCurriculum);
    }

    /**
     * This method get name.
     *
     * @return name
     */
    public String getLastNameCurriculum() {
        return TrabajopolisUtils.getMessage(lastNameCurriculum);
    }

    /**
     * This method get name.
     *
     * @return name
     */
    public String getDateBornCurriculum() {
        return TrabajopolisUtils.getMessage(dateBornCurriculum);
    }

    /**
     * This method get date born how user put in the feature.
     *
     * @return dateborn - Number date born like dd-MM-yyyy.
     */
    public String getDateBornToCurriculumFormat() {
        String dateBornFeatureFormat = getDateBornCurriculum().replace(".", "-");
        return dateBornFeatureFormat;
    }

    /**
     * Returns all data of the language that user fill in the form.
     *
     * @return languageData
     */
    public String getAllDataLanguage() {
        TrabajopolisUtils.getMessage(languageCurriculum);
        return TrabajopolisUtils.getMessage(languageCurriculum);
    }

    /**
     * This method get name.
     *
     * @return name
     */
    public String getSalaryCurriculum() {
        return TrabajopolisUtils.getMessage(salaryCurriculum);
    }

    /**
     * This method get name.
     *
     * @return name
     */
    public String getTitleCurriculum() {
        return TrabajopolisUtils.getMessage(titleCurriculum);
    }

    /**
     * This method get user work experience.
     *
     * @return name
     */
    public String getWorkExperienceCurriculum() {
        return TrabajopolisUtils.getMessage(workExpirence);
    }
}
