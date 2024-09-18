package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraMensajesRecibidosObject extends PageObject {

    By btnFiltro = By.xpath("//button[contains(@data-original-title,'Filtro')]");
    By lblSeleccionarFiltro = By.xpath("//span[@id='select2-SearchSelect-container']");
    By lblNombreABuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[1]/input[1]");
    By btnBuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[2]");
    By txtValidarConsulta = By.xpath("//h2[contains(text(),'Mensajes Recibidos')]");


    public By getBtnFiltro() {
        return btnFiltro;
    }
    public By getLblSeleccionarFiltro() {
        return lblSeleccionarFiltro;
    }
    public By getLblNombreABuscar() {return lblNombreABuscar;}
    public By getBtnBuscar() {
        return btnBuscar;
    }
    public By getTxtValidarConsulta() {return txtValidarConsulta;}

}
