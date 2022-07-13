package co.com.staging.zapatoca.miaguila.questions;

import co.com.staging.zapatoca.miaguila.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class TheWelcomeMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(HomePage.LBL_HELLO, isPresent()));
        return HomePage.LBL_HELLO.resolveFor(actor).getText();
    }

    public static TheWelcomeMessage is() {
        return new TheWelcomeMessage();
    }
}
