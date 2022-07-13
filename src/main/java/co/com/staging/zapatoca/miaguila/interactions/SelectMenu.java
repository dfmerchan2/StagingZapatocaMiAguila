package co.com.staging.zapatoca.miaguila.interactions;

import co.com.staging.zapatoca.miaguila.userinterfaces.MenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SelectMenu implements Interaction {

    private final String option;

    public SelectMenu(String option) {
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MenuPage.MENU_BUTTON, isPresent()),
                Click.on(MenuPage.MENU_BUTTON),
                WaitUntil.the(MenuPage.MENU_OPTION.of(option), isPresent()),
                Click.on(MenuPage.MENU_OPTION.of(option))
        );
    }

    public static Performable inTheOption(String option) {
        return instrumented(SelectMenu.class, option);
    }


}
