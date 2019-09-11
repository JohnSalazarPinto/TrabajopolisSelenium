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

import core.selenium.WebDriverManager;
import core.utils.TrabajopolisUtils;
import org.openqa.selenium.By;

/**
 * ResultSearch class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class ResultSearch extends TrabajopolisUtils {

    /**
     * This method makes click action on the first result from a search.
     */
    public void clickFirstResult() {
        WebDriverManager.getDriver().findElement(By.className("priorityListing")).
                findElement(By.className("anuncio-estandar-content")).
                findElement(By.className("anuncio-estandar-titulo")).click();
    }
}
