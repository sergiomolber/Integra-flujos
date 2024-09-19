package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraTransporteObject extends PageObject {

    /**
     * Crear Un Transporte
     **/
    By btnMas = By.xpath("//*[@Class='fa fa-plus-square']");
    By txtCodigoTransporte = By.xpath("//input[@id='Transport.TransportCode']");
    By selectorDireccion = By.xpath("//select[@id='Transport.Direction']");
    By selectorCodigoDeReferencia = By.xpath("//span[contains(text(),'Select')]");
    By selectorTipoDeTransporte = By.xpath("//select[@id='Transport.TransportType']");
    By selectorModoDeTransporte = By.xpath("//select[@id='Transport.TransportMode']");
    By txtCadenaDeConexion = By.xpath("//textarea[@id='Transport.ConnectionString']");
    By selectorCifrado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[10]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By selectorEstado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[11]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By txtFechaDesde = By.xpath("//input[@id='Transport.EffectiveFromDate']");
    By txtFechaHasta = By.xpath("//input[@id='Transport.EffectiveTillDate']");
    By selectorTipoDeMensaje = By.xpath("//select[@id='Transport.MessageType']");
    By btnCrear = By.xpath("//span[contains(text(),'Crear')]");
    By txtValidarCreacion = By.xpath("//div[@id='statusBox']");

    /**
     * Editar Un Transporte
     **/

    By btnFiltro = By.xpath("//button[contains(@data-original-title,'Filtro')]");
    By lblSeleccionarFiltro = By.xpath("//span[@id='select2-SearchSelect-container']");
    By optCodigoDeTransporte = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[1]/span[2]/span[1]/span[2]/ul[1]/li[1]");
    By lblCodigoABuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[1]/input[1]");
    By btnEliminarCodigoReferencia = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[3]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By btnEliminarCifrado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[10]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By btnBuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[2]");
    By btnEditar = By.xpath("//tbody/tr[@id='displayingWindow_0']/td[1]/div[1]/a[2]");
    By btnGuardarCambios = By.xpath("//span[contains(text(),'Guardar Cambios')]");

    /**
     * Eliminar Un Transporte
     **/
    By btnEliminar = By.xpath("//tbody/tr[@id='displayingWindow_0']/td[1]/div[1]/a[3]");
    By btnSiEliminar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[5]/div[1]/div[1]/div[3]/button[2]");
    By btnEditarEstado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[11]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]");

    By btnEditarTipoMensaje = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[19]/div[2]/div[1]/select[1]");
    By txtEstado = By.xpath("//body/span[1]/span[1]/span[1]/input[1]");
    By lblEdicionExitosa = By.xpath("//*[@id=\"statusBox\"]");
    By lblTransporte = By.xpath("//p[contains(text(),'Ver detalles de la edición de Transporte')]");

    By BtnDescargar = By.xpath("/html/body/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div[3]/button/i");
    
    By BtnSeleccionarExcel= By.xpath("/html/body/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div[3]/ul/li[1]/span[2]/input");

    By getBtnDescargarExcel= By.xpath("/html/body/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div[3]/ul/li[5]/i");
    
    /**
     
     * Crear y Editar Un Contrato
     **/
    public By getBtnMas() {return btnMas;}
    public By getBtnFiltro() {return btnFiltro;}
    public By getLblSeleccionarFiltro() {return lblSeleccionarFiltro;}
    public By getOptCodigoDeTransporte() {return optCodigoDeTransporte;}
    public By getLblCodigoABuscar() {return lblCodigoABuscar;}
    public By getBtnBuscar() {return btnBuscar;}
    public By getBtnEditar() {return btnEditar;}
    public By getBtnEliminarCodigoReferencia() {return btnEliminarCodigoReferencia;}
    public By getBtnEliminarCifrado() {return btnEliminarCifrado;}
    public By getBtnEditarEstado() {return btnEditarEstado;}
    public By getBtnEliminar() {return btnEliminar;}
    public By getBtnSiEliminar() {return btnSiEliminar;}
    public By getTxtCodigoTransporte() {
        return txtCodigoTransporte;
    }
    public By getSelectorDireccion() {
        return selectorDireccion;
    }
    public By getSelectorCodigoDeReferencia() {return selectorCodigoDeReferencia;}
    public By getSelectorTipoDeTransporte() {return selectorTipoDeTransporte;}
    public By getSelectorModoDeTransporte() {return selectorModoDeTransporte;}
    public By getSelectorCifrado() {return selectorCifrado;}
    public By getSelectorTipoDeMensaje() {return selectorTipoDeMensaje;}
    public By getTxtCadenaDeConexion() {
        return txtCadenaDeConexion;
    }
    public By getSelectorEstado() {
        return selectorEstado;
    }
    public By getBtnEditarTipoMensaje() {return btnEditarTipoMensaje;}
    public By getTxtEstado() {return txtEstado;}
    public By getTxtFechaDesde() {return txtFechaDesde;}
    public By getTxtFechaHasta() {return txtFechaHasta;}
    public By getBtnGuardarCambios() {return btnGuardarCambios;}
    public By getLblEdicionExitosa() {return lblEdicionExitosa;}
    public By getLblTransporte() {return lblTransporte;}
    public By getBtnCrear() {return btnCrear;}
    public By getTxtValidarCreacion() {return txtValidarCreacion;}

    public By getBtnDescargar() {return BtnDescargar;
    }

    public By getBtnSeleccionarExcel() {return BtnSeleccionarExcel;
    }

    public By getBtnDescargarExcel() { return getBtnDescargarExcel;
    }
}


