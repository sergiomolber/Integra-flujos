package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraReporteReintegrosObject extends PageObject {
   //  **/Crear Un Evento
    By btnMas1 = By.xpath("//*[@Class='fa fa-plus-square']");
    By txtFechaRegistro = By.xpath("//input[@id='RegisterRefunds.RegistryDate']");
    By txtFechaDeCompensacion = By.xpath("//input[@id='RegisterRefunds.ClearingDate']");
    By selectEntidadFinanciera = By.xpath("//span[@id='select2-RegisterRefundsFinancialEntity-container']");
    By txtMontoAFavor = By.xpath("//input[@id='RegisterRefunds.AmountInFavor']");
    By txtMontoEnContra = By.xpath("//input[@id='RegisterRefunds.AmountAgainst']");
    By selectEstado = By.xpath("//span[@id='select2-{{fieldLabel}}-container']");
    By txtObervacion = By.xpath("//textarea[@id='RegisterRefunds.Observation']");
    By btnCrear = By.xpath("//span[contains(text(),'Crear')]");
    By txtValidarCreacion = By.xpath("//span[contains(text(),'Reintegro aplicado exitosamente.')]");




    /**
     * Consulta Reporte Reintegro
     **/
    By btnMas = By.xpath("//*[@Class='fa fa-plus-square']");
    By txtFechaDeCompensacionInicial = By.xpath("//input[@id='FromDate']");
    By txtFechaDeCompensacionFinal = By.xpath("//input[@id='ToDate']");
    By btnGenerarReporte = By.xpath("//button[@id='okBtn']");
    By btActualizarReporte = By.xpath("//button[@id='okBtn']");
    By btnActualizar = By.xpath("//*[@class='fa fa-refresh fa-fs14']");
    By btnSeleccionarReporte = By.xpath("//*[@id=\"cntrlID\"]/tbody/tr[1]/td[5]/div");
 //input[@id='check_1']
 //*[@id="check_0"]
    By btnDescargar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]/i[1]");
    By btnDescargarReporteExcel = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/i[1]");
    By lblReporteReintegros = By.xpath("//h2[contains(text(),'Reporte Reintegros')]");

    /**
     * Consulta Reporte Reintegro
     **/

    public By getBtnMas() {
        return btnMas;
    }
    public By getBtnMas1() {
        return btnMas1;
    }
    public By getTxtFechaDeCompensacionInicial() {
        return txtFechaDeCompensacionInicial;
    }

    public By getBtnGenerarReporte() {return btnGenerarReporte;}

    public By getBtActualizarReporte() {return btActualizarReporte;}
    public By getBtnDescargarReporteExcel() {
        return btnDescargarReporteExcel;
    }

    public By getTxtFechaDeCompensacionFinal() {
        return txtFechaDeCompensacionFinal;
    }

    public By getBtnSeleccionarReporte() {return btnSeleccionarReporte;}

    public By getBtnDescargar() {return btnDescargar;}

    public By getLblReporteReintegros() {return lblReporteReintegros;}

    public By getTxtFechaRegistro() {
        return txtFechaRegistro;
    }

    public By getSelectEntidadFinanciera() {return selectEntidadFinanciera;}

    public By getSelectEstado() {
        return selectEstado;
    }

    public By getTxtFechaDeCompensacion() {
        return txtFechaDeCompensacion;
    }

    public By getTxtMontoAFavor() {
        return txtMontoAFavor;
    }

    public By getTxtMontoEnContra() {return txtMontoEnContra;}

    public By getTxtObervacion() {return txtObervacion;}

    public By getBtnCrear() {
        return btnCrear;
    }

    public By getTxtValidarCreacion() {return txtValidarCreacion;}


 public By getBtnActualizar() {
  return btnActualizar;

 }
}