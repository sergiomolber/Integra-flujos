package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraMensajesRecibidosObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.awt.*;

public class IntegraMensajesRecibidosStep {
    IntegraMensajesRecibidosObject integraMensajesRecibidosObject;
    Robot robot = new Robot();
    @Step
    public void clickEnFiltrar() {
        EsperaExplicita.esperaexplilicitaClick(integraMensajesRecibidosObject.getDriver(), integraMensajesRecibidosObject.getBtnFiltro());
        integraMensajesRecibidosObject.getDriver().findElement(integraMensajesRecibidosObject.getBtnFiltro()).click();
    }
    @Step
    public void filtroPorNitEntidadReceptora(String opcionDeBusqueda) {
        EsperaExplicita.esperaexplilicitaClick(integraMensajesRecibidosObject.getDriver(), integraMensajesRecibidosObject.getLblSeleccionarFiltro());
        integraMensajesRecibidosObject.getDriver().findElement(integraMensajesRecibidosObject.getLblSeleccionarFiltro()).click();
        integraMensajesRecibidosObject.getDriver().findElement(By.xpath("(//*[text()='"+opcionDeBusqueda+"'])[3]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void NITAbuscar(String palabraABuscar) {
        EsperaExplicita.esperaexplilicitaClick(integraMensajesRecibidosObject.getDriver(), integraMensajesRecibidosObject.getLblNombreABuscar());
        integraMensajesRecibidosObject.getDriver().findElement(integraMensajesRecibidosObject.getLblNombreABuscar()).click();
        integraMensajesRecibidosObject.getDriver().findElement(integraMensajesRecibidosObject.getLblNombreABuscar()).sendKeys(palabraABuscar);
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void clickEnBuscar() throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraMensajesRecibidosObject.getDriver(), integraMensajesRecibidosObject.getBtnBuscar());
        try {
            integraMensajesRecibidosObject.getDriver().findElement(integraMensajesRecibidosObject.getBtnBuscar()).click();
        } catch (Exception e) {
            robot.hacerEnter();
        }
    }
    @Step
    public void validacionDeConsulta() {
        EsperaExplicita.esperaExplicitaTexto(integraMensajesRecibidosObject.getDriver(), integraMensajesRecibidosObject.getTxtValidarConsulta());
        Assert.assertThat(integraMensajesRecibidosObject.getDriver().findElement(integraMensajesRecibidosObject.getTxtValidarConsulta()).isDisplayed(), Matchers.is(true));
        EsperaImplicita.esperaImplicitaWeb(3);
    }

}
