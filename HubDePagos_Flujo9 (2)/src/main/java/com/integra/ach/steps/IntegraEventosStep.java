package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraEventosObject;
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

public class IntegraEventosStep {
    IntegraEventosObject integraEventosObject;
    Robot robot = new Robot();
    ListaDesplegable listaDesplegable;

    @Step
    public void clickBotonMas() {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getBtnMas());
        integraEventosObject.getDriver().findElement(integraEventosObject.getBtnMas()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void escribirContacto(String contacto) {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getBtnContacto());
        integraEventosObject.getDriver().findElement(integraEventosObject.getBtnContacto()).sendKeys(contacto);
    }

    @Step
    public void seleccionarInicioYFinalizacionDelCiclo(String inicioyFinalizacionDeCiclo) {
        integraEventosObject.getDriver().findElement(By.xpath("(//*[text()='" + inicioyFinalizacionDeCiclo + "'])[2]")).click();
    }

    @Step
    public void seleccionarGeneracionArchivoDeSalida(String generacionArchivoDeSalida) {
        integraEventosObject.getDriver().findElement(By.xpath("(//*[text()='" + generacionArchivoDeSalida + "'])[3]")).click();
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEventosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void seleccionarLiberacionDeArchivosDeSalida(String liberacionDeArchivosDeSalida) {
        integraEventosObject.getDriver().findElement(By.xpath("(//*[text()='" + liberacionDeArchivosDeSalida + "'])[4]")).click();
    }

    @Step
    public void seleccionarErrorEnCierreDeCiclo(String errorEnCierreDeCiclo) {
        integraEventosObject.getDriver().findElement(By.xpath("(//*[text()='" + errorEnCierreDeCiclo + "'])[5]")).click();
    }

    @Step
    public void seleccionarEstado(String estado) {
        integraEventosObject.getDriver().findElement(integraEventosObject.getSelectEstado()).click();
//        listaDesplegable.seleccionarTextoVisible(integraEventosObject.getDriver(), integraEventosObject.getSelectEstado(), estado);
        integraEventosObject.getDriver().findElement(By.xpath("(//*[text()='" + estado + "'])[2]")).click();
    }

    @Step
    public void escribirActivoDesde() throws AWTException {
        String ActivoDesde = Robot.fechahora();
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getLblactivoDesde());
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblactivoDesde()).sendKeys(ActivoDesde);
        robot.hacerTap1();
    }

    @Step
    public void escribirActivoHasta(String activoHasta) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getLblactivoHasta());
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblactivoHasta()).sendKeys(activoHasta);
        robot.hacerTap1();
    }

    @Step
    public void escribirCorreo(String destinoCorreo) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getLblcorreo());
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblcorreo()).sendKeys(destinoCorreo);
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEventosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void clickEnCrear() {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getBtnCrear());
        integraEventosObject.getDriver().findElement(integraEventosObject.getBtnCrear()).click();
    }

    @Step
    public void validarCreacionDeEventos() {
        EsperaExplicita.esperaExplicitaTexto(integraEventosObject.getDriver(), integraEventosObject.getTxtValidarCreacion());
        Assert.assertThat(integraEventosObject.getDriver().findElement(integraEventosObject.getTxtValidarCreacion()).isDisplayed(), Matchers.is(true));
    }

    /**
     * Editar Un Evento
     **/
    @Step
    public void clickEnFiltrar() {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getBtnFiltro());
        integraEventosObject.getDriver().findElement(integraEventosObject.getBtnFiltro()).click();
    }

    @Step
    public void filtroPorContacto() {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getLblSeleccionarFiltro());
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblSeleccionarFiltro()).click();
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getOptContacto());
        integraEventosObject.getDriver().findElement(integraEventosObject.getOptContacto()).click();
    }

    @Step
    public void nombreABuscar(String eventoAEditar) {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getLblNombreABuscar());
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblNombreABuscar()).click();
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblNombreABuscar()).sendKeys(eventoAEditar);
    }

    @Step
    public void clickEnBuscar() throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getBtnBuscar());
        try {
            integraEventosObject.getDriver().findElement(integraEventosObject.getBtnBuscar()).click();
        } catch (Exception e) {
            robot.hacerEnter();
        }
    }

    @Step
    public void clickEnEditar() {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getBtnEditar());
        integraEventosObject.getDriver().findElement(integraEventosObject.getBtnEditar()).click();
    }

    @Step
    public void editarContacto(String contacto) {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getBtnContacto());
        integraEventosObject.getDriver().findElement(integraEventosObject.getBtnContacto()).clear();
        integraEventosObject.getDriver().findElement(integraEventosObject.getBtnContacto()).sendKeys(contacto);
    }

    @Step
    public void editarInicioYFinalizacionDelCiclo(String inicioyFinalizacionDeCiclo) {
        integraEventosObject.getDriver().findElement(By.xpath("(//*[text()='" + inicioyFinalizacionDeCiclo + "'])[2]")).click();
    }

    @Step
    public void editarGeneracionArchivoDeSalida(String generacionArchivoDeSalida) {
        integraEventosObject.getDriver().findElement(By.xpath("(//*[text()='" + generacionArchivoDeSalida + "'])[3]")).click();
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEventosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void editarLiberacionDeArchivosDeSalida(String liberacionDeArchivosDeSalida) {
        integraEventosObject.getDriver().findElement(By.xpath("(//*[text()='" + liberacionDeArchivosDeSalida + "'])[4]")).click();
    }

    @Step
    public void editarErrorEnCierreDeCiclo(String errorEnCierreDeCiclo) {
        integraEventosObject.getDriver().findElement(By.xpath("(//*[text()='" + errorEnCierreDeCiclo + "'])[5]")).click();
    }

    @Step
    public void editarEstado(String estado) {
        integraEventosObject.getDriver().findElement(integraEventosObject.getSelectEstado()).click();
//        listaDesplegable.seleccionarTextoVisible(integraEventosObject.getDriver(), integraEventosObject.getSelectEstado(), estado);
        integraEventosObject.getDriver().findElement(By.xpath("(//*[text()='" + estado + "'])[2]")).click();
    }

    @Step
    public void editarActivoDesde( ) throws AWTException {
        String ActivoDesde = Robot.fechahora();
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getLblactivoDesde());
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblactivoDesde()).clear();
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblactivoDesde()).sendKeys(ActivoDesde);
//        robot.hacerTap1();
    }

    @Step
    public void editarActivoHasta(String activoHasta) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getLblactivoHasta());
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblactivoHasta()).clear();
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblactivoHasta()).sendKeys(activoHasta);
//        robot.hacerTap1();
    }

    @Step
    public void editarCorreo(String destinoCorreo) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getLblcorreo());
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblcorreo()).clear();
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblcorreo()).sendKeys(destinoCorreo);
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEventosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void guardarCambios() {
        integraEventosObject.getDriver().findElement(integraEventosObject.getBtnGuardarCambios()).click();
    }

    @Step
    public void validarEdicionDeEvento() {
        EsperaExplicita.esperaExplicitaTexto(integraEventosObject.getDriver(), integraEventosObject.getTxtValidarEdicion());
        Assert.assertThat(integraEventosObject.getDriver().findElement(integraEventosObject.getTxtValidarEdicion()).isDisplayed(), Matchers.is(true));
    }
    /**
     * Eliminar Un Evento
     **/
    @Step
    public void nombreDeEventoAEliminar(String eventoAEliminar) {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getLblNombreABuscar());
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblNombreABuscar()).click();
        integraEventosObject.getDriver().findElement(integraEventosObject.getLblNombreABuscar()).sendKeys(eventoAEliminar);
    }
    @Step
    public void clickEnBorrar() {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getBtnBorrar());
        integraEventosObject.getDriver().findElement(integraEventosObject.getBtnBorrar()).click();
    }
    @Step
    public void clickEnSi() {
        EsperaExplicita.esperaexplilicitaClick(integraEventosObject.getDriver(), integraEventosObject.getBtnSiBorrar());
        integraEventosObject.getDriver().findElement(integraEventosObject.getBtnSiBorrar()).click();
    }

    @Step
    public void validarEliminacionDeEvento() {
        EsperaExplicita.esperaExplicitaTexto(integraEventosObject.getDriver(), integraEventosObject.getBtnValidarBorrado());
        Assert.assertThat(integraEventosObject.getDriver().findElement(integraEventosObject.getBtnValidarBorrado()).isDisplayed(), Matchers.is(true));
    }
}
