package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import com.integra.ach.steps.IntegraTableroDePagosStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class ConsultaTableroDePagosStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraTableroDePagosStep integraTableroDePagosStep;




    @Given("^Login exitoso para cierre de ciclo \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginExitosoParaCierreDeCiclo(String tipoDeEntidad, String usuario, String clave) {
        integraInicioStep.abrirWeb();
        integraInicioStep.seleccionarTipoEntidad(tipoDeEntidad);
        integraInicioStep.clickBotonVamos();
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
        integraInicioStep.validarInicioDeSesion();
    }

    @When("^Ingresar a modulo de Tablero de pagos luego filtro por fecha$")
    public void ingresarAModuloDeTableroDePagosLuegoFiltroPorFecha() throws AWTException {
        integraMenuPrincipalStep.clickModuloDeTransferencias();
        integraMenuPrincipalStep.clickSubModuloTableroDePagos();
        integraTableroDePagosStep.clickCampoDeFecha();
        integraTableroDePagosStep.escribirFechaDeFiltro();
        integraTableroDePagosStep.clickBuscar();


    }

    @Then("^Valido la informacion de la consulta luego oprime Exportar$")
    public void validoLaInformacionDeLaConsultaLuegoOprimeExportar() throws AWTException {
        integraTableroDePagosStep.clickExportar();
    }
}

