/*
 * @(#) FormPageTwo.java Copyright (c) 2019 Jala Foundation.
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
 * FormPageTwo class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class FormPageTwo extends BasePage {
    @FindBy(name = "WorkExperience[JobTitle][1]")
    private WebElement jobTitleForm;

    @FindBy(name = "WorkExperience[CompanyName][1]")
    private WebElement companyNameForm;

    @FindBy(name = "WorkExperience[pais_0][1]")
    private WebElement countryComboBoxForm;

    @FindBy(name = "WorkExperience[ciudad_0][1]")
    private WebElement cityForm;

    @FindBy(name = "WorkExperience[StartDate][1]")
    private WebElement startDateForm;

    @FindBy(name = "WorkExperience[EndDate][1]")
    private WebElement endDateForm;

    @FindBy(className = "ui-datepicker-month")
    private WebElement selectMonth;

    @FindBy(className = "ui-datepicker-year")
    private WebElement selectYear;

    @FindBy(id = "btn-add-cv")
    private WebElement nextButton;

    /**
     * This method fill all text field.
     *
     * @param jobTitle    - User job title.
     * @param companyName - User company name.
     * @param city        - User company city.
     */
    public void fillForm(final String jobTitle, final String companyName, final String city) {
        TrabajopolisUtils.setText(jobTitleForm, jobTitle);
        TrabajopolisUtils.setText(companyNameForm, companyName);
        TrabajopolisUtils.setText(cityForm, city);
    }

    /**
     * This method fill all combo box.
     *
     * @param country - User job country.
     */
    public void fillComboBox(final String country) {
        TrabajopolisUtils.selectComboBox(countryComboBoxForm, country);
    }

    /**
     * This method fill all date helper data.
     *
     * @param initDate - User init works.
     * @param endDate  - User finish works.
     */
    public void fillDate(final String initDate, final String endDate) {
        TrabajopolisUtils.click(startDateForm);
        TrabajopolisUtils.selectDate(selectMonth, selectYear, initDate);
        TrabajopolisUtils.click(endDateForm);
        TrabajopolisUtils.selectDate(selectMonth, selectYear, endDate);
        TrabajopolisUtils.click(nextButton);
    }
}
