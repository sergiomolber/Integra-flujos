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
        EsperaImplicita.esperaImplicitaWeb(2);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeTransferencias()).click();
    }

    @Step
    public void clickSubModuloTableroDePagos() throws AWTException {
        Utilidades.esperarExplicito30( integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getbtnModuloTableroDePagos());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getbtnModuloTableroDePagos()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraMenuPrincipalObject.getDriver();
        jse.executeScript("window.scrollBy(0,500)");
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickCatalogos() throws AWTException {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnReportes()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(3);
        robot.control_Menos();
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnReportes()).click();
    }

    @Step
    public void clickArchivoXML() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnAseguramientoXMLBANRED()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickReportes() throws AWTException {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnReportes()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(3);
        robot.control_Menos();
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnReportes()).click();
    }

    @Step
    public void clickReporteEstadisticas() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnReporteEstadisticas()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickCatalogo() throws AWTException {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(3);
        robot.control_Menos();
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).click();
    }

    @Step
    public void clickReintegros() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnReintegros()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickReporteReintegros() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnReporteReintegro()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

}


