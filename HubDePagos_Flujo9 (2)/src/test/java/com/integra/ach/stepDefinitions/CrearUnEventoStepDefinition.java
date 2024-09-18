package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraEventosStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class CrearUnEventoStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraEventosStep integraEventosStep;


    @When("^Ingresar a eventos y diligenciar formulario de creacion de un evento \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarAEventosYDiligenciarFormularioDeCreacionDeUnEvento(String contacto, String inicioyFinalizacionDeCiclo, String generacionArchivoDeSalida, String liberacionDeArchivosDeSalida, String errorEnCierreDeCiclo, String estado, String activoHasta, String destinoCorreo) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickEventos();
        integraEventosStep.clickBotonMas();
        integraEventosStep.escribirContacto(contacto);
        integraEventosStep.seleccionarInicioYFinalizacionDelCiclo(inicioyFinalizacionDeCiclo);
        integraEventosStep.seleccionarGeneracionArchivoDeSalida(generacionArchivoDeSalida);
        integraEventosStep.seleccionarLiberacionDeArchivosDeSalida(liberacionDeArchivosDeSalida);
        integraEventosStep.seleccionarErrorEnCierreDeCiclo(errorEnCierreDeCiclo);
        integraEventosStep.seleccionarEstado(estado);
        integraEventosStep.escribirActivoDesde();
        integraEventosStep.escribirActivoHasta(activoHasta);
        integraEventosStep.escribirCorreo(destinoCorreo);
        integraEventosStep.clickEnCrear();
    }



    @Then("^Valido mensaje de creacion de evento exitosa$")
    public void validoMensajeDeCreacionDeEventoExitosa() {
        integraEventosStep.validarCreacionDeEventos();
    }
}
