package com.integra.ach.step;

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
    public void clickCatalogo() throws AWTException {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(3);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).click();
    }

    @Step
    public void clickLogsDeEventos() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        // Hacer scroll hasta el botón de ciclos de tiempo antes de hacer click
        JavascriptExecutor js = (JavascriptExecutor) integraMenuPrincipalObject.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnLogsDeEventos()));
        // Espera antes de hacer clic en el botón
        EsperaExplicita.esperaexplilicitaClick(integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnLogsDeEventos());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnLogsDeEventos()).click();
        EsperaImplicita.esperaImplicitaWeb(2);

    }



}