package co.com.staging.zapatoca.miaguila.stepdefinitions;

import co.com.staging.zapatoca.miaguila.tasks.AddInformation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUserStepDefinition {

    @When("the user {string} enters the mandatory information for registration")
    public void theUserEntersTheMandatoryInformationForRegistration(String userType) {
        theActorInTheSpotlight().attemptsTo(
                AddInformation.fromTheNewUser(userType)
        );
    }

    @And("add your location information")
    public void addYourLocationInformation() {

    }

    @Then("he should see the registration successfully")
    public void heShouldSeeTheRegistrationSuccessfully() {

    }

}
