package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraTableroDePagosObject;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import com.integra.ach.utils.Utilidades;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class IntegraTableroDePagosStep {
    Robot robot = new Robot();
    IntegraTableroDePagosObject integratableroDePagosObject;



    public IntegraTableroDePagosStep() throws AWTException {
    }

    @Step
    public void clickCampoDeFecha() throws AWTException {
        Utilidades.esperarExplicito30( integratableroDePagosObject.getDriver(), integratableroDePagosObject.getctnCampoFecha());
        integratableroDePagosObject.getDriver().findElement(integratableroDePagosObject.getctnCampoFecha()).click();
        EsperaImplicita.esperaImplicitaWeb(2);



    }

    @Step
    public void escribirFechaDeFiltro() {
        // Obtener la fecha actual en formato "yyyy-MM-dd"
        String fechaDePagos = Robot.fechaHora();

        // Agregar el sufijo "-1" a la fecha
        String fechaConSufijo = fechaDePagos + "-1";

        // Esperar y enviar la fecha con el sufijo al campo de texto
        Utilidades.esperarExplicito30(integratableroDePagosObject.getDriver(), integratableroDePagosObject.gettxtCampoFecha());
        WebElement campoFecha = integratableroDePagosObject.getDriver().findElement(integratableroDePagosObject.gettxtCampoFecha());
        campoFecha.clear();
        campoFecha.sendKeys(fechaConSufijo);

        // Enviar la tecla Enter
        campoFecha.sendKeys(Keys.RETURN);

        // Espera implícita
        EsperaImplicita.esperaImplicitaWeb(5);
    }

    @Step
    public void clickBuscar() throws AWTException {
        Utilidades.esperarExplicito30( integratableroDePagosObject.getDriver(), integratableroDePagosObject.getbtnBuscar());
        integratableroDePagosObject.getDriver().findElement(integratableroDePagosObject.getbtnBuscar()).click();
        EsperaImplicita.esperaImplicitaWeb(2);

    }
    @Step
    public void clickExportar() throws AWTException {
        Utilidades.esperarExplicito30( integratableroDePagosObject.getDriver(), integratableroDePagosObject.getbtnExportar ());
        EsperaImplicita.esperaImplicitaWeb(4);
        integratableroDePagosObject.getDriver().findElement(integratableroDePagosObject.getbtnExportar()).click();
        EsperaImplicita.esperaImplicitaWeb(4);

    }

}


