/*
 * @(#) FormPageThree.java Copyright (c) 2019 Jala Foundation.
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
 * FormPageThree class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class FormPageThree extends BasePage {

    @FindBy(name = "EducacionColegio[Institucion][1]")
    private WebElement schoolForm;

    @FindBy(name = "EducacionColegio[NivelEstudio][1]")
    private WebElement schoolLevelForm;

    @FindBy(name = "EducacionColegio[pais_0][1]")
    private WebElement countrySchoolForm;

    @FindBy(name = "EducacionColegio[ciudad_0][1]")
    private WebElement citySchoolForm;

    @FindBy(name = "EducacionColegio[FechaIngreso][1]")
    private WebElement startSchoolDateForm;

    @FindBy(name = "EducacionColegio[FechaEgreso][1]")
    private WebElement endSchoolDateForm;

    @FindBy(name = "EducacionUniversitaria[UniversidadBolivia][1]")
    private WebElement universityForm;

    @FindBy(name = "EducacionUniversitaria[Carrera][1]")
    private WebElement careerForm;

    @FindBy(name = "EducacionUniversitaria[NivelEstudio][1]")
    private WebElement universityLevelForm;

    @FindBy(name = "EducacionUniversitaria[pais_0][1]")
    private WebElement countryUniversityForm;

    @FindBy(name = "EducacionUniversitaria[ciudad_0][1]")
    private WebElement cityUniversityForm;

    @FindBy(name = "EducacionUniversitaria[FechaIngreso][1]")
    private WebElement initUniversityDateForm;

    @FindBy(name = "EducacionUniversitaria[FechaEgreso][1]")
    private WebElement endUniversityForm;

    @FindBy(name = "idiomas[idioma][1]")
    private WebElement languageForm;

    @FindBy(name = "idiomas[nivel_escrito][1]")
    private WebElement writeLevelForm;

    @FindBy(name = "idiomas[nivel_oral][1]")
    private WebElement speakLevelForm;

    @FindBy(name = "idiomas[nivel_lectura][1]")
    private WebElement readLevelForm;

    @FindBy(className = "ui-datepicker-month")
    private WebElement selectMonth;

    @FindBy(className = "ui-datepicker-year")
    private WebElement selectYear;

    @FindBy(id = "btn-add-cv")
    private WebElement nextFormButton;

    /**
     * This method fill all text field form.
     *
     * @param school         - User school.
     * @param city           - User city.
     * @param university     - User university.
     * @param career         - User career.
     * @param universityCity - User university city.
     */
    public void fillForm(final String school, final String city, final String university, final String career,
                         final String universityCity) {
        TrabajopolisUtils.setText(schoolForm, school);
        TrabajopolisUtils.setText(citySchoolForm, city);
        TrabajopolisUtils.setText(universityForm, university);
        TrabajopolisUtils.setText(careerForm, career);
        TrabajopolisUtils.setText(cityUniversityForm, universityCity);
    }

    /**
     * This method fill all combo box form.
     *
     * @param schoolLevel       - User school level.
     * @param country           - User school country.
     * @param universityLevel   - User university level.
     * @param universityCountry - User university country.
     * @param language          - User language.
     * @param writingLevel      - User writing level.
     * @param speakLevel        - User speak level.
     * @param readingLevel      - User reading level.
     */
    public void selectComboBox(final String schoolLevel, final String country,
                               final String universityLevel, final String universityCountry,
                               final String language, final String writingLevel,
                               final String speakLevel, final String readingLevel) {
        TrabajopolisUtils.selectComboBox(schoolLevelForm, schoolLevel);
        TrabajopolisUtils.selectComboBox(countrySchoolForm, country);
        TrabajopolisUtils.selectComboBox(universityLevelForm, universityLevel);
        TrabajopolisUtils.selectComboBox(countryUniversityForm, universityCountry);
        TrabajopolisUtils.selectComboBox(languageForm, language);
        TrabajopolisUtils.selectComboBox(writeLevelForm, writingLevel);
        TrabajopolisUtils.selectComboBox(speakLevelForm, speakLevel);
        TrabajopolisUtils.selectComboBox(readLevelForm, readingLevel);
    }

    /**
     * This method fill date helper.
     *
     * @param startSchool     - User starts school.
     * @param endSchool       - User ends school.
     * @param startUniversity - User starts university.
     * @param endUniversity   - User ends university.
     */
    public void selectDate(final String startSchool, final String endSchool, final String startUniversity,
                           final String endUniversity) {
        TrabajopolisUtils.click(startSchoolDateForm);
        TrabajopolisUtils.selectDate(selectMonth, selectYear, startSchool);
        TrabajopolisUtils.click(endSchoolDateForm);
        TrabajopolisUtils.selectDate(selectMonth, selectYear, endSchool);
        TrabajopolisUtils.click(initUniversityDateForm);
        TrabajopolisUtils.selectDate(selectMonth, selectYear, startUniversity);
        TrabajopolisUtils.click(endUniversityForm);
        TrabajopolisUtils.selectDate(selectMonth, selectYear, endUniversity);
        TrabajopolisUtils.click(nextFormButton);
    }
}
