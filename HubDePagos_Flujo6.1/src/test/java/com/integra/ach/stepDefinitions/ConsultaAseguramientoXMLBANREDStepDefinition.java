package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraConsultaAseguramientoXMLBANREDStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class ConsultaAseguramientoXMLBANREDStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraConsultaAseguramientoXMLBANREDStep integraConsultaAseguramientoXMLBANREDStep;
    @Given("^Login exitoso \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginExitoso(String tipoDeEntidad, String usuario, String clave) {
        integraInicioStep.abrirWeb();
        integraInicioStep.seleccionarTipoEntidad(tipoDeEntidad);
        integraInicioStep.clickBotonVamos();
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
        integraInicioStep.validarInicioDeSesion();
    }
    @When("^Ingresar a reportes luego al modulo de Aseguramiento XML BANRED y consulto \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarAReportesLuegoAlModuloDeAseguramientoXMLBANREDYConsulto(String posicion, String formato) throws AWTException {
        integraMenuPrincipalStep.clickCatalogos();
        integraMenuPrincipalStep.clickArchivoXML();
        integraConsultaAseguramientoXMLBANREDStep.ingresoFechaInicial();
        integraConsultaAseguramientoXMLBANREDStep.ingresoFechaFinal();
        integraConsultaAseguramientoXMLBANREDStep.seleccionarPosicion(posicion);
        integraConsultaAseguramientoXMLBANREDStep.seleccionarFormato(formato);
        integraConsultaAseguramientoXMLBANREDStep.clickEnConsultar();
    }
    @Then("^Valido consulta exitosa$")
    public void validoCreacionExitosa() {
        integraConsultaAseguramientoXMLBANREDStep.validoLblCreacionExitosa();
    }
}
