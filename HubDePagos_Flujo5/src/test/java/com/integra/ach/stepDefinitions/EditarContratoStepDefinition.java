package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraContratosStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class EditarContratoStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraContratosStep integraContratosStep;
    @Steps
    IntegraInicioStep integraInicioStep;



    @When("^Ingresar a contratos y creo un contrato \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarAContratosYCreoUnContrato( String descripcionAsociacion, String codigoEntidad, String codigoServicio, String codigoProceso, String productoSoportado, String codigoSucursal, String derivarCodigoSucursal, String instruccionDeAcuerdo, String nombreFormatoEntrada, String archivosDuplicados, String lotesDuplicados, String pagosDuplicados, String procesamientoParaleloDePagos, String PSAPredeterminado,String mecanismoDeUso, String estado) throws AWTException {
        integraMenuPrincipalStep.clickBtnVinculacionEntidades();
        integraMenuPrincipalStep.clickContratos();
        integraContratosStep.clickBotonMas();
        integraContratosStep.ingresoDescripcionAsociacion(descripcionAsociacion);
        integraContratosStep.clicSelectorCodEntidad(codigoEntidad);
        integraContratosStep.clicSelectorCodServicio(codigoServicio);
        integraContratosStep.editarCodigoDeProceso(codigoProceso);
        integraContratosStep.clicProductoSoportado(productoSoportado);
       // integraContratosStep.codigoSucursal(codigoSucursal);
        integraContratosStep.editarDerivarCodigoDeSucursal(derivarCodigoSucursal);
        integraContratosStep.editarInstruccionDeAcuerdo(instruccionDeAcuerdo);
        integraContratosStep.clicSelectorNombreFormatoEntrada(nombreFormatoEntrada);
        integraContratosStep.editarArchivosDuplicados(archivosDuplicados);
        integraContratosStep.editarLotesDuplicados(lotesDuplicados);
        integraContratosStep.editarPagosDuplicados(pagosDuplicados);
        integraContratosStep.editarProcesamientoParaleloDePagos(procesamientoParaleloDePagos);
        integraContratosStep.editarPSAPredeterminado(PSAPredeterminado);
        integraContratosStep.clicSelectMecanismoUso(mecanismoDeUso);
        integraContratosStep.clicSelectEstado(estado);
        integraContratosStep.ingresoFechaDesde();
        integraContratosStep.ingresoFechaHasta();
        integraContratosStep.clickEnCrear();
    }

    @When("^Ingresar a contratos y edito un contrato \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarAContratosYEditoLaInformacionDelContrato(String contratoABuscar, String descripcionAsociacion, String codigoProceso, String productoSoportado, String codigoSucursal, String derivarCodigoSucursal, String instruccionDeAcuerdo, String archivosDuplicados, String lotesDuplicados, String pagosDuplicados, String procesamientoParaleloDePagos, String PSAPredeterminado, String estado) throws AWTException {
        integraMenuPrincipalStep.clickBtnVinculacionEntidades();
        integraMenuPrincipalStep.clickContratos();
        integraContratosStep.clickEnFiltrar();
        integraContratosStep.filtroPorDescripcionDeAsociacion();
        integraContratosStep.contratoABuscar(contratoABuscar);
        integraContratosStep.clickEnBuscar();
        integraContratosStep.clickEnEditar();
        integraContratosStep.ingresoDescripcionAsociacion(descripcionAsociacion);
        integraContratosStep.editarCodigoDeProceso(codigoProceso);
        integraContratosStep.editarProductoSoportado(productoSoportado);
        integraContratosStep.editarCodigoSucursal(codigoSucursal);
        integraContratosStep.editarDerivarCodigoDeSucursal(derivarCodigoSucursal);
        integraContratosStep.editarInstruccionDeAcuerdo(instruccionDeAcuerdo);
        integraContratosStep.editarArchivosDuplicados(archivosDuplicados);
        integraContratosStep.editarLotesDuplicados(lotesDuplicados);
        integraContratosStep.editarPagosDuplicados(pagosDuplicados);
        integraContratosStep.editarProcesamientoParaleloDePagos(procesamientoParaleloDePagos);
        integraContratosStep.editarPSAPredeterminado(PSAPredeterminado);
        integraContratosStep.clicSelectEstado(estado);
        integraContratosStep.ingresoFechaDesde();
        integraContratosStep.ingresoFechaHasta();
        integraContratosStep.clicBotonGuardarCambios();
    }

    @When("^Ingresar a contratos y elimino un contrato \"([^\"]*)\"$")
    public void ingresarAContratosYEliminoLaInformacionDelContrato(String contratoABuscar) throws AWTException {
        integraMenuPrincipalStep.clickBtnVinculacionEntidades();
        integraMenuPrincipalStep.clickContratos();
        integraContratosStep.clickEnFiltrar();
        integraContratosStep.filtroPorDescripcionDeAsociacion();
        integraContratosStep.contratoABuscar(contratoABuscar);
        integraContratosStep.clickEnBuscar();
        integraContratosStep.clickEnEliminar();
        integraContratosStep.clickEnSiEliminar();

    }


    @Then("^Valido mensaje de eliminacion exitosa$")
    public void validoMensajeDeEliminacionExitosa() {integraContratosStep.validarEliminacionDelContrato();}
}