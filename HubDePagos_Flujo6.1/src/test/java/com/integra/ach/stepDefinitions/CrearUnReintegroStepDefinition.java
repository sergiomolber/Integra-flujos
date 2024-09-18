package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import com.integra.ach.steps.IntegraReintegrosStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class CrearUnReintegroStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraReintegrosStep integraReintegrosStep;


    @When("^Ingresar cartalogos luego al modulo de reintegro y diligenciar formulario de creacion de un reintegro  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarCartalogosLuegoAlModuloDeReintegroYDiligenciarFormularioDeCreacionDeUnReintegro( String entidad, String montoAFavor, String montoEnContra, String estado, String obervacion) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickReintegros();
        integraReintegrosStep.clickBotonMas();
        integraReintegrosStep.escribirFechaDeRegistro();
        integraReintegrosStep.escribirFechaCompensacion();
        integraReintegrosStep.seleccionarEntidad(entidad);
        integraReintegrosStep.escribirMontoAFavor(montoAFavor);
        integraReintegrosStep.escribirMontoEnContra(montoEnContra);
        integraReintegrosStep.seleccionarEstado(estado);
        integraReintegrosStep.escribirObervacion(obervacion);
        integraReintegrosStep.clickEnCrear();
    }

    @Then("^Valido mensaje de creacion exitosa$")
    public void validoMensajeDeCreacionExitosa() {
        integraReintegrosStep.validarCreacionDeEventos();
    }
}
