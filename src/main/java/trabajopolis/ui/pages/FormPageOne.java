/*
 * @(#) Jobs.java Copyright (c) 2019 Jala Foundation.
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

import core.utils.TrabajopolisUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import trabajopolis.ui.BasePage;

/**
 * FormPageOne class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class FormPageOne extends BasePage {
    @FindBy(name = "nombre_0")
    private WebElement nameForm;

    @FindBy(name = "apellidos_0")
    private WebElement lastNameForm;

    @FindBy(name = "celular_0")
    private WebElement cellPhoneForm;

    @FindBy(name = "numero_identidad_0")
    private WebElement documentationId;

    @FindBy(name = "direccion")
    private WebElement addresForm;

    @FindBy(name = "estado_civil")
    private WebElement civilStatusCombo;

    @FindBy(name = "identidad_0")
    private WebElement documentationCombo;

    @FindBy(id = "btn-add-cv")
    private WebElement nextFormButton;

    @FindBy(name = "nacimiento_0")
    private WebElement bornForm;

    @FindBy(className = "ui-datepicker-month")
    private WebElement selectMonth;

    @FindBy(className = "ui-datepicker-year")
    private WebElement selectYear;

    /**
     * Visit curriculum page.
     */
    public void visitCurriculumPage() {
        PageTransport.visitFillCurriculumPage();
    }

    /**
     * This method fill all text fields.
     *
     * @param name      - User name.
     * @param lastName  - User last name.
     * @param cellPhone - User cell phone.
     * @param id        - User id.
     * @param address   - User address.
     */
    public void fillCurriculumFormPageOne(final String name, final String lastName,
                                          final String cellPhone, final String id, final String address) {
        TrabajopolisUtils.setText(nameForm, name);
        TrabajopolisUtils.setText(lastNameForm, lastName);
        TrabajopolisUtils.setText(cellPhoneForm, cellPhone);
        TrabajopolisUtils.setText(documentationId, id);
        TrabajopolisUtils.setText(addresForm, address);
    }

    /**
     * This method fills all combo box options.
     *
     * @param civilStatus   - User civil status
     * @param documentation - User type of documentation.
     * @param date          - User date born.
     */
    public void fillOptions(final String civilStatus, final String documentation, final String date) {
        TrabajopolisUtils.selectComboBox(civilStatusCombo, civilStatus);
        TrabajopolisUtils.selectComboBox(documentationCombo, documentation);
        TrabajopolisUtils.click(bornForm);
        TrabajopolisUtils.selectDate(selectMonth, selectYear, date);
        TrabajopolisUtils.click(nextFormButton);
    }
}
