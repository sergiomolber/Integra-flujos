package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraReporteEstadisticasObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.awt.*;

public class IntegraReporteEstadisticaStep {
    IntegraReporteEstadisticasObject integraReporteEstadisticasObject;
    Robot robot = new Robot();

    @Step
    public void seleccionarReporte() {
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnSeleccionTipoReporte());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnSeleccionTipoReporte()).click();
    }

    /**
     * Reporte Acumulado
     **/

    @Step
    public void seleccionarReporteAcumulado() {
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnReporteAcumulado());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnReporteAcumulado()).click();
    }

    @Step
    public void seleccionarEntidadOrigenReporteAcumulado(String entidadOrigenReporteAcumulado){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnSelectorEntidadOrigenAcumulado());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnSelectorEntidadOrigenAcumulado()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+entidadOrigenReporteAcumulado+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void seleccionarEntidadDestinoReporteAcumulado(String entidadDestinoReporteAcumulado){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnSelectorEntidadDestinoAcumulado());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnSelectorEntidadDestinoAcumulado()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+entidadDestinoReporteAcumulado+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void seleccionarTipoDeTransaccionesReporteAcumulado(String tipoTransaccionesReporteAcumulado){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnSelectorTiposTransaccionesAcumulado());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnSelectorTiposTransaccionesAcumulado()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("(//*[text()='"+tipoTransaccionesReporteAcumulado+"'])[1]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void seleccionarAgruparPorReporteAcumulado(String agruparPorReporteAcumulado, String añoReporte){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnAgruparPorAcumulado());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnAgruparPorAcumulado()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnIngresarAgruparPor()).sendKeys(agruparPorReporteAcumulado+ Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(3);
        try {
           integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getTxtAñoReporte()).sendKeys(añoReporte +  Keys.ENTER);
        } catch (Exception e) {
        }
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraReporteEstadisticasObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void seleccionarFormatoReporteAcumulado(String formatoReporteAcumulado){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnFormatoAcumulado());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnFormatoAcumulado()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("(//*[text()='"+formatoReporteAcumulado+"'])[2]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    /**
     * Reporte Archivo de salida
     **/

    @Step
    public void seleccionarReporteArchivoDeSalida() {
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnReporteArchivoDeSalida());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnReporteArchivoDeSalida()).click();
    }

    @Step
    public void seleccionarEntidadFinanciera(String entidadFinanciera){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnEntidadFinanciera());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnEntidadFinanciera()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+entidadFinanciera+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraReporteEstadisticasObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void ingresarFechaInicialReporteArchivoDeSalida(){
        String fechaInicialReporteArchivoDeSalida = com.integra.ach.utils.Robot.fechahoraanterior();
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getTxtFechaInicialSalida());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getTxtFechaInicialSalida()).sendKeys(fechaInicialReporteArchivoDeSalida + Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void ingresarFechaFinalReporteArchivoDeSalida(){
        String fechaFinalReporteArchivoDeSalida = com.integra.ach.utils.Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getTxtFechaFinalSalida());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getTxtFechaFinalSalida()).sendKeys(fechaFinalReporteArchivoDeSalida + Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void seleccionarFormatoReporteArchivoDeSalida(String formatoReporteArchivoDeSalida){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getTxtFomatoArchivoSalida());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getTxtFomatoArchivoSalida()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+formatoReporteArchivoDeSalida+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    /**
     * Reporte Descripcion de lote
     **/

    @Step
    public void seleccionarReporteDescripcionPorLote() {
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnReporteDescripcionDeLote());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnReporteDescripcionDeLote()).click();
    }

    @Step
    public void seleccionarEntidadOrigenReporteDescripcionPorLote(String entidadOrigenReporteDescripcionPorLote){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnSelectorEntidadOrigenLote());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnSelectorEntidadOrigenLote()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+entidadOrigenReporteDescripcionPorLote+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void seleccionarEntidadDestinoReporteDescripcionPorLote(String entidadDestinoReporteDescripcionPorLote){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnSelectorEntidadDestinoLote());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnSelectorEntidadDestinoLote()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+entidadDestinoReporteDescripcionPorLote+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void ingresarFechaInicialReporteDescripcionPorLote(){
        String fechaInicialReporteDescripcionPorLote = com.integra.ach.utils.Robot.fechahoraanterior();
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getTxtFechaInicialLote());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getTxtFechaInicialLote()).sendKeys(fechaInicialReporteDescripcionPorLote + Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void ingresarFechaFinalReporteDescripcionPorLote( ){
        String fechaFinalReporteDescripcionPorLote = com.integra.ach.utils.Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getTxtFechaFinalSaLote());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getTxtFechaFinalSaLote()).sendKeys(fechaFinalReporteDescripcionPorLote + Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void ingresarDescripcionPorLote(String descripcionPorLote){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnDescripcionLote());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnDescripcionLote()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+descripcionPorLote+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void seleccionarFormatoReporteDescripcionPorLote(String formatoReporteDescripcionPorLote) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getTxtFormatoLote());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getTxtFormatoLote()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+formatoReporteDescripcionPorLote+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        robot.control_Menos();
    }

    /**
     * Reporte Diario
     **/

    @Step
    public void seleccionarReporteDiario() {
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnReporteDiario());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnReporteDiario()).click();
    }

    @Step
    public void seleccionarEntidadOrigenReporteDiario(String entidadOrigenReporteDiario){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnSelectorEntidadOrigenDiario());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnSelectorEntidadOrigenDiario()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+entidadOrigenReporteDiario+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void seleccionarEntidadDestinoReporteDiario(String entidadDestinoReporteDiario){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnSelectorEntidadDestinoDiario());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnSelectorEntidadDestinoDiario()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+entidadDestinoReporteDiario+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void ingresarFechaInicialReporteDiario(){
        String fechaInicialReporteDiario = com.integra.ach.utils.Robot.fechahoraanterior();
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getTxtFechaInicialDiario());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getTxtFechaInicialDiario()).sendKeys(fechaInicialReporteDiario + Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void ingresarFechaFinalReporteDiario(){
        String fechaFinalReporteDiario = com.integra.ach.utils.Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getTxtFechaFinalSaDiario());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getTxtFechaFinalSaDiario()).sendKeys(fechaFinalReporteDiario + Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void seleccionarTipoDeTransaccionesReporteDiario(String tipoTransaccionesReporteDiario){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnSelectorTiposTransaccionesDiario());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnSelectorTiposTransaccionesDiario()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("(//*[text()='"+tipoTransaccionesReporteDiario+"'])[1]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void seleccionarAgruparPorReporteDiario(String agruparPorReporteDiario, String añoReporte){
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnAgruparPorDiario());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnAgruparPorDiario()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnIngresarAgruparPor()).sendKeys(agruparPorReporteDiario+ Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(3);
        try {
            integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getTxtAñoReporte()).sendKeys(añoReporte +  Keys.ENTER);
        } catch (Exception e) {
        }
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraReporteEstadisticasObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void seleccionarFormatoReporteDiario(String formatoReporteDiario) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnFormatoDiario());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnFormatoDiario()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteEstadisticasObject.getDriver().findElement(By.xpath("(//*[text()='"+formatoReporteDiario+"'])[2]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        robot.control_Menos();
    }

    @Step
    public void seleccionarGenerarReporte() throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getBtnGenerar());
        integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getBtnGenerar()).click();
        EsperaImplicita.esperaImplicitaWeb(3);

    }

    @Step
    public void validarGeneracionDeReporte() {
        EsperaExplicita.esperaExplicitaTexto(integraReporteEstadisticasObject.getDriver(), integraReporteEstadisticasObject.getLblReporteGenerado());
        Assert.assertThat(integraReporteEstadisticasObject.getDriver().findElement(integraReporteEstadisticasObject.getLblReporteGenerado()).isDisplayed(), Matchers.is(true));
        EsperaImplicita.esperaImplicitaWeb(5);
    }
}
