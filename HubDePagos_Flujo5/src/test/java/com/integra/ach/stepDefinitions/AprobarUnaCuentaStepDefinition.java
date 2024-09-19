package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraInscribirCuentasStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class AprobarUnaCuentaStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraInscribirCuentasStep integraInscribirCuentasStep;

    @When("^Ingresar a catalogos luego modulo aprobacion de cuentas y aprobar una \"([^\"]*)\"$")
    public void ingresarACatalogoYIngresarInscripcionDeCuentasYEliminarUna(String NitABuscar) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.IngresarAprobacionDeCuentas();
        //integraInscribirCuentasStep.NITEntidadRecetoraAAprobar(NitABuscar);
        integraInscribirCuentasStep.seleccionarEditar();
        integraInscribirCuentasStep.EditarEstadoAActive();
        integraInscribirCuentasStep.guardarCambiosAprobacion();
        integraInscribirCuentasStep.seleccionarSiAutorizarCuenta();
    }

    @Then("^Valido mensaje de aprobacion exitosa$")
    public void validoMensajeDeAprobacionExitosa() {
        integraInscribirCuentasStep.validarAprobacionDeCuenta();
    }
}
