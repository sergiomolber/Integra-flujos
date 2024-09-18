package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraCuentasAdministradorasStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class EliminarUnaCuentaAdministradoraStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraCuentasAdministradorasStep integraCuentasAdministradorasStep;

    @When("^Ingresar a catalogos luego modulo cuentas administradoras y eliminar una \"([^\"]*)\"$")
    public void ingresarACatalogoYIngresarCuentasAdministradorasEliminoUna(String numeroCuentaABuscar) throws AWTException {
//        integraMenuPrincipalStep.clickCatalogo();
//        integraMenuPrincipalStep.clickCuentasAdministradoras();
        integraCuentasAdministradorasStep.clickEnFiltrar();
        integraCuentasAdministradorasStep.filtroPorCodigo();
        integraCuentasAdministradorasStep.nombreDeCuentasAdministradoraAEliminar(numeroCuentaABuscar);
        integraCuentasAdministradorasStep.clickEnBuscar();
        integraCuentasAdministradorasStep.clickEnBorrar();
        integraCuentasAdministradorasStep.clickEnSi();
    }

    @Then("^Valido mensaje de eliminacion exitosa$")
    public void validoMensajeDeEliminacionExitosa() {
        integraCuentasAdministradorasStep.validarEliminacionDeCuentaAdministradora();
    }
}
