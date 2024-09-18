package com.integra.ach.stepDefinitions;

import com.integra.ach.pageObject.IntegraInicioObject;
import com.integra.ach.step.IntegraLogsDeEventoStep;
import com.integra.ach.step.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.integra.ach.step.IntegraInicioStep;
import net.thucydides.core.annotations.Steps;

import java.awt.*;


public class ConsultaPorCorreoStepDefinition {
    @Steps
    IntegraLogsDeEventoStep integraLogsDeEventoStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;

    @When("^Ingresar a logs de eventos y consulto por correo \"([^\"]*)\"$")
    public void ingresarALogsDeEventosYConsultoPorCorreo(String correo) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickLogsDeEventos();
        integraLogsDeEventoStep.escribirCorreo(correo);
        integraLogsDeEventoStep.seleccionarFechaInicio();
        integraLogsDeEventoStep.seleccionarFechaFinal();
        integraLogsDeEventoStep.clickBuscar();
    }

// ESTE SCRITP NO ES VALIDO 
//    @Then("^Valido mensaje de busqueda por correo exitoso$")
//    public void validoMensajeDeBusquedaPorCorreoExitoso() throws AWTException {
//        integraLogsDeEventoStep.validarCorreo();
//    }


}
