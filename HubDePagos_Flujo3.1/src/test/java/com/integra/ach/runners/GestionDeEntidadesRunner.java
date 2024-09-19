package com.integra.ach.runners;

import com.integra.ach.utils.BeforeSuite;
import com.integra.ach.utils.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = "src/test/resources/com.integra.ach.features",
        tags = {"@CPL001,@CPL002,@CPL003,@CPL004"},
        glue = "com.integra.ach.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class GestionDeEntidadesRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/com.integra.ach.features");
    }
}