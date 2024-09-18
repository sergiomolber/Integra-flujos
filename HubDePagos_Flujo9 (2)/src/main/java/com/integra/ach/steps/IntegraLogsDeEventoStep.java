package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraLogsDeEventosObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class IntegraLogsDeEventoStep {

    IntegraLogsDeEventosObject integraLogsDeEventoStep;
    Robot robot = new Robot();

    /**
     * consultar por evento
     **/
    @Step
    public void seleccionarEvento(String evento) throws AWTException {
        integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getLblEvento()).sendKeys(evento);
        robot.hacerEnter();
        EsperaImplicita.esperaImplicitaWeb(5);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraLogsDeEventoStep.getDriver();
        jse.executeScript("window.scrollBy(0,200)");
    }

    @Step
    public void seleccionarFechaInicio()throws AWTException {
        String fechaInicio = Robot.fechahora();
        integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getBtnFechaInicial()).sendKeys(fechaInicio);
    }

    @Step
    public void seleccionarFechaFinal() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(5);
        String fechaFin = Robot.fechahora();
        integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getBtnFechaFinal()).sendKeys(fechaFin);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraLogsDeEventoStep.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void clickBuscar() {
        EsperaImplicita.esperaImplicitaWeb(7);
        try {
            integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getBtnBuscar()).click();
        } catch (Exception E) {
            integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getBtnBuscar()).click();
        }
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraLogsDeEventoStep.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
//    @Step
//    public void validarConsultaEvento() throws AWTException {
//        robot.control_Menos();
//        EsperaExplicita.esperaExplicitaTexto(integraLogsDeEventoStep.getDriver(), integraLogsDeEventoStep.getBtnValidarEvento());
//        Assert.assertThat(integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getBtnValidarEvento()).isDisplayed(), Matchers.is(true));
//    }
    //Descarga de reporte
    public void GenerarReporte() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        JavascriptExecutor jse = (JavascriptExecutor) integraLogsDeEventoStep.getDriver();
        jse.executeScript("window.scrollBy(0,-700)");
        EsperaExplicita.esperaexplilicitaClick(integraLogsDeEventoStep.getDriver(), integraLogsDeEventoStep.getBtnGenerarLogsDeEventos());
        integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getBtnGenerarLogsDeEventos()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraLogsDeEventoStep.getDriver(), integraLogsDeEventoStep.getBtnDescargarReporteExcel());
        integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getBtnDescargarReporteExcel()).click();

    }
    //Descarga de reporte desde informes ACH
    public void DescargarReporte() {
        EsperaImplicita.esperaImplicitaWeb(20);
        EsperaExplicita.esperaexplilicitaClick(integraLogsDeEventoStep.getDriver(), integraLogsDeEventoStep.getBtnActualizar());
        integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getBtnActualizar()).click();
        EsperaExplicita.esperaexplilicitaClick(integraLogsDeEventoStep.getDriver(), integraLogsDeEventoStep.getBtnDescargarReporte());
        integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getBtnDescargarReporte()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    /**
     * consultar por usuario
     **/
    @Step
    public void escribirUsuario(String usuarioEvento) {
        integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getLblUsuario()).sendKeys(usuarioEvento);
    }

    @Step
    public void validarUsuario() throws AWTException {
        robot.control_Menos();
        EsperaExplicita.esperaexplilicitaClick(integraLogsDeEventoStep.getDriver(), integraLogsDeEventoStep.getTxtUsuario());
        Assert.assertThat(integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getTxtUsuario()).isDisplayed(), Matchers.is(true));
    }

    /**
     * consultar por correo
     **/
    @Step
    public void escribirCorreo(String correo) {
        integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getLblCorreo()).sendKeys(correo);
    }

    @Step
    public void validarCorreo() throws AWTException {
        robot.control_Menos();
        EsperaExplicita.esperaexplilicitaClick(integraLogsDeEventoStep.getDriver(), integraLogsDeEventoStep.getTxtCorreo());
        Assert.assertThat(integraLogsDeEventoStep.getDriver().findElement(integraLogsDeEventoStep.getTxtCorreo()).isDisplayed(), Matchers.is(true));
    }


}

