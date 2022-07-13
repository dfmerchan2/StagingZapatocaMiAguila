package co.com.staging.zapatoca.miaguila.tasks;

import co.com.staging.zapatoca.miaguila.models.User;
import co.com.staging.zapatoca.miaguila.userinterfaces.LoginPage;
import co.com.staging.zapatoca.miaguila.userinterfaces.RegistrarPage;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static co.com.staging.zapatoca.miaguila.utils.GetTestData.getUserData;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AddInformation implements Task {

    private Faker faker = new Faker();
    private final String userType;

    public AddInformation(String userType) {
        this.userType = userType;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            User user = getUserData(userType);
            actor.attemptsTo(
                    WaitUntil.the(LoginPage.BTN_REGISTER, isPresent()),
                    Click.on(LoginPage.BTN_REGISTER),
                    WaitUntil.the(RegistrarPage.TXT_NAME, isPresent()),
                    Type.theValue(user.getName()).into(RegistrarPage.TXT_NAME),
                    Type.theValue(user.getFirstSurname()).into(RegistrarPage.TXT_FIRST_SURNAME),
                    Type.theValue(user.getSecondSurname()).into(RegistrarPage.TXT_SECOND_SURNAME),
                    Scroll.to(RegistrarPage.TXT_FIRST_SURNAME).andAlignToTop(),
                    SelectFromOptions.byVisibleText(user.getDocumentType()).from(RegistrarPage.LST_DOCUMENT_TYPE),
                    Enter.theValue(user.getDocumentNumber()).into(RegistrarPage.TXT_DOCUMENT_NUMBER),
                    Enter.theValue(String.format(user.getEmail(), faker.number().digits(4))).into(RegistrarPage.TXT_EMAIL),
                    Enter.theValue(user.getPhone()).into(RegistrarPage.TXT_PHONE),
                    Enter.theValue(user.getPassword()).into(RegistrarPage.TXT_PASSWORD),
                    Enter.theValue(user.getPassword()).into(RegistrarPage.TXT_CONFIRM_PASSWORD),
                    Scroll.to(RegistrarPage.TXT_PHONE).andAlignToTop(),
                    Click.on(RegistrarPage.CHECK_ACCEPT_CONDITIONS),
                    Switch.toFrame(0),
                    Click.on(RegistrarPage.CHECK_CAPTCHA)
//                    Click.on(RegistrarPage.BTN_CREATE_ACCOUNT)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Performable fromTheNewUser(String userType) {
        return instrumented(AddInformation.class, userType);
    }
}
