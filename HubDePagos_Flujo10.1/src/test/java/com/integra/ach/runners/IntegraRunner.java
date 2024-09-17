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
//Flujo 12 Ciclo 5 Dia 1
    //HU/ MODULO/ REQ : Flujo ciclo 5
    // Este Runner realiza la consulta del consumo ERP.
    @RunWith(RunnerPersonalizado.class)
    @CucumberOptions(
            features = "src/test/resources/com.integra.ach.features",
            tags = {"@CargaArchivoExitoso or @EditarUnCiclo or @CierreDeCicloExitoso or @ConsultaConsumoERP"},
            glue = "com.integra.ach.stepDefinitions",
            snippets = SnippetType.CAMELCASE
    )
    public static class CargaArchivoExitosoRunner {
        @BeforeSuite
        public static void test() throws InvalidFormatException, IOException {
            DataToFeature.overrideFeatureFiles("./src/test/resources/com.integra.ach.features");
        }
    }
    }









