/*
 * @(#) WorkExperience.java Copyright (c) 2019 Jala Foundation.
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
 * WorkExperience class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class WorkExperience {
    private String title;
    private String companyName;
    private String workingFromDate;
    private String workingUntilDate;

    /**
     * Gets user job title.
     *
     * @return title - User job title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets user job title from form page.
     *
     * @param title - User job title.
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Gets user job companyName.
     *
     * @return companyName - User job companyName.
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets user job companyName from form page.
     *
     * @param companyName - User job indusry.
     */
    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    /**
     * Gets user working date from date from form page.
     *
     * @return workingFromDate - User working from date.
     */
    public String getWorkingFromDate() {
        return workingFromDate;
    }

    /**
     * Sets user working date from date from form page.
     *
     * @param workingFromDate - User working date
     */
    public void setWorkingFromDate(final String workingFromDate) {
        this.workingFromDate = workingFromDate;
    }

    /**
     * Gets user working date until date from form page.
     *
     * @return workingUntilDate - User working from date.
     */
    public String getWorkingUntilDate() {
        return workingUntilDate;
    }

    /**
     * Sets user working date until date from form page.
     *
     * @param workingUntilDate - User working date
     */
    public void setWorkingUntilDate(final String workingUntilDate) {
        this.workingUntilDate = workingUntilDate;
    }
}
