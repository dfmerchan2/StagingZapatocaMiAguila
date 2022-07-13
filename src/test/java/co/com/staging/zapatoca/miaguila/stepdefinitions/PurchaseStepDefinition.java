package co.com.staging.zapatoca.miaguila.stepdefinitions;

import co.com.staging.zapatoca.miaguila.tasks.AddProducts;
import co.com.staging.zapatoca.miaguila.userinterfaces.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PurchaseStepDefinition {

    @When("he adds {int} products from category {string} to the shopping cart")
    public void heAddsProductsFromCategoryToTheShoppingCart(int quantity, String category) {
        theActorInTheSpotlight().attemptsTo(
                AddProducts.toShoppingCart(quantity, category)
        );

    }

    @Then("he should see these products in the shopping cart")
    public void heShouldSeeTheseProductsInTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(HomePage.LBL_QUANTITY_OF_PRODUCTS).text().isEqualTo("5")
        );
    }

}
