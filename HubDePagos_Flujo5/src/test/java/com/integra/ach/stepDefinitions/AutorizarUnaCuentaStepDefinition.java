package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraInscribirCuentasStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class AutorizarUnaCuentaStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraInscribirCuentasStep integraInscribirCuentasStep;

    @When("^Ingresar a catalogos luego modulo Autorizacion de cuentas \"([^\"]*)\"$")
    public void ingresarACatalogoYIngresarAutorizacionDeCuentas(String NitABuscar) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.IngresarAutorizacionDeCuentas();
        //integraInscribirCuentasStep.clickEnFiltrar();
        //integraInscribirCuentasStep.NITAAutorizar(NitABuscar);
        //integraInscribirCuentasStep.clickEnBuscar();
        integraInscribirCuentasStep.seleccionarEditar();
        integraInscribirCuentasStep.EditarEstadoAprobadoPorACH();
        integraInscribirCuentasStep.guardarCambios();

    }


    @Then("^Valido mensaje exitoso$")
    public void validoMensajeExitoso() {
        integraInscribirCuentasStep.validarEliminacionDeCuenta();
    }

}
