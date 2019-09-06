/*
 * @(#) DefaultSuiteTestSelenium.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import project.ui.pages.CalculatorPage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * DefaultSuiteTestSelenium class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class DefaultSuiteTestSelenium {

    static CalculatorPage calculatorPage = new CalculatorPage();

    /**
     * Close the page after of the each test.
     */
    @After
    public void tearDown() {
        calculatorPage.clean();
    }

    @AfterClass
    public static void afterClass() {
        calculatorPage.close();
    }

    /**
     * Test of addition for link test locator.
     */
    @Test
    public void additionLinktest() {
        calculatorPage.operationLinkTetxt("222+2");
        assertThat(calculatorPage.result(), is("224"));
    }

    /**
     * Test of multiplication for link test locator.
     */
    @Test
    public void multiplicationLinktest() {
        calculatorPage.operationLinkTetxt("2×2");
        assertThat(calculatorPage.result(), is("4"));
    }

    /**
     * Test of divition for link test locator.
     */
    @Test
    public void divitionLinktest() {
        calculatorPage.operationLinkTetxt("2÷2");
        assertThat(calculatorPage.result(), is("1"));
    }

    /**
     * Test of subtraction for link test locator.
     */
    @Test
    public void subtractionLinktest() {
        calculatorPage.operationLinkTetxt("2-1");
        assertThat(calculatorPage.result(), is("1"));
    }

    /**
     * Test of multiple operation for XpathinnerText locator.
     */
    @Test
    public void multipleOperationXpathinnerText() {
        calculatorPage.operationInnerText("22+2-2×2÷4");
        assertThat(calculatorPage.result(), is("23"));
    }

    /**
     * Test of multiple operation for XpathAttributes locator.
     */
    @Test
    public void multipleXpathAttributes() {
        calculatorPage.operationXpathAttributes("2/2*7-2+1");
        assertThat(calculatorPage.result(), is("6"));
    }

    /**
     * Test of multiple operation for Xpathlink locator.
     */
    @Test
    public void multipleOperationXpathlink() {
        calculatorPage.operationLinkTetxt("22+4×5÷2-3");
        assertThat(calculatorPage.result(), is("29"));
    }

    /**
     * Test of multiple operation for XpathPosition locator.
     */
    @Test
    public void multipleOperationsXpathPosition() {
        calculatorPage.operationXpathPosition("5+3-1×2÷2");
        assertThat(calculatorPage.result(), is("7"));
    }

    /**
     * Test of result infinity for Xpathlink locator.
     */
    @Test
    public void divisionCeroXpathlink() {
        calculatorPage.operationXpathLink("2÷0");
        assertThat(calculatorPage.result(), is("Infinity"));
    }
}
