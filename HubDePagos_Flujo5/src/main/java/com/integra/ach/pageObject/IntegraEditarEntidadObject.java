package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraEditarEntidadObject extends PageObject {

    By btnFiltro = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/button[1]/i[1]");
    By selectorFiltro = By.xpath("//span[@id='select2-SearchSelect-container']");
    By btnEntidad = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[1]/span[2]/span[1]/span[2]/ul[1]/li[2]");
    By txtFiltroEntidad = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[1]/input[1]");
    By btnEditarEntidad = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/a[2]/i[1]");
    By txtEntidad = By.xpath("//input[@id='Party.PartyName']");
    By txtNombreEntidad = By.xpath("//textarea[@id='Party.PartyDisplayName']");
    By txtIndentificadorExternoDeEntidad = By.xpath("//input[@id='Party.PartyExternalIdentifier']");
    By txtNumeroCuenta = By.xpath("//input[@id='Party.DefaultChargesAccountNo']");
    By selectorCodigoCalendario = By.xpath("//span[@id='select2-PartyCalendarCode-container']");
    By codigoCalendarioColombiano = By.xpath("//*[@id=\"select2-PartyCalendarCode-results\"]/li[6]");
    By txtDireccion = By.xpath("//input[@id='Party.AddressLine1']");
    By txtCiudad = By.xpath("//input[@id='Party.City']");
    By selectorPais = By.xpath("//span[@id='select2-PartyCountryCode-container']");
    By paisColombia = By.xpath("//*[@id=\"select2-PartyCountryCode-results\"]/li[50]");
    By txtCorreo = By.xpath("//input[@id='Party.EmailID']");
    By txtTelefono = By.xpath("//input[@id='Party.PhoneNo']");
    By txtNIT = By.xpath("//input[@id='Party.LegalEntityIdentifier']");
    By txtUltimoValorPSE = By.xpath("//input[@id='Party.LastSequenceValue']");
    By txtDigitoChequeo = By.xpath("//input[@id='Party.CheckUpDigit']");
    By txtDominioCorreo = By.xpath("//input[@id='Party.MailDomains']");
    By txtSufijoUsuario = By.xpath("//input[@id='Party.UserSuffix']");
    By selector2FA_Autenticacion = By.xpath("//select[@id='Party.Enable_2FA']");
    By selector2FA_AutenticacionActive = By.xpath("//*[@id=\"Party.Enable_2FA\"]/option[2]");
    By selectorTipoInstitucion = By.xpath("//span[@id='select2-PartyInstitutionType-container']");
    By tipoInstitucionEstablecimientoBancario = By.xpath("//*[@id=\"select2-PartyInstitutionType-results\"]/li[4]");
    By txtNitCuentaXML = By.xpath("//input[@id='Party.BREP_INT_NIT']");
    By txtPortafolio = By.xpath("//input[@id='Party.BREP_INT_PORTAFOLIO']");
    By selectorEstado = By.xpath("//*[@id=\"select2-PartyStatus-container\"]");
    By txtEstado = By.xpath("//body/span[1]/span[1]/span[1]/input[1]");
    By txtFechaDesde = By.xpath("//*[@id=\"Party.EffectiveFromDate\"]");
    By txtFechaHasta = By.xpath("//*[@id=\"Party.EffectiveTillDate\"]");
    By btnGuardarCambios = By.xpath("//span[contains(text(),'Guardar Cambios')]");
    By lblValidarEdicionExitosa = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]");

    By btnExportar = By.xpath("//div[3]/button/i");
    By btnExportarExcel = By.xpath("//li[3]/i");

    //Eliminar Entidad

    By btnEliminarEntidad = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/a[3]/i[1]");

    By btnConfirmarEliminarEntidad = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/button[2]");

    By lblValidarElimicionExitosa = By.xpath("//div[@id='statusBox']");

    public By getBtnFiltro() {
        return btnFiltro;
    }

    public By getSelectorFiltro() {
        return selectorFiltro;
    }
    public By getbtnExportar() {
        return btnExportar;
    }

    public By getBtnExportarExcel() {
        return btnExportarExcel;
    }

    public By getBtnEntidad() {return btnEntidad; }

    public By getTxtFiltroEntidad() {
        return txtFiltroEntidad;
    }

    public By getBtnEditarEntidad() {
        return btnEditarEntidad;
    }

    public By getTxtEntidad() {return txtEntidad;}

    public By getTxtNombreEntidad() {
        return txtNombreEntidad;
    }

    public By getTxtIndentificadorExternoDeEntidad() {
        return txtIndentificadorExternoDeEntidad;
    }

    public By getTxtNumeroCuenta() {
        return txtNumeroCuenta;
    }

    public By getSelectorCodigoCalendario() {
        return selectorCodigoCalendario;
    }

    public By getCodigoCalendarioColombiano() {
        return codigoCalendarioColombiano;
    }

    public By getTxtDireccion() {
        return txtDireccion;
    }

    public By getTxtCiudad() {
        return txtCiudad;
    }

    public By getSelectorPais() {return selectorPais; }

    public By getPaisColombia() {
        return paisColombia;
    }

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getTxtNIT() {
        return txtNIT;
    }

    public By getTxtUltimoValorPSE() {
        return txtUltimoValorPSE;
    }

    public By getTxtDigitoChequeo() {
        return txtDigitoChequeo;
    }

    public By getTxtDominioCorreo() {
        return txtDominioCorreo;
    }

    public By getTxtSufijoUsuario() {
        return txtSufijoUsuario;
    }

    public By getSelector2FA_Autenticacion() {
        return selector2FA_Autenticacion;
    }

    public By getSelector2FA_AutenticacionActive() {
        return selector2FA_AutenticacionActive;
    }

    public By getSelectorTipoInstitucion() {
        return selectorTipoInstitucion;
    }

    public By getTipoInstitucionEstablecimientoBancario() {
        return tipoInstitucionEstablecimientoBancario;
    }

    public By getTxtNitCuentaXML() {
        return txtNitCuentaXML;
    }

    public By getTxtPortafolio() {
        return txtPortafolio;
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

    public By getBtnGuardarCambios() {
        return btnGuardarCambios;
    }

    public By getLblValidarEdicionExitosa() {
        return lblValidarEdicionExitosa;
    }

    public By getBtnEliminarEntidad() {return btnEliminarEntidad;}

    public By getBtnConfirmarEliminarEntidad() {return btnConfirmarEliminarEntidad;}

    public By getLblValidarElimicionExitosa() {return lblValidarElimicionExitosa;}
}
