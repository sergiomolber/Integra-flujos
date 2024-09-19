package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraMenuPrincipalObject;
import com.integra.ach.utils.EsperaExplicita;
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
    public void clickSubirArchivo() {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnSubirArchivo()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickInstruccionesDistribuidas() {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnInstruccionesDistribuidas()).click();
        EsperaImplicita.esperaImplicitaWeb(8);
    }


    @Step
    public void clickModuloDeCiclos() throws AWTException {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeCiclos()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(3);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeCiclos()).click();
    }

    @Step
    public void clickCierreDeCiclo() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCierreDeCiclo()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }



    @Step
    public void clickCatalogo() throws AWTException {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(5);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).click();
    }

    @Step
    public void clickEnCiclosDeTiempo() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        // Hacer scroll hasta el botón de ciclos de tiempo antes de hacer click
        JavascriptExecutor js = (JavascriptExecutor) integraMenuPrincipalObject.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCicloTiempo()));

        // Espera antes de hacer clic en el botón
        EsperaExplicita.esperaexplilicitaClick(integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnCicloTiempo());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCicloTiempo()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void IngresarInscripcionDeCuentas() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        // Hacer scroll hasta el botón de ciclos de tiempo antes de hacer click
        JavascriptExecutor js = (JavascriptExecutor) integraMenuPrincipalObject.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnInscripcionDeCuentas()));

        // Espera antes de hacer clic en el botón
        EsperaExplicita.esperaexplilicitaClick(integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnInscripcionDeCuentas());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnInscripcionDeCuentas()).click();
        EsperaImplicita.esperaImplicitaWeb(2);

    }
    @Step
    public void IngresarAprobacionDeCuentas() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnAprobacionDeCuentas()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void IngresarALimites() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnLimites()).click();
        Robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }


    @Step
    public void IngresarAutorizacionDeCuentas() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnAutorizacionDeCuentas()).click();
        Robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }


    @Step
    public void clickRestricciones() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        // Hacer scroll hasta el botón de ciclos de tiempo antes de hacer click
        JavascriptExecutor js = (JavascriptExecutor) integraMenuPrincipalObject.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnRestricciones()));

        // Espera antes de hacer clic en el botón
        EsperaExplicita.esperaexplilicitaClick(integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnRestricciones());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnRestricciones()).click();
        EsperaImplicita.esperaImplicitaWeb(2);

       }

    @Step
    public void clickReporteMinimoXEf() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        // Hacer scroll hasta el botón de ciclos de tiempo antes de hacer click
        JavascriptExecutor js = (JavascriptExecutor) integraMenuPrincipalObject.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnReporteMinimoXEf()));

        // Espera antes de hacer clic en el botón
        EsperaExplicita.esperaexplilicitaClick(integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnReporteMinimoXEf());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnReporteMinimoXEf()).click();
        EsperaImplicita.esperaImplicitaWeb(2);


    }

    @Step
    public void clickBtnVinculacionEntidades() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        while ( integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnVinculacionEntidades()).isDisplayed()) {
            break;
        }
        Robot.control_Menos();

        Utilidades.esperarExplicito30( integraMenuPrincipalObject.getDriver(),integraMenuPrincipalObject.getBtnVinculacionEntidades());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnVinculacionEntidades()).click();
        Utilidades.esperar(2000);
    }


    @Step
    public void clickBtnEntidades() throws AWTException {
        Utilidades.esperar(3000);
        Utilidades.esperarExplicito30( integraMenuPrincipalObject.getDriver(),integraMenuPrincipalObject.getBtnEntidades());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnEntidades()).click();
        Robot.control_Mas();
        Utilidades.esperar(2000);
    }

    @Step
    public void clickContratos() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnContratos()).click();
        Robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }


}


