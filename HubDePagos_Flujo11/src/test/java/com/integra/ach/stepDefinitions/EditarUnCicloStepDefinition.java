package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraCicloDeTiempoStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class EditarUnCicloStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraCicloDeTiempoStep integraCicloDeTiempoStep;

    @When("^Ingresar a ciclo de tiempo y edito la informacion del ciclo \"([^\"]*)\"$")
    public void ingresarACicloDeTiempoYEditoLaInformacionDelCiclo(String cicloAEditar) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickEnCiclosDeTiempo();
        integraCicloDeTiempoStep.clickEnFiltrar();
        integraCicloDeTiempoStep.filtroPorCiclo();
        integraCicloDeTiempoStep.nombreABuscar(cicloAEditar);
        integraCicloDeTiempoStep.clickEnBuscar();
        integraCicloDeTiempoStep.clickEnEditar();
        integraCicloDeTiempoStep.editarHora();
        integraCicloDeTiempoStep.guardarCambios();
    }
    @When("^Ingresar a ciclo de tiempo y edito la informacion del ciclo horaMas5Minutos \"([^\"]*)\"$")
    public void ingresarACicloDeTiempoYEditoLaInformacionDelCiclohoraMas5Minutos(String cicloAEditar) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickEnCiclosDeTiempo();
        integraCicloDeTiempoStep.clickEnFiltrar();
        integraCicloDeTiempoStep.filtroPorCiclo();
        integraCicloDeTiempoStep.nombreABuscar(cicloAEditar);
        integraCicloDeTiempoStep.clickEnBuscar();
        integraCicloDeTiempoStep.clickEnEditar();
        integraCicloDeTiempoStep.editarhoraMas5Minutos();
        integraCicloDeTiempoStep.guardarCambios();
    }

    @Then("^Valido mensaje de edicion exitosa$")
    public void validoMensajeDeEdicionExitosa() {
        integraCicloDeTiempoStep.validarEdicionDelLimite();
    }
}
