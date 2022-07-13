package co.com.staging.zapatoca.miaguila.tasks;

import co.com.staging.zapatoca.miaguila.interactions.SelectMenu;
import co.com.staging.zapatoca.miaguila.interactions.SelectProduct;
import co.com.staging.zapatoca.miaguila.questions.ObtainList;
import co.com.staging.zapatoca.miaguila.userinterfaces.HomePage;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AddProducts implements Task {


    private final int quantity;
    private final String category;

    public AddProducts(int quantity, String category) {
        this.quantity = quantity;
        this.category = category;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectMenu.inTheOption(category),
                WaitUntil.the(HomePage.BTN_CLOSE_ALERT, isPresent()).forNoMoreThan(40).seconds(),
                Click.on(HomePage.BTN_CLOSE_ALERT),
                SelectProduct.toAdd(quantity)
        );
    }

    public static Performable toShoppingCart(int quantity, String category) {
        return instrumented(AddProducts.class, quantity, category);
    }
}
