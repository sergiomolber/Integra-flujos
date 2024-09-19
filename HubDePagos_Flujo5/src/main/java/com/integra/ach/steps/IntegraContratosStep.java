package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraContratosObject;
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

public class IntegraContratosStep {
    IntegraContratosObject integraContratosObject;
    Robot robot = new Robot();

    @Step
    public void clickBotonMas() {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaExplicitaTexto(integraContratosObject.getDriver(), integraContratosObject.getBtnMas());
        integraContratosObject.getDriver().findElement(integraContratosObject.getBtnMas()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void clickEnFiltrar() {
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getBtnFiltro());
        integraContratosObject.getDriver().findElement(integraContratosObject.getBtnFiltro()).click();
    }

    @Step
    public void filtroPorDescripcionDeAsociacion() {
        EsperaImplicita.esperaImplicitaWeb(5);
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getLblSeleccionarFiltro());
        integraContratosObject.getDriver().findElement(integraContratosObject.getLblSeleccionarFiltro()).click();
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getOptDescripcionAsociacion());
        integraContratosObject.getDriver().findElement(integraContratosObject.getOptDescripcionAsociacion()).click();
    }

    @Step
    public void contratoABuscar(String contratoAEditar) {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getLblNombreABuscar());
        integraContratosObject.getDriver().findElement(integraContratosObject.getLblNombreABuscar()).click();
        integraContratosObject.getDriver().findElement(integraContratosObject.getLblNombreABuscar()).sendKeys(contratoAEditar);
    }

    @Step
    public void clickEnBuscar() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getBtnBuscar());
        try {
            integraContratosObject.getDriver().findElement(integraContratosObject.getBtnBuscar()).click();
        } catch (Exception e) {
            robot.hacerEnter();
            EsperaImplicita.esperaImplicitaWeb(5);
        }
    }

    @Step
    public void clickEnEditar() {
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getBtnEditar());
        EsperaImplicita.esperaImplicitaWeb(2);
        integraContratosObject.getDriver().findElement(integraContratosObject.getBtnEditar()).click();
    }
    @Step
    public void clickEnEliminar() {
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getBtnEliminar());
        EsperaImplicita.esperaImplicitaWeb(2);
        integraContratosObject.getDriver().findElement(integraContratosObject.getBtnEliminar()).click();
    }

    @Step
    public void clickEnSiEliminar() {
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getBtnSiEliminar());
        EsperaImplicita.esperaImplicitaWeb(2);
        integraContratosObject.getDriver().findElement(integraContratosObject.getBtnSiEliminar()).click();
    }
    @Step
    public void ingresoDescripcionAsociacion(String descripcionAsociacion){/**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraContratosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getTxtDescripcionAsociacion());
        integraContratosObject.getDriver().findElement(integraContratosObject.getTxtDescripcionAsociacion()).clear();
        integraContratosObject.getDriver().findElement(integraContratosObject.getTxtDescripcionAsociacion()).sendKeys(descripcionAsociacion);
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void clicSelectorCodEntidad(String codigoEntidad){
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getSelectorCodigoEntidad());
        integraContratosObject.getDriver().findElement(integraContratosObject.getSelectorCodigoEntidad()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
        integraContratosObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+codigoEntidad+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(15);
    }
    @Step
    public void clicSelectorCodServicio(String codigoServicio){
        EsperaImplicita.esperaImplicitaWeb(10);
        EsperaExplicita.esperaExplicitaTexto(integraContratosObject.getDriver(), integraContratosObject.getSelectorCodigoServicio());
        integraContratosObject.getDriver().findElement(integraContratosObject.getSelectorCodigoServicio()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
        integraContratosObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+codigoServicio+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void editarCodigoDeProceso(String codigoProceso){
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getBtnEliminarCodigoProceso());
        integraContratosObject.getDriver().findElement(integraContratosObject.getBtnEliminarCodigoProceso()).click();
        EsperaImplicita.esperaImplicitaWeb(10);
        integraContratosObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+codigoProceso+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(10);
    }
    @Step
    public void clicProductoSoportado(String productoSoportado){
        EsperaImplicita.esperaImplicitaWeb(8);
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getSelectorProductoSoportado());
        integraContratosObject.getDriver().findElement(integraContratosObject.getSelectorProductoSoportado()).click();
        EsperaImplicita.esperaImplicitaWeb(8);
        integraContratosObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+productoSoportado+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(8);

    }
    @Step
    public void editarProductoSoportado(String productoSoportado){
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getBtnEliminarProductoSoportado());
        try {
            integraContratosObject.getDriver().findElement(integraContratosObject.getBtnEliminarProductoSoportado()).click();
        } catch (Exception e) {
        }

        EsperaImplicita.esperaImplicitaWeb(5);
        integraContratosObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+productoSoportado+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(5);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraContratosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void codigoSucursal(String codigoSucursal){
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getSelectorCodigoSucursal());
        integraContratosObject.getDriver().findElement(integraContratosObject.getSelectorCodigoSucursal()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
        integraContratosObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+codigoSucursal+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void editarCodigoSucursal(String codigoSucursal){
        EsperaImplicita.esperaImplicitaWeb(7);
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getBtnEliminarCodigoSucursal());
        integraContratosObject.getDriver().findElement(integraContratosObject.getBtnEliminarCodigoSucursal()).click();
        EsperaImplicita.esperaImplicitaWeb(7);
        integraContratosObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+codigoSucursal+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(7);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraContratosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void editarDerivarCodigoDeSucursal(String derivarCodigoSucuarsal) {
        EsperaImplicita.esperaImplicitaWeb(7);
        integraContratosObject.getDriver().findElement(By.xpath("(//*[text()='" + derivarCodigoSucuarsal + "'])[3]")).click();
        EsperaImplicita.esperaImplicitaWeb(7);
    }

    @Step
    public void editarInstruccionDeAcuerdo(String instruccionDeAcuerdo) {
        EsperaImplicita.esperaImplicitaWeb(7);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraContratosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        integraContratosObject.getDriver().findElement(By.xpath("(//*[text()='" + instruccionDeAcuerdo + "'])[4]")).click();
        EsperaImplicita.esperaImplicitaWeb(7);

    }

    @Step
    public void editarArchivosDuplicados(String archivosDuplicados) {
        EsperaImplicita.esperaImplicitaWeb(7);
        integraContratosObject.getDriver().findElement(By.xpath("(//*[text()='" + archivosDuplicados + "'])[5]")).click();
        EsperaImplicita.esperaImplicitaWeb(10);
    }

    @Step
    public void editarLotesDuplicados(String lotesDuplicados) {
        EsperaImplicita.esperaImplicitaWeb(7);
        integraContratosObject.getDriver().findElement(By.xpath("(//*[text()='" + lotesDuplicados + "'])[6]")).click();
        EsperaImplicita.esperaImplicitaWeb(10);
    }

    @Step
    public void editarPagosDuplicados(String pagosDuplicados) {
        EsperaImplicita.esperaImplicitaWeb(7);
        integraContratosObject.getDriver().findElement(By.xpath("(//*[text()='" + pagosDuplicados + "'])[7]")).click();
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraContratosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        EsperaImplicita.esperaImplicitaWeb(7);
    }

    @Step
    public void editarProcesamientoParaleloDePagos(String procesamientoParaleloDePagos) {
        EsperaImplicita.esperaImplicitaWeb(7);
        integraContratosObject.getDriver().findElement(By.xpath("(//*[text()='" + procesamientoParaleloDePagos + "'])[9]")).click();
        EsperaImplicita.esperaImplicitaWeb(7);
    }

    @Step
    public void editarPSAPredeterminado(String PSAPredeterminado) {
        EsperaImplicita.esperaImplicitaWeb(7);
        integraContratosObject.getDriver().findElement(By.xpath("(//*[text()='" + PSAPredeterminado + "'])[11]")).click();
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraContratosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        EsperaImplicita.esperaImplicitaWeb(7);
        //integraContratosObject.getDriver().findElement(By.xpath("//*[@id='PartyServiceAssociation.AdditionalConfig']")).sendKeys("1234567");
    }
    @Step
    public void clicSelectorNombreFormatoEntrada(String nombreFormatoEntrada){
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getSelectorNombreFormatoEntrada());
        integraContratosObject.getDriver().findElement(integraContratosObject.getSelectorNombreFormatoEntrada()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraContratosObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+nombreFormatoEntrada+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(15);
    }
    @Step
    public void clicSelectMecanismoUso(String mecanismoDeUso){
        integraContratosObject.getDriver().findElement(By.xpath("//span[contains(text(),'"+mecanismoDeUso+"')]")).click();
        /**Hacer Scroll**/
        EsperaImplicita.esperaImplicitaWeb(5);
        JavascriptExecutor jse = (JavascriptExecutor) integraContratosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void clicSelectEstado(String estado) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getSelectorEstado());
        integraContratosObject.getDriver().findElement(integraContratosObject.getSelectorEstado()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getTxtEstado());
        integraContratosObject.getDriver().findElement(integraContratosObject.getTxtEstado()).sendKeys(estado + Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(2);
        robot.hacerTap1();
    }
    @Step
    public void ingresoFechaDesde() throws AWTException {
        String fechaDesde = Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getTxtFechaDesde());
        integraContratosObject.getDriver().findElement(integraContratosObject.getTxtFechaDesde()).clear();
        integraContratosObject.getDriver().findElement(integraContratosObject.getTxtFechaDesde()).sendKeys(fechaDesde);
    }
    @Step
    public void ingresoFechaHasta() throws AWTException {
        String fechaHasta = Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getTxtFechaHasta());
        integraContratosObject.getDriver().findElement(integraContratosObject.getTxtFechaHasta()).clear();
        integraContratosObject.getDriver().findElement(integraContratosObject.getTxtFechaHasta()).sendKeys(fechaHasta);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraContratosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void clicBotonGuardarCambios(){
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraContratosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        EsperaExplicita.esperaexplilicitaClick(integraContratosObject.getDriver(), integraContratosObject.getBtnGuardarCambios());
        EsperaImplicita.esperaImplicitaWeb(5);
        integraContratosObject.getDriver().findElement(integraContratosObject.getBtnGuardarCambios()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void lblEdicionExitosa(){
        EsperaExplicita.esperaExplicitaTexto(integraContratosObject.getDriver(), integraContratosObject.getLblEdicionExitosa());
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraContratosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        Assert.assertThat(integraContratosObject.getDriver().findElement(integraContratosObject.getLblEdicionExitosa()).isDisplayed(), Matchers.is(true));
        Assert.assertThat(integraContratosObject.getDriver().findElement(integraContratosObject.getLblContrato()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void clickEnCrear() throws AWTException {
        /**Hacer Scroll**/
        robot.control_Menos();
        JavascriptExecutor jse = (JavascriptExecutor) integraContratosObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        integraContratosObject.getDriver().findElement(integraContratosObject.getBtnCrear()).click();
    }

    @Step
    public void validarCreacionDelContrato() {
        EsperaExplicita.esperaExplicitaTexto(integraContratosObject.getDriver(), integraContratosObject.getTxtValidarCreacion());
        Assert.assertThat(integraContratosObject.getDriver().findElement(integraContratosObject.getTxtValidarCreacion()).isDisplayed(), Matchers.is(true));
        EsperaExplicita.esperaExplicitaTexto(integraContratosObject.getDriver(), integraContratosObject.getLblContrato());
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void validarEliminacionDelContrato() {
        EsperaExplicita.esperaExplicitaTexto(integraContratosObject.getDriver(), integraContratosObject.getTxtValidarCreacion());
        Assert.assertThat(integraContratosObject.getDriver().findElement(integraContratosObject.getTxtValidarCreacion()).isDisplayed(), Matchers.is(true));
        EsperaExplicita.esperaExplicitaTexto(integraContratosObject.getDriver(), integraContratosObject.getLblContrato());
        EsperaImplicita.esperaImplicitaWeb(5);
    }

}
