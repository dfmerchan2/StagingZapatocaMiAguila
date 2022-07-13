package co.com.staging.zapatoca.miaguila.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Purchase.feature",
        glue = "co.com.staging.zapatoca.miaguila.stepdefinitions",
        plugin = {"rerun:target/rerunFailed/PurchaseRerun.txt", "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class PurchaseRunner {
}
