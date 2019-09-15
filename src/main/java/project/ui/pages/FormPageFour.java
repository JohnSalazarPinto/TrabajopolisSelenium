/*
 * @(#) FormPageFour.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package project.ui.pages;

import core.utils.TrabajopolisUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import project.ui.BasePage;

/**
 * FormPageFour class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class FormPageFour extends BasePage {

    @FindBy(name = "Title")
    private WebElement titleForm;

    @FindBy(name = "JobCategory[]")
    private WebElement jobCategoryForm;

    @FindBy(name = "JobType[]")
    private WebElement jobTypeForm;

    @FindBy(name = "pretension_salarial")
    private WebElement moneyForm;

    @FindBy(name = "Country")
    private WebElement countryForm;

    @FindBy(name = "CityBolivia")
    private WebElement cityForm;

    @FindBy(name = "privacidad")
    private WebElement privacityForm;


    @FindBy(id = "btn-add-cv")
    private WebElement nextFormButton;

    @FindBy(xpath = "//div[@class=\"ui-dialog-buttonset\"] //span[contains(.,\"Ha\")]")
    private WebElement popUp;

    /**
     * Fill form for all text fields.
     *
     * @param title  - Title of the proffession.
     * @param salary - Salary that wants to won.
     */
    public void fillForm(final String title, final String salary) {
        TrabajopolisUtils.setText(titleForm, title);
        TrabajopolisUtils.setText(moneyForm, salary);
    }

    /**
     * Fill form for all combo boxs.
     *
     * @param jobCategory - Category job.
     * @param jobType     - Type job.
     * @param country     - Country where he is living.
     * @param city        - City where he is living.
     * @param privacity   - Privacity of the curriculum.
     */
    public void fillComboForm(final String jobCategory, final String jobType, final String country,
                              final String city, final String privacity) {
        TrabajopolisUtils.selectComboBox(jobCategoryForm, jobCategory);
        TrabajopolisUtils.selectComboBox(jobTypeForm, jobType);
        TrabajopolisUtils.selectComboBox(countryForm, country);
        TrabajopolisUtils.selectComboBox(cityForm, city);
        TrabajopolisUtils.selectComboBox(privacityForm, privacity);
        TrabajopolisUtils.click(popUp);
        TrabajopolisUtils.click(nextFormButton);
    }
}
