/*
 * @(#) RunCukesTest.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package runner;

import core.report.GeneratorReport;
import core.utils.TrabajopolisUtils;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;

/**
 * RunCukesTest class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-pretty",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
        glue = {"steps", "hooks"},
        features = {"src/test/resources/features/Login.feature"},
        monochrome = true)
public class RunCukesTest extends AbstractTestNGCucumberTests {
    private TrabajopolisUtils trabajopolisUtils;

    /**
     * The method afterExecution executes the project and generate it report.
     */
    @AfterTest
    public void afterExecution() {
        trabajopolisUtils = new TrabajopolisUtils();
        trabajopolisUtils.close();
        GeneratorReport.getInstance().generateReport();
    }
}
