package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraTableroDePagosObject extends PageObject {

    By ctnCampoFecha = By.xpath("//div[@id='container']/div[4]/form/div/div/div/div/span/span/span/span");

    By txtCampoFecha = By.xpath("/html/body/span/span/span[1]/input");

    By btnBuscar = By.xpath("//button[@id='SearchFontIcon']/i");
    By btnExportar = By.xpath("//div[@id='container']/div[4]/form/div/div[3]");


    public By getctnCampoFecha () {
        return ctnCampoFecha;
    }
    public By gettxtCampoFecha () {
        return txtCampoFecha;
    }
    public By getbtnBuscar () {
        return btnBuscar;
    }

    public By getbtnExportar () {
        return btnExportar;
    }





}







