package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraTransporteObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class IntegraTransporteStep {
    IntegraTransporteObject integraTransporteObject;
    Robot robot = new Robot();

    @Step
    public void clickBotonMas() {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaExplicitaTexto(integraTransporteObject.getDriver(), integraTransporteObject.getBtnMas());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnMas()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void ingresarCodigoTransporte(String codigoDeTransporte){
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getTxtCodigoTransporte());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getTxtCodigoTransporte()).clear();
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getTxtCodigoTransporte()).sendKeys(codigoDeTransporte);
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void seleccionarDireccion(String direccion) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getSelectorDireccion());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getSelectorDireccion()).click();
        Select s = new Select(integraTransporteObject.getDriver().findElement(integraTransporteObject.getSelectorDireccion()));
        s.selectByValue(direccion);
        EsperaImplicita.esperaImplicitaWeb(4);
    }
    @Step
    public void seleccionarCodigoDeReferencia(String codigoDeReferencia){
        EsperaExplicita.esperaExplicitaTexto(integraTransporteObject.getDriver(), integraTransporteObject.getSelectorCodigoDeReferencia());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getSelectorCodigoDeReferencia()).click();
        EsperaImplicita.esperaImplicitaWeb(4);
        integraTransporteObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+codigoDeReferencia+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(4);
    }
    @Step
    public void editarCodigoDeReferencia(String codigoDeReferencia){
        EsperaExplicita.esperaExplicitaTexto(integraTransporteObject.getDriver(), integraTransporteObject.getSelectorCodigoDeReferencia());
        EsperaImplicita.esperaImplicitaWeb(4);
        integraTransporteObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+codigoDeReferencia+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(4);
    }
    @Step
    public void seleccionarTipoDeTransporte(String tipoDeTransporte) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getSelectorTipoDeTransporte());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getSelectorTipoDeTransporte()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
        Select s = new Select(integraTransporteObject.getDriver().findElement(integraTransporteObject.getSelectorTipoDeTransporte()));
        s.selectByValue(tipoDeTransporte);
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void seleccionarModoTransporte(String modoTransporte) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getSelectorModoDeTransporte());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getSelectorModoDeTransporte()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
        robot.flechaAbajo();
        robot.hacerEnter();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void ingresoCadenaDeConexion(String cadenadeConexion) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getTxtCadenaDeConexion());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getTxtCadenaDeConexion()).clear();
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getTxtCadenaDeConexion()).sendKeys(cadenadeConexion);
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void seleccionarCifrado(String cifrado) throws AWTException {
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraTransporteObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getSelectorCifrado());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getSelectorCifrado()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        integraTransporteObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+cifrado+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void editarCifrado(String cifrado) throws AWTException {
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraTransporteObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getSelectorCifrado());
        EsperaImplicita.esperaImplicitaWeb(2);
        integraTransporteObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+cifrado+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void seleccionarEstado(String estado) throws AWTException {
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraTransporteObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getSelectorEstado());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getSelectorEstado()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getTxtEstado());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getTxtEstado()).sendKeys(estado + Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(2);
        robot.hacerTap1();
    }
    @Step
    public void editarEstado(String estado) throws AWTException {
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraTransporteObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnEditarEstado());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnEditarEstado()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getTxtEstado());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getTxtEstado()).sendKeys(estado + Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(3);
        robot.hacerTap1();
    }
    @Step
    public void ingresoFechaDesde() throws AWTException {
        String fechaDesde = Robot.fechahora();
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getTxtFechaDesde());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getTxtFechaDesde()).clear();
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getTxtFechaDesde()).sendKeys(fechaDesde + Keys.ENTER);
        robot.hacerTap1();
    }
    @Step
    public void ingresoFechaHasta(String fechaHasta){
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getTxtFechaHasta());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getTxtFechaHasta()).clear();
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getTxtFechaHasta()).sendKeys( fechaHasta+ Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(2);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraTransporteObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void seleccionarTipoMensaje(String tipoMensaje) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getSelectorTipoDeMensaje());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getSelectorTipoDeMensaje()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        integraTransporteObject.getDriver().findElement(By.xpath("//option[contains(text(),'"+tipoMensaje+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void editarTipoMensaje(String tipoMensaje) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnEditarTipoMensaje());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnEditarTipoMensaje()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        integraTransporteObject.getDriver().findElement(By.xpath("//option[contains(text(),'"+tipoMensaje+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void clickEnCrear() {
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnCrear()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void clicBotonGuardarCambios(){
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraTransporteObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnGuardarCambios());
        EsperaImplicita.esperaImplicitaWeb(5);
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnGuardarCambios()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void lblEdicionExitosa(){
        EsperaExplicita.esperaExplicitaTexto(integraTransporteObject.getDriver(), integraTransporteObject.getLblEdicionExitosa());
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraTransporteObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        Assert.assertThat(integraTransporteObject.getDriver().findElement(integraTransporteObject.getLblEdicionExitosa()).isDisplayed(), Matchers.is(true));
        EsperaExplicita.esperaExplicitaTexto(integraTransporteObject.getDriver(), integraTransporteObject.getLblTransporte());
        EsperaImplicita.esperaImplicitaWeb(4);
    }

    @Step
    public void validarCreacionDelTransporte() {
        EsperaExplicita.esperaExplicitaTexto(integraTransporteObject.getDriver(), integraTransporteObject.getTxtValidarCreacion());
        Assert.assertThat(integraTransporteObject.getDriver().findElement(integraTransporteObject.getTxtValidarCreacion()).isDisplayed(), Matchers.is(true));
        EsperaExplicita.esperaExplicitaTexto(integraTransporteObject.getDriver(), integraTransporteObject.getLblTransporte());
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void clickEnFiltrar() {
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnFiltro());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnFiltro()).click();
    }
    @Step
    public void filtroPorCodigoDeTransporte() {
        EsperaImplicita.esperaImplicitaWeb(5);
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getLblSeleccionarFiltro());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getLblSeleccionarFiltro()).click();
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getOptCodigoDeTransporte());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getOptCodigoDeTransporte()).click();
    }
    @Step
    public void transporteABuscar(String transporteAEditar) {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getLblCodigoABuscar());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getLblCodigoABuscar()).click();
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getLblCodigoABuscar()).sendKeys(transporteAEditar);
    }
    @Step
    public void clickEnBuscar() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnBuscar());
        try {
            integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnBuscar()).click();
        } catch (Exception e) {
            robot.hacerEnter();
        }
    }
    @Step
    public void clickEnEditar() {
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnEditar());
        EsperaImplicita.esperaImplicitaWeb(2);
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnEditar()).click();
    }

    @Step
    public void eliminarCodigoDeReferencia() throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnEliminarCodigoReferencia());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnEliminarCodigoReferencia()).click();
        EsperaImplicita.esperaImplicitaWeb(6);
    }

    @Step
    public void eliminarCifrado() throws AWTException {
        robot.control_Menos();
        robot.control_Menos();
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnEliminarCifrado());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnEliminarCifrado()).click();
        EsperaImplicita.esperaImplicitaWeb(4);
        robot.control_Mas();
    }
    @Step
    public void clickEnEliminar() {
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnEliminar());
        EsperaImplicita.esperaImplicitaWeb(2);
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnEliminar()).click();
    }
    @Step
    public void clickEnSiEliminar() {
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnSiEliminar());
        EsperaImplicita.esperaImplicitaWeb(2);
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnSiEliminar()).click();
    }

    @Step
    public void validarEliminacionDelContrato() {
        EsperaExplicita.esperaExplicitaTexto(integraTransporteObject.getDriver(), integraTransporteObject.getTxtValidarCreacion());
        Assert.assertThat(integraTransporteObject.getDriver().findElement(integraTransporteObject.getTxtValidarCreacion()).isDisplayed(), Matchers.is(true));
        EsperaExplicita.esperaExplicitaTexto(integraTransporteObject.getDriver(), integraTransporteObject.getLblTransporte());
        EsperaImplicita.esperaImplicitaWeb(5);
    }

    public void Descargar() {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnDescargar());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnDescargar()).click();
        EsperaImplicita.esperaImplicitaWeb(3);

    }

    public void SeleccionarExcel() {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnSeleccionarExcel());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnSeleccionarExcel()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    public void DescargarExcel() {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraTransporteObject.getDriver(), integraTransporteObject.getBtnDescargarExcel());
        integraTransporteObject.getDriver().findElement(integraTransporteObject.getBtnDescargarExcel()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
}
