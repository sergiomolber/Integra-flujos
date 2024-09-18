package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMensajesRecibidosStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class ConsultaMensajesRecibidosStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraMensajesRecibidosStep integraMensajesRecibidosStep;

    @When("^Ingresar a catalogos luego modulo mensajes recibidos y se realiza una consulta \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarACatalogoYIngresarInscripcionDeCuentasYEliminarUna(String opcionDeBusqueda,String palabraABuscar) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.IngresarMensajesRecibidos();
        integraMensajesRecibidosStep.clickEnFiltrar();
        integraMensajesRecibidosStep.filtroPorNitEntidadReceptora(opcionDeBusqueda);
        integraMensajesRecibidosStep.NITAbuscar(palabraABuscar);
        integraMensajesRecibidosStep.clickEnBuscar();
    }

    @Then("^Valido consulta$")
    public void validoMensajeDeAprobacionExitosa() {
        integraMensajesRecibidosStep.validacionDeConsulta();
    }
}
