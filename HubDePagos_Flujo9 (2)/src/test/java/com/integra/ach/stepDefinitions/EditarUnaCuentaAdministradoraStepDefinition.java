package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraCuentasAdministradorasStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class EditarUnaCuentaAdministradoraStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraCuentasAdministradorasStep integraCuentasAdministradorasStep;

    @When("^Ingresar a catalogos luego modulo cuentas administradoras y editar una \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarACatalogosLuegoModuloCuentasAdministradorasYEditarUna(String numeroDeCuentaABuscar, String tipoDeCuenta, String codigoAdministradora, String NITAdministradora, String codigoDeServicio, String nombreDeServicio, String tipoDeSuscripcion, String EFOriginadora,String EFReceptora, String estado, String activoHasta) throws AWTException {
//        integraMenuPrincipalStep.clickCatalogo();
//        integraMenuPrincipalStep.clickCuentasAdministradoras();
        integraCuentasAdministradorasStep.clickEnFiltrar();
        integraCuentasAdministradorasStep.filtroPorCodigo();
        integraCuentasAdministradorasStep.numeroCuentaABuscar(numeroDeCuentaABuscar);
        integraCuentasAdministradorasStep.clickEnBuscar();
        integraCuentasAdministradorasStep.clickEnEditar();
        integraCuentasAdministradorasStep.ingresarTipoDeCuenta(tipoDeCuenta);
        integraCuentasAdministradorasStep.ingresarCodigoAdministradora(codigoAdministradora);
        integraCuentasAdministradorasStep.ingresarNITAdministradora(NITAdministradora);
        integraCuentasAdministradorasStep.ingresarCodigoDeServicio(codigoDeServicio);
        integraCuentasAdministradorasStep.ingresarNombreDeServicio(nombreDeServicio);
        integraCuentasAdministradorasStep.ingresarTipoDeSuscripcion(tipoDeSuscripcion);
        integraCuentasAdministradorasStep.ingresarEFOriginadora(EFOriginadora);
        integraCuentasAdministradorasStep.ingresarEFReceptora(EFReceptora);
        integraCuentasAdministradorasStep.seleccionarEstado(estado);
        integraCuentasAdministradorasStep.escribirActivoDesde();
        integraCuentasAdministradorasStep.escribirActivoHasta(activoHasta);
        integraCuentasAdministradorasStep.guardarCambios();
    }

    @Then("^Valido mensaje de edicion exitosa$")
    public void validoMensajeDeEdicionExitosa() {
        integraCuentasAdministradorasStep.validarEdicionDeCuentaAdministradora();
    }
}
