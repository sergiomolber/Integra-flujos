package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraReporteEstadisticasObject extends PageObject {
    /**
     * Generacion reporte estadisticas
     **/
    By btnSeleccionTipoReporte = By.xpath("//span[contains(text(),'Seleccionar')]");
    By btnReporteAcumulado = By.xpath("//li[contains(text(),'Acumulado')]");

    By btnIngresarAgruparPor = By.xpath("//body/span[1]/span[1]/span[1]/input[1]");
    By btnSelectorEntidadOrigenAcumulado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By btnSelectorEntidadDestinoAcumulado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By btnSelectorTiposTransaccionesAcumulado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[2]/div[1]/div[3]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By btnAgruparPorAcumulado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[2]/div[1]/div[4]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By btnFormatoAcumulado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");


    By txtAñoReporte = By.xpath("//input[@id='yearAno']");
    By btnReporteArchivoDeSalida = By.xpath("//li[contains(text(),'Archivos de Salida')]");
    By btnEntidadFinanciera = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By txtFechaInicialSalida = By.xpath("//input[@id='startDateArchivosDeSalida']");
    By txtFechaFinalSalida = By.xpath("//input[@id='endDateArchivosDeSalida']");
    By txtFomatoArchivoSalida = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");

    By btnReporteDescripcionDeLote = By.xpath("//li[contains(text(),'Descripción de Lote')]");
    By btnSelectorEntidadOrigenLote = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[5]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By btnSelectorEntidadDestinoLote = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[5]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By txtFechaInicialLote = By.xpath("//input[@id='reportBatchDescriptionstartDate']");
    By txtFechaFinalSaLote = By.xpath("//input[@id='reportBatchDescriptionendDate']");
    By btnDescripcionLote = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[5]/div[2]/div[1]/div[5]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By txtFormatoLote = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");

    By btnReporteDiario = By.xpath("//li[contains(text(),'Diario')]");
    By btnSelectorEntidadOrigenDiario = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By btnSelectorEntidadDestinoDiario = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By btnSelectorTiposTransaccionesDiario = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[5]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By txtFechaInicialDiario = By.xpath("//input[@id='startDate']");
    By txtFechaFinalSaDiario = By.xpath("//input[@id='endDate']");
    By btnAgruparPorDiario = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[6]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By btnFormatoDiario = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By btnGenerar = By.xpath("//input[@id='generate']");
    By lblReporteGenerado = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]");

    /**
     * Consulta Reporte Reintegro
     **/

    public By getBtnSeleccionTipoReporte() {
        return btnSeleccionTipoReporte;
    }
    public By getBtnReporteAcumulado() {
        return btnReporteAcumulado;
    }

    public By getBtnSelectorEntidadOrigenAcumulado() {
        return btnSelectorEntidadOrigenAcumulado;
    }

    public By getBtnSelectorEntidadDestinoAcumulado() {
        return btnSelectorEntidadDestinoAcumulado;
    }

    public By getBtnSelectorTiposTransaccionesAcumulado() {
        return btnSelectorTiposTransaccionesAcumulado;
    }

    public By getBtnAgruparPorAcumulado() {return btnAgruparPorAcumulado;}

    public By getBtnIngresarAgruparPor() {return btnIngresarAgruparPor;}

    public By getTxtAñoReporte() {return txtAñoReporte;}

    public By getBtnFormatoAcumulado() {
        return btnFormatoAcumulado;
    }

    public By getBtnReporteArchivoDeSalida() {
        return btnReporteArchivoDeSalida;
    }

    public By getBtnEntidadFinanciera() {
        return btnEntidadFinanciera;
    }

    public By getTxtFechaInicialSalida() {
        return txtFechaInicialSalida;
    }

    public By getTxtFechaFinalSalida() {
        return txtFechaFinalSalida;
    }

    public By getTxtFomatoArchivoSalida() {
        return txtFomatoArchivoSalida;
    }

    public By getBtnReporteDescripcionDeLote() {
        return btnReporteDescripcionDeLote;
    }

    public By getBtnSelectorEntidadOrigenLote() {return btnSelectorEntidadOrigenLote;}

    public By getBtnSelectorEntidadDestinoLote() {
        return btnSelectorEntidadDestinoLote;
    }

    public By getTxtFechaInicialLote() {
        return txtFechaInicialLote;
    }

    public By getTxtFechaFinalSaLote() {
        return txtFechaFinalSaLote;
    }

    public By getBtnDescripcionLote() {
        return btnDescripcionLote;
    }

    public By getTxtFormatoLote() {
        return txtFormatoLote;
    }

    public By getBtnReporteDiario() {
        return btnReporteDiario;
    }

    public By getBtnSelectorEntidadOrigenDiario() {return btnSelectorEntidadOrigenDiario;}

    public By getBtnSelectorEntidadDestinoDiario() {
        return btnSelectorEntidadDestinoDiario;
    }

    public By getBtnSelectorTiposTransaccionesDiario() {
        return btnSelectorTiposTransaccionesDiario;
    }

    public By getTxtFechaInicialDiario() {
        return txtFechaInicialDiario;
    }

    public By getTxtFechaFinalSaDiario() {
        return txtFechaFinalSaDiario;
    }

    public By getBtnAgruparPorDiario() {
        return btnAgruparPorDiario;
    }

    public By getBtnFormatoDiario() {
        return btnFormatoDiario;
    }

    public By getBtnGenerar() {return btnGenerar;}

    public By getLblReporteGenerado() {return lblReporteGenerado;}
}