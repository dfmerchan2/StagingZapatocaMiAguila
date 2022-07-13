package co.com.staging.zapatoca.miaguila.stepdefinitions;

import co.com.staging.zapatoca.miaguila.exceptions.InvalidMessageExceptions;
import co.com.staging.zapatoca.miaguila.interactions.OpenPlatform;
import co.com.staging.zapatoca.miaguila.questions.TheWelcomeMessage;
import co.com.staging.zapatoca.miaguila.tasks.Authenticate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.staging.zapatoca.miaguila.utils.ErrorMessages.UNEXPECTED_MESSAGE_ERROR;
import static co.com.staging.zapatoca.miaguila.utils.PlatformUrl.DOMICILE_ZAPATOCA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinition {

    @Given("that {string} enters the Zapatoca Address page")
    public void thatEntersTheZapatocaAddressPage(String actor) {
        theActorCalled(actor).attemptsTo(
                OpenPlatform.of(DOMICILE_ZAPATOCA.getUrl())
        );
    }

    @When("he enters the username {string} and password {string}")
    public void heEntersTheUsernameAndPassword(String email, String password) {
        theActorInTheSpotlight().attemptsTo(
                Authenticate.inAddressesZapatoca(email, password)
        );
    }

    @Then("he should see the welcome message {string}")
    public void heShouldSeeTheWelcomeMessage(String message) {
        theActorInTheSpotlight()
                .should(
                        seeThat(TheWelcomeMessage.is(), equalTo(message))
                                .orComplainWith(
                                        InvalidMessageExceptions.class, UNEXPECTED_MESSAGE_ERROR.getMessage())
                );
    }

}
