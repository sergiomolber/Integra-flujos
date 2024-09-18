package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraReporteEstadisticaStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class ReporteEstadisticaStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraReporteEstadisticaStep integraReporteEstadisticaStep;


    @When("^Ingresar reportes luego al modulo de estadistica y generar un reporte estadistico acumulado \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarAReportesYGenerarReporteDeAcumulado(String entidadOrigenAcumulado, String entidadDestinoAcumulado, String tipoDeTransaccionAcumulado, String agruparPorAcumulado,String añoReporte, String formatoAcumulado) throws AWTException {
        integraMenuPrincipalStep.clickReportes();
        integraMenuPrincipalStep.clickReporteEstadisticas();
        integraReporteEstadisticaStep.seleccionarReporte();
        integraReporteEstadisticaStep.seleccionarReporteAcumulado();
        integraReporteEstadisticaStep.seleccionarEntidadOrigenReporteAcumulado(entidadOrigenAcumulado);
        integraReporteEstadisticaStep.seleccionarEntidadDestinoReporteAcumulado(entidadDestinoAcumulado);
        integraReporteEstadisticaStep.seleccionarTipoDeTransaccionesReporteAcumulado(tipoDeTransaccionAcumulado);
        integraReporteEstadisticaStep.seleccionarAgruparPorReporteAcumulado(agruparPorAcumulado,añoReporte);
        integraReporteEstadisticaStep.seleccionarFormatoReporteAcumulado(formatoAcumulado);
        integraReporteEstadisticaStep.seleccionarGenerarReporte();
    }

    @Then("^Valido generacion Reporte acumulado$")
    public void validoGeneracionReporteAcumulado() {
        integraReporteEstadisticaStep.validarGeneracionDeReporte();
    }

    @When("^Ingresar reportes luego al modulo de estadistica y generar un reporte estadistico de archivo de salida \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarAReportesYGenerarReporteDeAchivoDeSalida(String entidadFinanciera,  String formatoArchivoSalida) throws AWTException {
        integraMenuPrincipalStep.clickReportes();
        integraMenuPrincipalStep.clickReporteEstadisticas();
        integraReporteEstadisticaStep.seleccionarReporte();
        integraReporteEstadisticaStep.seleccionarReporteArchivoDeSalida();
        integraReporteEstadisticaStep.seleccionarEntidadFinanciera(entidadFinanciera);
        integraReporteEstadisticaStep.ingresarFechaInicialReporteArchivoDeSalida();
        integraReporteEstadisticaStep.ingresarFechaFinalReporteArchivoDeSalida();
        integraReporteEstadisticaStep.seleccionarFormatoReporteArchivoDeSalida(formatoArchivoSalida);
        integraReporteEstadisticaStep.seleccionarGenerarReporte();
    }

    @Then("^Valido generacion Reporte estadistico de archivo de salida$")
    public void validoGeneracionReporteAchivoDeSalida() {
        integraReporteEstadisticaStep.validarGeneracionDeReporte();
    }

    @When("^Ingresar reportes luego al modulo de estadistica y generar un reporte estadistico descripcion de lote \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarReportesLuegoAlModuloDeEstadisticaYGenerarUnReporteEstadisticoDescripcionDeLote(String entidadOrigenDescripcionLote, String entidadDestinoDescripcionLote, String descripcionLote, String formatoDescripcionLote) throws AWTException {
        integraMenuPrincipalStep.clickReportes();
        integraMenuPrincipalStep.clickReporteEstadisticas();
        integraReporteEstadisticaStep.seleccionarReporte();
        integraReporteEstadisticaStep.seleccionarReporteDescripcionPorLote();
        integraReporteEstadisticaStep.seleccionarEntidadOrigenReporteDescripcionPorLote(entidadOrigenDescripcionLote);
        integraReporteEstadisticaStep.seleccionarEntidadDestinoReporteDescripcionPorLote(entidadDestinoDescripcionLote);
        integraReporteEstadisticaStep.ingresarFechaInicialReporteDescripcionPorLote();
        integraReporteEstadisticaStep.ingresarFechaFinalReporteDescripcionPorLote();
        integraReporteEstadisticaStep.ingresarDescripcionPorLote(descripcionLote);
        integraReporteEstadisticaStep.seleccionarFormatoReporteDescripcionPorLote(formatoDescripcionLote);
        integraReporteEstadisticaStep.seleccionarGenerarReporte();
    }

    @Then("^Valido generacion Reporte descripcion de lote$")
    public void validoGeneracionReporteDescripcionDeLote() {
        integraReporteEstadisticaStep.validarGeneracionDeReporte();
    }

    @When("^Ingresar reportes luego al modulo de estadistica y consultar un reporte estadistico diario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarAReportesYGenerarReporteDeDiario(String entidadOrigenDiario, String entidadDestinoDiario,   String tipoTransaccionDiario, String agruparPorDiario, String añoReporte, String formatoDiario) throws AWTException {
        integraMenuPrincipalStep.clickReportes();
        integraMenuPrincipalStep.clickReporteEstadisticas();
        integraReporteEstadisticaStep.seleccionarReporte();
        integraReporteEstadisticaStep.seleccionarReporteDiario();
        integraReporteEstadisticaStep.seleccionarEntidadOrigenReporteDiario(entidadOrigenDiario);
        integraReporteEstadisticaStep.seleccionarEntidadDestinoReporteDiario(entidadDestinoDiario);
        integraReporteEstadisticaStep.ingresarFechaInicialReporteDiario();
        integraReporteEstadisticaStep.ingresarFechaFinalReporteDiario();
        integraReporteEstadisticaStep.seleccionarTipoDeTransaccionesReporteDiario(tipoTransaccionDiario);
        integraReporteEstadisticaStep.seleccionarAgruparPorReporteDiario(agruparPorDiario, añoReporte);
        integraReporteEstadisticaStep.seleccionarFormatoReporteDiario(formatoDiario);
        integraReporteEstadisticaStep.seleccionarGenerarReporte();
    }

    @Then("^Valido generacion Reporte diario$")
    public void validoGeneracionReporteDiario() {
        integraReporteEstadisticaStep.validarGeneracionDeReporte();
    }
}
