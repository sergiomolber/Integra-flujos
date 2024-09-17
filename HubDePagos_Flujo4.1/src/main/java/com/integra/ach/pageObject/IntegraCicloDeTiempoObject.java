package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraCicloDeTiempoObject extends PageObject {
    /**
     * Crear Un Ciclo
     **/
    By btnMas = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]/i[1]");
    By lblNombreDeCiclo = By.id("VPHCycleTime.CycleName");
    By lblHoraDeCierre = By.id("VPHCycleTime.RecepitionEndTime");
    By btnCrear = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[2]/button[2]");
    By txtValidarCreacion = By.xpath("//span[contains(text(),'Configuración de Ciclo agregado satisfactoriamente')]");
    /**
     * Editar Un Ciclo
     **/
    By btnFiltro = By.xpath("//button[contains(@data-original-title,'Filtro')]");
    By lblSeleccionarFiltro = By.xpath("//span[@id='select2-SearchSelect-container']");
    By optCiclo = By.xpath("(//*[text()='Ciclo'])[3]");
    By lblNombreABuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[1]/input[1]");
    By btnBuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[2]");
    By btnEditar = By.xpath("//tbody/tr[@id='displayingWindow_0']/td[1]/div[1]/a[2]");
    By btnGuardarCambios = By.xpath("//span[contains(text(),'Guardar Cambios')]");
    By txtValidarEdicion = By.xpath("//span[contains(text(),'Configuración de ciclo actualizado satisfactoriame')]");
    By btnCicloTiempo = By.xpath("//span[contains(text(),'Ciclo Tiempo')]");
    /**
     * Eliminar Un Limite
     **/
    By btnBorrar = By.xpath("//tr//td//div//a[contains(@class,'actionIcons ng-scope')][2]");
    By btnSiBorrar = By.xpath("//button[contains(text(),'Sí, borrarlo')]");
    By btnValidarBorrado = By.xpath("//span[contains(text(),'Configuración de ciclo eliminado satisfactoriament')]");

    public By getBtnMas() {
        return btnMas;
    }



    public By getLblNombreDeCiclo() {
        return lblNombreDeCiclo;
    }

    public By getLblHoraDeCierre() {
        return lblHoraDeCierre;
    }

    public By getBtnCrear() {
        return btnCrear;
    }

    public By getTxtValidarCreacion() {
        return txtValidarCreacion;
    }

    /**
     * Editar Un Ciclo
     **/
    public By getBtnFiltro() {
        return btnFiltro;
    }

    public By getLblSeleccionarFiltro() {
        return lblSeleccionarFiltro;
    }

    public By getOptCiclo() {
        return optCiclo;
    }

    public By getLblNombreABuscar() {
        return lblNombreABuscar;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getBtnEditar() {
        return btnEditar;
    }

    public By getBtnGuardarCambios() {
        return btnGuardarCambios;
    }

    public By getTxtValidarEdicion() {
        return txtValidarEdicion;
    }

    public By getBtnCicloTiempo() {
        return btnCicloTiempo;
    }
    /**
     * Eliminar Un Ciclo
     **/
    public By getBtnBorrar() {
        return btnBorrar;
    }

    public By getBtnSiBorrar() {
        return btnSiBorrar;
    }

    public By getBtnValidarBorrado() {
        return btnValidarBorrado;
    }
}
