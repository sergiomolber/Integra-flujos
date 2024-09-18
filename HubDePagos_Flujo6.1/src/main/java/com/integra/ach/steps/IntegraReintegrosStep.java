package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraReporteReintegrosObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.ListaDesplegable;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;

public class IntegraReintegrosStep {
    IntegraReporteReintegrosObject integraReporteReintegrosObject;
    com.integra.ach.utils.Robot robot = new com.integra.ach.utils.Robot();
    ListaDesplegable listaDesplegable;

// Crear reintegro

    public void clickBotonMas() {
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getBtnMas1());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getBtnMas1()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void escribirFechaDeRegistro() throws AWTException {
        String fechadesde = com.integra.ach.utils.Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getTxtFechaRegistro());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtFechaRegistro()).clear();
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtFechaRegistro()).sendKeys(fechadesde);
        robot.hacerTap1();
    }
    @Step
    public void escribirFechaCompensacion() throws AWTException {
        String fechaCompensacion = Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getTxtFechaDeCompensacion());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtFechaDeCompensacion()).clear();
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtFechaDeCompensacion()).sendKeys(fechaCompensacion);
        robot.hacerTap1();
    }

    @Step
    public void seleccionarEntidad(String entidad) {
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getSelectEntidadFinanciera());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getSelectEntidadFinanciera()).click();
        integraReporteReintegrosObject.getDriver().findElement(By.xpath("(//*[text()='" + entidad + "'])[2]")).click();
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraReporteReintegrosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }



    @Step
    public void seleccionarEstado(String estado) {
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getSelectEstado()).click();
        integraReporteReintegrosObject.getDriver().findElement(By.xpath("(//*[text()='" + estado + "'])[2]")).click();
    }
    @Step
    public void escribirMontoAFavor(String montoAFavor) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getTxtMontoAFavor());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtMontoAFavor()).clear();
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtMontoAFavor()).sendKeys(montoAFavor);
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraReporteReintegrosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void escribirMontoEnContra(String montoEnContra) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getTxtMontoEnContra());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtMontoEnContra()).clear();
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtMontoEnContra()).sendKeys(montoEnContra);
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraReporteReintegrosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void escribirObervacion(String obervacion) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getTxtObervacion());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtObervacion()).clear();
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtObervacion()).sendKeys(obervacion);
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraReporteReintegrosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void clickEnCrear() {
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getBtnCrear());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getBtnCrear()).click();
    }

    @Step
    public void validarCreacionDeEventos() {
        EsperaExplicita.esperaExplicitaTexto(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getTxtValidarCreacion());
        Assert.assertThat(integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtValidarCreacion()).isDisplayed(), Matchers.is(true));
    }



    // buscar y generar reporte
    @Step
    public void escribirFechaDeCompensacionInicial() throws AWTException {
        String fechaCompensacionInicial = Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getTxtFechaDeCompensacionInicial());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtFechaDeCompensacionInicial()).clear();
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtFechaDeCompensacionInicial()).sendKeys(fechaCompensacionInicial);
        robot.hacerTap1();
    }
    @Step
    public void escribirFechaCompensacionFinal() throws AWTException {
        String fechaCompensacionFinal = Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getTxtFechaDeCompensacionFinal());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtFechaDeCompensacionFinal()).clear();
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getTxtFechaDeCompensacionFinal()).sendKeys(fechaCompensacionFinal);
        robot.hacerEnter();
    }

    @Step
    public void clickEnGenerarReporte() {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getBtnGenerarReporte());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getBtnGenerarReporte()).click();
        EsperaImplicita.esperaImplicitaWeb(4);
    }
    public void clickEnActualizar() {
        EsperaImplicita.esperaImplicitaWeb(3);
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getBtnActualizar()).click();
        EsperaImplicita.esperaImplicitaWeb(2);

    }
    @Step
    public void seleccionarReporteADescargar() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getBtnSeleccionarReporte());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getBtnSeleccionarReporte()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
       // robot.control_Mas();
    }

    @Step
    public void seleccionarDescargarReporteExcel() throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getBtnDescargar());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getBtnDescargar()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
        EsperaExplicita.esperaexplilicitaClick(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getBtnDescargarReporteExcel());
        integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getBtnDescargarReporteExcel()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }

    @Step
    public void validarDescarga() {
        EsperaExplicita.esperaExplicitaTexto(integraReporteReintegrosObject.getDriver(), integraReporteReintegrosObject.getLblReporteReintegros());
        Assert.assertThat(integraReporteReintegrosObject.getDriver().findElement(integraReporteReintegrosObject.getLblReporteReintegros()).isDisplayed(), Matchers.is(true));
    }



}
