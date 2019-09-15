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

import core.selenium.WebDriverManager;
import cucumber.api.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Hooks class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class Hooks {
    private WebDriver driver;

    /**
     * Init driver.
     */
    public Hooks() {
        this.driver = WebDriverManager.getInstance().getDriver();
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
    @After("@DeleteCurriculum")
    public void deleteCurriculum() {
        driver.get("https://www.trabajopolis.bo/my-listings/");
        driver.findElement(By.linkText("Eliminar")).click();
        assertThat(driver.switchTo().alert().getText(), is("Por favor confirme que desea eliminar el currículo seleccionado. \nEsta acción no se puede deshacer."));
        driver.switchTo().alert().accept();
    }
}
