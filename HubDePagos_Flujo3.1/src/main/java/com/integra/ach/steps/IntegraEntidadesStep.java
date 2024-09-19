package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraEntidadesObject;
import com.integra.ach.utils.Robot;
import com.integra.ach.utils.Utilidades;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.awt.*;

public class IntegraEntidadesStep {

    IntegraEntidadesObject integraEntidadesObject;

    @Step
    public void seleccionarBtnCrearEntidad(){
        Utilidades.esperar(10000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getBtnCrearEntidad());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getBtnCrearEntidad()).click();
    }
    @Step
    public void ingresoCodigoEntidad(String CodigoEntidad){
        Utilidades.esperar(10000);
        Utilidades.esperaExplicitaTexto(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtCodigoEntidad());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtCodigoEntidad()).sendKeys(CodigoEntidad);
    }
    @Step
    public void ingresoEntidad(String Entidad){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtEntidad());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtEntidad()).sendKeys(Entidad);
    }
    @Step
    public void clicSelectorTipoEntidad(){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getSelectorTipoEntidad());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getSelectorTipoEntidad()).click();
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTipoEntidadBanco());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTipoEntidadBanco()).click();
    }
    @Step
    public void ingresoNombreEntidad(String NombreEntidad){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtNombreEntidad());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtNombreEntidad()).sendKeys(NombreEntidad);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEntidadesObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresoIndentificadorExternoDeEntidad(String IdentificadorExternodelaEntidad){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtIndentificadorExternoDeEntidad());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtIndentificadorExternoDeEntidad()).sendKeys(IdentificadorExternodelaEntidad);
    }
    @Step
    public void ingresoNumeroCuenta(String NumeroCuenta){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtNumeroCuenta());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtNumeroCuenta()).sendKeys(NumeroCuenta);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEntidadesObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void clicSelectorCodigoCalendario(String CodigoCalendario){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getSelectorCodigoCalendario());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getSelectorCodigoCalendario()).click();
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getCodigoCalendarioColombiano());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getCodigoCalendarioColombiano()).click();
        Utilidades.esperar(1000);
    }
    @Step
    public void ingresoDireccion(String Direccion){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtDireccion());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtDireccion()).sendKeys(Direccion);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEntidadesObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresoCiudad(String Ciudad){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtCiudad());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtCiudad()).sendKeys(Ciudad);
    }
    @Step
    public void clicSelectorPais(){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getSelectorPais());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getSelectorPais()).click();
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getPaisColombia());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getPaisColombia()).click();
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEntidadesObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresoCorreo(String Correo){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtCorreo());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtCorreo()).sendKeys(Correo);
    }
    @Step
    public void ingresoTelefono(String Telefono){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtTelefono());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtTelefono()).sendKeys(Telefono);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEntidadesObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresoNIT(String NIT){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtNIT());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtNIT()).sendKeys(NIT);
    }
    @Step
    public void ingresoUltimoValorPSE(String UltimoValorPSE){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtUltimoValorPSE());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtUltimoValorPSE()).sendKeys(UltimoValorPSE);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEntidadesObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresoDigitoChequeo(String DigitoChequeo){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtDigitoChequeo());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtDigitoChequeo()).sendKeys(DigitoChequeo);
    }
    @Step
    public void ingresoDominioCorreo(String DominioCorreo){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtDominioCorreo());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtDominioCorreo()).sendKeys(DominioCorreo);
    }
    @Step
    public void ingresoSufijoUsuario(String SufijoUsuario){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtSufijoUsuario());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtSufijoUsuario()).sendKeys(SufijoUsuario);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEntidadesObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void clicSelector2FA_Autenticacion(){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getSelector2FA_Autenticacion());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getSelector2FA_Autenticacion()).click();
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getSelector2FA_AutenticacionActive());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getSelector2FA_AutenticacionActive()).click();
    }
    @Step
    public void clicSelectorTipoInstitucion(){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getSelectorTipoInstitucion());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getSelectorTipoInstitucion()).click();
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTipoInstitucionEstablecimientoBancario());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTipoInstitucionEstablecimientoBancario()).click();
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEntidadesObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresoNitCuentaXML(String NITCuentaXML){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtNitCuentaXML());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtNitCuentaXML()).sendKeys(NITCuentaXML);
    }
    @Step
    public void ingresoPortafolio(String Portafolio){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtPortafolio());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtPortafolio()).sendKeys(Portafolio);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEntidadesObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void clicSelectEstado(String CEstado){
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getSelectorEstado());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getSelectorEstado()).click();
        Utilidades.esperar(2000);
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtEstado()).sendKeys(CEstado + Keys.ENTER);
        Utilidades.esperar(2000);
    }
    @Step
    public void ingresoFechaDesde()throws AWTException {
        String FechaDesde = Robot.fechahora();
        Utilidades.esperar(1000);
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtFechaDesde());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtFechaDesde()).sendKeys(FechaDesde + Keys.ENTER);
    }
    @Step
    public void ingresoFechaHasta(String FechaHasta){
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getTxtFechaHasta());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getTxtFechaHasta()).sendKeys(FechaHasta + Keys.ENTER);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraEntidadesObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void clicBotonCrear(){
        Utilidades.bajarPantalla(integraEntidadesObject.getDriver());
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getBtnCrear());
        integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getBtnCrear()).click();

    }
    @Step
    public void validolblCreacionExitosa(){
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getLblCreadaExitosamente());
        Utilidades.subirPantalla(integraEntidadesObject.getDriver(), integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getLblCreadaExitosamente()));
        Assert.assertTrue(integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getLblCreacionEntidades()).getText(), true);
    }

    @Step
    public void validolblCodigoYaCreado(){
        Utilidades.esperarExplicito30(integraEntidadesObject.getDriver(), integraEntidadesObject.getLblCodigoYaCreado());
        Utilidades.subirPantalla(integraEntidadesObject.getDriver(), integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getLblCodigoYaCreado()));
        Assert.assertTrue(integraEntidadesObject.getDriver().findElement(integraEntidadesObject.getLblFormularioCreacionEntidades()).getText(), true);
    }
}
