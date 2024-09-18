package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraEventosStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class EditarUnEventoStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraEventosStep integraEventosStep;

    @When("^Ingresar a eventos y edito la informacion del evento \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarAEventosYEditoLaInformacionDelEvento(String eventoAEditar, String contacto, String inicioyFinalizacionDeCiclo, String generacionArchivoDeSalida, String liberacionDeArchivosDeSalida, String errorEnCierreDeCiclo, String estado, String activoHasta, String destinoCorreo) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickEventos();
        integraEventosStep.clickEnFiltrar();
        integraEventosStep.filtroPorContacto();
        integraEventosStep.nombreABuscar(eventoAEditar);
        integraEventosStep.clickEnBuscar();
        integraEventosStep.clickEnEditar();
        integraEventosStep.editarContacto(contacto);
        integraEventosStep.editarInicioYFinalizacionDelCiclo(inicioyFinalizacionDeCiclo);
        integraEventosStep.editarGeneracionArchivoDeSalida(generacionArchivoDeSalida);
        integraEventosStep.editarLiberacionDeArchivosDeSalida(liberacionDeArchivosDeSalida);
        integraEventosStep.editarErrorEnCierreDeCiclo(errorEnCierreDeCiclo);
        integraEventosStep.editarEstado(estado);
        integraEventosStep.editarActivoDesde();
        integraEventosStep.editarActivoHasta(activoHasta);
        integraEventosStep.editarCorreo(destinoCorreo);
        integraEventosStep.guardarCambios();
    }


    @Then("^Valido mensaje de edicion de evnto exitosa$")
    public void validoMensajeDeEdicionDeEvntoExitosa() {
        integraEventosStep.validarEdicionDeEvento();
    }
}
