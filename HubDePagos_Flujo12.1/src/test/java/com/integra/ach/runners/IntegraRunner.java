package com.integra.ach.runners;

import com.integra.ach.utils.BeforeSuite;
import com.integra.ach.utils.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

import java.io.IOException;

@RunWith(IntegraRunner.class)
@Suite.SuiteClasses({})
public class IntegraRunner extends Suite {

    public IntegraRunner(Class<?> klass, RunnerBuilder builder) throws InitializationError {
        super(klass, builder);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ////HU/ MODULO/ REQ : Flujo devoluciones
    //Este runner ejecuta un proceso en dos etapas:
    // primero, adjunta un documento para la devolución;
    // luego, cierra el ciclo para permitir la adjunción de un segundo documento específico
    // relacionado con la devolución.
    @RunWith(RunnerPersonalizado.class)
    @CucumberOptions(
            features = "src/test/resources/com.integra.ach.features",
            tags = {" @EditarUnCiclohoraMas5Minutos or @AdjuntarDocumentoOrigen or @EditarUnCiclo  or @CierreDeCicloExitoso or  @EditarUnCiclohoraMas5Minutosciclo3 or @AdjuntarDocumentoDevolucion or @EditarUnCiclo3 or @CierreDeCicloExitoso3"},
            glue = "com.integra.ach.stepDefinitions",
            snippets = SnippetType.CAMELCASE
    )
    public static class FlujoDevolucion {
        @BeforeSuite
        public static void test() throws InvalidFormatException, IOException {
            DataToFeature.overrideFeatureFiles("./src/test/resources/com.integra.ach.features");
        }
    }
}






