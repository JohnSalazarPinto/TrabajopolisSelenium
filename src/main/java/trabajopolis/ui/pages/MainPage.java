/*
 * @(#) MainPage.java Copyright (c) 2019 Jala Foundation.
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
 * MainPage class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class MainPage extends BasePage {
    @FindBy(id = "keywords")
    private WebElement keyword;

    @FindBy(id = "btnSearch")
    private WebElement searchButton;

    @FindBy(name = "JobCategory[multi_like][]")
    private WebElement jobComboBox;

    @FindBy(name = "CityBolivia[multi_like][]")
    private WebElement cityComboBox;

    @FindBy(name = "PostedWithin[multi_like][]")
    private WebElement postedWithinComboBox;

    @FindBy(name = "EmploymentType[multi_like][]")
    private WebElement employmentTypeComboBox;

    /**
     * This method works for fill data.
     *
     * @param key - Data that will be fill.
     */
    public void sendKeyWord(final String key) {
        TrabajopolisUtils.setText(keyword, key);
    }

    /**
     * This method send key word to text field.
     *
     * @param keyWord - Key word for search a job.
     */
    public void fillSimpleSearch(final String keyWord) {
        sendKeyWord(keyWord);
    }

    /**
     * This method makes click action.
     */
    public void clickSearch() {
        TrabajopolisUtils.click(searchButton);
    }

    /**
     * This method works for fill data.
     *
     * @param key  - Data that will be fill.
     * @param city - City for search.
     * @param type - Type for search.
     * @param time - Time for search.
     */
    public void setText(final String key, final String city, final String type, final String time) {
        TrabajopolisUtils.selectComboBox(jobComboBox, key);
        TrabajopolisUtils.selectComboBox(cityComboBox, city);
        TrabajopolisUtils.selectComboBox(employmentTypeComboBox, type);
        TrabajopolisUtils.selectComboBox(postedWithinComboBox, time);
    }
}
