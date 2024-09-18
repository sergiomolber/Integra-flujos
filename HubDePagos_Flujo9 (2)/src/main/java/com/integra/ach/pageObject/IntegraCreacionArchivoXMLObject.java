package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraCreacionArchivoXMLObject extends PageObject {
    /**
     * Creacion Archivo XML
     **/
    By btnMas = By.xpath("//*[@Class='fa fa-plus-square']");
    By seleccionarPosicion = By.xpath("//select[@id='Xmlfile.Position']");
    By seleccionarCiclo = By.xpath("//*[@id='select2-XmlfileCycle-container']");
    By btnGenerarArchivoXML = By.xpath("//button[contains(text(),'Generar XML')]");
    By btnCrear = By.xpath("//span[contains(text(),'Crear')]");
    By lblValidacionCreacionExitosa = By.xpath("//span[contains(text(),'El archivo XML ha sido creado con éxito')]");
    By BtnEditar = By.xpath("//tr[@id='displayingWindow_0']/td/div/a/i");

    By SeleccionarRespuetaBR = By.xpath("/html/body/div[3]/div/div[3]/div/div[2]/div[7]/form/div[1]/div[10]/div[2]/div[1]/span/span[1]/span/span[2]");
    By Consecutivo = By.xpath("//*[@id=\"select2-{{fieldLabel}}-container\"]");

    By TxtObservacion = By.xpath("//*[@id=\"Xmlfile.Observation\"]");

    By BtnGuardarCambios= By.xpath("//span[contains(text(),'Guardar Cambios')]");
    /**
     * Creacion Archivo XML
     **/
    public By getBtnMas() {return btnMas;}
    public By getLblValidacionCreacionExitosa() {
        return lblValidacionCreacionExitosa;
    }
    public By getSeleccionarPosicion() {
        return seleccionarPosicion;
    }
    public By getBtnCrear() {
        return btnCrear;
    }
    public By getSeleccionarCiclo() {
        return seleccionarCiclo;
    }
    public By getBtnGenerarArchivoXML() {return btnGenerarArchivoXML;}


    public By getBtnEditar() {return BtnEditar;
    }

    public By getRespuetaBR() { return SeleccionarRespuetaBR;
    }

    public By getConsecutivo() {return Consecutivo;
    }

    public By getTxtObservacion() { return TxtObservacion;
    }

    public By getBtnGuardarCambios() { return BtnGuardarCambios;
    }
}