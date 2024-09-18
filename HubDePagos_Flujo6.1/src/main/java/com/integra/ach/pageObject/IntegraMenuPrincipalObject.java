package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraMenuPrincipalObject extends PageObject {
    By btnModuloDeTransferencias = By.xpath("//span[contains(text(),'Módulo de Transferencias')]");

    By btnModuloTableroDePagos = By.xpath("//*[@id=\"AllPaymentsDashboard\"]/a");
    By btnReportes = By.xpath("(//span[contains(text(),'Reportes')])[2]");
    By btnAseguramientoXMLBANRED = By.xpath("//span[contains(text(),'Aseguramiento XML BANRED')]");
    By btnReporteEstadisticas = By.xpath("//span[contains(text(),'Reporte Estadísticas')]");

    By btnCatalogos = By.xpath("//span[contains(text(),'Catálogos')]");
    By btnReintegros = By.xpath("(//span[contains(text(),'Registrar Reintegros')])[1]");
    By btnReporteReintegro = By.xpath("(//span[contains(text(),'Reporte Reintegros')])[1]");


    public By getBtnModuloDeTransferencias() {
        return btnModuloDeTransferencias;
    }
    public By getbtnModuloTableroDePagos () {
        return btnModuloTableroDePagos;
    }
    public By getBtnReportes() {
        return btnReportes;
    }

    public By getBtnAseguramientoXMLBANRED() {
        return btnAseguramientoXMLBANRED;
    }
    public By getBtnReporteEstadisticas() {
        return btnReporteEstadisticas;
    }

    public By getBtnCatalogos() {
        return btnCatalogos;
    }

    public By getBtnReintegros() {
        return btnReintegros;
    }
    public By getBtnReporteReintegro() {
        return btnReporteReintegro;
    }







}







