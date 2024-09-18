package com.integra.ach.stepDefinitions;

import com.integra.ach.step.IntegraLogsDeEventoStep;
import com.integra.ach.step.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.awt.*;

public class ConsultaPorUsuarioStepDefinition {
    @Steps
    IntegraLogsDeEventoStep integraLogsDeEventoStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;

    @When("^Ingresar a logs de eventos y consulto por usuario \"([^\"]*)\"$")
    public void ingresarALogsDeEventosYConsultoPorUsuario(String usuarioEvento) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickLogsDeEventos();
        integraLogsDeEventoStep.escribirUsuario(usuarioEvento);
        integraLogsDeEventoStep.seleccionarFechaInicio();
        integraLogsDeEventoStep.seleccionarFechaFinal();
        integraLogsDeEventoStep.clickBuscar();
    }

// ESTE SCRIPT NO ES VALIDO
//    @Then("^Valido mensaje de busqueda por usuario exitoso$")
//    public void validoMensajeDeBusquedaPorUsuarioExitoso() throws AWTException {
//        integraLogsDeEventoStep.validarUsuario();
//    }

}
