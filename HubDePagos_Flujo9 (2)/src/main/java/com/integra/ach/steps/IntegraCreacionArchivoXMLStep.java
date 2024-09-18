package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraCreacionArchivoXMLObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class IntegraCreacionArchivoXMLStep {
    IntegraCreacionArchivoXMLObject integraCreacionArchivoXMLObject;
    Robot robot = new Robot();

    @Step
    public void clickBotonMas() {
        EsperaImplicita.esperaImplicitaWeb(4);
        EsperaExplicita.esperaexplilicitaClick(integraCreacionArchivoXMLObject.getDriver(), integraCreacionArchivoXMLObject.getBtnMas());
        integraCreacionArchivoXMLObject.getDriver().findElement(integraCreacionArchivoXMLObject.getBtnMas()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void seleccionarPosicion(String posicion) {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraCreacionArchivoXMLObject.getDriver(), integraCreacionArchivoXMLObject.getSeleccionarPosicion());
        EsperaImplicita.esperaImplicitaWeb(2);
        integraCreacionArchivoXMLObject.getDriver().findElement(By.xpath("//*[text()='" + posicion + "']")).click();
        Select s = new Select(integraCreacionArchivoXMLObject.getDriver().findElement(integraCreacionArchivoXMLObject.getSeleccionarPosicion()));
        s.selectByVisibleText(posicion);
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void seleccionarCiclo(String ciclo) throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        integraCreacionArchivoXMLObject.getDriver().findElement(integraCreacionArchivoXMLObject.getSeleccionarCiclo()).click();
        integraCreacionArchivoXMLObject.getDriver().findElement(By.xpath("//*[text()='" + ciclo + "']")).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraCreacionArchivoXMLObject.getDriver();
        jse.executeScript("window.scrollBy(0,400)");
    }

    @Step
    public void clickEnCrear() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        //robot.control_Menos();
        EsperaExplicita.esperaexplilicitaClick(integraCreacionArchivoXMLObject.getDriver(), integraCreacionArchivoXMLObject.getBtnCrear());
        integraCreacionArchivoXMLObject.getDriver().findElement(integraCreacionArchivoXMLObject.getBtnCrear()).click();
    }

    @Step
    public void validoLblCreacionExitosa() {
        EsperaExplicita.esperaexplilicitaClick(integraCreacionArchivoXMLObject.getDriver(), integraCreacionArchivoXMLObject.getLblValidacionCreacionExitosa());
        Assert.assertTrue(integraCreacionArchivoXMLObject.getDriver().findElement(integraCreacionArchivoXMLObject.getLblValidacionCreacionExitosa()).getText(), true);
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickGenerarArchivoXML() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraCreacionArchivoXMLObject.getDriver(), integraCreacionArchivoXMLObject.getBtnGenerarArchivoXML());
        integraCreacionArchivoXMLObject.getDriver().findElement(integraCreacionArchivoXMLObject.getBtnGenerarArchivoXML()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    public void EditargenerarXML() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(4);

        EsperaExplicita.esperaexplilicitaClick(integraCreacionArchivoXMLObject.getDriver(), integraCreacionArchivoXMLObject.getBtnEditar());
        integraCreacionArchivoXMLObject.getDriver().findElement(integraCreacionArchivoXMLObject.getBtnEditar()).click();
        EsperaImplicita.esperaImplicitaWeb(4);
    }

    public void TramitarXML(String RespuestaBR) throws AWTException {
        robot.control_Menos();
        EsperaImplicita.esperaImplicitaWeb(3);

        integraCreacionArchivoXMLObject.getDriver().findElement(integraCreacionArchivoXMLObject.getRespuetaBR()).click();
        integraCreacionArchivoXMLObject.getDriver().findElement(By.xpath("//*[text()='" + RespuestaBR + "']")).click();
        EsperaImplicita.esperaImplicitaWeb(2);



    }

    public void Seleccionarconsecutivo(String Consecutivo) throws AWTException {

        EsperaImplicita.esperaImplicitaWeb(3);
        integraCreacionArchivoXMLObject.getDriver().findElement(integraCreacionArchivoXMLObject.getConsecutivo()).click();
        integraCreacionArchivoXMLObject.getDriver().findElement(By.xpath("//*[text()='" + Consecutivo + "']")).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        JavascriptExecutor jse = (JavascriptExecutor) integraCreacionArchivoXMLObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");

    }

    public void ingresarobservacion(String observacion) throws AWTException {
//        JavascriptExecutor jse = (JavascriptExecutor) integraCreacionArchivoXMLObject.getDriver();
//        jse.executeScript("window.scrollBy(0,300)");
        EsperaExplicita.esperaexplilicitaClick(integraCreacionArchivoXMLObject.getDriver(), integraCreacionArchivoXMLObject.getTxtObservacion());
        integraCreacionArchivoXMLObject.getDriver().findElement(integraCreacionArchivoXMLObject.getTxtObservacion()).clear();
        integraCreacionArchivoXMLObject.getDriver().findElement(integraCreacionArchivoXMLObject.getTxtObservacion()).sendKeys(observacion);
        EsperaImplicita.esperaImplicitaWeb(3);

    }

    public void clickGuardarCambios() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(4);
        EsperaExplicita.esperaexplilicitaClick(integraCreacionArchivoXMLObject.getDriver(), integraCreacionArchivoXMLObject.getBtnGuardarCambios());
        integraCreacionArchivoXMLObject.getDriver().findElement(integraCreacionArchivoXMLObject.getBtnGuardarCambios()).click();
        EsperaImplicita.esperaImplicitaWeb(4);
    }
}