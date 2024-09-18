package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraNotificacionesStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;


public class CrearNotificacionStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraNotificacionesStep integraCreacionNotificacionesStep;

    @Given("^Login Exitoso \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginExitoso(String tipoDeEntidad, String usuario, String clave) {
        integraInicioStep.abrirWeb();
        integraInicioStep.seleccionarTipoEntidad(tipoDeEntidad);
        integraInicioStep.clickBotonVamos();
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
        integraInicioStep.validarInicioDeSesion();
    }
    @When("^Ingreso configuración de aplicacion y creo una notificación \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"$")
    public void ingresoConfiguraciónDeAplicacionYCreoUnaNotificación(String severidad, String tipo, String asunto, String mensaje, String entidad, String estado, String fechaActivoHasta) throws AWTException
    {
     // Implementación del método
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickNotificaciones();
        integraCreacionNotificacionesStep.clickBotonMas();
        integraCreacionNotificacionesStep.seleccionarSeveridad(severidad);
        integraCreacionNotificacionesStep.seleccionarTipo(tipo);
        integraCreacionNotificacionesStep.ingresoAsunto(asunto);
        integraCreacionNotificacionesStep.ingresoMensaje(mensaje);
        integraCreacionNotificacionesStep.ingresoEntidad(entidad);
        integraCreacionNotificacionesStep.clicSelectEstado(estado);
        integraCreacionNotificacionesStep.ingresoFechaDesde();
        integraCreacionNotificacionesStep.ingresoFechaHasta(fechaActivoHasta);
        integraCreacionNotificacionesStep.clickBtnCrear();
    }

    @Then("^Valido creación exitosa de una notificación$")
    public void validoCreaciónExitosaParametro() {
        integraCreacionNotificacionesStep.validoLblCreacionExitosa();
    }

    @When("^Ingreso configuración de aplicacion y edito una notificación \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresoConfiguraciónDeAplicacionYEditoUnaNotificación(String severidad, String tipo, String asunto, String mensaje, String entidad, String estado , String fechaActivoHasta) throws AWTException, InterruptedException {
        //integraMenuPrincipalStep.clickCatalogo();
        //integraMenuPrincipalStep.clickNotificaciones();
        integraCreacionNotificacionesStep.clickBotonFiltro();
        integraCreacionNotificacionesStep.clickSelectorBusquedaAsunto();
        integraCreacionNotificacionesStep.ingresoAsuntoABuscar(asunto);
        integraCreacionNotificacionesStep.clickBotonBuscar();
        integraCreacionNotificacionesStep.clickBotonEditar();
        integraCreacionNotificacionesStep.seleccionarSeveridad(severidad);
        integraCreacionNotificacionesStep.seleccionarTipo(tipo);
        integraCreacionNotificacionesStep.ingresoAsunto(asunto);
        integraCreacionNotificacionesStep.ingresoMensaje(mensaje);
        integraCreacionNotificacionesStep.clickBotonLimpiarEntidad(entidad);
        integraCreacionNotificacionesStep.clicSelectEstado(estado);
        integraCreacionNotificacionesStep.ingresoFechaDesde();
        integraCreacionNotificacionesStep.ingresoFechaHasta(fechaActivoHasta);
        integraCreacionNotificacionesStep.clickBotonGuardarCambios();
    }

    @Then("^Valido edición exitosa de una notificación$")
    public void validoEdicionExitosaParametro() {
        integraCreacionNotificacionesStep.validoLblEdicionExitosa();
    }

    @When("^Ingreso configuración de aplicacion y elimino una notificación \"([^\"]*)\"$")
    public void ingresoAlModuloDeConfiguracionAplicacionEliminoNotificacion(String asunto) throws AWTException {
        //integraMenuPrincipalStep.clickCatalogo();
        //integraMenuPrincipalStep.clickNotificaciones();
        integraCreacionNotificacionesStep.clickBotonFiltro();
        integraCreacionNotificacionesStep.clickSelectorBusquedaAsunto();
        integraCreacionNotificacionesStep.ingresoAsuntoABuscar(asunto);
        integraCreacionNotificacionesStep.clickBotonBuscar();
        integraCreacionNotificacionesStep.clickBotonEliminar();
        integraCreacionNotificacionesStep.clickBotonEliminarConfirmacion();
    }
    @Then("^Valido eliminación exitosa de una notificación$")
    public void validoEliminacionExitosaNotifiación() {integraCreacionNotificacionesStep.validoLblEliminacionExitosa();
    }

    @When("^Ingreso configuración de aplicacion y valido notificación INFO BROADCAST$")
    public void ingresoAlModuloDeConfiguracionAplicacionValidoNotificacion() throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickNotificaciones();

    }

    @Then("^Valido alerta en aplicación INFO BROADCAST \"([^\"]*)\"$")
    public void validoVisualizacionAlert(String asuntoABuscar) {
        integraCreacionNotificacionesStep.validoAlertaInfoSeaVisualizada(asuntoABuscar);
    }


    @Then("^Recargar pagina$")
    public void recargarPagina() {
        integraCreacionNotificacionesStep.recargapagina();
    }
}