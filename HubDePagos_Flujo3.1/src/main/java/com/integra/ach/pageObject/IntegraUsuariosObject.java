package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraUsuariosObject extends PageObject {

    By btnFiltroParametro = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/button[1]/i[1]");
    By btnAgregarUsuario = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[5]/div[2]/div[1]/button[1]/i[1]");
    By txtUsuario = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]");
    By txtCorreo = By.xpath("//input[@id='AddUserMail']");
    By txtApellido = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/input[1]");
    By txtNombre = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]");
    By selectorRol = By.xpath("//span[@id='select2-RoleId-container']");
    By txtRol = By.xpath("//body/span[1]/span[1]/span[1]/input[1]");
    By selectorTipoIdentificacion = By.xpath("//span[@id='select2-IDType-container']");
    By txtTipoIdentificación = By.xpath("//body/span[1]/span[1]/span[1]/input[1]");
    By txtNumeroId = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[2]/div[1]/input[1]");
    By txtTelefono = By.xpath("//input[@id='PhoneNumber']");
    By txtExtensionTelefono = By.xpath("//input[@id='PhoneExtensionNumber']");
    By txtCelular= By.xpath("//input[@id='Mobile']");
    By selectorPais = By.xpath("//span[@id='select2-country-container']");
    By txtPais = By.xpath("//body/span[1]/span[1]/span[1]/input[1]");
    By txtCargo = By.xpath("//input[@id='Position']");
    By txtObservaciones = By.xpath("//input[@id='Observations']");
    By selectorEstado = By.xpath("//span[@id='select2-enableFlag-container']");
    By txtEstado = By.xpath("/html/body/span/span/span[1]/input");
    By txtFechaDesde = By.xpath("//input[@id='EffectiveFromDate']");
    By txtFechaHasta = By.xpath("//input[@id='EffectiveTillDate']");
    By selectorEstado2 = By.xpath("//select[@id='Status0']");
    By txtEstado2 = By.xpath("//tbody/tr[@id='0']/td[3]/select[1]/option[2]");
    By txtFechaDesde2 = By.xpath("//input[@id='Subsec_EffectiveFromDate0']");
    By txtFechaHasta2 = By.xpath("//input[@id='Subsec_EffectiveTillDate0']");
    By btnContinuar = By.xpath("//button[@id='Continue1']");
    By btnCrear = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[1]/div[1]/button[2]");
    By lblCargo = By.xpath("//label[contains(text(),'Cargo :')]");
    By lblTelefono = By.xpath("//label[contains(text(),'Teléfono :')]");
    By lblCreaciónConExito = By.xpath("//h2[contains(text(),'Gestión de Usuarios')]");
    By lblDominioInvalidado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
    By lblFormatoUserIncorrecto = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
    By lblYaExisteNumeroId = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
    By lblYaExisteCorreo = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");

    public By getBtnFiltroParametro() {
        return btnFiltroParametro;
    }

    public By getBtnAgregarUsuario() {
        return btnAgregarUsuario;
    }

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getSelectorRol() {
        return selectorRol;
    }

    public By getTxtRol() {
        return txtRol;
    }

    public By getSelectorTipoIdentificacion() {
        return selectorTipoIdentificacion;
    }

    public By getTxtTipoIdentificación() {
        return txtTipoIdentificación;
    }

    public By getTxtNumeroId() {
        return txtNumeroId;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getTxtExtensionTelefono() {
        return txtExtensionTelefono;
    }

    public By getTxtCelular() {
        return txtCelular;
    }

    public By getSelectorPais() {
        return selectorPais;
    }

    public By getTxtPais() {
        return txtPais;
    }

    public By getTxtCargo() {
        return txtCargo;
    }

    public By getTxtObservaciones() {
        return txtObservaciones;
    }

    public By getSelectorEstado() {
        return selectorEstado;
    }

    public By getTxtEstado() {
        return txtEstado;
    }

    public By getTxtFechaDesde() {
        return txtFechaDesde;
    }

    public By getTxtFechaHasta() {
        return txtFechaHasta;
    }

    public By getSelectorEstado2() {
        return selectorEstado2;
    }

    public By getTxtEstado2() {
        return txtEstado2;
    }

    public By getTxtFechaDesde2() {
        return txtFechaDesde2;
    }

    public By getTxtFechaHasta2() {
        return txtFechaHasta2;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }

    public By getBtnCrear() {
        return btnCrear;
    }

    public By getLblCargo() {
        return lblCargo;
    }

    public By getLblTelefono() {
        return lblTelefono;
    }

    public By getLblCreaciónConExito() {return lblCreaciónConExito;}

    public By getLblDominioInvalidado() {return lblDominioInvalidado;}

    public By getLblFormatoUserIncorrecto() {
        return lblFormatoUserIncorrecto;
    }

    public By getLblYaExisteNumeroId() {
        return lblYaExisteNumeroId;
    }

    public By getLblYaExisteCorreo() {
        return lblYaExisteCorreo;
    }
}
