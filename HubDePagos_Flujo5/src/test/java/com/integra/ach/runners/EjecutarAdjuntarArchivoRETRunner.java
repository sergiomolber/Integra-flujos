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

@RunWith(EjecutarAdjuntarArchivoRETRunner.class)
@Suite.SuiteClasses({})
public class EjecutarAdjuntarArchivoRETRunner extends Suite {

    public EjecutarAdjuntarArchivoRETRunner(Class<?> klass, RunnerBuilder builder) throws InitializationError {
        super(klass, builder);
    }

    //HU/ MODULO/ REQ :  Ciclo  2  (Flujo Archivos . RET)
    @RunWith(RunnerPersonalizado.class)
    @CucumberOptions(
            features = "src/test/resources/com.integra.ach.features",
            tags = {"@CrearUnaRestriccion,@SubirArchivoExitoso,@DescargarArchivo.RET"},
            glue = "com.integra.ach.stepDefinitions",
            snippets = SnippetType.CAMELCASE
    )
    public static class CrearUnaRestriccionRunner {
        @BeforeSuite
        public static void test() throws InvalidFormatException, IOException {
            DataToFeature.overrideFeatureFiles("./src/test/resources/com.integra.ach.features");
        }
    }
}