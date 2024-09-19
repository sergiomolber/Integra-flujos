package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import com.integra.ach.steps.IntegraRestriccionesStep;
import com.integra.ach.steps.IntegraSubirArchivoStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class DescargarArchivoRETStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraSubirArchivoStep integraSubirArchivoStep;
    @Steps
    IntegraRestriccionesStep integraRestriccionesStep;



    @When("^Ingresar al modulo de Trasnferencias luego a instrucciones distribuidas$")
    public void ingresarAlModuloDeTrasnferenciasLuegoAInstruccionesDistribuidas() {
        integraMenuPrincipalStep.clickModuloDeTransferencias();
        integraMenuPrincipalStep.clickInstruccionesDistribuidas();

        
    }

    @Then("^Descargar archivo\\.RET$")
    public void descargarArchivoRET() {
        integraRestriccionesStep.clickDescargarInstruccionDistribuida();
    }
}




