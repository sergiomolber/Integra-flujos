package com.integra.ach.stepDefinitions;


import com.integra.ach.steps.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class ConsultaMontoMinimoXEFStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;


    @Steps
    IntegraEntidadesStep integraEntidadesStep;
    @Steps
    IntegraEditarEntidadStep integraEditarEntidadesStep;

    @Steps
    IntegraContratosStep integraContratosStep;




    @When("^Ingreso al modulo de Reporte Minimo X Ef \"([^\"]*)\"$")
    public void ingresoAlModuloDeReporteMinimoXEfCodigoEntidad(String CodigoEntidad) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickReporteMinimoXEf();
        integraContratosStep.clickEnFiltrar();
        integraContratosStep.contratoABuscar(CodigoEntidad);
        integraContratosStep.clickEnBuscar();





    }

    @Then("^Valido Consulta de Monto$")
    public void validoConsultaDeMonto() throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();

    }
}
