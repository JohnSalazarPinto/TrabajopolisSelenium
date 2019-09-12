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

import core.selenium.WebDriverManager;
import core.utils.TrabajopolisUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CurriculumPage extends TrabajopolisUtils {


    public static void visitCurriculumPage() {
        visit("https://www.trabajopolis.bo/my-listings/");
    }

    public static void clickFillForm() {
        click(By.linkText("aquí"));
    }

    public static void fillCurriculumFormPageOne(final String name, final String lastName,
                                                 final String cellPhone, String id, String address) {

        sendKey(By.name("nombre_0"), name);
        sendKey(By.name("apellidos_0"), lastName);
        sendKey(By.name("celular_0"), cellPhone);
        sendKey(By.name("numero_identidad_0"), id);
        sendKey(By.name("direccion"), address);
        click(By.id("sex_m"));
    }

    public static void fillOptions(final String value, String status) {
        WebElement dropdown = WebDriverManager.getDriver().findElement(By.name("identidad_0"));
        dropdown.findElement(By.xpath("//option[. = '" + value + "']")).click();
        WebElement dropdown2 = WebDriverManager.getDriver().findElement(By.name("estado_civil"));
        dropdown.findElement(By.xpath("//option[. = '" + status + "']")).click();
    }

    public static void goNextPage(){
        click(By.id("btn-add-cv"));
    }
}
