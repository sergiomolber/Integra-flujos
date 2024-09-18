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


    //HU/ MODULO/ REQ : Flujo Prenotificación
    @RunWith(RunnerPersonalizado.class)
    @CucumberOptions(
            features = "src/test/resources/com.integra.ach.features",
            tags = {"  @SubirArchivoExitosoPrenotificacion,@EditarUnCiclo,@EditarUnCiclo,@CierreDeCicloExitoso,@EditarUnCiclohoraMas5MinutosPrenotificacion1,@SubirArchivoExitosoPrenotificacion1,@EditarUnCicloPrenotificacion1,@CierreDeCicloExitoso"},
            glue = "com.integra.ach.stepDefinitions",
            snippets = SnippetType.CAMELCASE
    )
    public static class PrenotificacionRunner {
        @BeforeSuite
        public static void test() throws InvalidFormatException, IOException {
            DataToFeature.overrideFeatureFiles("./src/test/resources/com.integra.ach.features");
        }
    }

}







