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

package project.ui.pages;

import core.utils.TrabajopolisUtils;
import org.openqa.selenium.By;

/**
 * Jobs class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class Jobs extends TrabajopolisUtils {

    /**
     * This method get the result for assert.
     *
     * @param name - Name that locator contains.
     * @return value - Value for the assertion.
     */
    public String searchInfo(final String name) {
        String value = value(By.xpath(name));
        return value;
    }
}
