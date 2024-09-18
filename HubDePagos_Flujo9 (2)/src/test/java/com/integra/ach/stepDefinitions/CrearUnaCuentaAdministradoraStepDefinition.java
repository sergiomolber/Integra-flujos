package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraCuentasAdministradorasStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class CrearUnaCuentaAdministradoraStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraCuentasAdministradorasStep integraCuentasAdministradorasStep;

    @When("^Ingresar a catalogos luego modulo cuentas administradoras y crear una \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"$")
    public void ingresarACatalogosLuegoModuloCuentasAdministradorasYCrearUna(String numeroCuenta, String tipoDeCuenta, String codigoAdministradora, String NITAdministradora, String codigoDeServicio, String nombreDeServicio, String tipoDeSuscripcion, String EFOriginadora, String EFReceptora, String estado, String activoHasta) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickCuentasAdministradoras();
        integraCuentasAdministradorasStep.clickBotonMas();
        integraCuentasAdministradorasStep.ingresarNumeroCuenta(numeroCuenta);
        integraCuentasAdministradorasStep.ingresarTipoDeCuenta(tipoDeCuenta);
        integraCuentasAdministradorasStep.ingresarCodigoAdministradora(codigoAdministradora);
        integraCuentasAdministradorasStep.ingresarNITAdministradora(NITAdministradora);
        integraCuentasAdministradorasStep.ingresarCodigoDeServicio(codigoDeServicio);
        integraCuentasAdministradorasStep.ingresarNombreDeServicio(nombreDeServicio);
        integraCuentasAdministradorasStep.ingresarTipoDeSuscripcion(tipoDeSuscripcion);
        integraCuentasAdministradorasStep.ingresarEFOriginadora(EFOriginadora);
        integraCuentasAdministradorasStep.ingresarEFReceptora(EFReceptora);
        integraCuentasAdministradorasStep.seleccionarEstado(estado);
        integraCuentasAdministradorasStep.escribirActivoDesde(); // Llamada sin parámetros
        integraCuentasAdministradorasStep.escribirActivoHasta(activoHasta);
        integraCuentasAdministradorasStep.clickEnCrear();
    }

    @Then("^Valido mensaje de creacion exitosa$")
    public void validoMensajeDeCreacionExitosa() {
        integraCuentasAdministradorasStep.validarCreacionDeTiposTransaccion();
    }

    @Then("^Regresar index$")
    public void regresarIndex() {
        integraCuentasAdministradorasStep.regresarindex();
    }
}
