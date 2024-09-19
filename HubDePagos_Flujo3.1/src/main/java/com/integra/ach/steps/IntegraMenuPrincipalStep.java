package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraMenuPrincipalObject;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import com.integra.ach.utils.Utilidades;
import net.thucydides.core.annotations.Step;

import java.awt.*;


public class IntegraMenuPrincipalStep {
    Robot robot = new Robot();
    IntegraMenuPrincipalObject integraMenuPrincipalObject;

    public IntegraMenuPrincipalStep() throws AWTException {
    }

    @Step
    public void clickEntidades() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnVinculacionEntidades()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(3);
        robot.control_Menos();
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnVinculacionEntidades()).click();
    }

    @Step
    public void clickContratos() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnTransporte()).click();
        robot.control_Mas();
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
}