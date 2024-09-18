package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraReintegrosObject extends PageObject {
    /**
     * Crear Un Evento
     **/
    By btnMas = By.xpath("//*[@Class='fa fa-plus-square']");
    By txtFechaRegistro = By.xpath("//input[@id='RegisterRefunds.RegistryDate']");
    By txtFechaDeCompensacion = By.xpath("//input[@id='RegisterRefunds.ClearingDate']");
    By selectEntidadFinanciera = By.xpath("//span[@id='select2-RegisterRefundsFinancialEntity-container']");
    By txtMontoAFavor = By.xpath("//input[@id='RegisterRefunds.AmountInFavor']");
    By txtMontoEnContra = By.xpath("//input[@id='RegisterRefunds.AmountAgainst']");
    By selectEstado = By.xpath("//span[@id='select2-{{fieldLabel}}-container']");
    By txtObervacion = By.xpath("//textarea[@id='RegisterRefunds.Observation']");
    By btnCrear = By.xpath("//span[contains(text(),'Crear')]");
    By txtValidarCreacion = By.xpath("//span[contains(text(),'Reintegro aplicado exitosamente.')]");
    /**
     * Editar Un Evento
     **/
    By btnFiltro = By.xpath("//button[contains(@data-original-title,'Filtro')]");
    By lblSeleccionarFiltro = By.xpath("//span[@id='select2-SearchSelect-container']");
    By optEntidadFinanciera = By.xpath("(//*[text()='Entidad Financiera'])[3]");
    By lblNombreABuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[1]/input[1]");
    By btnBuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[2]");
    By btnEliminarEntidad = By.xpath("//span[contains(text(),'×')]");
    By btnEditar = By.xpath("//tbody/tr[@id='displayingWindow_0']/td[1]/div[1]/a[2]");
    By btnGuardarCambios = By.xpath("//span[contains(text(),'Guardar Cambios')]");
    By txtValidarEdicion = By.xpath("//span[contains(text(),'Reintegro actualizado con éxito.')]");
    /**
     * Eliminar Un Evento
     **/
    By btnBorrar = By.xpath("//tr//td//div//a[contains(@class,'actionIcons ng-scope')][2]");
    By btnSiBorrar = By.xpath("//button[contains(text(),'Sí, borrarlo')]");
    By btnValidarBorrado = By.xpath("//span[contains(text(),'Reintegro eliminado correctamente.')]");

    public By getBtnMas() {
        return btnMas;
    }

    public By getTxtFechaRegistro() {
        return txtFechaRegistro;
    }

    public By getSelectEntidadFinanciera() {return selectEntidadFinanciera;}

    public By getSelectEstado() {
        return selectEstado;
    }

    public By getTxtFechaDeCompensacion() {
        return txtFechaDeCompensacion;
    }

    public By getTxtMontoAFavor() {
        return txtMontoAFavor;
    }

    public By getTxtMontoEnContra() {return txtMontoEnContra;}

    public By getTxtObervacion() {return txtObervacion;}

    public By getBtnCrear() {
        return btnCrear;
    }

    public By getTxtValidarCreacion() {return txtValidarCreacion;}

    /**
     * Editar Un Reintegro
     **/
    public By getBtnFiltro() {
        return btnFiltro;
    }

    public By getLblSeleccionarFiltro() {
        return lblSeleccionarFiltro;
    }

    public By getOptEntidadFinanciera() {return optEntidadFinanciera;}
    public By getLblNombreABuscar() {
        return lblNombreABuscar;
    }

    public By getBtnEliminarEntidad() {return btnEliminarEntidad;}

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
     * Eliminar Un Reintegro
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
