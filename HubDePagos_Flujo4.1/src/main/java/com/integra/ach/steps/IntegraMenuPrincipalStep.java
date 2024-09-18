package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraMenuPrincipalObject;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import com.integra.ach.utils.Utilidades;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;

public class IntegraMenuPrincipalStep {
    Robot robot = new Robot();
    IntegraMenuPrincipalObject integraMenuPrincipalObject;

    public IntegraMenuPrincipalStep() throws AWTException {
    }

    @Step
    public void clickModuloDeTransferencias() {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeTransferencias()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(5);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeTransferencias()).click();
    }

    @Step
    public void clickSubirArchivo() {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnSubirArchivo()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
    @Step
    public void clickCatalogo() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(5);
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).isDisplayed()) {
            break;
        }
        JavascriptExecutor jse = (JavascriptExecutor) integraMenuPrincipalObject.getDriver();
        jse.executeScript("window.scrollBy(0,1000)");
       robot.control_Menos();
        EsperaImplicita.esperaImplicitaWeb(5);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).click();
    }

    @Step
    public void clickModuloDeCiclos() throws AWTException {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeCiclos()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(5);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeCiclos()).click();
    }
    @Step
    public void clickEnCiclosDeTiempo() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(5);
        robot.control_Menos();
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCicloTiempo()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(5);
    }


    @Step
    public void clickCierreDeCiclo() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCierreDeCiclo()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }


    @Step
    public void clickReportesDeCompensacion() {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnReportesDeCompensacion()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(5);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnReportesDeCompensacion()).click();
    }

    @Step
    public void clickCuadreYConciliacion() {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCuadreYConciliacion()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }

    @Step
    public void clickPlanillaConsolidada() {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnPlanillaConsolidada()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }

    @Step
    public void clickPlanillaDeCompensacion() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnPlanillaDeCompensacion()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
}





