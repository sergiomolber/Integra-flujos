package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraCuentasAdministradorasObject extends PageObject {
    /**
     * Crear Una Cuenta Administradora
     **/
    By btnMas = By.xpath("//*[@Class='fa fa-plus-square']");
    By txtNumeroCuenta = By.xpath("//input[@id='AdminAccounts.AccountNumber']");
    By txtTipoDeCuenta = By.xpath("//input[@id='AdminAccounts.AccountType']");
    By txtCodigoAdministradora = By.xpath("//input[@id='AdminAccounts.AdminCode']");
    By txtNITAdministradora = By.xpath("//input[@id='AdminAccounts.AdminNIT']");
    By txtCodigoServicio = By.xpath("//input[@id='AdminAccounts.ServiceCode']");
    By txtNombreServicio = By.xpath("//input[@id='AdminAccounts.ServiceName']");
    By txtTipoSuscripcion = By.xpath("//input[@id='AdminAccounts.SubscriptionType']");
    By txtEFOriginadora = By.xpath("//input[@id='AdminAccounts.SourcebankCode']");
    By txtEFReceptora = By.xpath("//input[@id='AdminAccounts.TargetBankCode']");
    By txtFechaDesde = By.xpath("//input[@id='AdminAccounts.EffectiveFromDate']");
    By txtFechaHasta = By.xpath("//input[@id='AdminAccounts.EffectiveTillDate']");
    By btnEstado = By.id("select2-{{fieldLabel}}-container");
    By btnCrear = By.xpath("//span[contains(text(),'Crear')]");
    By txtValidarCreacion = By.xpath("//span[contains(text(),'Cuenta de administradora creada correctamente.')]");
    /**
     * Editar Una Cuenta Administradora
     **/
    By btnFiltro = By.xpath("//button[contains(@data-original-title,'Filtro')]");
    By lblSeleccionarFiltro = By.xpath("//span[@id='select2-SearchSelect-container']");
    By optNumeroCuenta = By.xpath("(//*[text()='Número de Cuenta'])[3]");
    By lblNombreABuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[1]/input[1]");
    By btnBuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[2]");
    By btnEditar = By.xpath("//tbody/tr[@id='displayingWindow_0']/td[1]/div[1]/a[2]");
    By btnGuardarCambios = By.xpath("//span[contains(text(),'Guardar Cambios')]");
    By txtValidarEdicion = By.xpath("//span[contains(text(),'Cuenta de administradora actualizada correctamente.')]");
    /**
     * Eliminar Una Cuenta Administradora
     **/
    By btnBorrar = By.xpath("//tr//td//div//a[contains(@class,'actionIcons ng-scope')][2]");
    By btnSiBorrar = By.xpath("//button[contains(text(),'Sí, borrarlo')]");
    By btnValidarBorrado = By.xpath("//span[contains(text(),'Cuenta de administradora eliminada correctamente.')]");

    By btnActualizar= By.xpath("//*[@class='fa fa-refresh fa-fs14']");

    /**
     * Crear Una Cuenta Administradora
     **/
    public By getBtnMas() {
        return btnMas;
    }
    public By getTxtNumeroCuenta() {
        return txtNumeroCuenta;
    }
    public By getTxtTipoDeCuenta() {
        return txtTipoDeCuenta;
    }
    public By getTxtCodigoAdministradora() {return txtCodigoAdministradora;}
    public By getTxtNITAdministradora() {return txtNITAdministradora;}
    public By getTxtCodigoServicio() {return txtCodigoServicio;}
    public By getTxtNombreServicio() {return txtNombreServicio;}
    public By getTxtTipoSuscripcion() {return txtTipoSuscripcion;}
    public By getTxtEFOriginadora() {return txtEFOriginadora;}
    public By getTxtEFReceptora() {return txtEFReceptora;}
    public By getBtnEstado() {return btnEstado;}
    public By getTxtFechaDesde() {return txtFechaDesde;}
    public By getTxtFechaHasta() {return txtFechaHasta;}
    public By getBtnCrear() {
        return btnCrear;
    }
    public By getTxtValidarCreacion() {return txtValidarCreacion;}
    /**
     * Editar Una Cuenta Administradora
     **/
    public By getBtnFiltro() {
        return btnFiltro;
    }
    public By getLblSeleccionarFiltro() {
        return lblSeleccionarFiltro;
    }
    public By getOptNumeroCuenta() {
        return optNumeroCuenta;
    }
    public By getLblNombreABuscar() {
        return lblNombreABuscar;
    }
    public By getBtnBuscar() {
        return btnBuscar;
    }
    public By getBtnEditar() {return btnEditar;}
    public By getBtnGuardarCambios() {
        return btnGuardarCambios;
    }
    public By getTxtValidarEdicion() {
        return txtValidarEdicion;
    }
    /**
     * Eliminar Una Cuenta Administradora
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

    public By getBtnActualizar() { return btnActualizar;   }
}
