package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraEventosObject extends PageObject {
    /**
     * Crear Un Evento
     **/
    By btnMas = By.xpath("//*[@Class='fa fa-plus-square']");
    By btnContacto = By.id("Events.Contact");
    By selectEstado = By.xpath("//*[@id='select2-{{fieldLabel}}-container']");
    By lblactivoDesde = By.xpath("//input[@id='Events.EffectiveFromDate']");
    By lblactivoHasta = By.xpath("//input[@id='Events.EffectiveTillDate']");
    By lblcorreo = By.xpath("//input[@id='Mail']");
    By btnCrear = By.xpath("//span[contains(text(),'Crear')]");
    By txtValidarCreacion = By.xpath("//span[contains(text(),'Evento creado exitosamente.')]");
    /**
     * Editar Un Evento
     **/
    By btnFiltro = By.xpath("//button[contains(@data-original-title,'Filtro')]");
    By lblSeleccionarFiltro = By.xpath("//span[@id='select2-SearchSelect-container']");
    By optContacto = By.xpath("(//*[text()='Contacto'])[3]");
    By lblNombreABuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[1]/input[1]");
    By btnBuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[2]");
    By btnEditar = By.xpath("//tbody/tr[@id='displayingWindow_0']/td[1]/div[1]/a[2]");
    By btnGuardarCambios = By.xpath("//span[contains(text(),'Guardar Cambios')]");
    By txtValidarEdicion = By.xpath("//span[contains(text(),'Evento actualizado exitosamente.')]");
    /**
     * Eliminar Un Evento
     **/
    By btnBorrar = By.xpath("//tr//td//div//a[contains(@class,'actionIcons ng-scope')][2]");
    By btnSiBorrar = By.xpath("//button[contains(text(),'Sí, borrarlo')]");
    By btnValidarBorrado = By.xpath("//span[contains(text(),'Evento eliminado exitosamente.')]");

    public By getBtnMas() {
        return btnMas;
    }

    public By getBtnContacto() {
        return btnContacto;
    }

    public By getSelectEstado() {
        return selectEstado;
    }

    public By getLblactivoDesde() {
        return lblactivoDesde;
    }

    public By getLblactivoHasta() {
        return lblactivoHasta;
    }

    public By getLblcorreo() {
        return lblcorreo;
    }

    public By getBtnCrear() {
        return btnCrear;
    }

    public By getTxtValidarCreacion() {
        return txtValidarCreacion;
    }

    /**
     * Editar Un Evento
     **/
    public By getBtnFiltro() {
        return btnFiltro;
    }

    public By getLblSeleccionarFiltro() {
        return lblSeleccionarFiltro;
    }

    public By getOptContacto() {
        return optContacto;
    }

    public By getLblNombreABuscar() {
        return lblNombreABuscar;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getBtnEditar() {
        return btnEditar;
    }

    public By getBtnGuardarCambios() {
        return btnGuardarCambios;
    }

    public By getTxtValidarEdicion() {
        return txtValidarEdicion;
    }
    /**
     * Eliminar Un Evento
     **/
    public By getBtnBorrar() {
        return btnBorrar;
    }

    public By getBtnSiBorrar() {
        return btnSiBorrar;
    }

    public By getBtnValidarBorrado() {
        return btnValidarBorrado;
    }
}
