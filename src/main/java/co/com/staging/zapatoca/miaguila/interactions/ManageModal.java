package co.com.staging.zapatoca.miaguila.interactions;

import co.com.staging.zapatoca.miaguila.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ManageModal implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (HomePage.BTN_SELECT_ADDRESS.resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    Click.on(HomePage.BTN_SELECT_ADDRESS),
                    WaitUntil.the(HomePage.BTN_CLOSE_SHOPPING_CART, isPresent()),
                    Click.on(HomePage.BTN_CLOSE_SHOPPING_CART)
            );
        }else if (HomePage.BTN_CLOSE_SHOPPING_CART.resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    Click.on(HomePage.BTN_CLOSE_SHOPPING_CART)
            );
        }
    }

    public static Performable ofAddressAndCart() {
        return instrumented(ManageModal.class);
    }
}
