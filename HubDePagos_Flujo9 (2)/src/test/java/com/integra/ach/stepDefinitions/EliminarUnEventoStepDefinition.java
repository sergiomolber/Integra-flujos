package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraEventosStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class EliminarUnEventoStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraEventosStep integraEventosStep;

    @When("^Ingresar a eventos y busca el evento a eliminar \"([^\"]*)\"$")
    public void ingresarAEventosYBuscaElEventoAEliminar(String eventoAEliminar) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickEventos();
        integraEventosStep.clickEnFiltrar();
        integraEventosStep.filtroPorContacto();
        integraEventosStep.nombreDeEventoAEliminar(eventoAEliminar);
        integraEventosStep.clickEnBuscar();
        integraEventosStep.clickEnBorrar();
        integraEventosStep.clickEnSi();
    }


    @Then("^Valido mensaje de eliminacion de evento exitosa$")
    public void validoMensajeDeEliminacionDeEventoExitosa() {
        integraEventosStep.validarEliminacionDeEvento();
    }
}
