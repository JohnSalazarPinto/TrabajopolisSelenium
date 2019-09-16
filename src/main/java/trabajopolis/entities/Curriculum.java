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

package trabajopolis.entities;

/**
 * CurriculumPage class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class Curriculum {
    private String name;
    private String title;
    private String salary;
    private String lastName;
    private String dateBorn;

    /**
     * This method get job title that user fill.
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method set user title.
     *
     * @param title - Job title
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * This method get title that user fill.
     *
     * @return title
     */
    public String getSalary() {
        return salary;
    }

    /**
     * This method set user title.
     *
     * @param salary - User salary
     */
    public void setSalary(final String salary) {
        this.salary = salary;
    }

    /**
     * This method get title that user fill.
     *
     * @return title
     */
    public String getDateBorn() {
        return dateBorn;
    }

    /**
     * This method set user title.
     *
     * @param dateBorn - Date born
     */
    public void setDateBorn(final String dateBorn) {
        this.dateBorn = dateBorn;
    }

    /**
     * This method get title that user fill.
     *
     * @return title
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method set user title.
     *
     * @param lastName - Last name
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method get title that user fill.
     *
     * @return title
     */
    public String getName() {
        return name;
    }

    /**
     * This method set user title.
     *
     * @param name - Name title
     */
    public void setName(final String name) {
        this.name = name;
    }
}
