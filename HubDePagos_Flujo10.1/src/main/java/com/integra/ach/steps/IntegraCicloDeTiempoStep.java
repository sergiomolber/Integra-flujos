package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraCicloDeTiempoObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.LectorExcel;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;

public class IntegraCicloDeTiempoStep {
    IntegraCicloDeTiempoObject integraCicloDeTiempoObject;
    Robot robot = new Robot();

    @Step
    public void clickBotonMas() {
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getBtnMas());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getBtnMas()).click();
    }

    @Step
    public void escribirNombre() {
        String nombreDelCiclo = Robot.generarNombreAleatorio(8);
        String rutaProyecto = System.getProperty("user.dir");
        LectorExcel.escribirData(rutaProyecto+"/src/test/resources/Data/Data_CicloDeTiempo.xlsx","EditarUnCiclo","cicloAEditar",2,nombreDelCiclo);
        LectorExcel.escribirData(rutaProyecto+"/src/test/resources/Data/Data_CicloDeTiempo.xlsx","EliminarUnCiclo","cicloAEliminar",2,nombreDelCiclo);
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getLblNombreDeCiclo());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblNombreDeCiclo()).sendKeys(nombreDelCiclo);
    }

    @Step
    public void escribirHoraDeCierre(String hora, String minutos, String segundos) {
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getLblHoraDeCierre());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblHoraDeCierre()).sendKeys(hora + minutos + segundos);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraCicloDeTiempoObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void clickEnCrear() {
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getBtnCrear()).click();
    }

    @Step
    public void validarCreacionDelCiclo() {
        EsperaExplicita.esperaExplicitaTexto(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getTxtValidarCreacion());
        Assert.assertThat(integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getTxtValidarCreacion()).isDisplayed(), Matchers.is(true));
    }

    /**
     * Editar Un Ciclo
     **/
    @Step
    public void clickEnFiltrar() {
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getBtnFiltro());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getBtnFiltro()).click();
    }

    @Step
    public void filtroPorCiclo() {
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getLblSeleccionarFiltro());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblSeleccionarFiltro()).click();
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getOptCiclo());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getOptCiclo()).click();
    }
    @Step
    public void clickEnCiclosDeTiempo() throws AWTException {
        robot.control_Menos();
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getBtnCicloTiempo()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void nombreABuscar(String cicloAEditar) {
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getLblNombreABuscar());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblNombreABuscar()).click();
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblNombreABuscar()).sendKeys(cicloAEditar);
    }

    @Step
    public void clickEnBuscar() throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getBtnBuscar());
        try {
            integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getBtnBuscar()).click();
        } catch (Exception e) {
            robot.hacerEnter();
        }
    }

    @Step
    public void clickEnEditar() {
        EsperaImplicita.esperaImplicitaWeb(5);
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getBtnEditar());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getBtnEditar()).click();
    }

    @Step
    public void editarHora() {
        String hora = Robot.horaMenos5Minutos();
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getLblHoraDeCierre());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblHoraDeCierre()).clear();
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblHoraDeCierre()).sendKeys(hora);
       // integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblHoraDeCierre()).sendKeys(hora + minutos + segundos);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraCicloDeTiempoObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void editarhoraMas5Minutos() {
        String hora = Robot.horaMas5Minutos();
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getLblHoraDeCierre());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblHoraDeCierre()).clear();
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblHoraDeCierre()).sendKeys(hora);
        // integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblHoraDeCierre()).sendKeys(hora + minutos + segundos);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraCicloDeTiempoObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void guardarCambios() {
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getBtnGuardarCambios()).click();
    }

    @Step
    public void validarEdicionDelLimite() {
        EsperaExplicita.esperaExplicitaTexto(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getTxtValidarEdicion());
        Assert.assertThat(integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getTxtValidarEdicion()).isDisplayed(), Matchers.is(true));
    }

    /**
     * Ciclo a Eliminar
     **/
    @Step
    public void nombreDeCicloAEliminar(String cicloAEliminar) {
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getLblNombreABuscar());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblNombreABuscar()).click();
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getLblNombreABuscar()).sendKeys(cicloAEliminar);
    }

    @Step
    public void clickEnBorrar() {
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getBtnBorrar());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getBtnBorrar()).click();
    }

    @Step
    public void clickEnSi() {
        EsperaExplicita.esperaexplilicitaClick(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getBtnSiBorrar());
        integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getBtnSiBorrar()).click();
    }

    @Step
    public void validarEliminacionDelCiclo() {
        EsperaExplicita.esperaExplicitaTexto(integraCicloDeTiempoObject.getDriver(), integraCicloDeTiempoObject.getBtnValidarBorrado());
        Assert.assertThat(integraCicloDeTiempoObject.getDriver().findElement(integraCicloDeTiempoObject.getBtnValidarBorrado()).isDisplayed(), Matchers.is(true));
    }
}
