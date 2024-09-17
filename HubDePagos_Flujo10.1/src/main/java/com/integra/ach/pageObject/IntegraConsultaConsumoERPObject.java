package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraConsultaConsumoERPObject extends PageObject {

    /**
     * Consulta Consumo ERP
     **/
    By txtFecha = By.xpath("//input[@id='CstartDate']");
    By btnBuscar = By.xpath("//button[contains(text(),'Buscar')]");

    By lblIDConsumo = By.xpath("//th[contains(text(),'Id Consumo')]");

    By btnIniciarSolicitud = By.xpath("//*[@id=\"okBtn\"]");

    By btnEnviar = By.xpath("//div[2]/div/div/div/div/button[2]");

    By LblMensajeExitoso = By.xpath("//div[2]/div/div[2]");
    /**
     * Consulta Consumo ERP
     **/

    public By getTxtFecha() {
        return txtFecha;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getLblIDConsumo() {
        return lblIDConsumo;

    }
        public By getbtnIniciarSolicitud() {
            return btnIniciarSolicitud;


    }

    public By getbtnEnviar() {
        return btnEnviar;


    }

    public By getLblMensajeExitoso() {
        return LblMensajeExitoso;

    }
}


