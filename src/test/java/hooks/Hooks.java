/*
 * @(#) Hooks.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package hooks;

import trabajopolis.ui.pages.CurriculumManager;
import trabajopolis.ui.pages.PageTransport;
import core.selenium.WebDriverManager;
import core.utils.TrabajopolisUtils;
import cucumber.api.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;

/**
 * Hooks class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class Hooks {
    private WebDriver driver;
    private CurriculumManager curriculumManager;

    /**
     * Init driver.
     */
    public Hooks() {
        this.driver = WebDriverManager.getInstance().getDriver();
        this.curriculumManager = new CurriculumManager();
    }

    /**
     * Takes a screenshot when a scenario is failed.
     *
     * @param scenario - Scenario that is running.
     */
    @After
    public void tearDown(final Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }

    /**
     * This method delete the last curriculum.
     */
    @After(value = "@DeleteCurriculum", order = 1)
    public void deleteCurriculum() {
        PageTransport.visitCurriculumPage();
        curriculumManager.deleteLastCurriculum();
        curriculumManager.acceptDeleteCurriculumAlert();
    }

    /**
     * This method logout the user account.
     */
    @After(value = "@Logout", order = 0)
    public void logout() {
        PageTransport.visitCurriculumPage();
        TrabajopolisUtils.click(By.xpath("//a[@href=\"https://www.trabajopolis.bo/logout/\"]"));
    }
}
