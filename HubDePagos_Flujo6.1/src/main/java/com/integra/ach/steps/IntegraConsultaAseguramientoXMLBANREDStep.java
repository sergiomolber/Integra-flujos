package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraConsultaAseguramientoXMLBANREDObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.awt.*;

public class IntegraConsultaAseguramientoXMLBANREDStep {
    IntegraConsultaAseguramientoXMLBANREDObject integraConsultaAseguramientoXMLBANREDObject;
    Robot robot = new Robot();

    @Step
    public void ingresoFechaInicial() throws AWTException {
        String fechaInicial = com.integra.ach.utils.Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraConsultaAseguramientoXMLBANREDObject.getDriver(), integraConsultaAseguramientoXMLBANREDObject.getTxtFechaInicial());
        integraConsultaAseguramientoXMLBANREDObject.getDriver().findElement(integraConsultaAseguramientoXMLBANREDObject.getTxtFechaInicial()).clear();
        integraConsultaAseguramientoXMLBANREDObject.getDriver().findElement(integraConsultaAseguramientoXMLBANREDObject.getTxtFechaInicial()).sendKeys(fechaInicial+ Keys.ENTER);

    }
    @Step
    public void ingresoFechaFinal() throws AWTException {
        String fechaFinal = com.integra.ach.utils.Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraConsultaAseguramientoXMLBANREDObject.getDriver(), integraConsultaAseguramientoXMLBANREDObject.getTxtFechaFinal());
        integraConsultaAseguramientoXMLBANREDObject.getDriver().findElement(integraConsultaAseguramientoXMLBANREDObject.getTxtFechaFinal()).clear();
        integraConsultaAseguramientoXMLBANREDObject.getDriver().findElement(integraConsultaAseguramientoXMLBANREDObject.getTxtFechaFinal()).sendKeys(fechaFinal+ Keys.ENTER);
    }
    @Step
    public void seleccionarPosicion(String posicion) {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraConsultaAseguramientoXMLBANREDObject.getDriver(), integraConsultaAseguramientoXMLBANREDObject.getSelectorPosicion());
        integraConsultaAseguramientoXMLBANREDObject.getDriver().findElement(integraConsultaAseguramientoXMLBANREDObject.getSelectorPosicion()).click();
        integraConsultaAseguramientoXMLBANREDObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+ posicion +"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }
    @Step
    public void seleccionarFormato(String formato) throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraConsultaAseguramientoXMLBANREDObject.getDriver(), integraConsultaAseguramientoXMLBANREDObject.getSelectorFormato());
        integraConsultaAseguramientoXMLBANREDObject.getDriver().findElement(integraConsultaAseguramientoXMLBANREDObject.getSelectorFormato()).click();
        integraConsultaAseguramientoXMLBANREDObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+ formato +"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }
    @Step
    public void clickEnConsultar() {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraConsultaAseguramientoXMLBANREDObject.getDriver(), integraConsultaAseguramientoXMLBANREDObject.getBtnConsultar());
        integraConsultaAseguramientoXMLBANREDObject.getDriver().findElement(integraConsultaAseguramientoXMLBANREDObject.getBtnConsultar()).click();
        EsperaImplicita.esperaImplicitaWeb(8);
    }
    @Step
    public void validoLblCreacionExitosa() {
        EsperaExplicita.esperaexplilicitaClick(integraConsultaAseguramientoXMLBANREDObject.getDriver(), integraConsultaAseguramientoXMLBANREDObject.getLblValidacionConsultaExitosa());
        Assert.assertTrue(integraConsultaAseguramientoXMLBANREDObject.getDriver().findElement(integraConsultaAseguramientoXMLBANREDObject.getLblValidacionConsultaExitosa()).getText(), true);
        EsperaImplicita.esperaImplicitaWeb(2);
    }

}
