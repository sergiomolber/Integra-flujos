package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraEntidadesObject extends PageObject {

    By btnCrearEntidad = By.xpath("//button[3]/i");
    By txtCodigoEntidad = By.xpath("//input[@id='Party.PartyCode']");
    By txtEntidad = By.xpath("//input[@id='Party.PartyName']");
    By txtNombreEntidad = By.xpath("//textarea[@id='Party.PartyDisplayName']");
    By selectorTipoEntidad = By.xpath("//select[@id='Party.PartyType']");
    By tipoEntidadBanco = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[9]/form[1]/div[1]/div[4]/div[2]/div[1]/select[1]/option[3]");
    By txtIndentificadorExternoDeEntidad = By.xpath("//input[@id='Party.PartyExternalIdentifier']");
    By txtNumeroCuenta = By.xpath("//input[@id='Party.DefaultChargesAccountNo']");
    By selectorCodigoCalendario = By.xpath("//span[@id='select2-PartyCalendarCode-container']");
    By codigoCalendarioColombiano = By.xpath("//*[@id=\"select2-PartyCalendarCode-results\"]/li[6]");
    By txtDireccion = By.xpath("//input[@id='Party.AddressLine1']");
    By txtCiudad = By.xpath("//input[@id='Party.City']");
    By selectorPais = By.xpath("//span[@id='select2-PartyCountryCode-container']");
    By paisColombia= By.xpath("//*[@id=\"select2-PartyCountryCode-results\"]/li[50]");
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
    By btnCrear = By.xpath("//span[contains(text(),'Crear')]");
    By lblCreadaExitosamente = By.xpath("//*[@id=\"statusBox\"]");
    By lblCodigoYaCreado = By.xpath("//*[@id=\"statusBox\"]");
    By lblEntidadEditadaExitosa = By.xpath("div[@id='statusBox']");
    By lblCreacionEntidades = By.xpath("//p[contains(text(),'Detalle Entidad Editar Ver Entidad')]");
    By lblFormularioCreacionEntidades = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/p[1]");

    public By getBtnCrearEntidad() {return btnCrearEntidad;}

    public By getTxtCodigoEntidad() {
        return txtCodigoEntidad;
    }

    public By getTxtEntidad() {
        return txtEntidad;
    }

    public By getTxtNombreEntidad() {
        return txtNombreEntidad;
    }

    public By getSelectorTipoEntidad() {
        return selectorTipoEntidad;
    }

    public By getTipoEntidadBanco() {
        return tipoEntidadBanco;
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

    public By getSelectorPais() {
        return selectorPais;
    }

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

    public By getBtnCrear() {
        return btnCrear;
    }

    public By getLblCreadaExitosamente() {
        return lblCreadaExitosamente;
    }

    public By getLblCodigoYaCreado() {return lblCodigoYaCreado;}

    public By getLblCreacionEntidades() {
        return lblCreacionEntidades;
    }

    public By getLblFormularioCreacionEntidades() {
        return lblFormularioCreacionEntidades;
    }

    public By getLblEntidadEditadaExitosa() {return lblEntidadEditadaExitosa;}
}
