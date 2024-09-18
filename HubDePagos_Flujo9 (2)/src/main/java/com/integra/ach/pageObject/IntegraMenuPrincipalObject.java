package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraMenuPrincipalObject extends PageObject {
    By btnModuloDeComisiones = By.xpath("//span[contains(text(),'Módulo de Comisiones')]");
    By btnComisiones = By.xpath("//body/div[3]/div[1]/div[2]/aside[1]/div[2]/div[1]/section[1]/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]/span[1]");

    By btnCatalogos = By.xpath("//span[contains(text(),'Catálogos')]");
    By btnCuentasAdministradoras = By.xpath("//span[contains(text(),'Cuentas de Administradoras')]");

    By btnNotificaciones = By.xpath("//span[contains(text(),'Notificaciones')]");

    By btnEventos = By.xpath("(//span[contains(text(),'Eventos')])[1]");

    By btnArchivoXML = By.xpath("(//span[contains(text(),'Archivo XML')])[1]");


    By btnMensajesRecibidos = By.xpath("//span[contains(text(),'Mensajes Recibidos')]");

    By btnLogsDeEventos = By.xpath("//span[contains(text(),'Logs de Eventos')]");

    public By getBtnModuloDeComisiones() {
        return btnModuloDeComisiones;
    }

    public By getBtnComisiones() {
        return btnComisiones;
    }
    public By getBtnCatalogos() {
        return btnCatalogos;
    }
    public By getBtnCuentasAdministradoras() {
        return btnCuentasAdministradoras;
    }

    public By getBtnNotificaciones() {
        return btnNotificaciones;
    }

    public By getBtnEventos() {
        return btnEventos;
    }

    public By getBtnMensajesRecibidos() {return btnMensajesRecibidos;}


    public By getBtnArchivoXML() {
        return btnArchivoXML;
    }

    public By getBtnLogsDeEventos() {
        return btnLogsDeEventos;
    }
}
