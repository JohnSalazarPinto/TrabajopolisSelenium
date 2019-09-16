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

    @FindBy(xpath = "//*[@id=\"rounded-lh-cap\"]/ul/li[3]/div/h1/strong")
    private WebElement titleCurriculum;

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
}
