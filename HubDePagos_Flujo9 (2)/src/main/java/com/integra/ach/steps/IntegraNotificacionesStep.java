package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraNotificacionObject;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Utilidades;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

import static com.integra.ach.utils.Utilidades.robot;

public class IntegraNotificacionesStep {
    IntegraNotificacionObject integraNotificacionObject;

    /**
     * Crear Una Notificación
     **/
    @Step
    public void clickBotonMas() {
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getBtnMas());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getBtnMas()).click();
    }
    @Step
    public void seleccionarSeveridad(String severidad) {
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getSelectSeveridad());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getSelectSeveridad()).click();
        Select s = new Select(integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getSelectSeveridad()));
        s.selectByVisibleText(severidad);
    }
    @Step
    public void seleccionarTipo(String tipo) {
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getSelectTipo());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getSelectTipo()).click();
        Select s = new Select(integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getSelectTipo()));
        s.selectByVisibleText(tipo);
    }
    @Step
    public void ingresoAsunto(String asunto){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraNotificacionObject.getDriver(), integraNotificacionObject.getTxtAsunto());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtAsunto()).clear();
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtAsunto()).sendKeys(asunto);
    }
    @Step
    public void ingresoMensaje(String mensaje){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraNotificacionObject.getDriver(), integraNotificacionObject.getTxtMensaje());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtMensaje()).clear();
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtMensaje()).sendKeys(mensaje);
    }
    @Step
    public void ingresoEntidad(String entidad) {
        Utilidades.esperar(2000);
        try {
            Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getBtnLimpiarEntidad());
            integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getBtnLimpiarEntidad()).click();
            integraNotificacionObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+ entidad +"')]")).click();

        } catch (Exception e) {
        }
        Utilidades.esperarExplicito30(integraNotificacionObject.getDriver(), integraNotificacionObject.getTxtEntidad());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtEntidad()).click();
        integraNotificacionObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+ entidad +"')]")).click();
        Utilidades.esperar(3000);
    }
    @Step
    public void clicSelectEstado(String estado){
        Utilidades.esperarExplicito30(integraNotificacionObject.getDriver(), integraNotificacionObject.getSelectEstado());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getSelectEstado()).click();
        Utilidades.esperar(2000);
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtEstado()).click();
        Utilidades.esperar(2000);
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtEstado()).sendKeys(estado + Keys.ENTER);
        Utilidades.esperar(2000);
    }
    @Step
    public void ingresoFechaDesde() throws AWTException {
        String fechadesde = Robot.fechahora();
        Utilidades.esperarExplicito30(integraNotificacionObject.getDriver(), integraNotificacionObject.getTxtFechaDesde());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtFechaDesde()).clear();
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtFechaDesde()).sendKeys(fechadesde);
        Robot.hacerTap1();
    }
    @Step
    public void ingresoFechaHasta(String fechaHasta) throws AWTException {
        JavascriptExecutor jse = (JavascriptExecutor) integraNotificacionObject.getDriver();
        jse.executeScript("window.scrollBy(0,350)");
        Utilidades.esperarExplicito30(integraNotificacionObject.getDriver(), integraNotificacionObject.getTxtFechaHasta());
        Utilidades.subirPantalla(integraNotificacionObject.getDriver(), integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtFechaHasta()));
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtFechaHasta()).clear();
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtFechaHasta()).sendKeys(fechaHasta+Keys.ENTER);
    }
    @Step
    public void clickBtnCrear(){

        Utilidades.esperar(5000);
        JavascriptExecutor jse = (JavascriptExecutor) integraNotificacionObject.getDriver();
        jse.executeScript("window.scrollBy(0,350)");
        Utilidades.esperarExplicito30(integraNotificacionObject.getDriver(), integraNotificacionObject.getBtnCrear());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getBtnCrear()).click();
        Utilidades.esperar(2000);
    }
    @Step
    public void validoLblCreacionExitosa() {
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getTxtValidarCreacion());
        Assert.assertTrue(integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtValidarCreacion()).getText(), true);
    }

    /**
     * Editar Una Notificación
     **/
    @Step
    public void clickBotonFiltro() {
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getBtnFiltro());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getBtnFiltro()).click();
    }
    @Step
    public void clickSelectorBusquedaAsunto() {
        Utilidades.esperarExplicito30(integraNotificacionObject.getDriver(), integraNotificacionObject.getLblSeleccionarFiltro());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getLblSeleccionarFiltro()).click();
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getOptAsunto()).click();
    }
    @Step
    public void ingresoAsuntoABuscar(String asuntoABuscar){
        Utilidades.esperarExplicito30(integraNotificacionObject.getDriver(), integraNotificacionObject.getTxtAsuntoABuscar());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtAsuntoABuscar()).sendKeys(asuntoABuscar);
    }
    @Step
    public void clickBotonBuscar() {
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getBtnBuscar());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getBtnBuscar()).click();
    }
    @Step
    public void clickBotonEditar() {
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getBtnEditar());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getBtnEditar()).click();
    }
    @Step
    public void clickBotonLimpiarEntidad(String entidad) {
        Utilidades.esperar(2000);
        try {
            Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getBtnLimpiarEntidad());
            integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getBtnLimpiarEntidad()).click();
            integraNotificacionObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+ entidad +"')]")).click();

        } catch (Exception e) {
        }
        //Utilidades.esperarExplicito30(integraNotificacionObject.getDriver(), integraNotificacionObject.getTxtEntidad());
        //integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtEntidad()).click();
        //integraNotificacionObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+ entidad +"')]")).click();
        //Utilidades.esperar(3000);
    }
    @Step
    public void clickBotonGuardarCambios() {
        Utilidades.esperar(5000);
        JavascriptExecutor jse = (JavascriptExecutor) integraNotificacionObject.getDriver();
        jse.executeScript("window.scrollBy(0,350)");
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getBtnGuardarCambios());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getBtnGuardarCambios()).click();
        Utilidades.esperar(2000);
    }
    @Step
    public void validoLblEdicionExitosa() {
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getTxtValidarEdicion());
        Assert.assertTrue(integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getTxtValidarEdicion()).getText(), true);
    }
    /**
     * Eliminar Una Notificación
     **/
    @Step
    public void clickBotonEliminar() {
        Utilidades.esperar(3000);
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getBtnBorrar());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getBtnBorrar()).click();
    }
    @Step
    public void clickBotonEliminarConfirmacion() {
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getBtnSiBorrar());
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getBtnSiBorrar()).click();
    }
    @Step
    public void validoLblEliminacionExitosa() {
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), integraNotificacionObject.getBtnValidarBorrado());
        Assert.assertTrue(integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getBtnValidarBorrado()).getText(), true);
    }

    @Step
    public void validoAlertaInfoSeaVisualizada(String asuntoABuscar) {
        Utilidades.esperarExplicito30( integraNotificacionObject.getDriver(), By.xpath("//*[contains(text(),'"+ asuntoABuscar +"')]"));
        Assert.assertTrue(integraNotificacionObject.getDriver().findElement(By.xpath("//*[contains(text(),'"+ asuntoABuscar +"')]")).getText(), true);
    }

    public void recargapagina() {
        EsperaImplicita.esperaImplicitaWeb(5);
        integraNotificacionObject.getDriver().findElement(integraNotificacionObject.getBtnActualizar()).click();
        EsperaImplicita.esperaImplicitaWeb(4);
    }
}
