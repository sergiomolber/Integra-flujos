package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraInscribirCuentasStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class EditarUnaCuentaStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraInscribirCuentasStep integraInscribirCuentasStep;

    @When("^Ingresar a catalogos luego modulo inscripcion de cuentas y editar una \"([^\"]*)\"$")
    public void ingresarACatalogoYIngresarInscripcionDeCuentasYEditarUna(String NITABuscar) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.IngresarInscripcionDeCuentas();
        integraInscribirCuentasStep.clickEnFiltrar();
        integraInscribirCuentasStep.NITAbuscar(NITABuscar);
        integraInscribirCuentasStep.clickEnBuscar();
        integraInscribirCuentasStep.clickEnEditar();
        integraInscribirCuentasStep.EditarEstadoACreated();
        integraInscribirCuentasStep.guardarCambios();
    }

    @Then("^Valido mensaje de edicion exitosa$")
    public void validoMensajeDeEdicionExitosa() {
        integraInscribirCuentasStep.validarEdicionDeTipoTransaccion();
    }
}
