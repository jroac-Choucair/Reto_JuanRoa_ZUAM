package com.choucair.moviles.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/java/features/CompraExitosa.feature"}
        ,tags = "@RutaCompraExitosa"
        ,glue = {"com.choucair.moviles.app.stepsdefinitios"}
        ,snippets = SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class RunnerCucumber {
}