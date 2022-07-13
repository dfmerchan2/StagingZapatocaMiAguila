package co.com.staging.zapatoca.miaguila.tasks;

import co.com.staging.zapatoca.miaguila.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Authenticate implements Task {

    private final String email;
    private final String password;

    public Authenticate(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.TXT_EMAIL, isPresent()),
                Enter.theValue(email).into(LoginPage.TXT_EMAIL),
                Enter.theValue(password).into(LoginPage.TXT_PASSWORD),
                WaitUntil.the(LoginPage.BTN_REGISTER, isClickable()),
                Click.on(LoginPage.BTN_GET_INTO)
        );
    }

    public static Performable inAddressesZapatoca(String email, String password) {
        return instrumented(Authenticate.class, email, password);
    }
}
