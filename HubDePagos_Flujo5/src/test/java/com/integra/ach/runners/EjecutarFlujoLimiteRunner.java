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

@RunWith(EjecutarFlujoLimiteRunner.class)
@Suite.SuiteClasses({})
public class EjecutarFlujoLimiteRunner extends Suite {

    public EjecutarFlujoLimiteRunner(Class<?> klass, RunnerBuilder builder) throws InitializationError {
        super(klass, builder);
    }

    //HU/ MODULO/ REQ :  Flujo Limite
    // Este Runner lleva a cabo el proceso de cuentas al realizar la edición en la inscripción de cuentas al estado 'Create' por parte del administrador operador.
    // Posteriormente, se procede con la edición nuevamente para la aprobación de la cuenta al estado 'Active' por parte del usuario administrador de aprobaciones.
    // Luego, se realiza la edición en la autorización de cuenta para establecer el campo 'Aprobado por ACH' en estado TRUE por parte del usuario Aprover ACH.
    @RunWith(RunnerPersonalizado.class)
    @CucumberOptions(
            features = "src/test/resources/com.integra.ach.features",
            tags = {"@AprobarUnaCuenta,@AutorizarUnaCuenta"},
            glue = "com.integra.ach.stepDefinitions",
            snippets = SnippetType.CAMELCASE
    )
    public static class ProcesoDeCuentasRunner {
        @BeforeSuite
        public static void test() throws InvalidFormatException, IOException {
            DataToFeature.overrideFeatureFiles("./src/test/resources/com.integra.ach.features");
        }
    }

}