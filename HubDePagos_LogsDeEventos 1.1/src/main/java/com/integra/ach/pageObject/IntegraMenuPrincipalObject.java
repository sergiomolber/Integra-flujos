package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraMenuPrincipalObject extends PageObject {
    By btnCatalogos = By.xpath("//span[contains(text(),'Catálogos')]");
    By btnLogsDeEventos = By.xpath("//span[contains(text(),'Logs de Eventos')]");

    public By getBtnCatalogos() {
        return btnCatalogos;
    }


    public By getBtnLogsDeEventos() {
        return btnLogsDeEventos;
    }

}
