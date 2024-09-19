package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraContratosObject extends PageObject {

    /**
     * Crear Un Contrato
     **/
    By btnMas = By.xpath("//*[@Class='fa fa-plus-square']");
    By txtDescripcionAsociacion = By.xpath("//textarea[@id='PartyServiceAssociation.AssociationDescription']");
    By selectorCodigoEntidad = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]");
    By selectorCodigoServicio = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[3]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By selectorCodigoProceso = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[4]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]");
    By selectorProductoSoportado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[5]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By selectorCodigoSucursal = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[6]/div[2]/div[1]/span[1]/span[1]/span[1]/span[2]");
    By selectorNombreFormatoEntrada = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[9]/div[2]/div[1]/span[1]/span[1]/span[1]/span[2]");
    By selectorEstado = By.xpath("//span[@id='select2-PartyServiceAssociationStatus-container']");
    By txtFechaDesde = By.xpath("//input[@id='PartyServiceAssociation.EffectiveFromDate']");
    By txtFechaHasta = By.xpath("//input[@id='PartyServiceAssociation.EffectiveTillDate']");
    By btnCrear = By.xpath("//span[contains(text(),'Crear')]");
    By txtValidarCreacion = By.xpath("//div[@id='statusBox']");
    /**
     * Editar Un Contrato
     **/

    By btnFiltro = By.xpath("//button[contains(@data-original-title,'Filtro')]");
    By lblSeleccionarFiltro = By.xpath("//span[@id='select2-SearchSelect-container']");
    By optDescripcionAsociacion = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[1]/span[2]/span[1]/span[2]/ul[1]/li[2]");
    By lblNombreABuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[1]/input[1]");
    By btnBuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[2]");
    By btnEditar = By.xpath("//tbody/tr[@id='displayingWindow_0']/td[1]/div[1]/a[2]");
    By btnEliminar = By.xpath("//tbody/tr[@id='displayingWindow_0']/td[1]/div[1]/a[3]");
    By btnSiEliminar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[5]/div[1]/div[1]/div[3]/button[2]");
    By btnEliminarCodigoProceso = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[4]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By btnEliminarProductoSoportado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[5]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/span[1]");
    By btnEliminarCodigoSucursal = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[6]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By txtEstado = By.xpath("//body/span[1]/span[1]/span[1]/input[1]");
    By btnGuardarCambios = By.xpath("//span[contains(text(),'Guardar Cambios')]");
    By lblFormatoLotes = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[41]/div[3]/div[2]/div[1]/div[3]/label[1]");
    By lblEdicionExitosa = By.xpath("//*[@id=\"statusBox\"]");
    By lblContrato = By.xpath("//p[contains(text(),'Detalle de las condiciones de prestación de servic')]");

    /**
     * Crear y Editar Un Contrato
     **/
    public By getBtnMas() {return btnMas;}
    public By getBtnFiltro() {return btnFiltro;}
    public By getLblSeleccionarFiltro() {return lblSeleccionarFiltro;}
    public By getOptDescripcionAsociacion() {return optDescripcionAsociacion;}
    public By getLblNombreABuscar() {return lblNombreABuscar;}
    public By getBtnBuscar() {return btnBuscar;}
    public By getBtnEditar() {return btnEditar;}
    public By getBtnEliminar() {return btnEliminar;}
    public By getBtnSiEliminar() {return btnSiEliminar;}
    public By getTxtDescripcionAsociacion() {
        return txtDescripcionAsociacion;
    }
    public By getSelectorCodigoEntidad() {
        return selectorCodigoEntidad;
    }
    public By getSelectorCodigoServicio() {
        return selectorCodigoServicio;
    }
    public By getBtnEliminarCodigoProceso() {return btnEliminarCodigoProceso;}
    public By getSelectorProductoSoportado() {return selectorProductoSoportado;}
    public By getBtnEliminarProductoSoportado() {return btnEliminarProductoSoportado;}
    public By getSelectorCodigoSucursal() {return selectorCodigoSucursal;}
    public By getBtnEliminarCodigoSucursal() {return btnEliminarCodigoSucursal;}
    public By getSelectorNombreFormatoEntrada() {
        return selectorNombreFormatoEntrada;
    }
    public By getSelectorEstado() {
        return selectorEstado;
    }
    public By getTxtEstado() {
        return txtEstado;
    }
    public By getTxtFechaDesde() {return txtFechaDesde;}
    public By getTxtFechaHasta() {return txtFechaHasta;}
    public By getBtnGuardarCambios() {return btnGuardarCambios;}
    public By getLblEdicionExitosa() {return lblEdicionExitosa;}
    public By getLblContrato() {
        return lblContrato;
    }
    public By getBtnCrear() {return btnCrear;}
    public By getTxtValidarCreacion() {return txtValidarCreacion;}
}


