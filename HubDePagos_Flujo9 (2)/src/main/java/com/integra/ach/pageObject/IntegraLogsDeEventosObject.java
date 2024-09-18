package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraLogsDeEventosObject extends PageObject {

    /**
     * Consultar por Evento
     **/
    By lblEvento = By.xpath("//input[@Class='select2-search__field']");
    By optSelect = By.xpath("//select[@data-select2-id='15']");

    By btnFechaInicio = By.xpath("//input[@id='AUDITTIMESTAMPStart']");

    By btnFechaFin = By.xpath("//input[@id='AUDITTIMESTAMPEnd']");

    By btnBuscar = By.xpath("//span[. ='Buscar '] ");
    By btnValidarEvento = By.xpath("(//tr/th[@class='ng-binding ng-scope cursorPointer'])[11]");


    /**
     * Consultar Usuario
     **/
    By lblUsuario = By.xpath("(//input[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required'])[1]");

    By txtUsuario = By.xpath("(//tr/th[@class='ng-binding ng-scope cursorPointer'])[2]");


    /**
     * Consultar correo
     **/
    By lblCorreo = By.xpath("(//input[@class ='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required'] )[3]");

    By txtCorreo = By.xpath("(//tr/th[@class='ng-binding ng-scope cursorPointer'])[4]");

    /** Generar log de eventos reporte
     */
    By BtnGenerarLogsDeEventos= By.xpath("/html/body/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div[2]/button/i");
    By BtnDescargarReporteExcel= By.xpath("/html/body/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div[2]/ul/li[3]/i");
    By BtnDescargarReporte = By.xpath("/html/body/div[3]/div/div[3]/div/div[2]/div/div[2]/div[4]/table/tbody/tr/td[7]/button/i");
    By BtnActualizar= By.xpath("/html/body/div[3]/div/div[3]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div[2]/button/i");

    public By getLblEvento() {
        return lblEvento;
    }

    public By getOptSelect() {
        return optSelect;
    }

    public By getBtnFechaInicial() {
        return btnFechaInicio;
    }

    public By getBtnFechaFinal() {
        return btnFechaFin;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getLblUsuario() {
        return lblUsuario;
    }

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getLblCorreo() {
        return lblCorreo;
    }

    public By getBtnValidarEvento() {
        return btnValidarEvento;
    }

    public By getBtnGenerarLogsDeEventos() {return BtnGenerarLogsDeEventos;}

    public By getBtnDescargarReporteExcel() {return BtnDescargarReporteExcel;}

    public By getBtnActualizar() {return BtnActualizar;
    }

    public By getBtnDescargarReporte() {return BtnDescargarReporte;
    }
}