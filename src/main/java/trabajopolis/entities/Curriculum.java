/*
 * @(#) Curriculum.java Copyright (c) 2019 Jala Foundation.
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
 * Curriculum class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class Curriculum {
    private String name;
    private String title;
    private String salary;
    private String lastName;
    private String bornDate;

    /**
     * This method get job title that user fill.
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method set user job title.
     *
     * @param title - Job title
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * This method get salary that user fill.
     *
     * @return salary - User salary
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
     * @return bornDate - User born date.
     */
    public String getBornDate() {
        return bornDate;
    }

    /**
     * This method set user title.
     *
     * @param bornDate - Born date.
     */
    public void setBornDate(final String bornDate) {
        this.bornDate = bornDate;
    }

    /**
     * This method get title that user fill.
     *
     * @return lastName - User last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method set user title.
     *
     * @param lastName - User last name
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method get title that user fill.
     *
     * @return name - User name
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
