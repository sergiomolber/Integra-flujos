package com.integra.ach.stepDefinitions;


import com.integra.ach.steps.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class CrearRegistroEntidadFinancieraStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;

    @Steps
    IntegraRestriccionesStep integraRestriccionesStep;

    @Steps
    IntegraCrearLimitesStep integraCrearLimitesStep;

    @Steps
    IntegraInscribirCuentasStep integraInscribirCuentasStep;
    @Steps
    IntegraEntidadesStep integraEntidadesStep;
    @Steps
    IntegraEditarEntidadStep integraEditarEntidadesStep;



    @When("^Ingreso al modulo de creación de entidades y creo entidad \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresoAlModuloDeCreacionDeEntidadesYCreoEntidad(String CodigoEntidad, String Entidad, String NombreEntidad, String TipoEntidad, String SoportaULyingCust, String IdentificadorExternodelaEntidad, String NumeroCuenta,
                                                                 String CodigoCalendario, String Direccion, String Ciudad, String Pais, String Correo, String Telefono, String NIT, String UltimoValorPSE, String DigitoChequeo, String DominioCorreo, String SufijoUsuario,
                                                                 String FAAutenticacion, String Cifrado, String TipoAutenticacion, String XMLFavorACH, String NITCuentaXML, String Portafolio, String Estado, String ActivoDesde, String ActivoHasta) throws Exception {
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
        integraEntidadesStep.ingresoFechaDesde(ActivoDesde);
        integraEntidadesStep.ingresoFechaHasta(ActivoHasta);
        integraEntidadesStep.clicBotonCrear();
    }





    @Then("^Valido creación exitosa de la entidad$")
    public void validoCreaciónExitosaEntidad() {
        integraEntidadesStep.validolblCreacionExitosa();
        integraEditarEntidadesStep.clickBotonFiltro();
        integraEditarEntidadesStep.clickSelectorFiltro();


    }


}
