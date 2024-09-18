package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraConsultaAseguramientoXMLBANREDObject extends PageObject {
    /**
     * Creacion Archivo XML
     **/
    By txtFechaInicial = By.xpath("//input[@id='startDate']");
    By txtFechaFinal = By.xpath("//input[@id='endDate']");
    By selectorPosicion = By.xpath("(//*[text()='TODOS'])[2]");
    By selectorFormato = By.xpath("//span[contains(text(),'Seleccionar')]");
    By btnConsultar = By.xpath("//*[@value='Consultar']");
    By lblValidacionConsultaExitosa = By.xpath("//*[contains(text(),'Nombre del Archivo Entrada')]");
    /**
     * Creacion Archivo XML
     **/
    public By getSelectorFormato() {return selectorFormato;}
    public By getLblValidacionConsultaExitosa() {return lblValidacionConsultaExitosa;}
    public By getTxtFechaInicial() {
        return txtFechaInicial;
    }
    public By getBtnConsultar() {
        return btnConsultar;
    }
    public By getTxtFechaFinal() {
        return txtFechaFinal;
    }
    public By getSelectorPosicion() {return selectorPosicion;}
    }