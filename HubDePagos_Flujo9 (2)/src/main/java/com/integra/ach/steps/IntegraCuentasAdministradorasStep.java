package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraCuentasAdministradorasObject;
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

public class IntegraCuentasAdministradorasStep {
    IntegraCuentasAdministradorasObject integraCuentasAdministradorasObject;
    Robot robot = new Robot();
    ListaDesplegable listaDesplegable;

    @Step
    public void clickBotonMas() {
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getBtnMas());
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getBtnMas()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void ingresarNumeroCuenta(String numeroCuenta) {
        EsperaImplicita.esperaImplicitaWeb(3);
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtNumeroCuenta()).click();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtNumeroCuenta()).sendKeys(numeroCuenta);
    }
    @Step
    public void ingresarTipoDeCuenta(String tipoDeCuenta) {
        EsperaImplicita.esperaImplicitaWeb(2);
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtTipoDeCuenta()).click();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtTipoDeCuenta()).clear();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtTipoDeCuenta()).sendKeys(tipoDeCuenta);
    }
    @Step
    public void ingresarCodigoAdministradora(String codigoAdministradora) {
        EsperaImplicita.esperaImplicitaWeb(2);
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtCodigoAdministradora()).click();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtCodigoAdministradora()).clear();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtCodigoAdministradora()).sendKeys(codigoAdministradora);
    }
    @Step
    public void ingresarNITAdministradora(String NITAdministradora) {
        EsperaImplicita.esperaImplicitaWeb(2);
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtNITAdministradora()).click();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtNITAdministradora()).clear();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtNITAdministradora()).sendKeys(NITAdministradora);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraCuentasAdministradorasObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresarCodigoDeServicio(String codigoDeServicio) {
        EsperaImplicita.esperaImplicitaWeb(2);
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtCodigoServicio()).click();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtCodigoServicio()).clear();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtCodigoServicio()).sendKeys(codigoDeServicio);
    }
    @Step
    public void ingresarNombreDeServicio(String nombreDeServicio) {
        EsperaImplicita.esperaImplicitaWeb(2);
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtNombreServicio()).click();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtNombreServicio()).clear();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtNombreServicio()).sendKeys(nombreDeServicio);
    }
    @Step
    public void ingresarTipoDeSuscripcion(String tipoDeSuscripcion) {
        EsperaImplicita.esperaImplicitaWeb(2);
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtTipoSuscripcion()).click();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtTipoSuscripcion()).clear();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtTipoSuscripcion()).sendKeys(tipoDeSuscripcion);
    }
    @Step
    public void ingresarEFOriginadora(String EFOriginadora) {
        EsperaImplicita.esperaImplicitaWeb(2);
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtEFOriginadora()).click();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtEFOriginadora()).clear();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtEFOriginadora()).sendKeys(EFOriginadora);
    }
    @Step
    public void ingresarEFReceptora(String EFReceptora) {
        EsperaImplicita.esperaImplicitaWeb(2);
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtEFReceptora()).click();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtEFReceptora()).clear();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtEFReceptora()).sendKeys(EFReceptora);
    }
    @Step
    public void seleccionarEstado(String estado) {
        EsperaImplicita.esperaImplicitaWeb(2);
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getBtnEstado()).click();
        integraCuentasAdministradorasObject.getDriver().findElement(By.xpath("(//*[text()='" + estado + "'])[2]")).click();
    }
    @Step
    public void escribirActivoDesde() {
        String fechadesde = Robot.fechahora();
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getTxtFechaDesde());
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtFechaDesde()).clear();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtFechaDesde()).sendKeys(fechadesde);
    }
    @Step
    public void escribirActivoHasta(String activoHasta) throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getTxtFechaHasta());
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtFechaHasta()).clear();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtFechaHasta()).sendKeys(activoHasta);
        robot.hacerTap1();
    }
    @Step
    public void clickEnCrear() {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getBtnCrear());
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getBtnCrear()).click();
    }
    @Step
    public void validarCreacionDeTiposTransaccion() {
        EsperaExplicita.esperaExplicitaTexto(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getTxtValidarCreacion());
        Assert.assertThat(integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtValidarCreacion()).isDisplayed(), Matchers.is(true));
    }
    /**
     * Editar Un Evento
     **/
    @Step
    public void clickEnFiltrar() {
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getBtnFiltro());
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getBtnFiltro()).click();
    }
    @Step
    public void filtroPorCodigo() {
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getLblSeleccionarFiltro());
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getLblSeleccionarFiltro()).click();
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getOptNumeroCuenta());
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getOptNumeroCuenta()).click();
    }
    @Step
    public void numeroCuentaABuscar(String numeroDeCuentaABuscar) {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getLblNombreABuscar());
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getLblNombreABuscar()).click();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getLblNombreABuscar()).sendKeys(numeroDeCuentaABuscar);
    }
    @Step
    public void clickEnBuscar() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getBtnBuscar());
        try {
            integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getBtnBuscar()).click();
        } catch (Exception e) {
            robot.hacerEnter();
        }
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void clickEnEditar() {
        EsperaImplicita.esperaImplicitaWeb(5);
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getBtnEditar());
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getBtnEditar()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void guardarCambios() {
        EsperaImplicita.esperaImplicitaWeb(2);
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getBtnGuardarCambios()).click();
    }
    @Step
    public void validarEdicionDeCuentaAdministradora() {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaExplicitaTexto(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getTxtValidarEdicion());
        Assert.assertThat(integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getTxtValidarEdicion()).isDisplayed(), Matchers.is(true));
    }
    /**
     * Eliminar Un Evento
     **/
    @Step
    public void nombreDeCuentasAdministradoraAEliminar(String numeroCuentaABuscar) {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getLblNombreABuscar());
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getLblNombreABuscar()).click();
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getLblNombreABuscar()).sendKeys(numeroCuentaABuscar);
    }
    @Step
    public void clickEnBorrar() {
        EsperaImplicita.esperaImplicitaWeb(4);
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getBtnBorrar());
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getBtnBorrar()).click();
    }
    @Step
    public void clickEnSi() {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getBtnSiBorrar());
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getBtnSiBorrar()).click();
    }
    @Step
    public void validarEliminacionDeCuentaAdministradora() {
        EsperaExplicita.esperaExplicitaTexto(integraCuentasAdministradorasObject.getDriver(), integraCuentasAdministradorasObject.getBtnValidarBorrado());
        Assert.assertThat(integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getBtnValidarBorrado()).isDisplayed(), Matchers.is(true));
    }

    public void regresarindex() {
        EsperaImplicita.esperaImplicitaWeb(5);
        integraCuentasAdministradorasObject.getDriver().findElement(integraCuentasAdministradorasObject.getBtnActualizar()).click();
        EsperaImplicita.esperaImplicitaWeb(4);

    }
}
