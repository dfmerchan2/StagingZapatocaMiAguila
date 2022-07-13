package co.com.staging.zapatoca.miaguila.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_EMAIL =
            Target.the("Email text box").locatedBy("//input[@type='email']");
    public static final Target TXT_PASSWORD =
            Target.the("Password text box").locatedBy("//input[@type='password']");
    public static final Target BTN_GET_INTO =
            Target.the("Get into button").locatedBy("//h6[contains(text(),'Ingresa con tu correo')]/following::button//span[contains(text(),'Ingresar')]");
    public static final Target BTN_REGISTER =
            Target.the("Register button").locatedBy("//button[contains (text(),'Regístrate')]");

    private LoginPage() {
    }
}
