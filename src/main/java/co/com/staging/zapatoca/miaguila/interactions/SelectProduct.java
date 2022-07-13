package co.com.staging.zapatoca.miaguila.interactions;

import co.com.staging.zapatoca.miaguila.questions.ObtainList;
import co.com.staging.zapatoca.miaguila.userinterfaces.HomePage;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.stream.IntStream;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectProduct implements Interaction {

    private final Faker faker = new Faker();
    private final int quantity;

    public SelectProduct(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> products = actor.asksFor(ObtainList.is(HomePage.LST_PRODUCTS));
        IntStream.range(0, quantity)
                .forEach(
                        i -> {
                            int counter = faker.random().nextInt(products.size());
                            actor.attemptsTo(
                                    Scroll.to(HomePage.BTN_PRODUCTS.of(products.get(counter))).andAlignToBottom(),
                                    WaitUntil.the(HomePage.BTN_PRODUCTS.of(products.get(counter)), isClickable()),
                                    Click.on(HomePage.BTN_PRODUCTS.of(products.get(counter))),
                                    ManageModal.ofAddressAndCart()
                            );
                            products.remove(counter);
                        }
                );
    }

    public static Performable toAdd(int quantity) {
        return instrumented(SelectProduct.class, quantity);
    }
}
