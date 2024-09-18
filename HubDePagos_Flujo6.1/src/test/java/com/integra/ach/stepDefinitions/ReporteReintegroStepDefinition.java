package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraReintegrosStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class ReporteReintegroStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraReintegrosStep integraReintegrosStep;

    @When("^Ingresar cartalogos luego al modulo de reintegro y consultar un reintegiro$")
    public void ingresarCartalogosLuegoAlModuloDeReintegroYConsultarUnReintegiro() throws AWTException {
        integraMenuPrincipalStep.clickReportes();
        integraMenuPrincipalStep.clickReporteReintegros();
        integraReintegrosStep.escribirFechaDeCompensacionInicial();
        integraReintegrosStep.escribirFechaCompensacionFinal();
        integraReintegrosStep.clickEnGenerarReporte();
        integraReintegrosStep.clickEnActualizar();
        integraReintegrosStep.seleccionarReporteADescargar();
        integraReintegrosStep.seleccionarDescargarReporteExcel();

    }

    @Then("^Valido consulta$")
    public void validoConsulta() {
        integraReintegrosStep.validarDescarga();
    }
}
