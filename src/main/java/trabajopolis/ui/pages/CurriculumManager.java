/*
 * @(#) CurriculumManager.java Copyright (c) 2019 Jala Foundation.
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

import core.selenium.WebDriverManager;
import core.utils.TrabajopolisUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import trabajopolis.ui.BasePage;

/**
 * CurriculumManager class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class CurriculumManager extends BasePage {
    @FindBy(xpath = "//*[@id=\"maindDivBg\"]/div[6]/p[4]/a[2]")
    private WebElement reviewCurriculumButton;

    @FindBy(linkText = "Eliminar")
    private WebElement deleteCurriculum;

    /**
     * This method do click on the button for review the curriculum tha was created.
     */
    public void clickCurriculum() {
        TrabajopolisUtils.click(reviewCurriculumButton);
    }

    /**
     * This method do click for delete the las curriculum created.
     */
    public void deleteLastCurriculum() {
        TrabajopolisUtils.click(deleteCurriculum);
    }

    /**
     * This method confirms that the user wants to delete the curriculum.
     */
    public void acceptDeleteCurriculumAlert() {
        WebDriverManager.getDriver().switchTo().alert().accept();
    }
}
