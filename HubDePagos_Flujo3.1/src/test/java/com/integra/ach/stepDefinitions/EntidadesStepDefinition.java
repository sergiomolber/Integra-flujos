package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraEditarEntidadStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraEntidadesStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;


public class EntidadesStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraEntidadesStep integraEntidadesStep;
    @Steps
    IntegraEditarEntidadStep integraEditarEntidadesStep;



    @When("^Ingreso al modulo de creación de entidades y creo entidad \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"$")
    public void ingresoAlModuloDeCreaciónDeEntidadesYCreoEntidad(String CodigoEntidad, String Entidad, String NombreEntidad, String TipoEntidad, String SoportaULyingCust, String IdentificadorExternodelaEntidad, String NumeroCuenta,
                                                                 String CodigoCalendario, String Direccion, String Ciudad, String Pais, String Correo, String Telefono, String NIT, String UltimoValorPSE, String DigitoChequeo, String DominioCorreo, String SufijoUsuario,
                                                                 String FAAutenticacion, String Cifrado, String TipoAutenticacion, String XMLFavorACH, String NITCuentaXML, String Portafolio, String Estado, String ActivoHasta) throws Exception {
        integraMenuPrincipalStep.clickBtnVinculacionEntidades();
        integraMenuPrincipalStep.clickBtnEntidades();
        integraEntidadesStep.seleccionarBtnCrearEntidad();
        integraEntidadesStep.ingresoCodigoEntidad(CodigoEntidad);
        integraEntidadesStep.ingresoEntidad(Entidad);
        integraEntidadesStep.ingresoNombreEntidad(NombreEntidad);
        integraEntidadesStep.clicSelectorTipoEntidad();
        integraEntidadesStep.clicSelectorCodigoCalendario(CodigoCalendario);
        integraEntidadesStep.ingresoIndentificadorExternoDeEntidad(IdentificadorExternodelaEntidad);
        integraEntidadesStep.ingresoNumeroCuenta(NumeroCuenta);
        integraEntidadesStep.ingresoDireccion(Direccion);
        integraEntidadesStep.ingresoCiudad(Ciudad);
        integraEntidadesStep.clicSelectorPais();
        integraEntidadesStep.ingresoCorreo(Correo);
        integraEntidadesStep.ingresoTelefono(Telefono);
        integraEntidadesStep.ingresoNIT(NIT);
        integraEntidadesStep.ingresoUltimoValorPSE(UltimoValorPSE);
        integraEntidadesStep.ingresoDigitoChequeo(DigitoChequeo);
        integraEntidadesStep.ingresoDominioCorreo(DominioCorreo);
        integraEntidadesStep.ingresoSufijoUsuario(SufijoUsuario);
        integraEntidadesStep.clicSelector2FA_Autenticacion();
        integraEntidadesStep.clicSelectorTipoInstitucion();
        integraEntidadesStep.ingresoNitCuentaXML(NITCuentaXML);
        integraEntidadesStep.ingresoPortafolio(Portafolio);
        integraEntidadesStep.clicSelectEstado(Estado);
        integraEntidadesStep.ingresoFechaDesde();
        integraEntidadesStep.ingresoFechaHasta(ActivoHasta);
        integraEntidadesStep.clicBotonCrear();
    }

    @When("^Ingreso al modulo de creación de entidades y edito entidad \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresoAlModuloDeCreaciónDeEntidadesYEditoEntidad(String EntidadABuscar,
                                                                  String Entidad,
                                                                  String NombreEntidad,
                                                                  String IdentificadorExternodelaEntidad,
                                                                  String NumeroCuenta,
                                                                  String Direccion,
                                                                  String Ciudad,
                                                                  String Correo,
                                                                  String Telefono,
                                                                  String NIT,
                                                                  String UltimoValorPSE,
                                                                  String DigitoChequeo,
                                                                  String DominioCorreo,
                                                                  String SufijoUsuario,
                                                                   String NITCuentaXML,
                                                                  String Portafolio,
                                                                  String Estado,
                                                                  String ActivoHasta) throws AWTException {
        integraMenuPrincipalStep.clickBtnVinculacionEntidades();
        integraMenuPrincipalStep.clickBtnEntidades();
        integraEditarEntidadesStep.clickBotonFiltro();
        integraEditarEntidadesStep.clickSelectorFiltro();
        integraEditarEntidadesStep.clickEntidad();
        integraEditarEntidadesStep.ingresoEditarEntidad(EntidadABuscar);
        integraEditarEntidadesStep.clickBtnEditarEntidad();
        integraEditarEntidadesStep.ingresoEntidad(Entidad);
        integraEditarEntidadesStep.ingresoNombreEntidad(NombreEntidad);
        integraEditarEntidadesStep.ingresoIndentificadorExternoDeEntidad(IdentificadorExternodelaEntidad);
        integraEditarEntidadesStep.ingresoNumeroCuenta(NumeroCuenta);
        integraEditarEntidadesStep.ingresoDireccion(Direccion);
        integraEditarEntidadesStep.ingresoCiudad(Ciudad);
        integraEditarEntidadesStep.ingresoCorreo(Correo);
        integraEditarEntidadesStep.ingresoTelefono(Telefono);
        integraEditarEntidadesStep.ingresoNIT(NIT);
        integraEditarEntidadesStep.ingresoUltimoValorPSE(UltimoValorPSE);
        integraEditarEntidadesStep.ingresoDigitoChequeo(DigitoChequeo);
        integraEditarEntidadesStep.ingresoDominioCorreo(DominioCorreo);
        integraEditarEntidadesStep.ingresoSufijoUsuario(SufijoUsuario);
        integraEditarEntidadesStep.ingresoNitCuentaXML(NITCuentaXML);
        integraEditarEntidadesStep.ingresoPortafolio(Portafolio);
        integraEditarEntidadesStep.clicSelectEstado(Estado);
        integraEditarEntidadesStep.ingresoFechaDesde();
        integraEditarEntidadesStep.ingresoFechaHasta(ActivoHasta);
        integraEditarEntidadesStep.clickGuardarCambios();
    }

    @When("^Ingreso al modulo de creación de entidades y elimino entidad \"([^\"]*)\"$")
    public void ingresoAlModuloDeCreacionDeEntidadesYEditoEntidad(String Entidad ) throws AWTException {
        integraMenuPrincipalStep.clickBtnVinculacionEntidades();
        integraMenuPrincipalStep.clickBtnEntidades();
        integraEditarEntidadesStep.clickBotonFiltro();
        integraEditarEntidadesStep.clickSelectorFiltro();
        integraEditarEntidadesStep.clickEntidad();
        integraEditarEntidadesStep.ingresoEditarEntidad(Entidad);
        integraEditarEntidadesStep.clickBtnEliminarEntidad();
        integraEditarEntidadesStep.clickBtnConfirmarEliminarEntidad();
    }

    @Then("^Valido creación exitosa de la entidad$")
    public void validoCreaciónExitosaEntidad() {
        integraEntidadesStep.validolblCreacionExitosa();
        integraEditarEntidadesStep.clickBotonFiltro();
        integraEditarEntidadesStep.clickSelectorFiltro();
        integraEditarEntidadesStep.clickExportar();
    }

    @Then("^Valido creación con codigo de entidad existente$")
    public void validoCreaciónCodigoEntidadExistente() {
        integraEntidadesStep.validolblCodigoYaCreado();

    }

    @Then("^Valido edición de entidad exitosa$")
    public void validoEdiciónEntidadExitosa() {
        integraEditarEntidadesStep.validolblEdicionExitosa();

    }

    @Then("^Valido eliminación de entidad exitosa$")
    public void validoEliminaciónEntidadExitosa() {
        integraEditarEntidadesStep.validolblEliminaciónExitosa();

    }
}