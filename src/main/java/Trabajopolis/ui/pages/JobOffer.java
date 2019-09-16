/*
 * @(#) JobOffer.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package Trabajopolis.ui.pages;

import core.utils.TrabajopolisUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Trabajopolis.ui.BasePage;

/**
 * JobOffer class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class JobOffer extends BasePage {
    @FindBy(xpath = "//li[@class=\"rounded-sprite content\"]  //div[contains(strong,\"Categoría\")]")
    private WebElement category;

    @FindBy(xpath = "//li[@class=\"rounded-sprite content\"]  //div[contains(strong,\"Contrato\")]")
    private WebElement contrato;

    @FindBy(xpath = "//li[@class=\"rounded-sprite content\"]  //div[contains(strong,\"Ubicación\")]")
    private WebElement city;

    @FindBy(xpath = "//li[@class=\"rounded-sprite content\"]  //div[contains(strong,\"Publicado\")]")
    private WebElement time;

    /**
     * This method get category message.
     *
     * @return category message
     */
    public String getMessageCategory() {
        return TrabajopolisUtils.getMessage(category);
    }

    /**
     * This method get job type message.
     *
     * @return job type message
     */
    public String getMessageType() {
        return TrabajopolisUtils.getMessage(contrato);
    }

    /**
     * This method get city message.
     *
     * @return city message.
     */
    public String getMessageCity() {
        return TrabajopolisUtils.getMessage(city);
    }

    /**
     * This method get time message.
     *
     * @return time message
     */
    public String getMessageTime() {
        return TrabajopolisUtils.getMessage(time);
    }

    /**
     * This method get time when was published.
     */
    public void publishedWithin() {
        String time = getMessageTime();
        String[] date = time.split(" ");
    }
}
