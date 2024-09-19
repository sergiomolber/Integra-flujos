package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraInscribirCuentasStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class InscribirUnaCuentaStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraInscribirCuentasStep integraInscribirCuentasStep;



    @When("^Ingresar a catalogos luego modulo inscripcion de cuentas e inscribo una \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarACatalogoYIngresarInscripcionDeCuentasEInscribirUna(String NITEntidadReceptora, String entidadReceptora, String codigoDeTransaccion, String cuentaDestino, String NitEntidadOriginadora, String limiteAsociar, String estado, String activoDesde, String activoHasta) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.IngresarInscripcionDeCuentas();
        integraInscribirCuentasStep.clickBotonMas();
        integraInscribirCuentasStep.ingresarNITEntidadReceptora(NITEntidadReceptora);
        integraInscribirCuentasStep.ingresoEntidadReceptora(entidadReceptora);
        integraInscribirCuentasStep.ingresoCodigoTransaccion(codigoDeTransaccion);
        integraInscribirCuentasStep.ingresarNumeroCuentaDestino(cuentaDestino);
        integraInscribirCuentasStep.ingresarNITEntidadOriginadora(NitEntidadOriginadora);
        integraInscribirCuentasStep.ingresoLimiteAsociar(limiteAsociar);
        integraInscribirCuentasStep.seleccionarEstado(estado);
        integraInscribirCuentasStep.escribirActivoDesde(activoDesde);
        integraInscribirCuentasStep.escribirActivoHasta(activoHasta);
        integraInscribirCuentasStep.clickEnCrear();
    }

    @Then("^Valido mensaje de inscripcion exitosa$")
    public void validoMensajeDeCreacionExitosa() {
        integraInscribirCuentasStep.validarCreacionDeTiposTransaccion();
    }
}
