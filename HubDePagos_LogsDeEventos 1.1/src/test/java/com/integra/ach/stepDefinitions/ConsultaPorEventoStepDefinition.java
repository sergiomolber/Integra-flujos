package com.integra.ach.stepDefinitions;

import com.integra.ach.step.IntegraInicioStep;
import com.integra.ach.step.IntegraLogsDeEventoStep;
import com.integra.ach.step.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class ConsultaPorEventoStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraLogsDeEventoStep integraLogsDeEventoStep;
    @Given("^Login exitoso \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginExitoso(String tipoDeEntidad, String usuario, String clave) {
        integraInicioStep.abrirWeb();
        integraInicioStep.seleccionarTipoEntidad(tipoDeEntidad);
        integraInicioStep.clickBotonVamos();
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
        integraInicioStep.validarInicioDeSesion();
    }

    @When("^Ingresar a logs de eventos y buscar por \"([^\"]*)\"$")
    public void ingresarALogsDeEventosYBuscarPor(String evento) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickLogsDeEventos();
        integraLogsDeEventoStep.seleccionarEvento(evento);
        integraLogsDeEventoStep.seleccionarFechaInicio();
        integraLogsDeEventoStep.seleccionarFechaFinal();
        integraLogsDeEventoStep.clickBuscar();
    }
// ESTE SCRIPT NO ES VALIDO
//    @Then("^Valido mensaje de busqueda por evento exitoso$")
//    public void validoMensajeDeBusquedaPorEventoExitoso() throws AWTException {
//        integraLogsDeEventoStep.validarConsultaEvento();
//
//    }

    @When("^generar reporte de log de eventos$")
    public void generarReporteDeLogDeEventos() throws AWTException {
        integraLogsDeEventoStep.GenerarReporte();
        integraLogsDeEventoStep.DescargarReporte();
    }
}
