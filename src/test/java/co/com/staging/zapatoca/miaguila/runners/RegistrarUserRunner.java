package co.com.staging.zapatoca.miaguila.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/RegistrarUser.feature",
        glue = "co.com.staging.zapatoca.miaguila.stepdefinitions",
        plugin = {"rerun:target/rerunFailed/RegistrarUserRerun.txt", "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RegistrarUserRunner {
}
