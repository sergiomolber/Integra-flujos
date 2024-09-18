package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraCreacionArchivoXMLStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class CreacionArchivoXMLStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraCreacionArchivoXMLStep integraCreacionArchivoXMLStep;

    @When("^Ingresar catalogos luego al modulo de Archivo XML y creo un archivo \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarCatalogosLuegoAlModuloDeArchivoXMLYCreoUnArchivo(String posicion, String ciclo) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickArchivoXML();
        integraCreacionArchivoXMLStep.clickBotonMas();
        integraCreacionArchivoXMLStep.seleccionarPosicion(posicion);
        integraCreacionArchivoXMLStep.seleccionarCiclo(ciclo);
        integraCreacionArchivoXMLStep.clickEnCrear();
    }
    @Then("^Valido creacion exitosa y clic en generar Archivo XML$")
    public void validoCreacionExitosaYClicEnGenerarArchivoXML() throws AWTException {
        integraCreacionArchivoXMLStep.validoLblCreacionExitosa();
        integraCreacionArchivoXMLStep.clickGenerarArchivoXML();



    }

    @When("^Tramitar xml \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void tramitarXml(String RespuestaBR, String Consecutivo,String observacion)throws AWTException{
        integraCreacionArchivoXMLStep.EditargenerarXML();
        integraCreacionArchivoXMLStep.TramitarXML(RespuestaBR);
        integraCreacionArchivoXMLStep.Seleccionarconsecutivo(Consecutivo);
        integraCreacionArchivoXMLStep.ingresarobservacion(observacion);
        integraCreacionArchivoXMLStep.clickGuardarCambios();
    }
}
