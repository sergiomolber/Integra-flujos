package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraTransporteStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class TransporteStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraTransporteStep integraContratosStep;
    @Steps
    IntegraInicioStep integraInicioStep;

    @Given("^Login exitoso \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginExitoso(String tipoDeEntidad, String usuario, String clave) {
        integraInicioStep.abrirWeb();
        integraInicioStep.seleccionarTipoEntidad(tipoDeEntidad);
        integraInicioStep.clickBotonVamos();
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
        integraInicioStep.validarInicioDeSesion();
    }

    @When("^Ingresar a transporte y creo un transporte \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarATransporteYCreoUnTransporte( String codigoDeTransporte, String direccion, String codigoDeReferencia, String tipoDeTransporte, String modoDeTransporte,  String cadenaDeConexion, String cifrado, String estado,  String activoHasta, String tipoMensaje) throws AWTException {
        integraMenuPrincipalStep.clickEntidades();
        integraMenuPrincipalStep.clickContratos();
        integraContratosStep.clickBotonMas();
        integraContratosStep.ingresarCodigoTransporte(codigoDeTransporte);
        integraContratosStep.seleccionarDireccion(direccion);
        integraContratosStep.seleccionarCodigoDeReferencia(codigoDeReferencia);
        integraContratosStep.seleccionarTipoDeTransporte(tipoDeTransporte);
        integraContratosStep.seleccionarModoTransporte(modoDeTransporte);
        integraContratosStep.ingresoCadenaDeConexion(cadenaDeConexion);
        integraContratosStep.seleccionarCifrado(cifrado);
        integraContratosStep.seleccionarEstado(estado);
        integraContratosStep.ingresoFechaDesde();
        integraContratosStep.ingresoFechaHasta(activoHasta);
        integraContratosStep.seleccionarTipoMensaje(tipoMensaje);
        integraContratosStep.clickEnCrear();

    }

    @When("^Ingresar a transporte y edito un transporte \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"$")
    public void ingresarATransporteYEditoUnTransporte(
            String transporteABuscar,
            String direccion,
            String codigoDeReferencia,
            String cadenaDeConexion,
            String cifrado,
            String estado,
            String activoHasta,
            String tipoMensaje) throws AWTException {

        // Navegar al menú principal y acceder a las entidades y contratos
        integraMenuPrincipalStep.clickEntidades();
        integraMenuPrincipalStep.clickContratos();

        // Filtrar y buscar el transporte
        integraContratosStep.clickEnFiltrar();
        integraContratosStep.filtroPorCodigoDeTransporte();
        integraContratosStep.transporteABuscar(transporteABuscar);
        integraContratosStep.clickEnBuscar();

        // Editar el transporte encontrado
        integraContratosStep.clickEnEditar();
        integraContratosStep.seleccionarDireccion(direccion);
        integraContratosStep.eliminarCodigoDeReferencia();
        integraContratosStep.editarCodigoDeReferencia(codigoDeReferencia);
        integraContratosStep.ingresoCadenaDeConexion(cadenaDeConexion);
        integraContratosStep.eliminarCifrado();
        integraContratosStep.editarCifrado(cifrado);
        integraContratosStep.editarEstado(estado);
        integraContratosStep.ingresoFechaDesde();
        integraContratosStep.ingresoFechaHasta(activoHasta);
        integraContratosStep.editarTipoMensaje(tipoMensaje);

        // Guardar los cambios realizados
        integraContratosStep.clicBotonGuardarCambios();
    }

    @When("^Ingresar a transporte y elimino un transporte \"([^\"]*)\"$")
    public void ingresarAContratosYEliminoLaInformacionDelContrato(String transporteABuscar) throws AWTException {
        integraMenuPrincipalStep.clickEntidades();
        integraMenuPrincipalStep.clickContratos();
        integraContratosStep.clickEnFiltrar();
        integraContratosStep.filtroPorCodigoDeTransporte();
        integraContratosStep.transporteABuscar(transporteABuscar);
        integraContratosStep.clickEnBuscar();
        integraContratosStep.clickEnEliminar();
        integraContratosStep.clickEnSiEliminar();

    }


    @Then("^Valido mensaje de edicion exitosa$")
    public void validoMensajeDeEdicionExitosa() {
        integraContratosStep.lblEdicionExitosa();
    }

    @Then("^Valido mensaje de creacion exitosa$")
    public void validoMensajeDeCreacionExitosa() {integraContratosStep.validarCreacionDelTransporte();}

    @Then("^Valido mensaje de eliminacion exitosa$")
    public void validoMensajeDeEliminacionExitosa() {integraContratosStep.validarEliminacionDelContrato();}

    @Then("^Descargar archivo$")
    public void descargarArchivo() {
        integraContratosStep.Descargar();
        integraContratosStep.SeleccionarExcel();
        integraContratosStep.DescargarExcel();
    }
}