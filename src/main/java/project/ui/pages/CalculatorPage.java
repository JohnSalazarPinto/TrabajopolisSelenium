/*
 * @(#) CalculatorPage.java Copyright (c) 2019 Jala Foundation.
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

import org.openqa.selenium.By;
import project.ui.Base;

/**
 * CalculatorPage class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class CalculatorPage extends Base {
    private String url = "https://www.calculadora.org/";

    /**
     * Makes the operation with link text locator
     *
     * @param operation - Math operation.
     */
    public void operationLinkTetxt(String operation) {
        driverConnection();
//        visit(url);

        String[] vectorOperation = operation.split("");
        for (int i = 0; i < vectorOperation.length; i++) {
            click(By.linkText(vectorOperation[i]));
        }
        implicitWait(1);
        click(By.linkText("="));
    }

    /**
     * Makes the operation with xpath attributes locator.
     *
     * @param operation - Math operation.
     */
    public void operationXpathAttributes(String operation) {
        driverConnection();
//        visit(url);
        String[] vectorOperation = operation.split("");
        for (int i = 0; i < operation.length(); i++) {
            if (vectorOperation[i].contains("/") || vectorOperation[i].contains("+") || vectorOperation[i].contains("-")
                    || vectorOperation[i].contains("*")) {
                click(By.xpath("//a[@onclick=\"enter(\'" + vectorOperation[i] + "\');blur(this)\"]"));
            } else {
                click(By.xpath("//a[@onclick=\"enter(" + vectorOperation[i] + ");blur(this)\"]"));
            }
        }
        click(By.xpath("//a[@onclick=\'calc();blur(this)\']"));
    }

    /**
     * Makes the operation with inner text locator.
     *
     * @param operation - Math operation.
     */
    public void operationInnerText(String operation) {
        driverConnection();
//        visit(url);

        String[] vectorOperation = operation.split("");
        for (int i = 0; i < operation.length(); i++) {
            click(By.xpath("//a[contains(.,\'" + vectorOperation[i] + "\')]"));
        }
        click(By.xpath("//a[contains(.,\'=\')]"));
    }

    /**
     * Makes the operation with xpath link locator.
     *
     * @param operation - Math operation.
     */
    public void operationXpathLink(String operation) {
        driverConnection();
//         visit(url);
        String[] vectorOperation = operation.split("");
        for (int i = 0; i < operation.length(); i++) {
            click(By.xpath("//a[contains(text(),\'" + vectorOperation[i] + "\')]"));
        }
        click(By.xpath("//a[contains(text(),\'=\')]"));
    }

    /**
     * Makes the operation with xpath position locator.
     *
     * @param operation - Math operation.
     */
    public void operationXpathPosition(String operation) {
        driverConnection();
//        visit(url);
        String[] vectorOperation = operation.split("");
        for (int i = 0; i < operation.length(); i++) {
            click(By.xpath("//a[contains(.,\'" + vectorOperation[i] + "\')]"));
        }
        click(By.xpath("//a[contains(text(),\'=\')]"));
    }

    /**
     * Get the result of the math operation.
     */
    public String result() {
        return value(By.name("expr"));
    }
}
