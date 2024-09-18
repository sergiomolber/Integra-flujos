package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraMenuPrincipalObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;


public class IntegraMenuPrincipalStep {
    Robot robot = new Robot();
    IntegraMenuPrincipalObject integraMenuPrincipalObject;

    public IntegraMenuPrincipalStep() throws AWTException {
    }

    @Step
    public void clickEnComisiones() {
        EsperaImplicita.esperaImplicitaWeb(3);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeComisiones()).click();
        EsperaExplicita.esperaexplilicitaClick(integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnComisiones());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnComisiones()).click();
    }
    @Step
    public void clickCatalogo() throws AWTException {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(3);
       integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).click();
    }

    @Step
    public void clickCuentasAdministradoras() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        // Hacer scroll hasta el botón de ciclos de tiempo antes de hacer click
        JavascriptExecutor js = (JavascriptExecutor) integraMenuPrincipalObject.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCuentasAdministradoras()));

        // Espera antes de hacer clic en el botón
        EsperaExplicita.esperaexplilicitaClick(integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnCuentasAdministradoras());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCuentasAdministradoras()).click();
        EsperaImplicita.esperaImplicitaWeb(2);

    }

    @Step
    public void clickNotificaciones() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        // Hacer scroll hasta el botón de ciclos de tiempo antes de hacer click
        JavascriptExecutor js = (JavascriptExecutor) integraMenuPrincipalObject.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnNotificaciones()));

        // Espera antes de hacer clic en el botón
        EsperaExplicita.esperaexplilicitaClick(integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnNotificaciones());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnNotificaciones()).click();
        EsperaImplicita.esperaImplicitaWeb(2);


    }

    @Step
    public void clickEventos() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        // Hacer scroll hasta el botón de ciclos de tiempo antes de hacer click
        JavascriptExecutor js = (JavascriptExecutor) integraMenuPrincipalObject.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnEventos()));

        // Espera antes de hacer clic en el botón
        EsperaExplicita.esperaexplilicitaClick(integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnEventos());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnEventos()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void IngresarMensajesRecibidos() throws AWTException {

        EsperaImplicita.esperaImplicitaWeb(2);
        // Hacer scroll hasta el botón de ciclos de tiempo antes de hacer click
        JavascriptExecutor js = (JavascriptExecutor) integraMenuPrincipalObject.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnMensajesRecibidos()));

        // Espera antes de hacer clic en el botón
        EsperaExplicita.esperaexplilicitaClick(integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnMensajesRecibidos());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnMensajesRecibidos()).click();
        EsperaImplicita.esperaImplicitaWeb(2);


    }

    @Step
    public void clickArchivoXML() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        // Hacer scroll hasta el botón de ciclos de tiempo antes de hacer click
        JavascriptExecutor js = (JavascriptExecutor) integraMenuPrincipalObject.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnArchivoXML()));

        // Espera antes de hacer clic en el botón
        EsperaExplicita.esperaexplilicitaClick(integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnArchivoXML());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnArchivoXML()).click();
        EsperaImplicita.esperaImplicitaWeb(2);

    }

    @Step
    public void clickLogsDeEventos() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnLogsDeEventos()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(30);
    }
}