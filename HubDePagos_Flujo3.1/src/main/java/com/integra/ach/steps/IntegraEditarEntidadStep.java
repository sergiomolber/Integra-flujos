package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraEditarEntidadObject;
import com.integra.ach.utils.Robot;
import com.integra.ach.utils.Utilidades;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.awt.*;

public class IntegraEditarEntidadStep {
    IntegraEditarEntidadObject integraEditarEntidadObject;

    @Step
    public void clickBotonFiltro() {
        Utilidades.esperar(10000);
        Utilidades.esperarExplicito30( integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getBtnFiltro());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getBtnFiltro()).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void clickSelectorFiltro() {
        Utilidades.esperarExplicito30( integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getSelectorFiltro());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getSelectorFiltro()).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void clickExportar() {
        Utilidades.esperarExplicito30( integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getbtnExportar());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getbtnExportar()).click();
        Utilidades.esperar(2000);
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getBtnExportarExcel()).click();
    }



    @Step
    public void clickEntidad() {
        Utilidades.esperarExplicito30( integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getBtnEntidad());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getBtnEntidad()).click();
        Utilidades.esperar(2000);
    }

    @Step
        public void ingresoEditarEntidad(String entidadAEditar) {
        Utilidades.esperarExplicito30( integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtFiltroEntidad());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtFiltroEntidad()).sendKeys(entidadAEditar + Keys.ENTER);
        Utilidades.esperar(3000);
        Utilidades.esperarExplicito30( integraEditarEntidadObject.getDriver(),By.xpath("//span[contains(text(),'"+entidadAEditar+"')]"));
        integraEditarEntidadObject.getDriver().findElement(By.xpath("//span[contains(text(),'"+entidadAEditar+"')]")).click();
    }

    @Step
    public void clickBtnEditarEntidad() {
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30( integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getBtnEditarEntidad());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getBtnEditarEntidad()).click();
    }
    @Step
    public void ingresoEntidad(String Entidad){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtEntidad());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtEntidad()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtEntidad()).sendKeys(Entidad);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEditarEntidadObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresoNombreEntidad(String NombreEntidad){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtNombreEntidad());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtNombreEntidad()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtNombreEntidad()).sendKeys(NombreEntidad);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEditarEntidadObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void ingresoIndentificadorExternoDeEntidad(String IdentificadorExternodelaEntidad){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtIndentificadorExternoDeEntidad());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtIndentificadorExternoDeEntidad()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtIndentificadorExternoDeEntidad()).sendKeys(IdentificadorExternodelaEntidad);
    }
    @Step
    public void ingresoNumeroCuenta(String NumeroCuenta){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtNumeroCuenta());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtNumeroCuenta()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtNumeroCuenta()).sendKeys(NumeroCuenta);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEditarEntidadObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void clicSelectorCodigoCalendario(String CodigoCalendario){
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getSelectorCodigoCalendario());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getSelectorCodigoCalendario()).click();
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getCodigoCalendarioColombiano());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getCodigoCalendarioColombiano()).click();
        Utilidades.esperar(1000);
    }
    @Step
    public void ingresoDireccion(String Direccion){
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtDireccion());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtDireccion()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtDireccion()).sendKeys(Direccion);
    }
    @Step
    public void ingresoCiudad(String Ciudad){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtCiudad());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtCiudad()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtCiudad()).sendKeys(Ciudad);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEditarEntidadObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void clicSelectorPais(){
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getSelectorPais());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getSelectorPais()).click();
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getPaisColombia());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getPaisColombia()).click();
    }
    @Step
    public void ingresoCorreo(String Correo){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtCorreo());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtCorreo()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtCorreo()).sendKeys(Correo);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEditarEntidadObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresoTelefono(String Telefono){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtTelefono());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtTelefono()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtTelefono()).sendKeys(Telefono);
    }
    @Step
    public void ingresoNIT(String NIT){
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtNIT());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtNIT()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtNIT()).sendKeys(NIT);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEditarEntidadObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresoUltimoValorPSE(String UltimoValorPSE){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtUltimoValorPSE());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtUltimoValorPSE()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtUltimoValorPSE()).sendKeys(UltimoValorPSE);
    }
    @Step
    public void ingresoDigitoChequeo(String DigitoChequeo){
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtDigitoChequeo());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtDigitoChequeo()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtDigitoChequeo()).sendKeys(DigitoChequeo);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEditarEntidadObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresoDominioCorreo(String DominioCorreo){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtDominioCorreo());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtDominioCorreo()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtDominioCorreo()).sendKeys(DominioCorreo);
    }
    @Step
    public void ingresoSufijoUsuario(String SufijoUsuario){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtSufijoUsuario());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtSufijoUsuario()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtSufijoUsuario()).sendKeys(SufijoUsuario);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEditarEntidadObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void clicSelector2FA_Autenticacion(){
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getSelector2FA_Autenticacion());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getSelector2FA_Autenticacion()).click();
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getSelector2FA_AutenticacionActive());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getSelector2FA_AutenticacionActive()).click();
    }
    @Step
    public void clicSelectorTipoInstitucion(){
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getSelectorTipoInstitucion());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getSelectorTipoInstitucion()).click();
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTipoInstitucionEstablecimientoBancario());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTipoInstitucionEstablecimientoBancario()).click();
    }
    @Step
    public void ingresoNitCuentaXML(String NITCuentaXML){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtNitCuentaXML());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtNitCuentaXML()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtNitCuentaXML()).sendKeys(NITCuentaXML);
    }
    @Step
    public void ingresoPortafolio(String Portafolio){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtPortafolio());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtPortafolio()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtPortafolio()).sendKeys(Portafolio);
    }
    @Step
    public void clicSelectEstado(String CEstado){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getSelectorEstado());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getSelectorEstado()).click();
        Utilidades.esperar(2000);
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtEstado()).sendKeys(CEstado + Keys.ENTER);
        Utilidades.esperar(2000);
    }
    @Step
    public void ingresoFechaDesde()throws AWTException {
        String FechaDesde = Robot.fechahora();
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtFechaDesde());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtFechaDesde()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtFechaDesde()).sendKeys(FechaDesde + Keys.ENTER);
    }
    @Step
    public void ingresoFechaHasta(String FechaHasta){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getTxtFechaHasta());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtFechaHasta()).clear();
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getTxtFechaHasta()).sendKeys(FechaHasta + Keys.ENTER);
    }
    @Step
    public void clickGuardarCambios(){
        Utilidades.esperar(2000);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEditarEntidadObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        Utilidades.bajarPantalla(integraEditarEntidadObject.getDriver());
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getBtnGuardarCambios());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getBtnGuardarCambios()).click();
    }
    @Step
    public void validolblEdicionExitosa(){
        Utilidades.esperar(2000);
        Utilidades.esperarExplicito30(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getLblValidarEdicionExitosa());
        Utilidades.subirPantalla(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getLblValidarEdicionExitosa()));
        Assert.assertTrue(integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getLblValidarEdicionExitosa()).getText(), true);
        Utilidades.esperar(2000);
    }
    //* Xpath para eliminar *//

    @Step
    public void clickBtnEliminarEntidad() {
        Utilidades.esperarExplicito30( integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getBtnEliminarEntidad());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getBtnEliminarEntidad()).click();
    }

    @Step
    public void clickBtnConfirmarEliminarEntidad() {
        Utilidades.esperarExplicito30( integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getBtnConfirmarEliminarEntidad());
        integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getBtnConfirmarEliminarEntidad()).click();
    }
    @Step
    public void validolblEliminaciónExitosa(){
        Utilidades.esperaExplicitaTexto(integraEditarEntidadObject.getDriver(), integraEditarEntidadObject.getLblValidarElimicionExitosa());
        Assert.assertTrue(integraEditarEntidadObject.getDriver().findElement(integraEditarEntidadObject.getLblValidarElimicionExitosa()).getText(), true);
        Utilidades.esperar(2000);
    }
}
