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

    //HU/ MODULO/ REQ : HU/ MODULO/ REQ : Flujo  generar sanciones
    @RunWith(RunnerPersonalizado.class)
    @CucumberOptions(
            features = "src/test/resources/com.integra.ach.features",
            tags = {"@EditarUnCiclo2 or @CierreDeCiclo2Exitoso or @EditarUnCiclohoraMas5MinutosCiclo3 or @AdjuntarDocumentoDevolucionSancion9 or  @EditarUnCiclo3 or @CierreDeCiclo3Exitoso or @EditarUnCiclohoraMas5MinutosCiclo4 or @AdjuntarDocumentoDevolucionSancion10 or @EditarUnCiclo4 or @CierreDeCiclo4Exitoso or @EditarUnCiclohoraMas5MinutosCiclo5 or @AdjuntarDocumentoOrigenSancion500 or @EditarUnCiclo5 or @CierreDeCiclo5Exitoso"},
            glue = "com.integra.ach.stepDefinitions",
            snippets = SnippetType.CAMELCASE
    )
    public static class GenerarSancionesRunner {
        @BeforeSuite
        public static void test() throws InvalidFormatException, IOException {
            DataToFeature.overrideFeatureFiles("./src/test/resources/com.integra.ach.features");
        }
    }


}







