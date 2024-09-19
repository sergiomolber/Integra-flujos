package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraMenuPrincipalObject extends PageObject {
    By btnVinculacionEntidades = By.xpath("//span[contains(text(),'Vinculación de Entidades')]");
    By btnTransporte = By.xpath("(//span[contains(text(),'Transporte')])[1]");

    By btnCatalogos = By.xpath("//span[contains(text(),'Catálogos')]");
    By btnLimites = By.xpath("//span[contains(text(),'Límites')]");
    By btnUsuariosRoles = By.xpath("//span[contains(text(),'Usuarios y Roles')]");
    By btnCatalogo = By.xpath("//span[contains(text(),'Catálogos')]");
    By btnGestionUsuarios = By.xpath("//span[contains(text(),'Gestión de Usuarios')]");

    By btnEntidades = By.xpath("//*[@id=\"Party\"]/a/span");
    By btnContratos = By.xpath("//span[contains(text(),'Contratos')]");
    By btnDesbloquearUsuarios = By.xpath("//span[contains(text(),'Desbloqueo de Usuarios')]");
    By btnDatosDelSistema = By.xpath("//span[contains(text(),'Datos del Sistema')]");
    By btnConfiguracionAplicacion = By.xpath("//span[contains(text(),'Configuraciones de la Aplicación')]");


    public By getBtnVinculacionEntidades() {
        return btnVinculacionEntidades;
    }

    public By getBtnTransporte() {
        return btnTransporte;
    }

    public By getBtnCatalogos() {
        return btnCatalogos;
    }
    public By getBtnLimites() {
        return btnLimites;
    }

    public By getBtnUsuariosRoles() {
        return btnUsuariosRoles;
    }

    public By getBtnCatalogo() {
        return btnCatalogo;
    }

    public By getBtnGestionUsuarios() {
        return btnGestionUsuarios;
    }



    public By getBtnEntidades() {return btnEntidades;}

    public By getBtnContratos() {return btnContratos;}

    public By getBtnDesbloquearUsuarios() {return btnDesbloquearUsuarios;}
    public By getBtnDatosDelSistema() {return btnDatosDelSistema;}
    public By getBtnConfiguracionAplicacion() {return btnConfiguracionAplicacion;}
}


