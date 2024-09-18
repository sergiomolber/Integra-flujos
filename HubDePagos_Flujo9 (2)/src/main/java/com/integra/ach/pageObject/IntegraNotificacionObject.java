package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraNotificacionObject extends PageObject {

    /**
     * Crear Una Notificación
     **/
    By btnMas = By.xpath("//*[@Class='fa fa-plus-square']");
    By selectSeveridad = By.xpath("//select[@id='Notifications.Severity']");
    By selectTipo = By.xpath("//select[@id='Notifications.Type']");
    By txtAsunto = By.xpath("//input[@id='Notifications.Subject']");
    By txtMensaje = By.xpath("//textarea[@id='Notifications.Body']");
    By txtEntidad = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[8]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By selectEstado = By.xpath("//span[@id='select2-{{fieldLabel}}-container']");
    By txtEstado = By.xpath("//body/span[1]/span[1]/span[1]/input[1]");
    By txtFechaDesde = By.xpath("//input[@id='Notifications.EffectiveFromDate']");
    By txtFechaHasta = By.xpath("//input[@id='Notifications.EffectiveTillDate']");
    By btnCrear = By.xpath("/html/body/div[3]/div/div[3]/div/div[2]/div[7]/form/div[2]/button[2]");
    By btnActualizar = By.xpath("//*[@class='fa fa-refresh fa-fs14']");
    By txtValidarCreacion = By.xpath("//span[contains(text(),'Notificación creada satisfactoriamente.')]");
    /**
     * Editar Una Notificación
     **/
    By btnFiltro = By.xpath("//button[contains(@data-original-title,'Filtro')]");
    By lblSeleccionarFiltro = By.xpath("//span[@id='select2-SearchSelect-container']");
    By optAsunto = By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[5]");
    By txtAsuntoABuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[1]/input[1]");
    By btnBuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[2]");
    By btnEditar = By.xpath("//tbody/tr[@id='displayingWindow_0']/td[1]/div[1]/a[2]");
    By btnLimpiarEntidad = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[8]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/span[1]");
    By btnGuardarCambios = By.xpath("//span[contains(text(),'Guardar Cambios')]");
    By txtValidarEdicion = By.xpath("//span[contains(text(),'Notificación actualizado exitosamente.')]");
    /**
     * Eliminar Una Notificación
     **/
    By btnBorrar = By.xpath("//tr//td//div//a[contains(@class,'actionIcons ng-scope')][2]");
    By btnSiBorrar = By.xpath("//button[contains(text(),'Sí, borrarlo')]");
    By btnValidarBorrado = By.xpath("//span[contains(text(),'Notificación eliminada exitosamente.')]");

    public By getBtnMas() {
        return btnMas;
    }

    public By getSelectSeveridad() {return selectSeveridad;}

    public By getSelectTipo() {return selectTipo;}

    public By getTxtAsunto() {return txtAsunto;}

    public By getTxtMensaje() {return txtMensaje;}

    public By getTxtEntidad() {return txtEntidad;}

    public By getSelectEstado() {return selectEstado;}

    public By getTxtEstado() {return txtEstado;}

    public By getTxtFechaDesde() {return txtFechaDesde;}

    public By getTxtFechaHasta() {return txtFechaHasta;}

    public By getBtnCrear() {
        return btnCrear;
    }

    public By getTxtValidarCreacion() {
        return txtValidarCreacion;
    }

    /**
     * Editar Una Notificación
     **/
    public By getBtnFiltro() {
        return btnFiltro;
    }

    public By getLblSeleccionarFiltro() {
        return lblSeleccionarFiltro;
    }

    public By getOptAsunto() {return optAsunto;}

    public By getTxtAsuntoABuscar() {return txtAsuntoABuscar;}

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getBtnEditar() {
        return btnEditar;
    }

    public By getBtnLimpiarEntidad() {
        return btnLimpiarEntidad;
    }

    public By getBtnGuardarCambios() {
        return btnGuardarCambios;
    }

    public By getTxtValidarEdicion() {
        return txtValidarEdicion;
    }

    /**
     * Eliminar Una Notificación
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

    public By getBtnActualizar() {
        return btnActualizar;
    }
}
