package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraRestriccionesStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class CrearUnaRestriccionStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraRestriccionesStep integraRestriccionesStep;

    @When("^Ingresar a catalogos luego modulo restricciones y crear una \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarACatalogoYIngresarTiposDeTransaccionCreaUno(String eFOriginadora, String eFRecepetora, String codigoTransaccion, String estado, String activoDesde, String activoHasta) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickRestricciones();
        integraRestriccionesStep.clickBotonMas();
        integraRestriccionesStep.seleccionarEFOriginadora(eFOriginadora);
        integraRestriccionesStep.seleccionarEFReceptora(eFRecepetora);
        integraRestriccionesStep.seleccionarCodigoTransaccion(codigoTransaccion);
        integraRestriccionesStep.seleccionarEstado(estado);
        integraRestriccionesStep.escribirActivoDesde(activoDesde);
        integraRestriccionesStep.escribirActivoHasta(activoHasta);
        integraRestriccionesStep.clickEnCrear();
    }

    @Then("^Valido mensaje de creacion exitosa$")
    public void validoMensajeDeCreacionExitosa() {
        integraRestriccionesStep.validarCreacionDeTiposTransaccion();
    }


}
