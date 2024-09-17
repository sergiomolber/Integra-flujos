package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraConsultaConsumoERPStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class TransporteStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraConsultaConsumoERPStep integraConsultaConsumoERPStep;
    @Steps
    IntegraInicioStep integraInicioStep;


    @When("^Ingresar al modulo de ciclos y consultar un consumo de ERP \"([^\"]*)\"$")
    public void ingresarAModuloDeCiclosConsultarUnConsumoERP(String fecha) throws AWTException {
        integraMenuPrincipalStep.clickModuloDeCiclos();
        integraMenuPrincipalStep.clickIntegrarERP();
        integraConsultaConsumoERPStep.ingresoFecha(fecha);
        integraConsultaConsumoERPStep.clickEnBuscar();

    }


    @Then("^Valido Inicio de solicitud exitoso$")
    public void validoInicioDeSolicitudExitoso() {
        integraConsultaConsumoERPStep.validarBusqueda();
        integraConsultaConsumoERPStep.clickEnIniciarSolicitud();
        integraConsultaConsumoERPStep.clickEnEnviar();
        integraConsultaConsumoERPStep.validarMensajeExitoso();
    }
}