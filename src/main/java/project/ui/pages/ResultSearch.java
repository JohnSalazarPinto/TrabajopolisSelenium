/*
 * @(#) ResultSearch.java Copyright (c) 2019 Jala Foundation.
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
 * ResultSearch class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class ResultSearch extends BasePage {
    @FindBy(css = "tr[class='priorityListing']:nth-child(2) b")
    private WebElement cssElement;

    /**
     * This method do click on the first result of the Result page.
     */
    private void clickFirstElement() {
        TrabajopolisUtils.click(cssElement);
    }

    /**
     * This method makes click action on the first result from a clickSearch.
     */
    public void clickFirstResult() {
        clickFirstElement();
    }
}
