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

package trabajopolis.ui.pages;

import core.utils.TrabajopolisUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import trabajopolis.ui.BasePage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

    @FindBy(xpath = "//li[@class=\"rounded-sprite content\"]  //div[contains(strong,\"Publicado:\")]")
    private WebElement date;

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
     * @return date - Literal date.
     */
    public String getMessageTime() {
        return TrabajopolisUtils.getMessage(date);
    }

    /**
     * This method returns as long as the announcement was published in days.
     *
     * @return days - Number the as long as the announcement was published in days.
     */
    public int daysThatWasPublished() {
        int days = 0;
        String time = getMessageTime().substring(11);
        String numeralDate = TrabajopolisUtils.trasnformDateToNumeral(time);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date fechaInicial = dateFormat.parse(numeralDate);
            Calendar cal = Calendar.getInstance();
            Date fechaFinal = dateFormat.parse(dateFormat.format(cal.getTime()));
            days = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 86400000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }
}
