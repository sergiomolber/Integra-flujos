package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraConsultaConsumoERPObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class IntegraConsultaConsumoERPStep {
    IntegraConsultaConsumoERPObject integraConsultaConsumoERPObject;
    Robot robot = new Robot();

    @Step
    public void ingresoFecha(String fecha){
        EsperaExplicita.esperaexplilicitaClick(integraConsultaConsumoERPObject.getDriver(), integraConsultaConsumoERPObject.getTxtFecha());
        integraConsultaConsumoERPObject.getDriver().findElement(integraConsultaConsumoERPObject.getTxtFecha()).clear();
        integraConsultaConsumoERPObject.getDriver().findElement(integraConsultaConsumoERPObject.getTxtFecha()).sendKeys( fecha+ Keys.ENTER);
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickEnBuscar() {
        EsperaExplicita.esperaexplilicitaClick(integraConsultaConsumoERPObject.getDriver(), integraConsultaConsumoERPObject.getBtnBuscar());
        integraConsultaConsumoERPObject.getDriver().findElement(integraConsultaConsumoERPObject.getBtnBuscar()).click();
    }

    @Step
    public void validarBusqueda() {
        EsperaExplicita.esperaExplicitaTexto(integraConsultaConsumoERPObject.getDriver(), integraConsultaConsumoERPObject.getLblIDConsumo());
        Assert.assertThat(integraConsultaConsumoERPObject.getDriver().findElement(integraConsultaConsumoERPObject.getLblIDConsumo()).isDisplayed(), Matchers.is(true));
        EsperaImplicita.esperaImplicitaWeb(5);
    }

    @Step
    public void clickEnIniciarSolicitud() {
        EsperaExplicita.esperaexplilicitaClick(integraConsultaConsumoERPObject.getDriver(), integraConsultaConsumoERPObject.getbtnIniciarSolicitud());
        integraConsultaConsumoERPObject.getDriver().findElement(integraConsultaConsumoERPObject.getbtnIniciarSolicitud()).click();
    }


    @Step
    public void clickEnEnviar() {
        EsperaExplicita.esperaexplilicitaClick(integraConsultaConsumoERPObject.getDriver(), integraConsultaConsumoERPObject.getbtnEnviar());
        integraConsultaConsumoERPObject.getDriver().findElement(integraConsultaConsumoERPObject.getbtnEnviar()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }

    @Step
    public void validarMensajeExitoso() {
        EsperaExplicita.esperaExplicitaTexto(integraConsultaConsumoERPObject.getDriver(), integraConsultaConsumoERPObject.getLblMensajeExitoso());
        Assert.assertThat(integraConsultaConsumoERPObject.getDriver().findElement(integraConsultaConsumoERPObject.getLblMensajeExitoso()).isDisplayed(), Matchers.is(true));
        EsperaImplicita.esperaImplicitaWeb(5);
    }


}
